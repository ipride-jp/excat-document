package excat.test;

public abstract class CommonCase {
	
	/**
	 * abstract method of test case
	 * must override this method for every case
	 * 
	 * @param caseMessage
	 */
	public abstract void runCase(Object caseMessage) throws Throwable;
	
	/**
	 * get case no from child class 
	 * @return
	 */
	protected abstract String getCaseNo();
	
	/**
	 * reset excat config file and 
	 * wait a minute for new config becoming valid and 
	 * run this test case
	 *  
	 * @param caseMessage
	 */
	public void setConfigAndRunCase(Object caseMessage) {
		//get test case no
		String caseNo = getCaseNo();
		
		//copy property file to excat home 
		changePropertyFile(caseNo);
		
		//wait some minutes for config file becoming valid.
		doSleep();
		
		try {
			runCase(caseMessage);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * change excat property file 
	 * function : copy caseNo\*.* to excat_home\DumpStack\
	 * 
	 * @param caseNo
	 */
	private void changePropertyFile(String caseNo) {
		Util.command(caseNo);
	}
	
	/**
	 * make current thread sleep 
	 * for waiting property file was changed completely
	 *
	 */
	private void doSleep() {
		try {
			Thread.sleep(5000); //5 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
