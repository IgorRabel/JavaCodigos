import java.util.Scanner;

public class If {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("sim?");
    String sla = in.nextLine();

    if(sla.equalsIgnoreCase("Sim")){
        System.out.println("SIIINM");
    }else{
        System.out.println("NOOOO");
    }


    }
}
