package com.test;
import java.util.Calendar;
import java.util.Date;
public class Tesy {
public static void main(String[] args) {
	Calendar calendar=Calendar.getInstance();//实例化方法
	calendar.setTime(new Date());//转化为calendar
	calendar.set(2019,5,12);//设置时间，calendar简单
	Date date=calendar.getTime();//进行转化为date
	System.out.println(date);
	
}
}
