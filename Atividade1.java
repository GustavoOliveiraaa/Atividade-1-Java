import java.util.Scanner;

public class Atividade1 {
	public static void main(String args[]) {
		Scanner read = new Scanner(System.in);

		int a, b, c, d, soma;

		System.out.println("Insira o primeiro numero:");
		a = read.nextInt();
		System.out.println("Insira o segundo numero:");
		b = read.nextInt();
		System.out.println("Insira o terceiro numero:");
		c = read.nextInt();
		System.out.println("Insira o quarto numero:");
		d = read.nextInt();

		if(a > b && a > c && a > d) {
			System.out.println(a + " Maior");
		} else if(b > a && b > c && b > d) {
			System.out.println(b + " Maior");
		} else if(c > a && c > b && c > d) {
			System.out.println(c + " Maior!");
		} else {
			System.out.println(d + " Maior!");
		}

		if((a % 2) == 0) {
			System.out.println(a + " -> Par");
		} else {
			System.out.println(a + " -> Impar");
		}

		if((b % 2) == 0) {
			System.out.println(b + " -> PAR");
		} else {
			System.out.println(b + " -> Impar");
		}

		if((c % 2) == 0) {
			System.out.println(c + " -> Par");
		} else {
			System.out.println(c + " -> Impar");
		}

		if((d % 2) == 0) {
			System.out.println(d + " -> Par");
		} else {
			System.out.println(d + " -> Impar");
		}

		soma = (a + b + c + d);

		System.out.println("A soma total é " + soma);
	}
}