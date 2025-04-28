// Clase Producto
public class Producto {
    protected int numero;

    public Producto(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    // Método normal
    public void mostrarDetalles() {
        System.out.println("Producto #" + numero);
    }
}
