package excat.test;

import java.util.Date;

public class TestCase37_3 extends CommonCase {
	//change for every case
	private final static String caseNo = "37_3";
	
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new TestCase37_3().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 37_3 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 37_3");
		
		Long lmax = new Long(1234567890123456789L);//"0x7fffffffffffffffL====9223372036854775807";
		Double dbl = new Double(100.001);
		
		Object[][] sa = new Object[3][2];
		sa[0][0] = "00";
		sa[0][1] = "01";
		sa[1][0] = lmax;
		sa[1][1] = dbl;
		sa[2][0] = null;
		
		//do test work of this case
		String caseinfo = " is tested あいうえお　全角カナ　半角ｶﾀｶﾅ";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException(caseinfo);
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
