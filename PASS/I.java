public class I {
    int i;

    public void show(){

        for(i=0; i<101 ; i++){
            System.out.print(i);

            if(i==67){
                System.out.print(" SIIIX SEEEVEN");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
    
    I numero = new I();

    numero.show();



    }
}
