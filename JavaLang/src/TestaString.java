import static java.lang.Math.*;

import java.io.PrintStream;

public class TestaString {
	public static void main(String[] args) {
		PrintStream saida = System.out;
		String s = "fj21 ";
		String s2 = "fj11 22";
		s.replaceAll("1", "2");
		System.out.println(s);
		if (s2.contains(s)){
			System.out.println("contem");
		}else{
			System.out.println("n contem");
		}
		
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		if(x1==x2){
			System.out.println("igual");
		}else{
			System.out.println("diferente");
		}
		
		if(x1.equals(x2)){
			System.out.println("-igual");
		}else{
			System.out.println("-diferente");
		}
		System.out.println(x1);
		System.out.println(x2);
		
		Object o = new Object();
		o.equals("Teste");
		
		System.out.println(PI);
		}
}
