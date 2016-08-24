package com.tinet.test.zjaojn;

import java.lang.reflect.Field;

public class ReflectionDemoTwo {
	public static void main(String[] args) {
		Reflection refi = new Reflection();
		Class temp = refi.getClass();
		try {
			Field[] f = temp.getFields();
			for(int i=0;i<f.length;i++){
				Class c = f[i].getType();
				System.out.println("scope:"+c);
			}
			
			Field[] p = temp.getDeclaredFields();
			for(int j = 0;j<p.length;j++){
				Class c = p[j].getType();
				System.out.println("scope:"+c);
			}
			
			Field pr = temp.getDeclaredField("w");
			pr.setAccessible(true);
			Integer bb = (Integer)pr.get(refi);
			System.out.println(bb);
			
			Field pu = temp.getDeclaredField("a");
			pu.setAccessible(true);
			Integer aa = (Integer)pu.get(refi);
			System.out.println(bb);
			pu.set(refi, 1);
			Integer lo = (Integer)pu.get(refi);
			System.out.println("a的值:"+lo);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
