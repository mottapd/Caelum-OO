public class Programa implements Runnable{
	
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			System.out.println(i);
		}
	}
}
