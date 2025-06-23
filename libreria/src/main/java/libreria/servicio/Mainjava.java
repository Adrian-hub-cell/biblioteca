package libreria.servicio;

import java.util.List;

import libreria.modelo.Libro;
import libreria.modelo.prestamo;
import libreria.modelo.usuario;
import libreria.repositorio.librorepositorio;
import libreria.repositorio.prestamorepositorio;
import libreria.repositorio.usuariorepositorio;

public class Mainjava {
    @SuppressWarnings("UseSpecificCatch")
    public static void main(String[] args) {
        librorepositorio libroRepo = new librorepositorio();
        usuariorepositorio usuarioRepo = new usuariorepositorio();
        prestamorepositorio prestamoRepo = new prestamorepositorio();
        libreriaservicio servicio = new libreriaservicio(libroRepo, usuarioRepo, prestamoRepo);

        servicio.agregarLibro(new Libro("1", "Cien Años de Soledad", "Gabriel García Márquez"));
        servicio.registrarUsuario(new usuario("u1", "Laura"));

        // Agregar más libros automáticamente
        for (int i = 2; i <= 100; i++) {
            servicio.agregarLibro(new Libro(String.valueOf(i), "Libro #" + i, "Autor " + i));
        }

        try {
            servicio.prestarLibro("1", "u1");
            System.out.println("📚 Libro prestado con éxito.");
        } catch (Exception e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }

        System.out.println("\n📖 Historial de préstamos de Laura:");
        List<prestamo> prestamos = servicio.obtenerPrestamosPorUsuario("u1");
        for (prestamo p : prestamos) {
            System.out.println("- Libro ID: " + p.getLibroId() + " | Fecha: " + p.getFecha());
        }
    }
}

