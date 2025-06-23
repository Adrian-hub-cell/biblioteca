package libreria.servicio;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;
import java.util.NoSuchElementException;

import libreria.modelo.Libro;
import libreria.modelo.usuario;
import libreria.modelo.prestamo;

import libreria.repositorio.librorepositorio;
import libreria.repositorio.usuariorepositorio;
import libreria.repositorio.prestamorepositorio;

public class libreriaservicio {
    private librorepositorio libroRepo;
    private usuariorepositorio usuarioRepo = new usuariorepositorio();
    private prestamorepositorio prestamoRepo = new prestamorepositorio();
    @SuppressWarnings("unused")
    private prestamorepositorio prestamorepo;

    public libreriaservicio(librorepositorio libroRepo, usuariorepositorio usuarioRepo, prestamorepositorio prestamoRepo) {
        this.libroRepo = new librorepositorio();
        
        this.libroRepo = libroRepo;
        
        this.usuarioRepo = usuarioRepo;
        
        this.prestamoRepo = prestamoRepo;
    }

    public void agregarLibro(Libro libro) {
        libroRepo.agregarLibro(libro);
    }

    public Libro obtenerLibroPorId(String id) {
        return libroRepo.obtenerPorId(id)
                .orElseThrow(() -> new NoSuchElementException("Libro no encontrado: " + id));
    }

    public void registrarUsuario(usuario usuario) {
        usuarioRepo.agregarusuario(usuario);
    }

    public void prestarLibro(String libroId, String usuarioId) throws SQLException {
        Libro libro = obtenerLibroPorId(libroId);
        @SuppressWarnings("unused")
        usuario usuario = usuarioRepo.obtenerPorId(usuarioId)
                .orElseThrow (() -> new IllegalArgumentException("Usuario no encontrado: " + usuarioId));

        if (libro.isPrestado()) {
            throw new IllegalStateException("El libro ya está prestado.");
        }

        libro.setPrestado(true);
        prestamoRepo.agregarPrestamo(new prestamo(libroId, usuarioId, LocalDate.now()));
    }

    public List<prestamo> obtenerPrestamosPorUsuario(String usuarioId) {
        return prestamoRepo.obtenerPorusuario(usuarioId);
    }
}
