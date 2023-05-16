package homeworks.day2;

public class Produce {

	// Constructor - Yapıcı Metot - Class ile aynı ismr sahip olucak
	// Produce classı sadece id verilirse erişilebilir olur. newlenebilir
	// new Produce(id:1);  şeklinde kullanılmalı
	
	public Produce(int id,String name) {  // parametreli constructor
	}
	
	// override edildi -  
	public Produce() {  // parametresiz constructor	
	}

	// BİR CLASS SADECE BİR İŞİ YAPAR. ATTIRIBUTE CLASS IN ALTINA METOT EKLEME .
	// FONK BARINDIRANBAŞKA BİR CLASS OLSUN.
	// SOLİD PRENSİPLERİ - S - HER CLASSA TEK SORUMLULUK

	// private - sadece içinde bulunduğu blokta geçerlidir. yani en son içinde
	// bulunduğu { private } içinde

	// attribute || field denir

	int id;
	String name;
	String desc;
	double price;
	int stockAmount;

}
