package excat.test;

import java.util.ArrayList;

public class TestCase20_1 extends CommonCase {
	//change for every case
	public static String pub="publi";
	static String pack="packag";
	protected static String prot="protect";
	private final static String caseNo = "20_1";
	

	public static void TestCase20_1(){
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		//new TestCase20_1().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 20_1 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		runCase("abc".getBytes()[0],(short)123,true,'c',new Object());
	}
	
	/**
	 * test virant
	 */
	private void runCase(byte atByte, short atShort, boolean atBoolean,char atChar, Object caseMessage) throws Throwable{
		System.out.println("in case 20_1");
		
		//do test work of this case
		String caseinfo = " is tested�`���|22��111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affaf�`���|22��111");
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
