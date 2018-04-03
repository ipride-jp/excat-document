package excat.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestCaseShift extends CommonCase {
	//change for every case
	private static String caseNo = null;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new TestCaseShift().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case P_9 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object no) throws Throwable{
		System.out.println("in case shift no");
		
		//do test work of this case
		String caseinfo = " is tested～あ－22㈱111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
//		throw new RuntimeException("affaf～あ－22㈱111");
		
		if(no != null && !"".equals((String)no)) {
			Util.command((String)no);
		
		}
	}
	

	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
