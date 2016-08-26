package com.tinet.test.zjaojn;


public class ThreadDemo implements Runnable{
	private String name;
	private int count = 15;
	public ThreadDemo(String name){
		this.name = name;
	}
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		//synchronized (this) {
			for (int i = 0;i<5;i++){
				System.out.println(count--);
			}
		//}
	
	}
	
	public static void main(String[] args) throws InterruptedException {
		ThreadDemo t =  new ThreadDemo("my");
		new Thread(t,"c").start();
		
		new Thread(t,"d").start();
		new Thread(t,"e").start();
	}
	
}
