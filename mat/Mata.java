import java.util.Scanner;

public class Mata {
    Scanner in = new Scanner(System.in);

    private int a;
    private String nome;

    public void cadastrarInformacao(){
        System.out.println("Digite sua idade: ");
        a=in.nextInt();

        in.nextLine();

        System.out.println("Digite seu nome: ");
        nome=in.nextLine();
        

        mostrarInformacao();

    }

    private void mostrarInformacao(){

        System.out.printf("\n\n\n\n\n\n\n\n\n\n\n\nNome: %s\n", nome);
        System.out.printf("Idade: %d\n", a);

        System.out.println("Gostaria de mudar as infornacoes?");
        String escolha=in.nextLine();

        if(escolha.equalsIgnoreCase("Sim")){
            System.out.println("Certo, digita ai ent");
            cadastrarInformacao();
        }
    }


}
    