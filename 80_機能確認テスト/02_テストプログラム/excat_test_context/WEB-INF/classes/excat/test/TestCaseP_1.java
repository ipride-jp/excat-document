package excat.test;

public class TestCaseP_1 extends CommonCase {
	//change for every case
	private final static String caseNo = "P_1";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestCaseP_1().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case P_4 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case P_1");
		
		//do test work of this case
		String caseinfo = " is tested p1";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affaf p1 111");
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
