package contasbasicas;
import java.util.Scanner;
public class Menos {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int soma;
    System.out.println("Qual o primeiro número?");
    int num1 = sc.nextInt();
    System.out.println("Qual o segundo número?");
    int num2 = sc.nextInt();
    soma = num1 - num2;
if (soma < 0){
System.out.println("Ele ficou negativo\n" + soma);
}else {
System.out.println("O resultado deu\n" + soma);
}
   } 
}
