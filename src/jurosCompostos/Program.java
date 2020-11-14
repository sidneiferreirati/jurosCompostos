package jurosCompostos;

import java.text.NumberFormat;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		System.out.print("Valor Inicial: ");
		double valorInicial = entrada.nextDouble();
		System.out.print("Juros Anual: " );
		double taxaAno = entrada.nextDouble() / 100;
		double taxaMensal = taxaAno / 12;
		System.out.print("Aplicação mensal: ");
		double mensal = entrada.nextDouble();
		System.out.print("Quantos meses: ");
		int quantidadeMeses = entrada.nextInt();
		double montante = 0;
		double juros = 0;
		double totalJuros = 0;

		for (int i = 0; i < quantidadeMeses; i++) {
			if (i == 0) {
				montante = valorInicial;
				juros = montante * taxaMensal;
				totalJuros += juros;
				montante += juros + mensal;
			} else {
				juros = montante * taxaMensal;
				totalJuros += juros;
				montante += juros + mensal;
			}
		}
		
		entrada.close();
		System.out.println("Total de juros " + NumberFormat.getCurrencyInstance().format(totalJuros));
		System.out.println("Total acumulado com juros " + NumberFormat.getCurrencyInstance().format(montante));
	}
}
