import java.util.Scanner;

public class Frase{

    int escolha;

    public void escolhe(){
    Scanner in= new Scanner(System.in);
    
    System.out.println("--------Menu Principal--------");
    System.out.println("1 - Contar ate 15 na horizontal e crescente");
    System.out.println("2 - Contar ate 10 na horizontal e decresente");
    System.out.println("3 - Contar ate 5 na vertical");
    System.out.println("4 - Sair");

    escolha=in.nextInt();
    
    switch (escolha) {
        case 0:
            zero();
            escolhe();

            break;

        case 1: for(int i=0; i<16 ; i++){
            System.out.printf("%d ", i);
        }
            break;

        case 2: for(int i=10; i>-1; i--){
            System.out.printf("%d ", i);
        }
            break;

        case 3: for(int i=0; i<6; i++){
            System.out.printf("%d \n", i);
        }
            break;

        case 4: 
            break;

        default:
            escolhe();
    }


    }
    public void zero(){
    
    System.out.println("tu digitou errado, repete dnovo ai\n\n");

    }
    public static void main(String[] args) {
    Frase f= new Frase();

    f.escolhe();

    }
}