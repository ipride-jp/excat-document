package test.returnvalue;

import test.customobj.TestObj001;

public class MethodReturnStringValue extends MethodReturnValueBase {
	public MethodReturnStringValue(String strParam){
		stringReturnValue = strParam;
	}
	
	public void setStringReturnValue(String strParam){
		stringReturnValue = strParam;
	}
	
	public String getStringReturnValue() {
		// TODO Auto-generated method stub
		return stringReturnValue;
	}
	
	//OverrideÉÅÉ\ÉbÉh
	public TestObj001 overrideMethod(){
		TestObj001 myTestObj001 = new TestObj001("this is created at MethodReturnStringValue");
		return myTestObj001;
	}
}
