package excat.test;


public class TestCase11_4 extends CommonCase {
	//change for every case
	private final static String caseNo = "11_4";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		new TestCase11_4().setConfigAndRunCase("fire TokenMgrError in this case");
	}
	
	/**
	 * main process of Test Case 11_4 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 11_4");
		
		//do test work of this case
		String caseinfo = " is tested�`���|22��111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new IllegalAccessError(caseinfo);
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
