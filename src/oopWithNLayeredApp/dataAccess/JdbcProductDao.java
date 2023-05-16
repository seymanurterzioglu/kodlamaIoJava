package oopWithNLayeredApp.dataAccess;

// bir pakette başka bir paketi kullanıyor ise import etmeliyiz. her zmnki gbi
import oopWithNLayeredApp.entities.Product;

// productDao kurallarına uymak zorunda
public class JdbcProductDao implements ProductDao{
	
	public void add(Product product) {
		// sadece db erişim kodları buraya yazılır ..SQL kullanılarak
		System.out.println("JDBC ile veritabanına eklendi");
	}
	 

}

// aynı isimde ürün ekleyememe durumuna business domain deniliyor

// domianler bizim iş durumumuza özgüdür. istersek aynı isimde eklenebilir yapabilir, veri girdisinde farklı durumlar yazabiliriz
// iş kuralı bizim iş durumuna , domaine özgüdür. bu duurmlar business paket içerisine yazılır