import java.util.Calendar;

public class Main {
    public static void main(String[] args) {


        //Polimorfismo
    Catalogos L4150 = new Catalogos("L4150",1150,4150,2,30,"hd",1,"impresoras");
        Catalogos impresora = (Catalogos) L4150;
        System.out.println(impresora);



    }


}
