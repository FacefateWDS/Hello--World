package 课程;

public class AccountException extends Exception {

	/**
	 * 
	 */
	//目前没学，JAVA版本
	private static final long serialVersionUID = 1L;
	
	private String content;    //错误返回信息

	public AccountException(String content) {
		this.content = content;
	}

	public String getContent() {
		return this.content;
	}

	/*
	 * 在某些使用数字的系统中使用
	 */
//	private double amount;    //错误返回的金额
//
//	public AccountException(double amount) {
//		this.amount = amount;
//	}
//
//	public double getAmount() {
//		return amount;
//	}
}












package 课程;

public class SAccount {
	double money = 5000;
	
	public SAccount(double amount) throws AccountException{
		try {
			deposit(amount);
		}catch(AccountException e) {
			System.out.println("银行卡内存款只能为正数");
			System.out.println("异常:"+e.getStackTrace());
		}	
	}
	public SAccount(){
		//默认构造方法
	}
	// 存钱
	public void deposit(double amount) throws AccountException {
		if (amount > 0) {
			money += amount;
		} else {
			throw new AccountException("存钱不能为负数");
			// 抛出一个AccountException异常
		}
	}

	// 取钱
	public void getMoney(double amount) throws AccountException {
		if(amount<0) {
			throw new AccountException("请输入正的取钱数！");
		}
		if (amount <= money) {
			money -= amount;
		}
      /*else if(amount<0) {
			throw new AccountException("请输入正的取钱数！");
		}如果放在这里，将无法实现功能*/
		else {
			//double salary = money - amount;
			throw new AccountException("余额不够，请查看余额");
		}
	}
}






package 课程;

class SMain {
	
	public static void main(String[] args)	 {
		SAccount account=new SAccount();
		try{ 
			SAccount wo=new SAccount(-500); 
		}catch(AccountException e){//捕获AccountException异常  
//存钱异常提醒，输出异常描述信息 
		    System.out.println(e.getContent());
		    System.out.println("异常:"+e.getStackTrace()); 
		}
		try{ 
			account.deposit(-4); 
		}catch(AccountException e){//捕获AccountException异常  
//存钱异常提醒，输出异常描述信息 
		    System.out.println(e.getContent());
		    System.out.println("异常:"+e.getStackTrace()); 
		}
		try{
			account.getMoney(10000.0);
		}catch(AccountException e){//捕获AccountException异常
//取钱异常提醒，输出异常描述信息
			System.out.println("余额不足,取出多于余额所缺的钱:"+e.getAmount());
			System.out.println("异常:"+e.getStackTrace());
		}
		try{
			account.getMoney(-100.0);
		}catch(AccountException e){//捕获AccountException异常
//取钱异常提醒，输出异常描述信息
			System.out.println(e.getContent());
			System.out.println(e.toString());//输出了异常的名字
			System.out.println("异常:"+e.getStackTrace());//输出了异常所发生的地址
		}
	}
	
}

/*
存钱不能为负数
异常:[Ljava.lang.StackTraceElement;@15db9742
余额不足,取出多于余额所缺的钱:-5000.0
异常:[Ljava.lang.StackTraceElement;@6d06d69c
请输入正的取钱数！
异常:[Ljava.lang.StackTraceElement;@7852e922

*/
