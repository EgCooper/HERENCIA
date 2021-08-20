import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

    InforData inforData = new InforData("mxt","america",12345678,10,1293);


    System.out.println(inforData);
        Proveedores BussinesTadeito = new Proveedores("Tadeo","La paz",6536782,2,6576, Calendar.getInstance().getTime(),12,"Monitores");
        System.out.println(BussinesTadeito);
        
    }


}
