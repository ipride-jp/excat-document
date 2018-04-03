package excat.test;

public class TestCase11_8 extends CommonCase {
	//change for every case
	private final static String caseNo = "11_8";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new TestCase11_8().setConfigAndRunCase("fire classNotFound exception in this case");
	}
	
	/**
	 * main process of Test Case 11_8 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 11_8");
		
		//do test work of this case
		String caseinfo = " is tested～あ－22㈱111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new ClassNotFoundException("affaf～あ－22㈱111");
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
