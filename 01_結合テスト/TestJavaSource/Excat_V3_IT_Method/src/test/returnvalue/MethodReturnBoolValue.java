package test.returnvalue;

import test.customobj.TestObj001;

public class MethodReturnBoolValue extends MethodReturnValueBase {
	public MethodReturnBoolValue(boolean bParam){
		boolReturnValue = bParam;
	}
	
	public void setBoolReturnValue(boolean bParam){
		boolReturnValue = bParam;
	}   
	
	public boolean getBoolReturnValue() {
		// TODO Auto-generated method stub
		return boolReturnValue;
	}

	//OverrideÉÅÉ\ÉbÉh
	public TestObj001 overrideMethod(){
		TestObj001 myTestObj001 = new TestObj001("this is created at MethodReturnBoolValue Class");
		return myTestObj001;
	}
}
