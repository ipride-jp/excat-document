package excat.test;

import java.util.ArrayList;
import java.util.HashMap;

public class TestCaseP_10 extends CommonCase {
	//change for every case
	private final static String caseNo = "P_10";
	public static HashMap nestDepth1 = new HashMap();
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO é©ìÆê∂ê¨Ç≥ÇÍÇΩÉÅÉ\ÉbÉhÅEÉXÉ^Éu
		new TestCaseP_10().setConfigAndRunCase("fire runtime exception in this case");
	}
	
	/**
	 * main process of Test Case P_10 
	 * fire a RuntimeException
	 * 
	 * if it is necesary, 
	 * call setConfigAndRunCase() to change config file
	 */
	public void runCase(Object caseMessage) throws Throwable{
		System.out.println("in case P_10");
		
		//do test work of this case
		String caseinfo = " is testedÅ`Ç†Å|22áä111";
		//throw new RuntimeException((String)caseMessage + caseinfo);
//		throw new RuntimeException("affafÅ`Ç†Å|22áä111");
		m1();
	}
	
	private void m1() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-10",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m2(oa);
	}
	
	private void m2(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
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
		m11();
	}

	private void m11() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-11",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m12(oa);
	}
	
	private void m12(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m13();
	}
	
	private void m13() throws RuntimeException{
		String mm1 = "3";
		m14();
	}

	private void m14() throws RuntimeException{
		String mm1 = "4";
		m15();
	}
	
	private void m15() throws RuntimeException{
		String mm1 = "5";
		m16();
	}
	
	private void m16() throws RuntimeException{
		String mm1 = "6";
		m17();
	}
	
	private void m17() throws RuntimeException{
		String mm1 = "7";
		m18();
	}
	
	private void m18() throws RuntimeException{
		String mm1 = "8";
		m19();
	}
	
	private void m19() throws RuntimeException{
		String mm1 = "9";
		m21();
	}
	
	private void m21() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-12",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m22(oa);
	}
	
	private void m22(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m23();
	}
	
	private void m23() throws RuntimeException{
		String mm1 = "3";
		m24();
	}

	private void m24() throws RuntimeException{
		String mm1 = "4";
		m25();
	}
	
	private void m25() throws RuntimeException{
		String mm1 = "5";
		m26();
	}
	
	private void m26() throws RuntimeException{
		String mm1 = "6";
		m27();
	}
	
	private void m27() throws RuntimeException{
		String mm1 = "7";
		m28();
	}
	
	private void m28() throws RuntimeException{
		String mm1 = "8";
		m29();
	}
	
	private void m29() throws RuntimeException{
		String mm1 = "9";
		m31();
	}
	
	private void m31() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-13",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m32(oa);
	}
	
	private void m32(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m33();
	}
	
	private void m33() throws RuntimeException{
		String mm1 = "3";
		m34();
	}

	private void m34() throws RuntimeException{
		String mm1 = "4";
		m35();
	}
	
	private void m35() throws RuntimeException{
		String mm1 = "5";
		m36();
	}
	
	private void m36() throws RuntimeException{
		String mm1 = "6";
		m37();
	}
	
	private void m37() throws RuntimeException{
		String mm1 = "7";
		m38();
	}
	
	private void m38() throws RuntimeException{
		String mm1 = "8";
		m39();
	}
	
	private void m39() throws RuntimeException{
		String mm1 = "9";
		m41();
	}
	
	private void m41() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-14",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m42(oa);
	}
	
	private void m42(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m43();
	}
	
	private void m43() throws RuntimeException{
		String mm1 = "3";
		m44();
	}

	private void m44() throws RuntimeException{
		String mm1 = "4";
		m45();
	}
	
	private void m45() throws RuntimeException{
		String mm1 = "5";
		m46();
	}
	
	private void m46() throws RuntimeException{
		String mm1 = "6";
		m47();
	}
	
	private void m47() throws RuntimeException{
		String mm1 = "7";
		m48();
	}
	
	private void m48() throws RuntimeException{
		String mm1 = "8";
		m49();
	}
	
	private void m49() throws RuntimeException{
		String mm1 = "9";
		m51();
	}
	
	private void m51() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-15",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m52(oa);
	}
	
	private void m52(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m53();
	}
	
	private void m53() throws RuntimeException{
		String mm1 = "3";
		m54();
	}

	private void m54() throws RuntimeException{
		String mm1 = "4";
		m55();
	}
	
	private void m55() throws RuntimeException{
		String mm1 = "5";
		m56();
	}
	
	private void m56() throws RuntimeException{
		String mm1 = "6";
		m57();
	}
	
	private void m57() throws RuntimeException{
		String mm1 = "7";
		m58();
	}
	
	private void m58() throws RuntimeException{
		String mm1 = "8";
		m59();
	}
	
	private void m59() throws RuntimeException{
		String mm1 = "9";
		m61();
	}
	
	private void m61() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-16",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m62(oa);
	}
	
	private void m62(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m63();
	}
	
	private void m63() throws RuntimeException{
		String mm1 = "3";
		m64();
	}

	private void m64() throws RuntimeException{
		String mm1 = "4";
		m65();
	}
	
	private void m65() throws RuntimeException{
		String mm1 = "5";
		m66();
	}
	
	private void m66() throws RuntimeException{
		String mm1 = "6";
		m67();
	}
	
	private void m67() throws RuntimeException{
		String mm1 = "7";
		m68();
	}
	
	private void m68() throws RuntimeException{
		String mm1 = "8";
		m69();
	}
	
	private void m69() throws RuntimeException{
		String mm1 = "9";
		m71();
	}
	
	private void m71() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-17",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m72(oa);
	}
	
	private void m72(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m73();
	}
	
	private void m73() throws RuntimeException{
		String mm1 = "3";
		m74();
	}

	private void m74() throws RuntimeException{
		String mm1 = "4";
		m75();
	}
	
	private void m75() throws RuntimeException{
		String mm1 = "5";
		m76();
	}
	
	private void m76() throws RuntimeException{
		String mm1 = "6";
		m77();
	}
	
	private void m77() throws RuntimeException{
		String mm1 = "7";
		m78();
	}
	
	private void m78() throws RuntimeException{
		String mm1 = "8";
		m79();
	}
	
	private void m79() throws RuntimeException{
		String mm1 = "9";
		m81();
	}
	
	private void m81() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-18",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m82(oa);
	}
	
	private void m82(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m83();
	}
	
	private void m83() throws RuntimeException{
		String mm1 = "3";
		m84();
	}

	private void m84() throws RuntimeException{
		String mm1 = "4";
		m85();
	}
	
	private void m85() throws RuntimeException{
		String mm1 = "5";
		m86();
	}
	
	private void m86() throws RuntimeException{
		String mm1 = "6";
		m87();
	}
	
	private void m87() throws RuntimeException{
		String mm1 = "7";
		m88();
	}
	
	private void m88() throws RuntimeException{
		String mm1 = "8";
		m89();
	}
	
	private void m89() throws RuntimeException{
		String mm1 = "9";
		m91();
	}
	
	private void m91() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-19",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m92(oa);
	}
	
	private void m92(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m93();
	}
	
	private void m93() throws RuntimeException{
		String mm1 = "3";
		m94();
	}

	private void m94() throws RuntimeException{
		String mm1 = "4";
		m95();
	}
	
	private void m95() throws RuntimeException{
		String mm1 = "5";
		m96();
	}
	
	private void m96() throws RuntimeException{
		String mm1 = "6";
		m97();
	}
	
	private void m97() throws RuntimeException{
		String mm1 = "7";
		m98();
	}
	
	private void m98() throws RuntimeException{
		String mm1 = "8";
		m99();
	}
	
	private void m99() throws RuntimeException{
		String mm1 = "9";
		m101();
	}

	private void m101() throws RuntimeException{
		String mm1 = "1";
		

		HashMap nestDepth11 = new HashMap();
		HashMap nestDepth10 = new HashMap();
		HashMap nestDepth9 = new HashMap();
		HashMap nestDepth8 = new HashMap();
		HashMap nestDepth7 = new HashMap();
		HashMap nestDepth6 = new HashMap();
		HashMap nestDepth5 = new HashMap();
		HashMap nestDepth4 = new HashMap();
		HashMap nestDepth3 = new HashMap();
		HashMap nestDepth2 = new HashMap();
	
		
		nestDepth11.put("11-2","b");nestDepth11.put("11-3","c");nestDepth11.put("11-4","d");
		nestDepth10.put("10-1",nestDepth11);nestDepth10.put("10-2","bbbbb");nestDepth10.put("10-3","ccccc");nestDepth10.put("10-4","ddddd");
		nestDepth9.put("9-1",nestDepth10);nestDepth9.put("9-2","bbbb");nestDepth5.put("9-3","cccc");nestDepth9.put("9-4","dddd");
		nestDepth8.put("8-1",nestDepth9);nestDepth8.put("8-2","bbb");nestDepth8.put("8-3","ccc");nestDepth8.put("8-4","ddd");
		nestDepth7.put("7-1",nestDepth8);nestDepth7.put("7-2","bb");nestDepth7.put("7-3","cc");nestDepth7.put("7-4","dd");
		nestDepth6.put("6-1",nestDepth7);nestDepth6.put("6-2","b");nestDepth6.put("6-3","c");nestDepth6.put("6-4","d");
		nestDepth5.put("5-1",nestDepth6);nestDepth5.put("5-2","bbbbb");nestDepth5.put("5-3","ccccc");nestDepth5.put("5-4","ddddd");
		nestDepth4.put("4-1",nestDepth5);nestDepth4.put("4-2","bbbb");nestDepth4.put("4-3","cccc");nestDepth4.put("4-4","dddd");
		nestDepth3.put("3-1",nestDepth4);nestDepth3.put("3-2","bbb");nestDepth3.put("3-3","ccc");nestDepth3.put("3-4","ddd");
		nestDepth2.put("2-1",nestDepth3);
		nestDepth2.put("2-2","bb");
		nestDepth2.put("2-3","cc");
		nestDepth2.put("2-4","dd");
		nestDepth1.put("1-110",nestDepth2);
		nestDepth1.put("1-2","b");
		nestDepth1.put("1-3","c");
		nestDepth1.put("1-4","d");
		
		Object[] oa = new Object[101];
		for(int i=0;i<101;i++) {
			ArrayList lst = new ArrayList();
			lst.add("oa"+i);
			oa[i] = lst;	
		}
		
		m102(oa);
	}
	
	private void m102(Object[] oa) throws RuntimeException{
		String mm1 = "2";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<100;i++) {
			sb.append(""+i);
		}
		
		m103();
	}
	
	private void m103() throws RuntimeException{
		String mm1 = "3";
		m104();
	}

	private void m104() throws RuntimeException{
		String mm1 = "4";
		m105();
	}
	
	private void m105() throws RuntimeException{
		String mm1 = "5";
		m106();
	}
	
	private void m106() throws RuntimeException{
		String mm1 = "6";
		m107();
	}
	
	private void m107() throws RuntimeException{
		String mm1 = "7";
		m108();
	}
	
	private void m108() throws RuntimeException{
		String mm1 = "8";
		m109();
	}
	
	private void m109() throws RuntimeException{
		String mm1 = "9";
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
