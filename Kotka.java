public class Kotka {
	// полета
	private String ime;
	private String cvqt;
	private int vazrast;
	private double teglo;
	
	// конструктори
	public Kotka() {}
	
	public Kotka(int v) {
		vazrast = v;
	}
	
	public Kotka(String i, String c, int v, double t) {
		ime = i;
		cvqt = c;
		vazrast = v;
		teglo = t;
	}
	
	// getter-и
	public String getIme() {
		return ime;
	}
	
	public int getVazrast() {
		return vazrast;
	}
	
	// setter-и
	public void setVazrast(int v) {
		if (v >= 0 && v <= 100) {
			vazrast = v;
		}
	}
	
	// други методи
	public void print() {
		System.out.println("Аз съм " + ime + ".");
		System.out.println("Цветът ми е " + cvqt + ".");
		System.out.println("На " + vazrast + " години съм.");
		System.out.println("Тежа " + teglo + " килограма.");
	}
}
