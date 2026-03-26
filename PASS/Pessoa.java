import java.util.Scanner;

public class Pessoa{

    String nome;
    int idade;
    String cpf;
    Scanner in= new Scanner(System.in);

    public void showDados(){
    
    System.out.printf("Vc e %s, e com %d anos de idade\nSeu CPF e: %s", nome, idade, cpf);
    
    }

    public void getDados(){
    
        System.out.print("Digite seu nome: ");
        nome= in.nextLine();

        System.out.print("Digite sua idade: ");
        idade= in.nextInt();

        System.out.print("Digite seu CPF: ");
        cpf= in.next();

        in.close();
    }
    public static void main(String[] args) {
        
    
        Pessoa pessoa = new Pessoa();

        pessoa.getDados();
        pessoa.showDados();
        

    }
    
}
