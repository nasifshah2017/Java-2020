package com.jobready.client;

import com.jobready.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		InventoryManager manager = new InventoryManager();
		
		Thread inventoryTask = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				manager.populateSoldProducts();
			}
			
		});
		
		Thread displayTask = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				manager.displaySoldProducts();
			}
			
		});
		
		inventoryTask.start();		// 1st Thread

		
		 Thread.sleep(2000);
		
		displayTask.start();		// 2nd Thread

	}

}
