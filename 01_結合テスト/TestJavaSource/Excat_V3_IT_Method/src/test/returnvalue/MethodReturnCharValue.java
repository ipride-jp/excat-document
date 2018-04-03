package test.returnvalue;

import test.customobj.TestObj001;

public class MethodReturnCharValue extends MethodReturnValueBase {
	public MethodReturnCharValue(char cParam){
		charReturnValue = cParam;
	}
	
	public void setCharReturnValue(char cParam){
		charReturnValue = cParam;
	}
	@Override
	public char getCharReturnValue() {
		// TODO Auto-generated method stub
		return charReturnValue;
	}

	//Overrideƒƒ\ƒbƒh
	public TestObj001 overrideMethod(){
		TestObj001 myTestObj001 = new TestObj001("this is created at MethodReturnCharValue Class");
		return myTestObj001;
	}
}
