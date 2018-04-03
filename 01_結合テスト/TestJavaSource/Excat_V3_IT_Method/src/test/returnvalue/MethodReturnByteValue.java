package test.returnvalue;

public class MethodReturnByteValue extends MethodReturnValueBase {
	public MethodReturnByteValue(byte byteParam){
		byteReturnValue = byteParam;
	}
	
	public void setByteReturnValue(byte byteParam){
		byteReturnValue = byteParam;
	}
	
   @Override
	public byte getByteReturnValue() {
		// TODO Auto-generated method stub
		return byteReturnValue;
	}   
}
