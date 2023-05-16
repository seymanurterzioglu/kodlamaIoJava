package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

// bu interface sahip olan classlar bu metotları (paramatreleri ile beraber) içermelidir.

// interface , onu implemente eden sınıfın referansını tutabilir
public interface ProductDao {
	// interface de sadece şablon oluşturulur
	// sadece metot imzasını barındırabilir.
	
	void add(Product product);

}

/*
 
  BİR KATMAN  (BUSİNESS , DATAACSESS ,UI,API VB  (ENTİTİES DEĞİL)) BAŞKA BİR KATMANIN CLASSINI 
  KULLANIYOR İKEN , SADECE INTERFACE DEN İLETİŞİM KURMALIDIR.


*/