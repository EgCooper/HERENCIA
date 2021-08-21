import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

    InforData inforData = new InforData("mxt","america",12345678,10,1293);
    System.out.println(inforData);
        Proveedores BussinesTadeito = new Proveedores("Tadeo","La paz",6536782,2,6576, Calendar.getInstance().getTime(),12,"Monitores");
        System.out.println(BussinesTadeito);
    Catalogos catalogo1 = new Catalogos("asus",200,343,2600,144,"1080p",10,"monitores");
        System.out.println(catalogo1);
        Cliente clien0= new Cliente("ariel","lopv",78322334,Calendar.getInstance().getTime(), 30,2,"monitor",333);
        System.out.println(clien0);

    Soporte soportetest = new Soporte("seaquemao","ariel",Calendar.getInstance().getTime(),Calendar.getInstance().getTime(),"monitor",333);
        System.out.println(soportetest);
    }


}
