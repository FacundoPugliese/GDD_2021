public class Promocion implements estadoPrenda{
    private int descuento ;
    public Promocion (int d){
        this.descuento = d;
    }
    @Override
    public int precio(Prenda p){
        return p.getPrecioBase() - this.descuento;
    }

    public String getEstado(){
        return "Promocion";
    }
}
