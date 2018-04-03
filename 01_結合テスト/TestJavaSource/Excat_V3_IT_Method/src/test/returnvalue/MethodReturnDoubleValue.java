package test.returnvalue;

import test.customobj.TestObj001;

public class MethodReturnDoubleValue extends MethodReturnValueBase {
	public MethodReturnDoubleValue(double dParam){
		doubleReturnValue = dParam;
	}
	
	public void setDoubleReturnValue(double dParam){
		doubleReturnValue = dParam;
	}
	
	public double getDoubleReturnValue() {
		// TODO Auto-generated method stub
		return doubleReturnValue;
	}

	//OverrideÉÅÉ\ÉbÉh
	public TestObj001 overrideMethod(){
		TestObj001 myTestObj001 = new TestObj001("this is created at MethodReturnDoubleValue Class");
		return myTestObj001;
	}
}
