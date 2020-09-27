package com.jobready.threadpools;

public class MessageProcessor implements Runnable {
	private int message;
	
	public MessageProcessor(int message) {
		this.message = message;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + " [RECEIVED] Message = " + message);
		respondToMessage();	// Make the thread sleep to simulate doing some work
		System.out.println(Thread.currentThread().getName() + " (DONE) Processing Message = " + message);
		
	}

	private void respondToMessage() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("Unable to process message " + message);
		}
		
	}
}
