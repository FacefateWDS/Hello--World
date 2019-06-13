package com.test;
import java.util.*;
public class Test1 {

	public static void main(String[] args) {
		String str = "数学87分，语文79分，英语98分,";
		//str.trim();
		// String []strNumber;
		String strNumber[] = str.split("\\D+");
		String a = strNumber[1];
		String b = strNumber[2];
		String c = strNumber[3];
	
		StringTokenizer fenxi = new StringTokenizer("数学87分，语文79分，英语98分,","\\D+");
		System.out.println(fenxi.nextToken());
		//	
//		int Length[]=new int [3];
//		for (int i = 0; i < Length.length; i++)
//			//if(!strNumber[i].equals(""))
//			Length[i] = Integer.parseInt(strNumber[i+1]);
//
//		// System.out.println(a);
//
//		System.out.println(Length[0]);

	}

}





package com.test;

import java.util.Calendar;
import java.util.Date;

public class Test2 {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Date date = new Date();
		//格式组合输出
		
		String date1 = String.format("%tY年%<tm月%<td日", date);

		Calendar calendar1 = Calendar.getInstance();//初始化
		Calendar calendar2 = Calendar.getInstance();
		calendar1.set(2019, 6, 13);//设置时间
		calendar2.set(2019, 7, 26);
		Date date_1 = calendar1.getTime();//转化为Date
		Date date_2 = calendar2.getTime();
		//计算
		double days = (date_2.getTime() - date_1.getTime()) / (1000 * 60 * 60 * 24);
		System.out.println(days + "天");
		//System.out.println(calendar1.get());
	}

}
