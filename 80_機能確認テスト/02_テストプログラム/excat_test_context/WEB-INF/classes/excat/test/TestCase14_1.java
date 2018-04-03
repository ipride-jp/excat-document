package excat.test;

public class TestCase14_1 extends CommonCase {
	//change for every case
	private final static String caseNo = "14_1";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		new TestCase14_1().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 14_1 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 14_1");
		
		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		m1();
	}
	
	/**
	 * 
	 */
	private void m1() throws RuntimeException{
		String mm1 = "1";
		m2();
	}
	
	private void m2() throws RuntimeException{
		String mm1 = "2";
		m3();
	}
	
	private void m3() throws RuntimeException{
		String mm1 = "3";
		m4();
	}

	private void m4() throws RuntimeException{
		String mm1 = "4";
		m5();
	}
	
	private void m5() throws RuntimeException{
		String mm1 = "5";
		m6();
	}
	
	private void m6() throws RuntimeException{
		String mm1 = "6";
		m7();
	}
	
	private void m7() throws RuntimeException{
		String mm1 = "7";
		m8();
	}
	
	private void m8() throws RuntimeException{
		String mm1 = "8";
		m9();
	}
	
	private void m9() throws RuntimeException{
		String mm1 = "9";
		m10();
	}

	private void m10() throws RuntimeException{
		String mm10 = "10";
		throw new RuntimeException("affafÅ`Ç†Å|22áä111");
	}
	
	
	
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
}
