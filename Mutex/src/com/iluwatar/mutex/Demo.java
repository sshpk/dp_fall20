package com.iluwatar.mutex;

public class Demo {

	public static void main(String[] args) {
		Mutex mutex = new Mutex();
	    Jar jar = new Jar(100, mutex);
	    Thief peter = new Thief("Peter", jar);
	    Thief john = new Thief("John", jar);
	    peter.start();
	    john.start();

	}

}
