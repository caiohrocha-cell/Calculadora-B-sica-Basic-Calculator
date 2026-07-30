package contasbasicas;
import java.util.Scanner;
public class Mais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 0;
        System.out.println("Qual o primeiro número?");
        int num1 = sc.nextInt();
        System.out.println("Qual o segundo número?");
        int num2 = sc.nextInt();
        soma = num1 + num2;
        if (soma < 0){
        System.out.println("O numero deu negativo\n" + soma);
        }else{
            System.out.println("O seu resultado deu\n" + soma);
} 
        }
        
    }
   
