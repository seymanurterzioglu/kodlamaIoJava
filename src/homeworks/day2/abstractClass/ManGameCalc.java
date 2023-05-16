package homeworks.day2.abstractClass;

public class ManGameCalc extends GameCalculator{
	
	// hesapla metodu abstract yaptığımız için override etmek zorundayız 
	
	// override ettiğini belirtmek için - okunabilirliği artırı - annotation(dipnot)
	@Override
	public void hesapla() {
		System.out.println("Puanınız: 50 ");
		
	}

}
