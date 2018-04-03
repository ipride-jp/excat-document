package test.returnvalue;

import test.customobj.*;
public class MethodReturnObjValue extends MethodReturnValueBase {
	public MethodReturnObjValue(TestObj001 objParam){
		customObjReturnValue = objParam;
	}
	
	public void setCustomObjReturnValue(TestObj001 objParam){
		customObjReturnValue = objParam;
	}
	public TestObj001 getCustomObjReturnValue() {
		// TODO Auto-generated method stub
		return customObjReturnValue;
	}
	
	//OverrideÉÅÉ\ÉbÉh
	public TestObj001 overrideMethod(){
		TestObj001 myTestObj001 = new TestObj001("this is created at MethodReturnObjValue Class");
		return myTestObj001;
	}
}
