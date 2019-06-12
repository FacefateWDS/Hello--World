package test;

public class Test {

	public static void main(String[] args) {
//		String b = null;
//		// String c=b;
//		String c = new String(b);// 对于此是空指针，
//		// 在堆中，而通过null直接初始化的不会，仍然报null
//		System.out.println(c);
//		/*
//		 * Exception in thread "main" java.lang.NullPointerException at
//		 * java.lang.String.<init>(Unknown Source) at test.Test.main(Test.java:8)
//		 */
		
		
		
		
		
		
//		System.out.println(new Test()+22);它尽管有toString()，但并沒有一开始识别为""
		System.out.println(new Test()+"22");
		String name=" name";
		System.out.println(name.equals("NAME"));
		System.out.println(name.equalsIgnoreCase("Name"));
		System.out.println(name.endsWith("e"));
		System.out.println(name.compareTo("a"));//如果大于字符串name,为正数
		System.out.println(name.startsWith("am",1));//索引是第二个数
		System.out.println(name.length());//中间空格也算
		System.out.println(name.toUpperCase());
		/*
		 * 字符串的查找字符串看书135页。
		 * 注意未搜索返回-1
		 */
		String n[]=new String[44];
		System.out.println(name.trim());//去掉首尾空格
		System.out.println(name.substring(2));//索引取，截取
		System.out.println(name.replace("n", "m"));//替代
		System.out.println((n=name.split("a",-1))[1]);//返回发是地址,对于字符串数组
		//然而数组的里头一部分则是内容
		
		
	
		
		
		
		
	}
}
//结果
// test.Test@7852e92222
// false
// false
// true
// -65
// false
// 5
//  NAME
// name
// ame
//  mame
// me
