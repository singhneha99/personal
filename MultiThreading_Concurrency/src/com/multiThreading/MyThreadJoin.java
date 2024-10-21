package com.multiThreading;

class MyThread extends Thread
{
	static Thread mt;
	
	@Override
    public void run() 
	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e) {}
		for(int i = 0; i < 10; i++)
		{
			System.out.println("child thread");
		}
	}
}

public class MyThreadJoin {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread.mt = Thread.currentThread();
		MyThread t = new MyThread();
		t.start();
		t.join();
		for(int i = 0; i < 10; i++)
		{
			System.out.println("main thread");
			Thread.sleep(2000);
		}
		
		

	}

}
