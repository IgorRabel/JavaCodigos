import java.util.Scanner;

public class Calculo{
    
    
    static double calculoSalario(double salario, double aumento){
        
    return salario+(salario*(aumento/100));
        
    }
    
    public static void main(String[] args) {
    
    double salario, aumento;
    double novoSalario;
    
        Scanner in= new Scanner(System.in);
    
        System.out.print("Digite o valor do seu salario: R$");
        salario=in.nextDouble();
        
        System.out.print("Digite o valor do aumento: ");
        aumento=in.nextDouble();
        
        novoSalario=calculoSalario(salario,  aumento);
        
        System.out.format("Seu novo salario e: R$%.2f", novoSalario);
        
        in.close();
    }
}
