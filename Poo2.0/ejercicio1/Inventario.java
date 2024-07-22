import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
        System.out.println("Producto agregado: " + producto);
    }

    public void eliminarProducto(int id) {
        productos.removeIf(producto -> producto.getId() == id);
        System.out.println("Producto con ID " + id + " eliminado.");
    }

    public void listarProductos() {
        System.out.println("Lista de productos en el inventario:");
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }

    public void buscarProductoPorNombre(String nombre) {
        System.out.println("Buscando producto con nombre: " + nombre);
        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(producto);
            }
        }
    }

    public void buscarProductoPorCategoria(String categoria) {
        System.out.println("Buscando productos en la categoría: " + categoria);
        for (Producto producto : productos) {
            if (producto instanceof ProductoEspecifico) {
                ProductoEspecifico productoEspecifico = (ProductoEspecifico) producto;
                if (productoEspecifico.getCategoria().equalsIgnoreCase(categoria)) {
                    System.out.println(productoEspecifico);
                }
            }
        }
    }

   public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto producto1 = new Producto(1, "Lapiz", 0.5);
        ProductoEspecifico producto2 = new ProductoEspecifico(2, "Cuaderno", 2.0, "Papelería", "MarcaA");

        inventario.agregarProducto(producto1);
        inventario.agregarProducto(producto2);

        inventario.listarProductos();

        inventario.buscarProductoPorNombre("Lapiz");
        inventario.buscarProductoPorCategoria("Papelería");

        inventario.eliminarProducto(1);
        inventario.listarProductos();
    }
}
