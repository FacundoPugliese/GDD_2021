public class Efectivo implements formaPago{
    @Override
    public double monto(Venta v) {
        return v.getPrenda().precio()*v.cantidad;
    }
    public String formaDePago(){return "Efectivo";}
}
