import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class teste {

	public static void main(String[] args) throws IOException {
		String linha;
		// InputStream is = System.in;
		InputStream is = new FileInputStream("arquivo.txt");

		// InputStreamReader isr = new InputStreamReader(is);
		// BufferedReader br = new BufferedReader(isr);

		System.out.println("digite uma linha:");
		Scanner entrada = new Scanner(is);
		
		while (entrada.hasNextLine()) {
			linha = entrada.nextLine();
			System.out.println(linha);
			escrevelinha(linha);
		}

		entrada.close();

		// String linha = br.readLine(); // primeira linha

		// while (linha != null) {
		// System.out.println(linha);
		// linha = br.readLine();
		// }

		// br.close();

	}

	public static void escrevelinha(String linha) throws IOException {
		
		OutputStream os = new FileOutputStream("saida.txt", true);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		System.out.println("escrevendo linha:" + linha);
		bw.write(linha);
		bw.newLine();
		bw.close();
	}

}
