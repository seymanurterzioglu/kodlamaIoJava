package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	// sadece interface ' e bağımlı oldu.  Loose Coupling - gevşek bağlılık denir
	
	private ProductDao productDao;
	
	// Dependency Injection - bağımlılık enjeksiyonu = logger enjeksiyon edilmesine denir
	
	/*
	 Dependency injection kaba tabir ile bir sınıfın/nesnenin bağımlılıklardan kurtulmasını amaçlayan 
	 ve o nesneyi olabildiğince bağımsızlaştıran bir programlama tekniği/prensibidir.
	 
	Dependency Injection: Yazılım bağımlılığı sevmez.
	
	 */
	private Logger [] loggers;  // Logger [] loggers
	
	
	// ProductManager çağrıldığında productDao cinsi veri gönder, liste olarak Logger cinsi veri gönder
	public ProductManager(ProductDao productDao,Logger [] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}

								// haberin olsun bu metot çağrıldığında böyle bir hata gelebilir demek
	public void add(Product product) throws Exception{
		// iş kuralları
		if(product.getUnitPrice()<10) {
			throw new Exception("Ürün fiyatı 10 dan küçük olamaz");
		}
		
		// bu şekilde kullanım doğru yöntem değil.
		// productManager ı bir class a bağımlı hale getiriyoruz
		// ileride eğişiklik yapmak sorunlu olucak
		//JdbcProductDao productDao= new JdbcProductDao();  bağımlı olduğu için kullanmıyoruz böyle durumlarda interface kullanıyoruz
		productDao.add(product);
		
		
		for(Logger logger: loggers) {
			logger.log(product.getName());
		}
		
	}

}
