import sun.util.resources.CalendarData;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class main {
    public static void main (String [ ] args) {

        /* Estados que puede tomar una prenda*/
        Liquidacion liquidacion = new Liquidacion();
        Nuevo nuevo = new Nuevo();
        Promocion promo = new Promocion(200);

        /*Formas de pago*/
        Efectivo efectivo = new Efectivo();
        Tarjeta visa = new Tarjeta(0.1);

        /*Creacion de prendas*/
        Prenda jean = new Prenda(liquidacion , "pantalon" ,1500);
        Prenda leñadora = new Prenda(nuevo , "camisa" , 1000);


        System.out.println( jean.toString());
        System.out.println( leñadora.toString());

        System.out.println( leñadora.precio());
        System.out.println( jean.precio());

        Venta venta1 = new Venta(jean,1,visa );
        Venta venta2 = new Venta(jean,1,efectivo);

        System.out.println(venta1.toString());
        System.out.println(venta2.toString());

        ArrayList<Venta> v = new ArrayList<Venta>();
        v.add(venta1);
        v.add(venta2);
        Sucursal sucursal = new Sucursal("Salada" , v);

        System.out.println(sucursal.VentasDelDia());







    }
}
