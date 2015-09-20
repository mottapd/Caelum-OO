package br.com.caelum.banco;

public class TesteException {
public static void main(String[] args) {
	System.out.println("comeco main");
	method1();
	System.out.println("comeco main");
}

private static void method1() {
	// TODO Auto-generated method stub
	System.out.println("comeco method1");
	method2();
	System.out.println("fim method1");
}

private static void method2() {
	// TODO Auto-generated method stub
	System.out.println("comeco method2");
	try {
		int valor=2/0;
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	System.out.println("comeco method2");
}
}
