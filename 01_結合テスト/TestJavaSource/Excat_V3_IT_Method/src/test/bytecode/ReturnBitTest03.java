package test.bytecode;

public class ReturnBitTest03 {
	/**
	 * �_�����Z
	 * 
	 */
	//3_0 Int�^�r�b�g�����ɃV�t�g����
	public int ReturnIntLeftShift_3_0(){
		int a = 3;
		return a<<2;
	}
	//3_0 Long�^�r�b�g�����ɃV�t�g����
	public long ReturnLongLeftShift_3_0(){
		long a = 3;
		return a<<2;
	}
	//3_1 Int�^�r�b�g���E�ɃV�t�g����
	public int ReturnIntRightShift_3_1(){
		int a = 3;
		return a>>2;
	}
	//3_1 Long�^�r�b�g���E�ɃV�t�g����
	public long ReturnLongRightShift_3_1(){
		long a = 3;
		return a>>2;
	}
	
	//3_2 int�^�r�b�g���E�ɘ_���V�t�g����
	public int ReturnIntRightShift_3_2(){
		int a = 3;
		return a>>>2;
	}
	//3_2 Long�^�r�b�g���E�ɘ_���V�t�g����
	public long ReturnLongRightShift_3_2(){
		long a = 3;
		return a>>>2;
	}
	
	//3_3 int�^AND����
	public int ReturnIntAND_3_3(){
		int a = 3;
		int b = 4;
		return a & b;
	}
	//3_3 Long�^AND����
	public long ReturnLongAND_3_3(){
		long a = 3;
		long b = 4;
		return a & b;
	}
	
	//3_4 int�^OR����
	public int ReturnIntOR_3_4(){
		int a = 3;
		int b = 4;
		return a | b;
	}
	//3_4 Long�^OR����
	public long ReturnLongOR_3_4(){
		long a = 3;
		long b = 4;
		return a | b;
	}
	
	//3_5 int�^XOR����
	public int ReturnIntXOR_3_5(){
		int a = 3;
		int b = 4;
		return a ^ b;
	}
	//3_5 Long�^XOR����
	public long ReturnLongXOR_3_5(){
		long a = 3;
		long b = 4;
		return a ^ b;
	}
	
}
