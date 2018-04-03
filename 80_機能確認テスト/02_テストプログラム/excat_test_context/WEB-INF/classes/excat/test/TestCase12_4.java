package excat.test;

public class TestCase12_4 extends CommonCase {
	//change for every case
	private final static String caseNo = "12_4";
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		new TestCase12_4().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case 12_4 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case 12_4");
		
		//reset config file
		preSetConf();
		
		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
		throw new RuntimeException("affafÅ`Ç†Å|22áä111");
	}
	
	/**
	 * all case is same for this method
	 */
	//@Override
	public String getCaseNo() {
		return caseNo;
	}
	
	private void preSetConf() {
		String preNo = "12_4_2";
		//copy property file to excat home 
		Util.command(preNo);	
		
		//wait some minutes for config file becoming valid.
		doSleep2();
		
	}
	
	private void doSleep2() {
		try {
			Thread.sleep(5000); //5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
