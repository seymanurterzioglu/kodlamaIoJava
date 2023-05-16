package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dataAccess.HibernateProductDao;
import oopWithNLayeredApp.entities.Product;

public class OopMain {
	
	//  DRY   - dont repeat yourself
	
	//  bir class sadece bir class inherit edebilir (sadece bir sınıftan miras alabilir)
	 // bir class birden fazla class implemente edebilir (birden fazla interface kullanabilir)

	
	//  interface ler refereans tiptir
	
	public static void main(String[] args) throws Exception {
		
		// arayüz iş birimi ile ilişki içindedir
		
		Product pro1= new Product(1,"Iphone Xr",14000);
		
		Logger [] loggers= {new DatabaseLogger(),new MailLogger(),new FileLogger()};
		
		ProductManager proManager= new ProductManager(new HibernateProductDao(),loggers);
		proManager.add(pro1);

	}
	
	
}
