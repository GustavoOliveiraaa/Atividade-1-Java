import java.util.Scanner;

public class Atividade1 {
    public static void main (String args[]) {
        Scanner read = new Scanner(System.in);
            int n1;
            int n2;
            int a1;
                
            System.out.println ("Insira o primeiro numero");
                n1 = read.nextInt();

            System.out.println("Insira o segundo numero");
                n2 = read.nextInt();

            if(n1 > n2) {
                System.out.println(n1 + "Maior valor");
         } else if (n2 > n1)  {
             System.out.println(n2 + "Maior valor");
            
             a1 = n1 + n2;

             System.out.println("Resultado:" + a1);

             a1 = read.nextInt();
             if (a1 % 2 == 0) {
                 System.out.print("Par");        
             } else {
                 System.out.print("impar");
             }
         }
         
    }
}