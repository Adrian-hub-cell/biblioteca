package libreria.repositorio;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import libreria.modelo.usuario;


public class usuariorepositorio {

    public void agregarusuario(usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Object obtenerPorId(String usuarioId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public class UsuarioRepositorio {
        private final Map<String, usuario> usuarios = new HashMap<>();
    
        public void agregarUsuario(usuario  usuario) {
            usuarios.put(usuario.getId(), usuario);
        }
    
        public Optional<usuario> obtenerPorId(String id) {
            return Optional.ofNullable(usuarios.get(id));
        }
    }
    

}
