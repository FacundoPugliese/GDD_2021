public class Tarjeta implements formaPago{
    final private double coeficiente ;

    public Tarjeta (double coeficiente){
        this.coeficiente = coeficiente;
    }

    public int montoParcial(Venta v) {
       return v.getPrenda().precio()*v.cantidad;
    }

    public double recargo (Venta v){
        return this.montoParcial(v)*(v.cuotas*coeficiente+0.01);
    }

    @Override
    public double monto (Venta v){
        return this.montoParcial(v)+this.recargo(v);
    }

    public String formaDePago(){return "Tarjeta";}
}
