public class Nuevo implements estadoPrenda{
    @Override
    public int precio(Prenda p){
        return p.getPrecioBase();
    }
    public String getEstado(){
        return "Nuevo";
    }
}
