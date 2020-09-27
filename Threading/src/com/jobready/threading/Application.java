package com.jobready.threading;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Starting Thread 1");
		Task taskRunner = new Task();
		taskRunner.start();				// Starting a Thread
		
		System.out.println("Starting Thread 2");
		Task taskRunner2 = new Task();
		taskRunner2.start();			// Starting another Thread
		
		

	}

}

class Task extends Thread {
	
	public void run() {
		for(int i=0; i<1000; i++) {
			System.out.println("Number: " + i + " - " + Thread.currentThread().getName());
			try {
				Thread.sleep(10);	// Stopping the Thread for 10ms
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
	}
	
}
