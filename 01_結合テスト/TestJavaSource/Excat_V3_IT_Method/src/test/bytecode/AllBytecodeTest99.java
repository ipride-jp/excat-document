package test.bytecode;


public class AllBytecodeTest99 {
	/**
	 * 配列
	 * 001 iastore, lastore, fastore, dastore, aastore, bastore, castore, sasoter - 配列にint, long, float, double, オブジェクト, byteまたはboolean, char, shortを格納。
	 */
	public void Test_Array_001(){

		int[] arr_int = new int[2];
		//iastore
		arr_int[0] = 1;
		
		long[] arr_long = new long[1];
		//lastore
		arr_long[0] = 2;
		
		float[] arr_float = new float[1];
		//fastore
		arr_float[0] = 3;
		
		double[] arr_double = new double[1];
		//dastore
		arr_double[0] = 4;
		
		String[] arr_String = new String[1];
		//aastore
		arr_String[0] = "a";
		
		byte[] arr_byte = new byte[1];
		//bastore
		arr_byte[0] = 6;
		boolean[] arr_boolean = new boolean[1];
		//bastore
		arr_boolean[0] = true;
		
		char[] arr_char = new char[1];
		//castore
		arr_char[0] = 'a';
		
		short[] arr_short = new short[1];
		//sasoter
		arr_short[0] = 7;
		
	}
	
	/**
	 * 比較 002
	 * dcmpg, dcmpl - double同士を比較。NaNの時は1, -1。 
	 * fcmpg, fcmpl - float同士を比較。NaNの時は1, -1。 
	 * lcmp - long同士を比較。
	 */
	public void Test_CMP_002(){
		double ad = 1234.0;
		double bd = 5678.0;
		double d = 0;
		//dcmpl
		d = ad > bd? ad:bd;
		//dcmpg
		d = ad < bd? bd:ad;
		
		float af = 1234;
		float bf = 5678;
		//fcmpl
		d = af > bf? af:bf;
		//fcmpg
		d = af < bf? bf:af;
		
		long al = 1234;
		long bl = 3456;
		//lcmp
		d = al > bl? al:bl;
		d = al < bl? al:bl;
	}
	
	/**
	 * 条件分岐 003
	 * ifeq, ifnull, iflt, ifle, ifne, ifnonnull, ifgt, ifge - スタックの値が0, null, 0未満, 0以下, 0以外, null以外, 0より大きい, 0以上ならジャンプする 
	 * if_icmpeq, if_icmpne, if_icmplt, if_icmpgt, if_icmple, if_icmpge - 2つのint値が等しい、等しくない、＜、＞、≦、≧ならジャンプする 
	 * if_acmpeq, if_acmpne - 2つのオブジェクトが同一、異なるオブジェクトを参照していたらジャンプする。
	 */
	public void Test_IF_003(){
		int a = 0;
		int b = 1;
		int c = -1;
		String aa = null;
		String bb = "aa";
		String cc = "aa";
		//ifeq
		if(bb.equals(cc)){
		};
		//ifnull
		if (aa != null) {
		};
		//iflt
		if (c >= 0) {
		};
		//ifle
		if (c > 0) {
		};
		//ifne
		if (c == 0) {
		};
		//ifnonnull
		if (aa == null) {
		};
		//ifgt
		if (c <= 0) {
		}
		//ifge
		if (c < 0) {
		};
		//if_icmpne
		if(a == b){
		};
		//if_icmpeq
		if(a != b){
			
		};
		//if_icmpge
		if(a < b){
			
		}
		//if_icmple
		if(a > b){
			
		}
		//if_icmpgt
		if(a <= b){
			
		}
		//if_icmplt
		if(a >= b){
			
		}
		//if_acmpne
		if (aa == bb){
			
		}
		//if_acmpeq
		if (aa != bb){
			
		}
	}

	/**
	 * ジャンプ 004
	 * goto, goto_w - 現在のプログラムカウンタにそれぞれ2,4バイト加えたアドレスに制御が移る。 
	 * jsr, jsr_w - サブルーチンへジャンプする。gotoと違い戻りアドレスを保存する。戻りアドレスの値はそれぞれジャンプ前のアドレス+3,5となる。 
	 * ret - サブルーチンの呼び出し元に戻る。アドレスが格納されているローカル変数を指定する。 
	 * lookupswitch - switch文のcase式の値が不連続である場合値を探しながらジャンプ先を探す。 
	 * tableswitch - switch文のcase式の値が連続である場合キー値をindexとしジャンプ先アドレスを値とする配列を作り高速にジャンプする。 
	 */
	public void Test_JUMP_004(){
		@SuppressWarnings("unused")
		int a = 2;
		boolean b = false;
		String c = "a";
		//goto
		if(b == true){
			a = 3;
		} else {
			a = 4;
		}
		//lookupswitch
		switch(a){
		case 0:
			a = 5;
			break;
		case 2:
			a = 6;
			break;
		default:
			a = 7;
			break;
		}
	
	}
	
}
