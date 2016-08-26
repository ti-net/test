package com.tinet.test.zjaojn;

public class BankDemo implements Runnable{
	
	private int count = 100;
	private int money(int pay){
		return count - pay;
	}
	@Override
	public void run() {
		synchronized (this) {
			for (int i = 0 ;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"ppp "+i);  
				System.out.println(money(i));
			}
		}
	}
	
	public static void main(String[] args) {
		BankDemo t = new BankDemo();
		new Thread(t,"c").start();
		new Thread(t,"d").start();
		new Thread(t,"e").start();
	
	}
	
}
