package com.test;
import java.lang.String;
public class Test {
public static void main(String[] args) {
	String name=new String("n");
	Object o="name";
	double[] a=new double[1];
	Object b=new Integer(1);
	Object c=new Test();
	Object f=new Object();
	System.out.println(o.toString());//输出相应的,子类
	System.out.println(a.toString());//输出相应的int,[D@7852e922，改变不了相应的
	System.out.println(b.toString());
	System.out.println(c.toString());
	System.out.println(f.toString());
}
}
//结果
//name
//[D@7852e922
//1
//com.test.Test@4e25154f
//java.lang.Object@70dea4e

