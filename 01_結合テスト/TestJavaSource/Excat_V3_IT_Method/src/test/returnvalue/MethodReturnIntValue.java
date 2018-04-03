package test.returnvalue;

import test.customobj.TestObj001;

public class MethodReturnIntValue extends MethodReturnValueBase {
	
	public MethodReturnIntValue(int nParam){
		intReturnValue = nParam;
	}
	
	public void setIntReturnValue(int nParam){
		intReturnValue = nParam;
	}
	
	@Override
	public int getIntReturnValue() {
		// TODO Auto-generated method stub
		return intReturnValue;
	}
	//Overrideƒƒ\ƒbƒh
	public TestObj001 overrideMethod(){
		TestObj001 myTestObj001 = new TestObj001("this is created at MethodReturnIntValue Class");
		return myTestObj001;
	}
}
