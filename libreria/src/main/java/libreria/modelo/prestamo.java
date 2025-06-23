package libreria.modelo;

import java.time.LocalDate;

public class prestamo {
    private final String libroId;
    private final String usuarioId;
    private final LocalDate fecha;

    public prestamo(String libroId, String usuarioId, LocalDate fecha) {
        this.libroId = libroId;
        this.usuarioId = usuarioId;
        this.fecha = fecha;
    }

    public String getLibroId() { return libroId; }
    public String getUsuarioId() { return usuarioId; }
    public LocalDate getFecha() { return fecha; }

    public void add(Object prestamo) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
}
