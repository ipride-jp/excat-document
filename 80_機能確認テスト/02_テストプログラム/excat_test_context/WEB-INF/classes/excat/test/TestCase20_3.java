package excat.test;

import java.util.ArrayList;

public class TestCase20_3 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "20_3";
	static String caseinfo = " is tested�`���|22��111";
	static byte atByte = 'a'; 
	static short atShort = 123;
	static boolean atBoolean = true; 
	static char atChar = 'c';
	static Object atObject = "object";
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		//new TestCase20_3().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 20_3 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 20_3");
		
		testThis(this);
		
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
	
	private void testThis(TestCase20_3 obj) {

		//do test work of this case
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affaf�`���|22��111");
	}
	
}
