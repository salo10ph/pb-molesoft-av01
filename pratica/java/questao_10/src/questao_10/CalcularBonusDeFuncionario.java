package questao_10;

import java.util.Scanner;

public class CalcularBonusDeFuncionario {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Scanner scanNome = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de funcionarios: ");
		int quantidadeDeFuncionarios = scan.nextInt();
		
		String[] nome = new String[quantidadeDeFuncionarios];
		double[] salario = new double[quantidadeDeFuncionarios];
		double[] bonus = new double[quantidadeDeFuncionarios];
		double[] salarioLiquido = new double[quantidadeDeFuncionarios];
		
		for(int i = 0; i < quantidadeDeFuncionarios; i++) {
			System.out.print("Digite o nome do funcionario: ");
			nome[i] = scanNome.nextLine();
			System.out.print("Digite o salario do funcionario: ");
			salario[i] = scan.nextDouble();
			
			if(salario[i] <= 1000) {
				bonus[i] = salario[i] * 0.2;
				salarioLiquido[i] = salario[i] + bonus[i];
			} else if(salario[i] < 2000) {
				bonus[i] = salario[i] * 0.1;
				salarioLiquido[i] = salario[i] + bonus[i];
			} else {
				bonus[i] = salario[i] * -0.1;
				salarioLiquido[i] = salario[i] + bonus[i];
			}
		}
		System.out.println("\n\nResultado do calculo do bônus: ");
		for(int i = 0; i < quantidadeDeFuncionarios; i++) {
			
			System.out.println("\nFuncionário " + nome[i]);
			System.out.println("Salário:  " + salario[i]);
			if(bonus[i] > 0) {
				System.out.println("Bônus: " + bonus[i]);
			} else {
				System.out.println("Desconto: " + -bonus[i]);
			}
			System.out.println("Salário liquido: " + salarioLiquido[i]);
		}
	}
}
