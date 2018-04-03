package test.bytecode;

import java.util.ArrayList;
import java.util.List;

public class ReturnTypeCastTest05 {
	/**
	 *型キャスト 
	 */
	
	//5_0 オブジェクトの型を確認
	public B ReturnCheckCastOnObject_5_0(){
		A a = null;
		return (B) a;
	}
	
	//5_0 オブジェクトの型を確認
	public ArrayList ReturnCheckCastOnArray_5_0(){
		List lst = null;
		return (ArrayList) lst;
	}
	
	//5_1 instatnceof 
	public boolean ReturnInstanceof_5_1(){
		B a = new B();
		return a instanceof B;
	}
	//5_1 instatnceof 
	public boolean ReturnInstanceof1_5_1(){
		Object a = new Object();
		return a instanceof A;
	}
	
	//5_2 i2l, i2f, i2d, i2b, i2c, i2s - intからlong, float, double, byte, char, shortに型キャスト
	//5_2 int to Long
	public long ReturnIntToLong_5_2(){
		int a =1;
		return a;
	}
	//5_2 int to float
	public float ReturnIntToFloat_5_2(){
		int a =1;
		return a;
	}
	//5_2 int to double
	public double ReturnIntToDouble_5_2(){
		int a =1;
		return a;
	}
	//5_2 int to byte
	public byte ReturnIntToByte_5_2(){
		int a =1;
		return (byte) a;
	}
	//5_2 int to char
	public char ReturnIntToChar_5_2(){
		int a =1;
		return (char) a;
	}
	//5_2 int to short
	public short ReturnIntToShort_5_2(){
		int a =1;
		return (short) a;
	}
	//5_3 l2i, l2f, l2d - longからint, float, doubleに型キャスト
	//5_3 long to int
	public int ReturnLongToInt_5_3(){
		long a =1;
		return (int) a;
	}
	//5_3 long to float
	public float ReturnLongToFloat_5_3(){
		long a =1;
		return a;
	}
	//5_3 long to double
	public double ReturnLongToDouble_5_3(){
		long a =1;
		return a;
	}
	//5_4 f2i, f2l, f2d - floatからint, long, doubleに型キャスト
	//5_4 float to int
	public int ReturnFloatToInt_5_4(){
		float a =1;
		return (int) a;
	}
	//5_4 float to long
	public long ReturnFloatToLong_5_4(){
		float a =1;
		return (long) a;
	}
	//5_4 float to double
	public double ReturnFloatToDouble_5_4(){
		float a =1;
		return a;
	}
	
	// 5_5 d2i, d2l, d2f - doubleからint, long, floatに型キャスト
	//5_5 double to int
	public int ReturnDoubleToInt_5_5(){
		double a = 1;
		return (int) a;
	}
	//5_5 double to long
	public long ReturnDoubleToLong_5_5(){
		double a = 1;
		return (long) a;
	}
	//5_5 double to float
	public float ReturnDoubleToFloat_5_5(){
		double a = 1;
		return (float) a;
	}
}

class A {
	
}
class B extends A{
	
}