import java.util.ArrayList;
import java.util.List;

//Crea una clase Producto que contenga
// información sobre un producto, como nombre y
// precio.
//Crea otra clase Categoría que
//contenga una lista de productos. Implementa
// métodos para agregar productos a una
// categoría y
//mostrar todos los productos de una categoría.
public class Ej6Producto {
    public static void main(String[] args) {

        Categoria cate = new Categoria("lacteos");
        Categoria cate1 = new Categoria("carne");
        Producto prod1 = new Producto("picadillo"
                , 158.8);
        Producto prod2 =
                new Producto("paty"
                        , 144.8);
        Producto prod3 =
                new Producto("leche"
                        , 13358.8);
        Producto prod4 = new Producto("queso " +
                "tregar"
                , 157778.8);
        Producto prod5 = new Producto("yogurt"
                , 1578.8);

        cate.agregarProducto(prod3);
        cate.agregarProducto(prod4);
        cate.agregarProducto(prod5);
        cate1.agregarProducto(prod1);
        cate1.agregarProducto(prod2);
        cate.mostrarProductos();
        cate1.mostrarProductos();

    }
}

class Producto {
    private String nombre;
    private Double precio;

    public Producto(String nombre,
                    Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}

class Categoria {
    private String nombre;
    private List<Producto> productos;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto prod) {
        productos.add(prod);

    }

    public void agregarProducto(String nombre
            , Double precio) {
        productos.add(
                new Producto(nombre, precio));
    }

    public void mostrarProductos() {
        System.out.println(
                "Lista de productos " + nombre);
        for (Producto prod : productos) {
            System.out.println(prod.toString());
        }
    }
}
