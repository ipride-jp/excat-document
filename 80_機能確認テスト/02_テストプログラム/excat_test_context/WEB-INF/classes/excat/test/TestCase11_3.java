package excat.test;

public class TestCase11_3 extends CommonCase {
	//change for every case
	private final static String caseNo = "11_3";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new TestCase11_3().setConfigAndRunCase("fire ThreadDeatth in this case");
	}
	
	/**
	 * main process of Test Case 11_3 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 11_3");
		
		//do test work of this case
		String caseinfo = " is tested～あ－22㈱111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new ThreadDeath();
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
