package libreria.modelo;

public class usuario {
    private final String id;
    private final String nombre;

    public usuario(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}
