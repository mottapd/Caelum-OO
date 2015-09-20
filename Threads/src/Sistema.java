public class Sistema {

	public static void main(String[] args) throws InterruptedException {
		
		Programa p1 = new Programa();
		Thread t1 = new Thread(p1);

		Programa p2 = new Programa();
		Thread t2 = new Thread(p2);
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		System.out.println("fim do curso");
		
	}

}

