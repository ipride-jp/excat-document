package excat.test;

public class TestCaseP_2 extends CommonCase {
	//change for every case
	private final static String caseNo = "P_2";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new TestCaseP_2().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case P_2 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case P_2");
		
		//do test work of this case
		String caseinfo = " is tested p2";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affaf p2 111");
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
