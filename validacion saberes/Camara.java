// Clase Camara que hereda de Producto
// Especialización de Producto que representa cámaras
public class Camara extends Producto {
    private String marca;
    private String modelo;

    // Constructor de Camara
    public Camara(int numero, String marca, String modelo) {
        super(numero); // Llamada al constructor de Producto
        this.marca = marca;
        this.modelo = modelo;
    }

    // Sobrescritura del método mostrarDetalles()
    public void mostrarDetalles() {
        System.out.println("Cámara #" + numero + " Marca: " + marca + ", Modelo: " + modelo);
    }
}
