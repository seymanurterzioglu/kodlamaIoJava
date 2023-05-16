package homeworks.day3.work2;

public class CustomerManager {
	// manager içerisinde iş kodları yazılır
	// örn:  müşteriyi ekle, kontrol et ....
	
	// bu şekilde bir kullanım ileride unutulabilir, sorun çıkarabileceğinden iyi değil
	private CustomerDal customerDal; 
	
	// bu şekilde constructor kullanımı ile unutulmasını önlemiş oluyoruz
	public CustomerManager(CustomerDal customer) {
		this.customerDal=customer;
	}
	
	public void add() {
		customerDal.add();
		
	}

}
