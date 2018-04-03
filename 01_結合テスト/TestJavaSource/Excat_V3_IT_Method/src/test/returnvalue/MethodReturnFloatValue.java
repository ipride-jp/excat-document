package test.returnvalue;

public class MethodReturnFloatValue extends MethodReturnValueBase {
	public MethodReturnFloatValue(float fParam){
		floatReturnValue = fParam;
	}
	
	public void setFloatReturnValue(float fParam){
		floatReturnValue = fParam;
	}
	
	@Override
	public float getFloatReturnValue() {
		// TODO Auto-generated method stub
		return floatReturnValue;
	}
	
}
