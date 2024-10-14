import java.util.ArrayList;
import java.util.List;

public class Ej2Biblio {
    //    Diseña una clase Biblioteca que contenga una lista de Libros.
//    Cada Libro debe tener un título y un autor, como mínimo.
//    La clase Biblioteca debe tener métodos para agregar libros y mostrar todos
//    los libros disponibles. En el programa principal,
//    crea una biblioteca, agrega varios libros y muestra la lista.
    public static void main(String[] args) {

        Biblioteca bibli = new Biblioteca();
//        bibli.setLibros(new ArrayList<Libro>());
        Libro li1=new Libro("El Aleph","Borges");
        Libro li2=new Libro("1984","Orwell");
        Libro li3=new Libro("Un mundo feliz","Huxley");
        Libro li4=new Libro("Satan de los esteros","Pelado");
        bibli.agregarLibro(li1);
        bibli.agregarLibro(li2);
        bibli.agregarLibro(li3);
        bibli.agregarLibro(li4);
        bibli.mostrarLibro();
    }
}

class Biblioteca {
    private List<Libro> libros;

    public void agregarLibro(Libro li) {
        libros.add(li);
    }

    public void mostrarLibro() {
        for (Libro li : libros) {
            System.out.println(li.toString());
        }
    }

    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    public Biblioteca() {
        this.libros=new ArrayList<>();
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }
}

class Libro {

    private String titulo;
    private String autor;

    public Libro() {
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}

