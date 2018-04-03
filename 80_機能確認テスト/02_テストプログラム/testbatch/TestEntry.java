package excat.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestEntry {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
//		boolean isJDK14 = false;
//		if(args != null && args.length > 0) {
//			if(args[0].indexOf("14") >= 0) {
//				isJDK14 = true;
//			}
//		}
		
		List lst = new ArrayList();
		if(args != null && args.length != 0) {
			lst = Arrays.asList(args);
		}
		else {
			args = null;
		}
		
		
		System.out.println("!!!!!!! test start !!!!!!!");
		System.out.println("!!!!!!! test start !!!!!!!" + lst);
		
		if(args == null || lst.contains("7_5")) {
			TestCase7_5 cat7_5 = new TestCase7_5();
			cat7_5.setConfigAndRunCase("test Throwable");
			sleepMoment();
		}
		
		if(args == null || lst.contains("7_11")) {
			TestCase7_11 cat7_11 = new TestCase7_11();
			cat7_11.setConfigAndRunCase("test folder");
			sleepMoment();
		}
		
		if(args == null || lst.contains("9_1")) {
			TestCase9_1 cat9_1 = new TestCase9_1();
			cat9_1.setConfigAndRunCase("test Throwable ");
			sleepMoment();		
		}
		
		if(args == null || lst.contains("9_2")) {
			TestCase9_2 cat9_2 = new TestCase9_2();
			cat9_2.setConfigAndRunCase("test runtime exception ");
			sleepMoment();		
		}
		
		if(args == null || lst.contains("9_3")) {
			TestCase9_3 cat9_3 = new TestCase9_3();
			cat9_3.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("9_4")) {
			TestCase9_4 cat9_4 = new TestCase9_4();
			cat9_4.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("9_5")) {
			TestCase9_5 cat9_5 = new TestCase9_5();
			cat9_5.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("10_1")) {
			TestCase10_1 cat10_1 = new TestCase10_1();
			cat10_1.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("10_2")) {
			TestCase10_2 cat10_2 = new TestCase10_2();
			cat10_2.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("10_3")) {
			TestCase10_3 cat10_3 = new TestCase10_3();
			cat10_3.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("10_4")) {
			TestCase10_4 cat10_4 = new TestCase10_4();
			cat10_4.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_1")) {
			TestCase11_1 cat11_1 = new TestCase11_1();
			cat11_1.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_2")) {
			TestCase11_2 cat11_2 = new TestCase11_2();
			cat11_2.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_3")) {
			TestCase11_3 cat11_3 = new TestCase11_3();
			cat11_3.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_4")) {
			TestCase11_4 cat11_4 = new TestCase11_4();
			cat11_4.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_5")) {
			TestCase11_5 cat11_5 = new TestCase11_5();
			cat11_5.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_6")) {
			TestCase11_6 cat11_6 = new TestCase11_6();
			cat11_6.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_7")) {
			TestCase11_7 cat11_7 = new TestCase11_7();
			cat11_7.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_8")) {
			TestCase11_8 cat11_8 = new TestCase11_8();
			cat11_8.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_9")) {
			TestCase11_9 cat11_9 = new TestCase11_9();
			cat11_9.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_10")) {
			TestCase11_10 cat11_10 = new TestCase11_10();
			cat11_10.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_11")) {
			TestCase11_11 cat11_11 = new TestCase11_11();
			cat11_11.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_12")) {
			TestCase11_12 cat11_12 = new TestCase11_12();
			cat11_12.setConfigAndRunCase("test runtime exception ");
			sleepMoment();
		}
		
//		if(!isJDK14) {
//			TestCase11_13 cat11_13 = new TestCase11_13();
//			cat11_13.setConfigAndRunCase("test JM exception ");
//			sleepMoment();
//		}
		
		if(args == null || lst.contains("11_14")) {
			TestCase11_14 cat11_14 = new TestCase11_14();
			cat11_14.setConfigAndRunCase("test NoSuchMethod exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_15")) {
			TestCase11_15 cat11_15 = new TestCase11_15();
			cat11_15.setConfigAndRunCase("test NotBound exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_16")) {
			TestCase11_16 cat11_16 = new TestCase11_16();
			cat11_16.setConfigAndRunCase("test IllegalArgument exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_17")) {
			TestCase11_17 cat11_17 = new TestCase11_17();
			cat11_17.setConfigAndRunCase("test Servlet exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_18")) {
			TestCase11_18 cat11_18 = new TestCase11_18();
			cat11_18.setConfigAndRunCase("test SQL exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_19")) {
			TestCase11_19 cat11_19 = new TestCase11_19();
			cat11_19.setConfigAndRunCase("test AppException exception ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("11_20")) {
			TestCase11_20 cat11_20 = new TestCase11_20();
			cat11_20.setConfigAndRunCase("test MethodSignature ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("12_1")) {
			TestCase12_1 cat12_1 = new TestCase12_1();
			cat12_1.setConfigAndRunCase("test wildcard ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("12_2")) {
			TestCase12_2 cat12_2 = new TestCase12_2();
			cat12_2.setConfigAndRunCase("test sameTaskTag ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("12_3")) {
			TestCase12_3 cat12_3 = new TestCase12_3();
			cat12_3.setConfigAndRunCase("test sameMonitoringTargetTag ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("12_4")) {
			TestCase12_4 cat12_4 = new TestCase12_4();
			cat12_4.setConfigAndRunCase("test addTaskTag ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("13_1")) {
			TestCase13_1 cat13_1 = new TestCase13_1();
			cat13_1.setConfigAndRunCase("test notMoniteringTarget ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("13_2")) {
			TestCase13_2 cat13_2 = new TestCase13_2();
			cat13_2.setConfigAndRunCase("test exceptionFiter ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("13_3")) {
			TestCase13_3 cat13_3 = new TestCase13_3();
			cat13_3.setConfigAndRunCase("test runtimeExceptionFiter ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("13_4")) {
			TestCase13_4 cat13_4 = new TestCase13_4();
			cat13_4.setConfigAndRunCase("test changeMonitoringPlace ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("13_5")) {
			TestCase13_5 cat13_5 = new TestCase13_5();
			cat13_5.setConfigAndRunCase("test deleteMoniteringTarget ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("14_1")) {
			TestCase14_1 cat14_1 = new TestCase14_1();
			cat14_1.setConfigAndRunCase("test stackTraceDepth=-1 ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("14_2")) {
			TestCase14_2 cat14_2 = new TestCase14_2();
			cat14_2.setConfigAndRunCase("test stackTraceDepth=15 ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("14_3")) {
			TestCase14_3 cat14_3 = new TestCase14_3();
			cat14_3.setConfigAndRunCase("test variable argument ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("14_4")) {
			TestCase14_4 cat14_4 = new TestCase14_4();
			cat14_4.setConfigAndRunCase("test all true ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("15_1")) {
			TestCase15_1 cat15_1 = new TestCase15_1();
			cat15_1.setConfigAndRunCase("test public fals ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("15_2")) {
			TestCase15_2 cat15_2 = new TestCase15_2();
			cat15_2.setConfigAndRunCase("test all fals ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("15_3")) {
			TestCase15_3 cat15_3 = new TestCase15_3();
			cat15_3.setConfigAndRunCase("test attributeNestDepth=-1 ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("16_1")) {
			TestCase16_1 cat16_1 = new TestCase16_1();
			cat16_1.setConfigAndRunCase("test attributeNestDepth=5 ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("16_2")) {
			TestCase16_2 cat16_2 = new TestCase16_2();
			cat16_2.setConfigAndRunCase("test attributeNestDepth=15 ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("16_3")) {
			TestCase16_3 cat16_3 = new TestCase16_3();
			cat16_3.setConfigAndRunCase("test encodeError ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("16_4")) {
			TestCase16_4 cat16_4 = new TestCase16_4();
			cat16_4.setConfigAndRunCase("test mapAndList ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("16_5")) {
			TestCase16_5 cat16_5 = new TestCase16_5();
			cat16_5.setConfigAndRunCase("test Thread ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("17_1")) {
			TestCase17_1 cat17_1 = new TestCase17_1();
			cat17_1.setConfigAndRunCase("test objectElement ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("17_2")) {
			TestCase17_2 cat17_2 = new TestCase17_2();
			cat17_2.setConfigAndRunCase("test maxValue ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("17_3")) {
			TestCase17_3 cat17_3 = new TestCase17_3();
			cat17_3.setConfigAndRunCase("test objectClass=' ' ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("17_4")) {
			TestCase17_4 cat17_4 = new TestCase17_4();
			cat17_4.setConfigAndRunCase("test fieldName=' ' ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("18_1")) {
			TestCase18_1 cat18_1 = new TestCase18_1();
			cat18_1.setConfigAndRunCase("test addArrayList ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("18_2")) {
			TestCase18_2 cat18_2 = new TestCase18_2();
			cat18_2.setConfigAndRunCase("test fieldValue=false ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("18_3")) {
			TestCase18_3 cat18_3 = new TestCase18_3();
			cat18_3.setConfigAndRunCase("test objectValid=false ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("18_4")) {
			TestCase18_4 cat18_4 = new TestCase18_4();
			cat18_4.setConfigAndRunCase("test deleteField ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("18_5")) {
			TestCase18_5 cat18_5 = new TestCase18_5();
			cat18_5.setConfigAndRunCase("test deleteObject ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("18_6")) {
			TestCase18_6 cat18_6 = new TestCase18_6();
			cat18_6.setConfigAndRunCase("test deleteObjectElement ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("20_1")) {
			TestCase20_1 cat20_1 = new TestCase20_1();
			cat20_1.setConfigAndRunCase("test object Variable on debug");
			sleepMoment();
		}
		
		if(args == null || lst.contains("20_2")) {
			TestCase20_2 cat20_2 = new TestCase20_2();
			cat20_2.setConfigAndRunCase("test deleteObjectElement ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("20_3")) {
			TestCase20_3 cat20_3 = new TestCase20_3();
			cat20_3.setConfigAndRunCase("test deleteObjectElement ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("21_1")) {
			TestCase21_1 cat21_1 = new TestCase21_1();
			cat21_1.setConfigAndRunCase("test 21_1 object");
			sleepMoment();
		}
		
		if(args == null || lst.contains("21_2")) {
			TestCase21_2 cat21_2 = new TestCase21_2();
			cat21_2.setConfigAndRunCase("test deleteObjectElement ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("21_3")) {
			TestCase21_3 cat21_3 = new TestCase21_3();
			cat21_3.setConfigAndRunCase("test deleteObjectElement ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("37_1")) {
			TestCase37_1 cat37_1 = new TestCase37_1();
			cat37_1.setConfigAndRunCase("test array ");
			sleepMoment();
		}
		
		if(args == null || lst.contains("37_2")) {
			TestCase37_2 cat37_2 = new TestCase37_2();
			cat37_2.setConfigAndRunCase("test object array ");
		}
		
		System.out.println("!!!!!!! test end !!!!!!!");
		
	}
	
	private static void sleepMoment() {
		try {
			Thread.sleep(7000); //7 seconds
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
