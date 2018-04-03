package test.objects;

public class TestObject extends TestObjectBase {
	private String sValue;
	
	public TestObject() {
		super();
		sValue = new String();
		sValue = "" + super.getValue();
	}
	
	public int getValue() {
		return getValue();
	}
	
	public String getValue(String prefix, String surfix) {
		return prefix + sValue + surfix;
	}
	
	public void setValue(int value) {
			this.sValue = "" + value;
			setValue(value);
	}
}
