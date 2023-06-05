
package login.login.Dao;

import login.login.model.usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<usuario, Integer>{
    usuario findByCorreo(String correo);
}
