package test.returnvalue;

import test.customobj.TestObj001;

public class MethodReturnLongValue extends MethodReturnValueBase {
	public MethodReturnLongValue(long lParam){
		longReturnValue = lParam;
	}
	
	public void setLongReturnValue(long lParam){
		longReturnValue = lParam;
	}
	
	@Override
	public long getLongReturnValue() {
		// TODO Auto-generated method stub
		return longReturnValue;
	}
	
	//OverrideÉÅÉ\ÉbÉh
	public TestObj001 overrideMethod(){
		TestObj001 myTestObj001 = new TestObj001("this is created at MethodReturnLangValue Class");
		return myTestObj001;
	}
}
