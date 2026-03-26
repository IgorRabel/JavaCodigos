import java.util.Scanner;

public class medianota {
    public static void main(String[] args) {
    Scanner in= new Scanner(System.in);

    String nome;
    float nota1, nota2;

    System.out.print("Digite o nome do aluno: ");
    nome=in.nextLine();

    System.out.printf("Digite a primeira nota do %s: ",nome);
    nota1=in.nextFloat();

    System.out.printf("Digite a segunda nota do %s: ",nome);
    nota2=in.nextFloat();

    if((nota1+nota2)/2 >= 6){
        System.out.printf("APROVADO");
    }
        else if((nota1+nota2)/2 >=4 && (nota1+nota2)/2<6){
            System.out.printf("RECUPERACAO");
        }
            else{
                System.out.printf("REPROVADO");
            }
        
    in.close();
    }
}
