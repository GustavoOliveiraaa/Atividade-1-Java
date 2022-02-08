import java.util.Scanner;

public class vtnc {
	public static void main(String args[]) {
		Scanner ler = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Insira o primeiro numero:");

		n1 = ler.nextInt();

		System.out.println("Insira o segundo numero:");

		n2 = ler.nextInt();

		System.out.println("Insira o terceiro numero:");

		n3 = ler.nextInt();

		if(n1 > n2 && n1 > n3) {
			System.out.println(n1 + " eh o maior");
		} else if(n2 > n1 && n2 > n3) {
			System.out.println(n2 + " eh o maior");
		} else {
			System.out.println(n3 + " eh o maior");
		}
	}
}