package contasbasicas;
import java.util.Scanner;
public class Vezes {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int soma;
    System.out.println("Informe seu número");
    int num1 = sc.nextInt();
    System.out.println("Informe seu segundo número");
    int num2 = sc.nextInt();
    soma = num1 * num2;
    if(soma < 0){
    System.out.println("O numero ficou negativo\n" + soma);
    }else {
        System.out.println("O resultado deu\n" + soma);
    }
    
   } 
}
