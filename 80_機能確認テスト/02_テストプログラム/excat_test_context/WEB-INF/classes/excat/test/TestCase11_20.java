package excat.test;

import java.util.ArrayList;

public class TestCase11_20 extends CommonCase {
	//change for every case
	private final static String caseNo = "11_20";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		new TestCase11_20().setConfigAndRunCase("methodSignature this case");
	}
	
	/**
	 * main process of Test Case 11_20 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 11_20");
		
		//do test work of this case
		String caseinfo = " is tested�`���|22��111";
		int i = 1;
		String str = "test11_20";
		ArrayList list = new ArrayList();
		
		try {
			methodA();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		
		methodA(i,str,list);
		
		//throw new RuntimeException((String)caseMessage + caseinfo);
		
	}
	
	private boolean methodA(int i, String str, ArrayList list) {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String methodStr = "methodA";
		throw new RuntimeException("affaf�`���|22��111 in methodA(int,String, ArrayList) ");
		//return true;
	}

	private boolean methodA() {
		// TODO �����������ꂽ���\�b�h�E�X�^�u
		String methodStr = "methodB";
		throw new RuntimeException("affaf�`���|22��111 in methodA ");
		//return false;
	}

	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
