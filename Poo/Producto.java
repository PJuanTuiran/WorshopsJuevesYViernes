public class Producto<t> {
    private static Integer numero = 5;
    private int id;
    private String descripcion;
    private int stock;

    public Producto(int id, String descripcion, int stock){
        this.id = id;
        this.descripcion = descripcion;
        this.stock = stock;

    }

    public void agregarStock(int add){
        if(add > 0){
            stock = stock + add;
            return;
        }

        System.out.println("deberias agregar un numero positivo");
        

    }
    
    public void quitarStock(int add){
        if(stock > 0 && stock >= add){
            stock = stock - add;
            return;
        }
        System.out.println("tu stock esta en 0");

    }

    public void mostrarCantidad(){
        System.out.println("la cantidad que hay es de" + stock);
    }

    public static void main(String[] args) {
        Producto arroz = new Producto(1, "es el mejor", 20);
        arroz.agregarStock(20);
        arroz.quitarStock(10);
        arroz.mostrarCantidad();
        
        
    }


}