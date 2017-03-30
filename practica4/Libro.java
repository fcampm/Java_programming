
package practica4;

/**
 *
 * @author Fabián
 */
public class Libro {
    private String nombre;
    private Autor autor; // Se incluye autor por composición ya que es un objeto
    private double precio;
    private int stock;

    public Libro(String nombre, Autor autor, double precio, int stock) {
        this.nombre = nombre;
        this.autor = new Autor(autor.getNombre(), autor.getEmail(), autor.getGenero());
        this.precio = precio;
        this.stock = stock;
    }

    public Libro(String nombre, Autor autor, double precio) {
        this.nombre = nombre;
        this.autor = new Autor(autor);
        this.precio = precio;
        this.stock = 0;
    }

    public String getNombre() {
        return this.nombre;
    }

    public Autor getAutor() {
        return this.autor;
    }


    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setPrecio(double precio) {
        if (precio >= 0.0){
            this.precio = precio;
        }
    }

    public void setStock(int stock) {
        if (stock >= 0){
            this.stock = stock;
        }
    }

    public String getAuthorName() {
        return this.autor.getNombre();
    }

    public String getAuthorEmail(){
        return this.autor.getEmail();
    }
    
    public char getAuthorGender(){
        return this.autor.getGenero();
    }

    @Override
    public String toString() {
        return "Libro: " + nombre + " Autor: " + autor + " Precio: " + precio + " Stock: " + stock;
        //return "Libro{" + "nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", stock=" + stock + '}';
    }


}
