package test.bytecode;

public class ReturnObjectTest04 {
	/**
	 * �I�u�W�F�N�g�S
	 * 
	 */
	int a = 0;
	static int b = 1;
	//4_0 �I�u�W�F�N�g����(������)
	public String ReturnNewObject_4_0(){
		return new String();
	}
	
	//4_0 �I�u�W�F�N�g����(������)
	public String ReturnNewObject_4_0_1(){
		String a = new String();
		return a;
	}
	
	//4_1�@�����o�ϐ��̎��o���B
	public int ReturnField_4_1(){
		return a;
	}
	
	//4_2�@Static�ϐ��̎��o���B
	public int ReturnStatic_4_2(){
		return b;
	}
}
