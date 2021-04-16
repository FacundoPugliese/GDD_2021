import java.util.ArrayList;

public class Sucursal {
    public String nombre;
    public ArrayList<Venta> ventas = new ArrayList<Venta>();

    public Sucursal(String nombre){
        this.nombre = nombre;
    }
    public Sucursal(String nombre , ArrayList<Venta> ventas){
        this.nombre = nombre;
        this.ventas = ventas;
    }

    public void agregarVenta(Venta v){
        this.ventas.add(v);
    }

    public double VentasDelDia(){
        return ventas.stream().mapToDouble(o -> o.monto()).sum();
    }
}
