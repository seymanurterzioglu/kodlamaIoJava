package homeworks.day3.work2;

public class D3Work2Main {

	public static void main(String[] args) {
		
		// sırası public class MyClass extends BaseClass implements  Interface1 , Interface2 {
		
		//   INTERFACE
		
		// bir class, birdeb fazla class dan interface  inhrint edebilir
		// interface ler new lenemez
		// interface den implement eden bir class new lenebilir. kendisi interface değil çünkü
		
		// referens değerlerini tutarlar
		
		//   data access  -   iş   -   arayüz katmanalrı arasındaki geçişler interface ler ile sağlanır
		
		CustomerDal customerDal= new MySqlCustomerDal();
		
		// customer manager kullanılarak customerDal interface kullanıyoruz. 
		CustomerManager customerManager=new CustomerManager(new OraclaDatabaseDal());
		customerManager.add();
		
		
		//   STATİC
		// Bir metodu static yaptığımızda new ile nesneye ihtiyaç duymadan , class ismi kullanılarak çağrılabilir
		
		// içeriğinde değişkenlere veri atamasında bulunan fonk static yapılmaz.
		// bu şekilde kişilerin değişkenleri aynı şekilde değişebilir.
		// ekrana yazdırmak gibi kullan- bırak tarzında fonk için kullanılır
		
		// yapıcı metotları çalıştırmak için new lemek gerekmektedir
		
		// static metot kullanıldığında o sınıfın constructorını kullanabilmek için, o sınıfta static { } yapılır
	
		// ana class statik olamaz
		
		//     
		// bir class içindeki başka bir class static olabilir. ve class ismi ile erişebiliriz       ---   // inner class
		//  ama bu durum solid prensibinin bir class sadece bir iş yaparına uymadığı için tavisye edilmez
		

	}

	// manager isimlendirmesi iş kodları ile ilgili class da  kullanılır
	// dal - data access layer isimlendirmesi veritabanı (silme,düzenleme,ekleme) ile ilgili class da kullanılır
	}
