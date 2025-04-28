// Clase base Producto
// Superclase de Camara e Impresion
public class Producto {
    protected int numero; // Número de identificación del producto

    // Constructor de Producto
    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    // Método general para mostrar detalles
    public void mostrarDetalles() {
        System.out.println("Producto #" + numero);
    }
}
