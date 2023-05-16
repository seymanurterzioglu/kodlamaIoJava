package javaDevelop;

//OOP konusu

//sınıf isimleri PascalCase
public class Products{
     // değişken ve metot isimlendirmeler camelCase
     private String name;
     private double unitPrice;
     private double discount;
     private String imageUrl;
     private int unitsInStock;
     
     // verilerden okunmasını istediğimizin get fonk,
     //            yazılmasını istemedğimizin set fonk
     //   fonk içinde return e kadar ekstra işlemler yapılbilir
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getUnitsInStock() {
		return unitsInStock;
	}
	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}
     
     

}