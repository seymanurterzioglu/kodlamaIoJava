package homeworks.day2.polymorphism;

public class EmailLogger  extends BaseLogger{
	
	
	// miras alınan class içindeki metod override edildi
	
	public void log(String msg) {
		System.out.println("the email msg: "+msg);
	}


}
