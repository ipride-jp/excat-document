package excat.test;

public class TestCase17_3 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "17_3";
	Float flo = new Float(1.64F);
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO ฉฎถฌณ๊ฝ\bhEX^u
		new TestCase17_3().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 17_3 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 17_3");
		
		//do test work of this case
		String caseinfo = " is tested` |22111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affaf` |22111");
	}
	
	
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
