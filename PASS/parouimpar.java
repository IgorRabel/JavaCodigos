import java.util.Scanner;

public class parouimpar {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int num= in.nextInt();

        if(num%2==0 && num!=0){
            System.out.format("Seu numero (%d) e par", num);
            
            }else if(num==0){
                System.out.format("Seu numero (%d) e o zero", num);
            }

                else{
                    System.out.format("Seu numero (%d) e impar", num);
                }

    in.close();
    }
}
