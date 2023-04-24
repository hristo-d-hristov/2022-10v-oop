public class Programa {
	public static void main(String[] args) {
		Kotka k1 = new Kotka("Мишо", "сив", 3, 5.8);
		Kotka k2 = new Kotka("Пешо", "кафяв", 5, 3.4);
		Kotka k3 = new Kotka("Страхил", "лилава", 45 , 6.7);
		Kotka k4 = new Kotka(5);
		Kotka k5 = new Kotka();
		
//		String k1Ime = k1.getIme();
//		System.out.println(k1Ime);
		
		int k1Vazrast = k1.getVazrast();
		System.out.println(k1Vazrast);
		k1.setVazrast(-5);
		
//		k1.print();
	}
}
