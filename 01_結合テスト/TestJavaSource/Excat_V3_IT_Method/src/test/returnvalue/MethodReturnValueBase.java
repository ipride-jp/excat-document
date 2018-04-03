package test.returnvalue;

import test.customobj.TestObj001;

public class MethodReturnValueBase implements MethodReturnValue {
    public short shortReturnValue = 1;
	public byte byteReturnValue = 2;
    public int intReturnValue = 3;
    public long longReturnValue = 4;
    public float floatReturnValue = 5;
    public double doubleReturnValue = 6;
    public char  charReturnValue = '0';
    public String stringReturnValue = "00";
    public boolean boolReturnValue = false;
    public TestObj001 customObjReturnValue = null;
	
    static short staticShortReturnValue = 0;
    static byte staticByteReturnValue = 0;
    static int staticIntReturnValue = 0;
    static long staticLongReturnValue = 0;
    static double staticDoubleReturnValue = 0;
    static char  staticCharReturnValue = ' ';
    static float staticFloatReturnValue = 0;
    static String staticStringReturnValue = " ";
    static boolean staticBoolReturnValue = false;
    static TestObj001 staticCustomObjReturnValue = null;

    @Override
	public byte getByteReturnValue() {
		// TODO Auto-generated method stub
		return byteReturnValue;
	}   
 
    @Override
	public short getShortReturnValue() {
		// TODO Auto-generated method stub
		return shortReturnValue;
	}   
	
    @Override
	public boolean getBoolReturnValue() {
		// TODO Auto-generated method stub
		return boolReturnValue;
	}

	@Override
	public char getCharReturnValue() {
		// TODO Auto-generated method stub
		return charReturnValue;
	}

	@Override
	public double getDoubleReturnValue() {
		// TODO Auto-generated method stub
		return doubleReturnValue;
	}

	@Override
	public int getIntReturnValue() {
		// TODO Auto-generated method stub
		return intReturnValue;
	}

	@Override
	public long getLongReturnValue() {
		// TODO Auto-generated method stub
		return longReturnValue;
	}
	
	@Override
	public float getFloatReturnValue() {
		// TODO Auto-generated method stub
		return floatReturnValue;
	}
	
	@Override
	public String getStringReturnValue() {
		// TODO Auto-generated method stub
		return stringReturnValue;
	}
	
	@Override
	public TestObj001 getCustomObjReturnValue() {
		// TODO Auto-generated method stub
		return customObjReturnValue;
	}
	

	//OverrideÉÅÉ\ÉbÉh
	public TestObj001 overrideMethod(){
		return customObjReturnValue;
	}

	public int testReturn001(){
		int nTestReturn = 0;
		return nTestReturn;
	}
	
	public String testReturn002(){
	    String strTestReturn = new String("testReturn002");	
	    return strTestReturn;
	}
	
	public boolean returnLoop(int n){
		if(n % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void returnLoopN(int n){
		for(int i = 0; i < n; i++){
			returnLoop(i);
		}
	}
	
	public boolean returnLoop1(int n){
		if(n % 2 == 0){
			return true;
		}
		else{
			return false;
		}
	}

	public void returnLoop100(){
		for(int i = 0; i < 100; i++){
			returnLoop1(i);
		}
	}
	
	public long overloading(int n){
         return n;
	}
	
	public double overloading(int n1, int n2){
	     return (n1*n2);	
	}
	
	public void doOverLoading(int n){
	   for(int i=0; i < n; i++){
		   if(n %2 == 0){
		       overloading(i);	   
		   }
		   else{
			   overloading(i,n);
		   }
	   }
	}
	
	//return this
	public MethodReturnValueBase returnThis(){
		return this;
	}
	
	//return null
	public Object returnNull(){
		return null;
	}
	
	//static return
	public static int returnStaticMethod(){
		int nTemp = 5;
		return nTemp;
	}
}
