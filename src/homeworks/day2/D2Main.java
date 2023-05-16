package homeworks.day2;

import homeworks.day2.abstractClass.GameCalculator;
import homeworks.day2.abstractClass.WomenGameCalc;
import homeworks.day2.inheritanceClass.Customer;
import homeworks.day2.inheritanceClass.Employee;
import homeworks.day2.inheritanceClass.Person;
import homeworks.day2.polymorphism.BaseLogger;
import homeworks.day2.polymorphism.CustomerManager;
import homeworks.day2.polymorphism.DatabaseLogger;
import homeworks.day2.polymorphism.EmailLogger;
import homeworks.day2.polymorphism.FileLogger;

public class D2Main {
	
	public static void main(String[] args) {
	 	
	// Struct -- değer tipi   -Stackda depolanır
	// Class   -- referans tipi --refereans id Stack da , kendisi Heap de depolanır
	//Stack’de değer tipleri, pointer ve adresler saklanırken, Heap’de ise referans değerleri saklanmaktadır
	
	// value  ( Stack- Heap)
	int num1=10;
	int num2=20;
	num2=num1;
	num1=30;
	System.out.println(num2);
	
	
	// value list ( Stack- Heap)
	//  diziler referans tiptir
	int [] numbers = new int[] {1,2,3};  // = {1,2,3}  bu şekilde de olabilir
	int [] numbers2 = new int[] {5,9,3};
	
	numbers2=numbers;  // heap i gösteren referans id leri aynı oldu. Bundan sonra heapte aynı yeri göstericekler. 
	//Birinin yaptığı değişiklik diğerini de etkiliyicek. Çünkü aynı referans değerine sahipler
	numbers[0]=15;
	System.out.println(numbers2[0]);
	
	
	//----------------------------------------------------------------------------------------------
	
	// Attributes
		
		
	// parametresiz constructor kullanım	
	Produce produce=new Produce();
	produce.name="Kamera";
	
	// parametreli constructor kullanım	
	Produce pro=new Produce(1,"Airpod");
	
	ProduceManager produceManager=new ProduceManager();
	produceManager.Add(produce);
	
	
	
	//----------------------------------------------------------------------------------------------------
	
	// Inheritance
	
	// yazılan prog değişime direnmeyen prog olmalıdır.
	
	Person prs=new Person();
	Customer customer=new Customer();
	Employee employee =new Employee();

	
	// inheritance devam
	
	//TeachCreditManager parametre olarak istendiğinde new TeachCreditManager() şeklinde gönderilebilir.
	// Miras aldığı üst sınıfı olan Base class da kullanılabilinir.   new BaseCreditManager()
	//TeachCreditManager ve farmCreditManager arasında herhangi bir bağlantı yoktur.
	//BaseCreditManager içeriğinde hem teach hem de farm ın referans değerlerini tutabilir.
	
	
	//------------------------------------------------------------------------------------------------------
	
	// Polimorfizm  ( Çok Biçimlilik)
	// loglama yöntemi 
		
	
		
	EmailLogger logger=new EmailLogger();
	logger.log("Log Msg");
	
	BaseLogger[] logs= new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger()};
	
	for(BaseLogger log:logs) {
		log.log("log message");
		
	}
										//  poliformizm
	CustomerManager custManager=new CustomerManager(new DatabaseLogger());
	custManager.add();
	
	
	//------------------------------------------------------------------------------------------------------
	
	// Abstract Classlar 
	
	WomenGameCalc womenGame=new WomenGameCalc();
	womenGame.hesapla();
	womenGame.gameOver();
	
	/*
	 *ABSTRACT SINIFLAR KOD İLERLEDİKÇE, ÇOK DEĞİŞTİRMEDEN YENİ EKLEMELER YAPABİLMEK İÇİN ÖNEMLİDİR
	
	 abstract class lar içerisindeki abstract metot override edilmeden new lenemez.
	 ve aşağıdaki kullanım sorunlar çıkartabilecek , güzel olmayan bir kullanımdır
	
	
	GameCalculator gmCalc=new GameCalculator() {
		
		@Override
		public void hesapla() {
			
		}
	};
	
	 bu nedenle abstract sınıfların parent class ı gizleme özelliği varda diyebiliriz
	 */
	
	//bu şekilde yapabilirz. çünkü new lediğimiz abstract class değil
	
	GameCalculator gameCalc=new WomenGameCalc();
	
	
	// abstract class ı içinde değişken fonk abstract etiketi alır. sabit fonk normal şekilde yazılır
	
	// abstract sınflarda sabit olan bir fonku kullanan diğer classlarda, fonk içine kod eklenmek ister is
	/*
	 public override void Save(){
	   // öncesi ve sonrası kod eklenebilir
	  	base.Save();
	 }
	 */
	
	
	// Bir class sadece bir normal class ya da abstract classı inherit edebilir.
	
	// abstract classlar ve interfaceler new leneme<. ikiside referans değeri özelliklerinden yararlanır
	
	
}
	


}
