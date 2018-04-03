package test.returnvalue;

import test.customobj.*;

public class MethodReturnMethodValue extends MethodReturnValueBase {
	public MethodReturnMethodValue(){
		;
	}
	
	public boolean returnBoolMethodValue(boolean bParam){
		boolReturnValue = bParam;
		return getBoolReturnValue();
	}
	
	public char returnCharMethodValue(char cParam){
		charReturnValue = cParam;
		return getCharReturnValue();
	}

	public byte returnByteMethodValue(byte byteParam){
		byteReturnValue = byteParam;
		return getByteReturnValue();
	}

	public short returnShortMethodValue(short sParam){
		shortReturnValue = sParam;
		return getShortReturnValue();
	}

	public int returnIntMethodValue(int nParam){
		intReturnValue = nParam;
		return getIntReturnValue();
	}

	public long returnLongMethodValue(long lParam){
		longReturnValue = lParam;
		return getLongReturnValue();
	}
	
	public float returnFloatMethodValue(float fParam){
		floatReturnValue = fParam;
		return getFloatReturnValue();
	}

	public double returnDoubleMethodValue(double dParam){
		doubleReturnValue = dParam;
		return getDoubleReturnValue();
	}

	public String returnStringMethodValue(String strParam){
		stringReturnValue = strParam;
		return getStringReturnValue();
	}

	public TestObj001 returnCustomObjMethodValue(TestObj001 objParam){
		customObjReturnValue = objParam;
		return getCustomObjReturnValue();
	}
	
}
