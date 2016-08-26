package com.tinet.test.zjaojn;

public class Singleton {
	private static Singleton instance = null;
	private Singleton(){}
	@SuppressWarnings("unused")
	private  synchronized Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
			
		}
		return instance;
	}
}
//饿汉
//1 public class Singleton {  
//2     private static Singleton instance = new Singleton();  
//3     private Singleton (){}
//4     public static Singleton getInstance() {  
//5     return instance;  
//6     }  
//7 }  
