import java.util.Scanner;

public class Sim {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String resposta;

    while (true) { 
        System.out.println("Deseja continuar: (S/N)");
        resposta=in.nextLine();

        if(resposta.equalsIgnoreCase("N")){
            break;
        }

        System.out.println("Continuando.....");


    }
        System.out.println("Programa encerrado!");


        in.close();
    }
}
