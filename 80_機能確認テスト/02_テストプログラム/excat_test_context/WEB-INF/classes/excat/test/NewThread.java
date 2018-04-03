package excat.test;

public class NewThread extends Thread {
	public NewThread (String newthread){
		super(newthread);
	}
	
	public void run(){
		String newThredName = this.getName();
	}

}
