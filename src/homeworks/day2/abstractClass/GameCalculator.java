package homeworks.day2.abstractClass;

// abstract class da abstract metot olmak zorunda değil
// abstract fonk sahip class da abstract olmak zorundadır
// abstract classlardan new ile nesne tanımlanamaz

public abstract class GameCalculator {
	
	// abstract metodun içi boştur. Ve bu sınıfı miras alanlar abstact metodu override etmek zorundadır.
	
	public abstract void hesapla();
	
	// override edilebilme özelliğini kapatmak için final dedik
	// hiç bir zaman değişmemesi gereken bir kuraldır
	
	public final void gameOver() {
		System.out.println("Oyun bitti!");
	}

}
