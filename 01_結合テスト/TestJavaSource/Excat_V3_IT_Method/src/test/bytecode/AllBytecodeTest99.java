package test.bytecode;


public class AllBytecodeTest99 {
	/**
	 * �z��
	 * 001 iastore, lastore, fastore, dastore, aastore, bastore, castore, sasoter - �z���int, long, float, double, �I�u�W�F�N�g, byte�܂���boolean, char, short���i�[�B
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
	 * ��r 002
	 * dcmpg, dcmpl - double���m���r�BNaN�̎���1, -1�B 
	 * fcmpg, fcmpl - float���m���r�BNaN�̎���1, -1�B 
	 * lcmp - long���m���r�B
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
	 * �������� 003
	 * ifeq, ifnull, iflt, ifle, ifne, ifnonnull, ifgt, ifge - �X�^�b�N�̒l��0, null, 0����, 0�ȉ�, 0�ȊO, null�ȊO, 0���傫��, 0�ȏ�Ȃ�W�����v���� 
	 * if_icmpeq, if_icmpne, if_icmplt, if_icmpgt, if_icmple, if_icmpge - 2��int�l���������A�������Ȃ��A���A���A���A���Ȃ�W�����v���� 
	 * if_acmpeq, if_acmpne - 2�̃I�u�W�F�N�g������A�قȂ�I�u�W�F�N�g���Q�Ƃ��Ă�����W�����v����B
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
	 * �W�����v 004
	 * goto, goto_w - ���݂̃v���O�����J�E���^�ɂ��ꂼ��2,4�o�C�g�������A�h���X�ɐ��䂪�ڂ�B 
	 * jsr, jsr_w - �T�u���[�`���փW�����v����Bgoto�ƈႢ�߂�A�h���X��ۑ�����B�߂�A�h���X�̒l�͂��ꂼ��W�����v�O�̃A�h���X+3,5�ƂȂ�B 
	 * ret - �T�u���[�`���̌Ăяo�����ɖ߂�B�A�h���X���i�[����Ă��郍�[�J���ϐ����w�肷��B 
	 * lookupswitch - switch����case���̒l���s�A���ł���ꍇ�l��T���Ȃ���W�����v���T���B 
	 * tableswitch - switch����case���̒l���A���ł���ꍇ�L�[�l��index�Ƃ��W�����v��A�h���X��l�Ƃ���z�����荂���ɃW�����v����B 
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
