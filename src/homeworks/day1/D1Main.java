package homeworks.day1;

public class D1Main {

	public static void main(String[] args) {

		//----------------------------
		
		System.out.println("Merhaba Java");
		System
		.out
		.println(
				"Merhaba Java 2"
				);

		// ---------------------------

		int studentCount=12;
		String msg = "Ogrenci sayisi: ";
		System.out.println(msg+studentCount);
		System.out.println("Ogrenci Sayim: "+studentCount);

		//----------------------------

		double number=12.5;
		number = -129;
		char ch='A';
		boolean isTrue=false;

		//----------------------------

		int number2=24;
		if(number2<20){
			System.out.println("Sayı 20 den küçüktür");
		}else if(number2==20){
			System.out.println("Sayı 20 ye eşittir");
		}else{
			System.out.println("Sayı 20 den büyüktür");
		}

		//----------------------------

		int num=266;
		int num2=25;
		int num3=26;
		int theBig=num;

		if(theBig<num2){
			theBig=num2;
		}

		if(theBig<num3){
			theBig=num3;
		}

		System.out.println("En buyuk: "+ theBig);

		//----------------------------

		char grade ='B';

		switch(grade){
			case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
			case 'B':
			// B nin içi boş olur ise C den devam eder
			System.out.println("Çok Güzel : Geçtiniz");
			break;
			case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
			case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;
			case 'F':
			System.out.println("Maalesef Kaldınız");
			break;
			default:
			System.out.println("Geçersiz Not!");
		}

		//--------------------------------------

		for(int i=2;i<0;i+=2){
			System.out.println(i);
		}
		System.out.println("Döngü Bitti!");

		int i=1;

		while(i<10){
			System.out.println(i);
			i+=2;
		}
		System.out.println("While Döngüsü Bitti!");

		int j=100;

		do{
			System.out.println(j);
			j+=2;
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti!");

		//-------------------------------------

		double[] myList = {1.2,6.3,4.3,5.6};
		double total=0;
		double max=myList[0];
		for(double no:myList){
			if(max<no){
				max=no;
			}
			total=total+no;
			System.out.println(no);
		}
		System.out.println("Toplam: "+ total);
		System.out.println("En buyuk: "+ max);

		//----------------------------------

		String [][] sehirler = new String[1][3];

		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Kastamonu";
		sehirler[0][1] = "Trabzon";

		//---------------------------------

		











	

	}
	
	

}
