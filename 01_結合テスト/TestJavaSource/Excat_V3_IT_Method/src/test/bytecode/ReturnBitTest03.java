package test.bytecode;

public class ReturnBitTest03 {
	/**
	 * 論理演算
	 * 
	 */
	//3_0 Int型ビットを左にシフトする
	public int ReturnIntLeftShift_3_0(){
		int a = 3;
		return a<<2;
	}
	//3_0 Long型ビットを左にシフトする
	public long ReturnLongLeftShift_3_0(){
		long a = 3;
		return a<<2;
	}
	//3_1 Int型ビットを右にシフトする
	public int ReturnIntRightShift_3_1(){
		int a = 3;
		return a>>2;
	}
	//3_1 Long型ビットを右にシフトする
	public long ReturnLongRightShift_3_1(){
		long a = 3;
		return a>>2;
	}
	
	//3_2 int型ビットを右に論理シフトする
	public int ReturnIntRightShift_3_2(){
		int a = 3;
		return a>>>2;
	}
	//3_2 Long型ビットを右に論理シフトする
	public long ReturnLongRightShift_3_2(){
		long a = 3;
		return a>>>2;
	}
	
	//3_3 int型ANDする
	public int ReturnIntAND_3_3(){
		int a = 3;
		int b = 4;
		return a & b;
	}
	//3_3 Long型ANDする
	public long ReturnLongAND_3_3(){
		long a = 3;
		long b = 4;
		return a & b;
	}
	
	//3_4 int型ORする
	public int ReturnIntOR_3_4(){
		int a = 3;
		int b = 4;
		return a | b;
	}
	//3_4 Long型ORする
	public long ReturnLongOR_3_4(){
		long a = 3;
		long b = 4;
		return a | b;
	}
	
	//3_5 int型XORする
	public int ReturnIntXOR_3_5(){
		int a = 3;
		int b = 4;
		return a ^ b;
	}
	//3_5 Long型XORする
	public long ReturnLongXOR_3_5(){
		long a = 3;
		long b = 4;
		return a ^ b;
	}
	
}
