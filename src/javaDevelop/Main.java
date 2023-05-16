package javaDevelop;

// class isimlendirmleri PascalCase yapılır
public class Main {

	public static void main(String[] args) {
		 
		//  cins isim = yeni product nesnesi oluşturma
		Products product1 = new Products();
	product1.setName("Makine");
	product1.setUnitPrice(7000);
	product1.setDiscount(5);
	product1.setUnitsInStock(4);
	product1.setImageUrl("img.jpg");

		Products product2 = new Products();
		product2.setName("Makine");
		product2.setUnitPrice(7000);
		product2.setDiscount(5);
		product2.setUnitsInStock(4);
		product2.setImageUrl("img.jpg");
		
		Products product3 = new Products();
		product3.setName("Makine");
		product3.setUnitPrice(7000);
		product3.setDiscount(5);
		product3.setUnitsInStock(4);
		product3.setImageUrl("img.jpg");
		Products[] products={product1,product2,product3};

		for(Products product: products){
			System.out.println(product.getName());

		};
		
		IndividualCustomer individualCustomer= new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("0500000");
		individualCustomer.setCustomerNumber("342");
		individualCustomer.setFirstName("Şeyma");
		individualCustomer.setLastName("Nur");
		
		CorporateCustomer corporateCustomer= new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setPhone("0538899");
		corporateCustomer.setCustomerNumber("235");
		corporateCustomer.setCompanyName("Kodlam.io");
		corporateCustomer.setTaxNumber("35277");
		
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		System.out.println(customers);
		





		

	}

}
