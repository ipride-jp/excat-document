package test.returnvalue;

import test.customobj.*;

public interface MethodReturnValue {
	public byte getByteReturnValue();
	public short getShortReturnValue();
	
    public int getIntReturnValue();

    public long getLongReturnValue();
    public float getFloatReturnValue();
    public double getDoubleReturnValue();

    public char getCharReturnValue();
    
    public String getStringReturnValue();
    
    public boolean getBoolReturnValue();
    
    public TestObj001 getCustomObjReturnValue();
}
