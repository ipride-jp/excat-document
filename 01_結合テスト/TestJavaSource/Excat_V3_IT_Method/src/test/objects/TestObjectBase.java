package test.objects;

public class TestObjectBase {
	private int value;
	
	public TestObjectBase() {
		value = 0;
	}
	
	public TestObjectBase(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
}
