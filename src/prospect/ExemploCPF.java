package src.prospect;
import java.util.Scanner;
public class ExemploCPF {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String CPF;
	System.out.println("Informe um CPF: ");
	CPF = sc.next();
	System.out.println("\nResultado: ");
	if(ValidaCPF.isCPF(CPF) == true)
		System.out.printf("%s\n", ValidaCPF.imprimeCPF(CPF));
	else System.out.println("Erro CPf invalido");

	
}
}