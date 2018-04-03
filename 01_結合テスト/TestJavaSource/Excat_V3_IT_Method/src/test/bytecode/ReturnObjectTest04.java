package test.bytecode;

public class ReturnObjectTest04 {
	/**
	 * オブジェクト４
	 * 
	 */
	int a = 0;
	static int b = 1;
	//4_0 オブジェクト生成(未成功)
	public String ReturnNewObject_4_0(){
		return new String();
	}
	
	//4_0 オブジェクト生成(未成功)
	public String ReturnNewObject_4_0_1(){
		String a = new String();
		return a;
	}
	
	//4_1　メンバ変数の取り出し。
	public int ReturnField_4_1(){
		return a;
	}
	
	//4_2　Static変数の取り出し。
	public int ReturnStatic_4_2(){
		return b;
	}
}
