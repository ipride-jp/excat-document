package test.returnvalue;

public class MethodReturnShortValue extends MethodReturnValueBase {
	public MethodReturnShortValue(short sParam){
		shortReturnValue = sParam;
	}
	
	public void setShortReturnValue(short sParam){
		shortReturnValue = sParam;
	}
	
  @Override
	public short getShortReturnValue() {
		// TODO Auto-generated method stub
		return shortReturnValue;
	}
}
