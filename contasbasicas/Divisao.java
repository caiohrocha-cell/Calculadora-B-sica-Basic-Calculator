package contasbasicas;
import java.util.Scanner;
public class Divisao {
   public static void main(String[] args) {
    int num1;
    int soma;
    Scanner sc = new Scanner(System.in);
    System.out.println("Qual o primeiro número?");
    num1 = sc.nextInt();
    if (num1 == 0){
    System.out.println("O resultado será 0 não adianta fazer conta");
    }else{
        System.out.println("Qual o segundo número?");
    int num2 = sc.nextInt();
        if(num2 == 0){
        System.out.println("O resultado será 0 não adianta fazer conta");
        }else {
soma = num1 / num2;
    if(soma < 0){
    System.out.println("O resultado negativo deu\n" + soma);
    }else{
    System.out.println("O resultado deu\n" + soma);
    }
    }
    }
   } 
}
