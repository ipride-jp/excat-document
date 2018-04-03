package excat.test;

import java.util.Date;

public class TestCase23_1 extends CommonCase {
	//change for every case
	private final static String caseNo = "23_1";
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new TestCase23_1().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 23_1 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 23_1");
		
		Sub23_1A a = new Sub23_1A();
		Sub23_1B b = new Sub23_1B(a);
		
		Date d = new Date();
		d.setTime(60000);
		String now = d.toString();
		
		//do test work of this case
		String caseinfo = " is tested 111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affaf 111");
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
