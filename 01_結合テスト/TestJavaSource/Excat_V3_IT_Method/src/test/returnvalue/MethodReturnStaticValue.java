package test.returnvalue;
import test.customobj.*;

public class MethodReturnStaticValue extends MethodReturnValueBase {
    /** 構築関数 **/
	public MethodReturnStaticValue(byte byteParam){
		staticByteReturnValue = byteParam;
	}

	public MethodReturnStaticValue(short sParam){
		staticShortReturnValue = sParam;
	}
	
	public MethodReturnStaticValue(boolean bParam){
		staticBoolReturnValue = bParam;
	}
	
	public MethodReturnStaticValue(int nParam){
		staticIntReturnValue = nParam;
	}

	public MethodReturnStaticValue(long lParam){
		staticLongReturnValue = lParam;
	}
	
	public MethodReturnStaticValue(double dParam){
		staticDoubleReturnValue = dParam;
	}
	
	public MethodReturnStaticValue(float fParam){
		staticFloatReturnValue = fParam;
	}
	
	public MethodReturnStaticValue(char cParam){
		staticCharReturnValue = cParam;
	}
	
	public MethodReturnStaticValue(String strParam){
		staticStringReturnValue = strParam;
	}
	
	public MethodReturnStaticValue(TestObj001 objParam){
		staticCustomObjReturnValue = objParam;
	}
	
	/** メンバー変数の設定関数 **/
	public void setStaticByteReturnValue(byte byteParam){
		staticByteReturnValue = byteParam;
	}
	
	public void setStaticShortReturnValue(short sParam){
		staticShortReturnValue = sParam;
	}

	public void setStaticBoolReturnValue(boolean bParam){
		staticBoolReturnValue = bParam;
	}
	
	public void setStaticIntReturnValue(int nParam){
		staticIntReturnValue = nParam;
	}
	
	public void setStaticLongReturnValue(long lParam){
		staticLongReturnValue = lParam;
	}

	public void setStaticDoubleReturnValue(double dParam){
		staticDoubleReturnValue = dParam;
	}

	public void setStaticFloatReturnValue(float fParam){
		staticFloatReturnValue = fParam;
	}

	public void setStaticCharReturnValue(char cParam){
		staticCharReturnValue = cParam;
	}

	public void setStaticStringReturnValue(String strParam){
		staticStringReturnValue = strParam;
	}

	public void setStaticCustomObjReturnValue(TestObj001 objParam){
		staticCustomObjReturnValue = objParam;
	}
	
	//メンバー変数の戻す
	public byte getStaticByteReturnValue(){
		return staticByteReturnValue;
	}
	
	public short getStaticShortReturnValue(){
		return staticShortReturnValue;
	}

	public boolean getStaticBoolReturnValue(){
		return staticBoolReturnValue;
	}
	
	public int getStaticIntReturnValue(){
		return staticIntReturnValue;
	}
	
	public long getStaticLongReturnValue(){
		return staticLongReturnValue;
	}

	public double getStaticDoubleReturnValue(){
		return staticDoubleReturnValue;
	}

	public float getStaticFloatReturnValue(){
		return staticFloatReturnValue;
	}

	public char getStaticCharReturnValue(){
		return staticCharReturnValue;
	}

	public String getStaticStringReturnValue(){
		return staticStringReturnValue;
	}

	public TestObj001 getStaticCustomObjReturnValue(){
		return staticCustomObjReturnValue;
	}
	
	//Overrideメソッド
	public TestObj001 overrideMethod(){
		TestObj001 myTestObj001 = new TestObj001("this is created at MethodReturnStaticValue Class");
		return myTestObj001;
	}
}
