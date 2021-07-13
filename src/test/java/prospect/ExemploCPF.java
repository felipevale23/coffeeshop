package src.test.java.prospect;

import java.util.Scanner;

public class ExemploCPF {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String cpf;

		System.out.println("Informe um CPF: ");
		cpf = sc.next();

		System.out.println("\nResultado: ");

		if (ValidaCPF.isCPF(cpf)) {

			System.out.printf("%s\n", ValidaCPF.imprimeCPF(cpf));

		} else {

			System.out.println("Erro CPf invalido");
		}

		sc.close();

	}

}