public class Liquidacion implements estadoPrenda{
    @Override
    public int precio(Prenda p) {
        return p.getPrecioBase()/2;
    }

    public String getEstado(){
        return "Liquidacion";
    }
}
