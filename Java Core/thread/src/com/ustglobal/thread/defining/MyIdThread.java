package com.ustglobal.thread.defining;

public class MyIdThread  extends Thread{

		public static void main(String[] args) {
			
			System.out.println("Main started");
			System.out.println(Thread.currentThread().getId());
			MyIdThread mi = new MyIdThread();
			System.out.println("myid thread "+mi.getId());
			System.out.println("Priority "+Thread.currentThread().getPriority());
			
			//nThread.currentThread().setPriority(16); IllegalArgumentException
			
			System.out.println("Main ended");
		}
}
