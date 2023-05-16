package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	 /*
	  Loglama işlemi, internet ya da LAN gibi ağlarda istek yapan cihaz 
	  ile istek yapılan cihaz arasındaki sanal trafik bilgilerinin kayıt altına alınmasına verilen isimdir.
	  */
	
	@Override  // fonk nun base class dan geldiğini belirten dipnot
	public void log(String data) {
		System.out.println("Dosyaya loglandı: "+ data);
		
	}
	

}
