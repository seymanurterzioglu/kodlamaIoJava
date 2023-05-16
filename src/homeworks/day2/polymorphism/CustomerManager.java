package homeworks.day2.polymorphism;

public class CustomerManager {
	private BaseLogger bLogger;
	
	// constractor - customer manager newlendiğinde aynı zamanda Baselogger cinsi veriyi de gönder.
	// bundan sonra customerMaanager içeriğinde bu class kullanılıcak
	
	public CustomerManager(BaseLogger logger) {
		bLogger=logger;
	}
	
	
	public void add() {
		System.out.println("Müşteri eklendi.");
		bLogger.log("log message: ");
		
		/*
		new yapmak heap de yer ayırdığından ,hep yapmaktan çekinmeliyiz
		bu şekilde tek bir fonk içinde tanımlarsak
		DatabaseLogger logger=new DatabaseLogger();
		logger.log("messsage");
		*/		
	}

}
