package test.returnvalue;

public class MethodReturnConstantValue extends MethodReturnValueBase {
	public MethodReturnConstantValue(){
		;
	}
	
	public boolean returnConstantBoolValue(boolean bParam){
		if(bParam == true){
			return true;
		}else{
			return false;
		}
	}
	
	public char returnConstantCharValue(){
		return 'd';
	}
	
	public byte returnConstantByteValue(){
		return 1;
	}
	
	public short returnConstantShortValue(short sParam){
		if(sParam > 0){
			return 31;
		}else{
			return -31;
		}
	}
	
	public int returnConstantIntValue(int nParam){
		if(nParam > 0){
			return 255;
		}else{
			return -255;
		}
	}
	
	public long returnConstantLongValue(long lParam){
		if(lParam > 0){
			return 65535;
		}else{
			return -65535;
		}
	}
	
	public float returnConstantFloatValue(float fParam){
		if(fParam > 0){
			return 123456;
		}else{
			return -123456;
		}
	}
	
	public double returnConstantDoubleValue(double dParam){
		if(dParam > 0){
			return 123.456;
		}else{
			return -123.456;
		}
	}
	
	public String returnConstantStringValue(){
		return "this is a constant value";
	}
}
