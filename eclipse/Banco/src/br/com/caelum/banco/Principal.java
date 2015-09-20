package br.com.caelum.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.caelum.banco.conta.*;

//import br.com.caelum.banco.conta.ContaCorrente;
/**
 * teste ContaCorrente
 * 
 * @author Bruno Vellego
 * 
 * */
public class Principal {
	/**
	 * inicia o jar
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// List<ContaPoupanca> contas = new ArrayList<>();
		List<ContaPoupanca> contas = new LinkedList<>();

		Random rnd = new Random();
		
		for (int i = 0; i < 10; i++) {
			ContaPoupanca c1 = new ContaPoupanca();
			c1.setNumero(rnd.nextInt(500));
			contas.add(c1);
		}

		//ordena
		System.out.println("ordena");
		Collections.sort(contas);
		mostralista(contas);
		// inverter
		System.out.println("inverte");
		Collections.reverse(contas);
		mostralista(contas);
		// embaralhar
		System.out.println("embaralha");
		Collections.shuffle(contas);
		mostralista(contas);
		// rotarionar
		System.out.println("rotaiona");
		Collections.rotate(contas, 1);
		mostralista(contas);
		
		Conta conta2 = new ContaCorrente();
		ContaCorrente conta = CriarContaComSaldo();
		System.out.println(conta.getSaldo());
		conta.deposita(100.5);
		conta.atualiza(0.1);
		System.out.println("tributo " + conta.calculaTributos());
		Tributavel t = conta;
		System.out.println("tributo interface " + t.calculaTributos());

		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();
		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);
		gerenciador.adiciona(conta);

		System.out.println(conta2);
		System.out.println(gerenciador.getTotal());
	}

	private static ContaCorrente CriarContaComSaldo() {
		ContaCorrente conta = new ContaCorrente();
		conta.deposita(100.0);
		return conta;
	}

	private static void mostralista(List<ContaPoupanca> contas) {
		for (int i = 0; i < contas.size(); i++) {
			Conta atual = contas.get(i);
			System.out.println("numero: " + atual.getNumero());
		}
	}

}
