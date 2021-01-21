package pk.cui.dp.lab.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;

public class Writer implements Runnable {

	private final String name;
	private ReadWriteLock rwLock;
	private final long writingTime;
	private List<Flight> flights;
	public Writer(List<Flight> flights,String name, ReadWriteLock writeLock, long writingTime) {
		this.name = name;
		this.rwLock = writeLock;
		this.writingTime = writingTime;
		this.flights = flights;
	}
	@Override
	public void run() {
		Lock writeLock = rwLock.writeLock();
		writeLock.lock();
		try {
			write();
		} catch (InterruptedException e) {
			System.out.println("InterruptedException when writing");

			Thread.currentThread().interrupt();
		} finally {
			writeLock.unlock();
		}
	}

	/**
	 * Simulate the write operation.
	 */
	public void write() throws InterruptedException {
		System.out.println(name+" begin");
		try{
			BufferedReader in = new BufferedReader(new FileReader("flights.txt"));
			String str;
			str = in.readLine();
			String[] tokens = str.split(",");
			Flight flight = new Flight();
			flight.setFlightNr(tokens[0]);
			flight.setDestination(tokens[1]);
			flight.setTime(tokens[2]);
			flight.setGate(tokens[3]);
			flight.setRemarks(tokens[4]);
			flights.add(flight);
			in.close();
			removeFirstLine("flights.txt");
		}
		catch (IOException e) {
			System.out.println("File Read Error");
		}
		Thread.sleep(writingTime);
		System.out.println(name+ " finished after writing "+writingTime+" ms");
	}
	void removeFirstLine(String fileName) throws IOException {  
		RandomAccessFile raf = new RandomAccessFile(fileName, "rw");          
		//Initial write position                                             
		long writePosition = raf.getFilePointer();                            
		raf.readLine();                                                       
		// Shift the next lines upwards.                                      
		long readPosition = raf.getFilePointer();                             

		byte[] buff = new byte[1024];                                         
		int n;                                                                
		while (-1 != (n = raf.read(buff))) {                                  
			raf.seek(writePosition);                                          
			raf.write(buff, 0, n);                                            
			readPosition += n;                                                
			writePosition += n;                                               
			raf.seek(readPosition);                                           
		}                                                                     
		raf.setLength(writePosition);                                         
		raf.close();                                                          
	}         
}
