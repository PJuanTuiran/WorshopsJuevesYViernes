public class Libro {
    private String titulo;
    private String autor;
    private int anoPublicacion;
    private boolean prestado;

    public Libro(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.prestado = false;
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

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        if (!prestado) {
            prestado = true;
        }
    }

    public void devolver() {
        if (prestado) {
            prestado = false;
        }
    }

    public static void main(String[] args) {
        Libro libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        System.out.println("Título: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Año de Publicación: " + libro.getAnoPublicacion());
        System.out.println("Prestado: " + libro.isPrestado());
        libro.prestar();
        System.out.println("Prestado: " + libro.isPrestado());
        libro.devolver();
        System.out.println("Prestado: " + libro.isPrestado());
    }
}
