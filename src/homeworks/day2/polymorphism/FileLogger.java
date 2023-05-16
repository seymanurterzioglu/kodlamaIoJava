package homeworks.day2.polymorphism;

public class FileLogger  extends BaseLogger {
	
	
	// miras alınan class içindeki metod override edildi
	
	public void log(String msg) {
		System.out.println("the file msg: "+msg);
	}


}
