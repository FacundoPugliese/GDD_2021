public class Prenda {
        public  estadoPrenda estado;
        public String tipo;
        public int precioBase;


    public Prenda (estadoPrenda estado , String tipo , int precioBase){
        this.estado = estado;
        this.tipo = tipo;
        this.precioBase = precioBase;
    }

    public int getPrecioBase() {
        return precioBase;
    }

    public int precio(){
        return estado.precio(this);
    }

    @Override
    public String toString() {
        return "Prenda{" +
                "estado=" + estado.getEstado() +
                ", tipo='" + tipo + '\'' +
                ", precioBase=" + precioBase +
                '}';
    }
};


