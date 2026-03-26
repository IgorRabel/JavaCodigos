import java.util.Scanner;

public class media {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    
    int[] nota = new int[2];
    System.out.println("Digite o nome do aulno: ");
    String nome=in.nextLine();

    for(int i=0; i<2; i++){

        System.out.printf("Digite a nota %d do aluno: ",i+1);
        nota[i]=in.nextInt();
    }

    if((nota[0] + nota[1] )/2 >=6){
        System.out.format("%s esta aprovado!", nome);
        
    }  else if((nota[0] + nota[1] )/2 >=4 && (nota[0] + nota[1] )/2 <6){
        System.out.format("%s esta de recuperacao", nome);
    }   else{
        System.out.format("%s esta reprovado", nome);
    }
        
    }
}
