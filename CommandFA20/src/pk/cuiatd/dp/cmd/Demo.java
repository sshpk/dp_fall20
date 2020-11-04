package pk.cuiatd.dp.cmd;

public class Demo {
	public static void main(String[] args) {
		FileSystemReciever reciever;
		String osName = System.getProperty("os.name").toLowerCase();
		System.out.println(osName);
		if(osName.contains("windows")){
			reciever = new WindowsFileSystemReciever();
		}
		else {
			reciever = new UnixFileSystemReciever();
		}
		Command cmd = new OpenFileCommand(reciever);
		FileInvoker invoker = new FileInvoker(cmd);
		invoker.execute();
		
		invoker.undo();
		
		cmd = new CloseFileCommand(reciever);
		invoker = new FileInvoker(cmd);
		invoker.execute();
		
		invoker.undo();
	}
}
