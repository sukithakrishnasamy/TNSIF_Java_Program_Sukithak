//Executor class for ChildThread
package com.tnsif.multithreading;

public class ThreadDemo {
	public static void main(String[] args) {
		MyChildThread threadOne = new MyChildThread();
		MyChildThread threadTwo = new MyChildThread();

		threadOne.start();
		//threadOne.start(); // throws IllegalStateException
		// threadOne.run(); // single threaded application 
		threadTwo.start();

		System.out.println("-----------------------End of Main--------------------------");
	}
}
