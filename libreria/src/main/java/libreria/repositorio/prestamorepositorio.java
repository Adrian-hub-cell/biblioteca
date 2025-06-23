package libreria.repositorio;

import java.util.ArrayList;
import java.util.List;

import libreria.modelo.prestamo;

public class prestamorepositorio {

    public List<prestamo> obtenerPorusuario(String usuarioId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void agregarPrestamo(prestamo prestamo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
   
    
    public class PrestamoRepositorio {
        private final List<prestamo> prestamos = new ArrayList<>();
    
        public void agregarPrestamo(prestamo prestamos) {
            Object prestamo = null;
            prestamos.add(prestamo);
        }
    
        public List<prestamo> obtenerPorUsuario(String usuarioId) {
            List<prestamo> resultado = new ArrayList<>();
            for (prestamo prestamo : prestamos) {
                if (prestamo.getUsuarioId().equals(usuarioId)) {
                    resultado.add(prestamo);
                }
            }
            return resultado;
        }
    }
    


}
