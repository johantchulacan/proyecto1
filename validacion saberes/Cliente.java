// Clase Cliente
// Representa a un cliente que realiza pedidos
public class Cliente {
    private String cedula;
    private String nombre;

    // Constructor de Cliente
    public Cliente(String cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    // Getters
    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }
}
