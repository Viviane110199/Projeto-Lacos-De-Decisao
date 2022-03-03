package PacoteExercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double id;
		
		System.out.println("Digite sua idade: ");
		id = leia.nextDouble();
		
		if(id >= 0 && id < 10) {
		System.out.println("Infantil");
		}
		
		else if(id >= 10 && id <= 14) {
		System.out.println("10-14 Infantil");
		}
		
		else if(id >= 15 && id <= 17) {
		System.out.println("15-17 Juvenil");
		}
		
		else if(id >= 18 && id <= 25) {
		System.out.println("18-25 Adulto");
		}

		else if(id > 25 && id < 100) {
		System.out.println("Adulto");	
		}
		
		else if(id < 0 && id > 100) {
		System.out.println("Idade inválida!");	
		}

	}

}
