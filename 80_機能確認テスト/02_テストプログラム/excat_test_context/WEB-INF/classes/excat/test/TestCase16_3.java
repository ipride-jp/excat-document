package excat.test;

public class TestCase16_3 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "16_3";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new TestCase16_3().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 16_3 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 16_3");
		
		//do test work of this case
		String caseinfo = " is tested～あ－22㈱111";
		
		StringBuffer buff = new StringBuffer("stringbuffer" + caseinfo);
		
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affaf～あ－22㈱111");
	}
	
	
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
