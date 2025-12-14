import java.util.Scanner;

public class calculo{
    public static void main(String[] args) {
        int num1, num2;

        Scanner sc= new Scanner(System.in);

        System.out.println("Digite um numero para a soma: ");
            num1= sc.nextInt();

        System.out.println("Digite o segundo numero para a soma: ");
            num2= sc.nextInt();

        System.out.println("O resultado deu: "+ soma(num1, num2));

        sc.close();


    }

    static int soma(int num1, int num2){
            return num1 + num2;
    }
}