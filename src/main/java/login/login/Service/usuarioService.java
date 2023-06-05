package login.login.Service;

import java.util.List;
import login.login.model.usuario;

public interface usuarioService {

    public List<usuario> findAll();

    public usuario save(usuario usuario);

    public usuario findById(Integer id);

    public void delete(Integer id);
    
    public usuario findByCorreo(String correo);

}
