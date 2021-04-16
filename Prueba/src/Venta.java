import java.text.SimpleDateFormat;
import java.util.Date;

public class Venta {
    public Prenda p ;

    @Override
    public String toString() {
        return "Venta{" +
                "p=" + p +
                ", cantidad=" + cantidad +
                ", fechaVenta='" + fechaVenta + '\'' +
                ", formapago=" + formapago.formaDePago() +
                ", cuotas=" + cuotas +
                ", precio=" + this.monto() +
                '}';
    }

    public int cantidad;
    public String fechaVenta = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    public formaPago formapago;
    public int cuotas = 1;


    public Venta(Prenda p , int cantidad , formaPago formapago){
        this.p = p;
        this.cantidad = cantidad;
        this.formapago = formapago;
    }

    public Prenda getPrenda(){ return p;}

    public double monto() {
        return formapago.monto(this);
    }
}
