package com.jobready.producerconsumer;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> questionList = new ArrayList<Integer>();
		
		Thread t1 = new Thread(new Producer(questionList));
		Thread t2 = new Thread(new Producer(questionList));
		
		t1.start();		// Starting the 1st Thread
		t2.start();		// Starting the 2nd Thread

	}

}
