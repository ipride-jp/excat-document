package excat.test;

import java.util.ArrayList;

public class TestCase21_3 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "21_3";
	static String caseinfo = " is tested�`���|22��111";
	static byte atByte = 'a'; 
	static short atShort = 123;
	static boolean atBoolean = true; 
	static char atChar = 'c';
	static Object atObject = "object";
	

	public static void TestCase21_3(){
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		//new TestCase21_3().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 21_3 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 21_3");
		
		testThis(this, this);
		
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
	
	private void testThis(TestCase21_3 obj, TestCase21_3 obj2) {

		System.out.println(obj.toString());
		System.out.println(obj.atBoolean);
		System.out.println(obj.atObject);
		
		//do test work of this case
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affaf�`���|22��111");
	}
}
