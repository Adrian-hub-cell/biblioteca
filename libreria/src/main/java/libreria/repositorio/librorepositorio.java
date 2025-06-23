package libreria.repositorio;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import libreria.modelo.Libro;

public class librorepositorio {
    private final Map<String, Libro> libros = new HashMap<>();

    public void agregarLibro(Libro libro) {
        libros.put(libro.getId(), libro);
    }

    public Optional<Libro> obtenerPorId(String id) {
        return Optional.ofNullable(libros.get(id));
    }
}
