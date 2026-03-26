
import java.util.Scanner;

public class Cadastro {
    Scanner in = new Scanner(System.in);

    private String nome;
    private int idade;

    void getCad(){
    
        System.out.println("Digite seu nome: ");
            nome=in.nextLine();

        System.out.println("Digite sua idade: ");
            idade=in.nextInt();
    
        System.out.format("Vc e %s, com %d anos\nGostaria de renovar seus dados?\nDigite '1' para SIM\nDigite '2' para NAO: ", nome , idade);
            int escolha=in.nextInt();

            in.nextLine();

        if(escolha==1){
            
            getCad();

            }  else{
            System.out.println("Perfeito ent sai daqui porr");
        }

}

}
