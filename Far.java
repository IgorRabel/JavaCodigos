import java.util.Scanner;

public class Far {

    

    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);
    String resposta;
    float grau;

    while (true) { 
        
        System.out.print("Digite o graus em numero: ");
            grau=in.nextFloat();

        in.nextLine();

        System.out.printf("Aqui esta o resultado em Farenhait: %.1f farenhait\n", (9*grau+160)/5);

        System.out.print("Gostaria de comecar novamente? (S/N): ");
            resposta=in.nextLine();

         
        if(resposta.equalsIgnoreCase("N")){
            break;
        }

        System.out.println("Vamo dnovo...");

    }

        System.out.println("Programa encerrado...");

        in.close();
}
}
