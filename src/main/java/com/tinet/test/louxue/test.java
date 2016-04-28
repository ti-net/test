package com.tinet.test.louxue;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test {
	
	public static void exceptionMethod() {
		try {
			System.out.print( 6/0 );
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param args
	 * @throws ParseException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws ParseException, IOException {
		
		String entIds="19,20,19";
		String[]entArray = entIds.split(",");
		System.out.println(Arrays.toString(entArray));
		List list = new LinkedList();
		for (int i = 0; i < entArray.length; i++) {
			if(!list.contains(entArray[i])){
				list.add(entArray[i]);
			}
		}
		entArray = (String[])list.toArray(new String[list.size()]); 
		System.out.println(Arrays.toString(entArray));
		exceptionMethod();
		
		String hotline = "4006869009";
		int hotlineLen = hotline.length();
		int start = hotlineLen - 6;
		String ruleNum = hotline.substring(start,hotlineLen);
		System.out.println("ruleNum = "+ruleNum);
		String AAAXYZ = "([0-9])\\1{2}((?:0(?=1)|1(?=2)|2(?=3)|3(?=4)|4(?=5)|5(?=6)|6(?=7)|7(?=8)|8(?=9)){2}|(?:9(?=8)|8(?=7)|7(?=6)|6(?=5)|5(?=4)|4(?=3)|3(?=2)|2(?=1)|1(?=0)){2}|890|098)";
		String ABCXYZ = "(012|123|234|345|456|567|678|789|890|980|876|765|654|543|432|321|210){2}";
		String ___ABC = "[\\d]{3}((?:0(?=1)|1(?=2)|2(?=3)|3(?=4)|4(?=5)|5(?=6)|6(?=7)|7(?=8)|8(?=9)){2}|890|098|(?:9(?=8)|8(?=7)|7(?=6)|6(?=5)|5(?=4)|4(?=3)|3(?=2)|2(?=1)|1(?=0)){2})";
		String ABCABC = "^(\\d)(\\d)(\\d)\\1\\2\\3$";
		String ABC = "(?:(?:0(?=1)|1(?=2)|2(?=3)|3(?=4)|4(?=5)|5(?=6)|6(?=7)|7(?=8)|8(?=9)){2}|(?:9(?=8)|8(?=7)|7(?=6)|6(?=5)|5(?=4)|4(?=3)|3(?=2)|2(?=1)|1(?=0)){2})\\d|890|098";
		System.out.println("AAAXYZ == 051012 ?"+Pattern.compile(AAAXYZ).matcher("051012").find());
		System.out.println("ABCABC == 726726 ?"+Pattern.compile(ABCABC).matcher("726726").find());
		System.out.println("ABCXYZ == 654012 ?"+Pattern.compile(ABCXYZ).matcher("654012").find());
		System.out.println("ABC == 987 ?"+Pattern.compile(ABC).matcher("987654").find());
		System.out.println("***ABC == 051012 ?"+Pattern.compile(___ABC).matcher("051012").find());
		
		long a = 1419370051;
		
		System.out.println(new Date(new Long(1422719999) * 1000));
		
		System.out.println(new Date(a * 1000));
		
		System.out.println(new Date(new Long(1419370051* 1000)));
		
		System.out.println(new Date(1419370051*1000));
		
		System.out.println(new Date(new Long(1420091999) * 1000));
		
		System.out.println(new Date());
		
		System.out.println(new BigDecimal("0").equals(new BigDecimal("0")));
		System.out.println(new BigDecimal("0.0").equals(new BigDecimal("0")));
		
		System.out.println("*****UUID==="+UUID.randomUUID());
		
		System.out.println("0,1,0,0".contains("1"));
		System.out.println("0".contains("1"));
		System.out.println("1".contains("1"));
		
		System.out.println("1,'"+null+"'");
		System.out.println("哈哈哈哈");		
		System.out.println("Conflicts coming");
		System.out.println("777");
		System.out.println("release 1.1.4");
	}
}




    