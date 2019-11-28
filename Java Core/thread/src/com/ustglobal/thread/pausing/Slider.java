package com.ustglobal.thread.pausing;

public class Slider {

	public static void main(String[] args) {
		
		System.out.println("Main Started ");
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Slider");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
