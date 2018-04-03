package test.returnvalue;

import test.customobj.*;

public class MethodReturnLocalValue extends MethodReturnValueBase {
	public MethodReturnLocalValue(){
		;
	}
	
	public boolean getLocalBoolValue(boolean bParam){
		boolean bTemp = bParam;
		return bTemp;
	}
	
	public char getLocalCharValue(char charParam){
		char charTemp = charParam;
		return charTemp;
	}
	
	public byte getLocalByteValue(byte byteParam){
		byte byteTemp = byteParam;
		return byteTemp;
	}
	
	public short getLocalShortValue(short sParam){
		short sTemp = sParam;
		return sTemp;
	}
	
	public int getLocalIntValue(int nParam){
		int nTemp = nParam;
		return nTemp;
	}
    
	public long getLocalLongValue(long lParam){
		long lTemp = lParam;
		return lTemp;
	}
	
	public float getLocalFloatValue(float fParam){
		float fTemp = fParam;
		return fTemp;
	}
	
	public double getLocalDoubleValue(double dParam){
		double dTemp = dParam;
		return dTemp;
	}
	
	public String getLocalStringValue(String strParam){
		String strTemp = strParam;
		return strTemp;
	}
	
	public TestObj001 getLocalCustomObjValue(TestObj001 objParam){
		TestObj001 objTemp = objParam;
		return objTemp;
	}
}
