import java.util.Scanner;

public class Revisao {
    Scanner in = new Scanner(System.in);

    float valorLitro, litro, litroFinal= litro*valorLitro, kmInicio, kmFim, valorRecebido, contaKm=kmFim-kmInicio, contaKmL= contaKm/litro;

    public void getDados(){
    
        System.out.print("Quantos quilometros voce estava no inicio?: ");
        kmInicio=in.nextFloat();

        System.out.print("Quantos quilometos estava no final?: ");
        kmFim=in.nextFloat();

        System.out.print("Quantos litros abasteceu?: ");
        litro=in.nextFloat();

        System.out.print("Quanto que estava o litro em reais? R$");
        valorLitro=in.nextFloat();

        System.out.print("Digite o valor que voce recebeu: ");
        valorRecebido= in.nextFloat();

    }
    public void showDados(){
        float litroFinal= litro*valorLitro, contaKm=kmFim-kmInicio, contaKmL= contaKm/litro;
        System.out.println("\n\n\n\n \n\n    ODOMETRO     ");
        System.out.printf("KM INICIO: %.2f KM\n", kmInicio);
        System.out.printf("KM FINAL: %.2f KM\n",kmFim);
        System.out.printf("Abateceu: %.2f litros\n",litro);
        System.out.printf("Valor recebido de corridas: R$%.2f \n",valorRecebido);
        System.out.printf("Consumo em KM/L: %.2f \n",contaKmL);
        System.out.printf("Valor recebido no dia: R$%.2f \n" , valorRecebido-litroFinal);


        in.close();
    }

    public static void main(String[] args) {

        Revisao revisao = new Revisao();

        revisao.getDados();
        revisao.showDados();
    
    }
}
