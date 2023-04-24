import java.util.Scanner;

public class Experiment {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bo;
	char c;
	String st;
	Scanner sc;
	Kotka k;
	
	Experiment() {
		
	}
	
	void print() {
		System.out.println("byte: " + b);
		System.out.println("short: " + s);
		System.out.println("int: " + i);
		System.out.println("long: " + l);
		System.out.println("float: " + f);
		System.out.println("double: " + d);
		System.out.println("boolean: " + bo);
		System.out.println("char: " + c);
		System.out.println("String: " + st);
		System.out.println("Scanner: " + sc);
		System.out.println("Kotka: " + k);
	}
}
