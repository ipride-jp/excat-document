package test.bytecode;

public class ReturnArrayTest01 {
	byte bInstance = 1;
	byte[] bArrayInstance ={1,2,3};
	
	//return instance byte=1
	public byte ReturnInstanceByte(){
		return bInstance;
	}
	//return local byte=2
	public byte ReturnLocalByte(){
		byte bLocal = 2;
		return bLocal; 
	}
	
	/**
	 * 配列1 start: bytecode is 
	 * [1_0 getfiled, 1_0 aload_N]
	 * [1_1 iaload, laload, faload, daload, aaload, baload, caload, saload]
	 * [1_2 newarray, 1_3 anewarray,1_4 multianewarray,1_5 arraylength]
	 */
	
	//1_0 return instance array 
	public byte[] ReturnArray_1_0_InstanceByte(){
		return bArrayInstance;
	}
	
	//1_0 return local array
	public byte[] ReturnArray_1_0_LocalByte(){
		byte[] bArrayLocal= {4,5,6};
		return bArrayLocal;
	}
	
	//1_1 return int from array
	public int ReturnInt_1_1_FromArray(){
		int[] iArray= {128,129,130};
		return iArray[1];
	}
	
	//1_1 return long from array
	public long ReturnLong_1_1_FromArray(){
		long[] lArray= {128,129,130};
		return lArray[1];
	}
	
	//1_1 return float from array
	public float ReturnFloat_1_1_FromArray(){
		float[] fArray= {128,129,130};
		return fArray[1];
	}
	
	//1_1 return double from array
	public double ReturnDouble_1_1_FromArray(){
		double[] dArray= {128,129,130};
		return dArray[1];
	}
	//1_1 return String from array
	public String ReturnString_1_1_FromArray(){
		String[] sArray= {"a", "b" ,"c"};
		return sArray[1];
	}
	
	//1_1 return byte from array
	public byte ReturnByte_1_1_FromArray(){
		byte[] bArray= {1,2,3};
		return bArray[1];
	}
	//1_1 return boolean from array
	public boolean ReturnBoolean_1_1_FromArray(){
		boolean[] bArray= {true,false};
		return bArray[0];
	}
	
	//1_1 return char from array
	public char ReturnChar_1_1_FromArray(){
		char[] cArray= {'a','b','c'};
		return cArray[1];
	}
	
	//1_1 return short from array
	public short ReturnShort_1_1_FromArray(){
		short[] sArray= {1,2,3};
		return sArray[1];
	}
	
	//1_2 return new array
	public byte[] Return_1_2_NewArrayByte(){
		return new byte[2];
	}

	//1_3 return object array
	public String[] Return_1_3_ANewArray(){
		return new String[2];
	}

	//1_3 return object array1
	public String[] Return_1_3_ANewArray1(){
		String[] str = new String[2];
		str[0] = "aa";
		return new String[2];
	}
	
	//1_4 return 二次元配列
	public byte[][] Return_1_4_MultiaNewArray(){
		byte[][] multiaArray = {{1,2},{3,4}};
		return multiaArray;
	}
	
	//1_4 return 二次元配列
	public byte[][] Return_1_4_MultiaNewArray1(){
		return new byte[1][1];
	}
	
	//1_5 return 配列の長さ
	public int Return_1_5_ArrayLength(){
		return new byte[4].length;
	}
	
	//1_5 return 配列の長さ
	public int Return_1_5_ArrayLength1(){
		return bArrayInstance.length;
	}
	
	//1_5 return 配列の長さ
	public byte Return_1_5_ArrayLengthWithCast(){
		return (byte) new byte[4].length;
	}
}
