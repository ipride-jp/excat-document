package test.customobj;

public class TestObj001 {
    private int  intMemberValue = 0;
    private long longMemberValue = 0;
    private double doubleMemberValue = 0;
    private float floatMemberValue = 0;
    private char  charMemberValue = ' ';
    private String stringMemberValue = " ";
    private boolean boolMemberValue = false;
    
    public TestObj001(int n) {
    	intMemberValue = n;
    }
    
    public TestObj001(String str) {
    	stringMemberValue = str;
    }    
    public int getIntMemberValue(){
    	return intMemberValue;
    }

    public long getLongMemberValue(){
    	return longMemberValue;
    }

    public double getDoubleMemberValue(){
    	return doubleMemberValue;
    }

    public char getCharMemberValue(){
    	return charMemberValue;
    }
    
    public String getStringMemberValue(){
    	return stringMemberValue;
    }
    
    public boolean getBoolMemberValue(){
    	return boolMemberValue;
    }
}
