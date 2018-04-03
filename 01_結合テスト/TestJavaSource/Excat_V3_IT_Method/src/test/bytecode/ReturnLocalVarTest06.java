package test.bytecode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReturnLocalVarTest06 {
	/**
	 * ローカル変数
	 */
	
	//6_0 iload, lload, fload, dload, aload - ローカル変数からint, long, float, double, オブジェクトを取り出してスタックに積む。
	// 6_0 int
	public int ReturnLocalInt_6_0(){
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		return d;
	}
	// 6_0 long
	public long ReturnLocalLong_6_0(){
		long a = 0;
		long b = 0;
		long c = 0;
		long d = 0;
		return d;
	}
	// 6_0 float
	public float ReturnLocalFloat_6_0(){
		float a = 0;
		float b = 0;
		float c = 0;
		float d = 0;
		return d;
	}
	// 6_0 double
	public double ReturnLocalDouble_6_0(){
		double a = 0;
		double b = 0;
		double c = 0;
		double d = 0;
		return d;
	}
	// 6_0 object
	public String ReturnLocalString_6_0(){
		String a = "a";
		String b = "a";
		String c = "a";
		String d = "a";
		return d;
	}
	// 6_0 list<Object>
	public List ReturnLocalListObject_6_0(){
		String a = "a";
		String b = "a";
		String c = "a";
		List<String> d = new ArrayList<String>();
		d.add("a");
		return d;
	}
	// 6_0 list<map>
	public List ReturnLocalListMap_6_0(){
		String a = "a";
		String b = "a";
		String c = "a";
		Map<String, String> m = new HashMap<String, String>();
		m.put("1", "a");
		List<Map> d = new ArrayList<Map>();
		d.add(m);
		return d;
	}
	// 6_0 Map<object,object>
	public Map ReturnLocalMapObject_6_0(){
		String a = "a";
		String b = "a";
		String c = "a";
		Map<String,String> d = new HashMap<String,String>();
		return d;
	}
	// 6_0 Map<object,list>
	public Map ReturnLocalMapList_6_0(){
		String a = "a";
		String b = "a";
		String c = "a";
		List<String> l = new ArrayList<String>();
		l.add("a");
		Map<String,List> d = new HashMap<String,List>();
		d.put("1", l);
		return d;
	}
	// 6_0 Map<object,Map>
	public Map ReturnLocalMapMap_6_0(){
		String a = "a";
		String b = "a";
		String c = "a";
		Map<String,String> l = new HashMap<String,String>();
		l.put("a","b");
		Map<String,Map> d = new HashMap<String,Map>();
		d.put("1", l);
		return d;
	}
	
	//6_1 iload_0, iload_1, iload_2, iload_3 - n番目のローカル変数からintを取り出してスタックに積む。
	//6_1 iload_1
	public int ReturnLocalInt1_6_1(){
		int a = 1;
		return a;
	}
	//6_1 iload_2
	public int ReturnLocalInt2_6_1(){
		int a = 1;
		int b = 1;
		return b;
	}
	//6_1 iload_3
	public int ReturnLocalInt3_6_1(){
		int a = 1;
		int b = 1;
		int c = 1;
		return c;
	}
	
	//lload_0, lload_1, lload_2, lload_3 - n番目のローカル変数からlongを取り出してスタックに積む。
	//6_2 lload_1
	public long ReturnLocalLong1_6_2(){
		long a = 1;
		return a;
	}
	//6_2 lload_2
	public long ReturnLocalLong2_6_2(){
		int a = 1;
		long b = 1;
		return b;
	}
	//6_2 lload_3
	public long ReturnLocalLong3_6_2(){
		int a = 1;
		int b = 1;
		long c = 1;
		return c;
	}
	
	//6_3 fload_0, fload_1, fload_2, fload_3 - n番目のローカル変数からfloatを取り出してスタックに積む。
	//6_3 fload_1
	public float ReturnLocalFloat1_6_3(){
		float a = 1;
		return a;
	}
	//6_3 fload_2
	public float ReturnLocalFloat2_6_3(){
		float a = 1;
		float b = 1;
		return b;
	}
	//6_3 fload_3
	public float ReturnLocalFloat3_6_3(){
		float a = 1;
		float b = 1;
		float c = 1;
		return c;
	}
	
	// 6_4 dload_0, dload_1, dload_2, dload_3 - n番目のローカル変数からdoubleを取り出してスタックに積む。
	//6_4 dload_1
	public double ReturnLocalDouble1_6_4(){
		double a = 1;
		return a;
	}
	//6_4 dload_2
	public double ReturnLocalDouble2_6_4(){
		int a = 1;
		double b = 12;
		return b;
	}
	//6_4 dload_3
	public double ReturnLocalDouble3_6_4(){
		int a = 1;
		int b = 12;
		double c = 13;
		return c;
	}
	
	// 6_5aload_0, aload_1, aload_2, aload_3 - n番目のローカル変数からオブジェクトを取り出してスタックに積む。
	//6_5 aload_1
	public String ReturnLocalString1_6_5(){
		String a = "";
		return a;
	}
	//6_5 aload_2
	public String ReturnLocalString2_6_5(){
		String a = "";
		String b = "";
		return b;
	}
	//6_5 aload_3
	public String ReturnLocalString3_6_5(){
		String a = "";
		String b = "";
		String c = "";
		return c;
	}
}
