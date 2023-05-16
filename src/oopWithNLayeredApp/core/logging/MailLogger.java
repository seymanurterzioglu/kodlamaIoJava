package oopWithNLayeredApp.core.logging;

public class MailLogger implements Logger{
	
	
	@Override  // fonk nun base class dan geldiğini belirten dipnot
	public void log(String data) {
		System.out.println("Mail ile loglandı: "+ data);
		
	}

}
