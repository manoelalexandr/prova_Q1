package main;

import java.util.Scanner;

import classe.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Funcionario func = new Funcionario();

		
		int cont = 0;
		
		while(cont != 3) {
			System.out.println("1 - Cadastrar Funcionário ");
			System.out.println("2 - Mostrar os dados sobre o Funcionário ");
			System.out.println("3 - Sair do Programa ");
			cont = sc.nextInt();
			
			if(cont == 1) {
				System.out.println("Informe o nome do funcionário: ");
				sc.nextLine();
				String nome = sc.nextLine();
				System.out.println("Informe o sobrenome do funcionário: ");
				String sobrenome = sc.nextLine();
				System.out.println("Informe o salário do funcionário: ");
				double salario = sc.nextDouble();
				if(salario < 0) {
					salario = 0;
				}
				System.out.println("Informe a gratificação recebida pelo funcionário: ");
				int grat = sc.nextInt();
				
				func = new Funcionario(nome, sobrenome, salario, grat);
				
			}else if(cont == 2) {
		
					System.out.println(func);
			}else if(cont == 3) {
				System.out.println("programa finalizado!");
			}
			}
		
		sc.close();
	}

}

