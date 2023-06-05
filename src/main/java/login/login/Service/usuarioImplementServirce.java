package login.login.Service;

import java.util.List;
import login.login.Dao.UsuarioDao;
import login.login.model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class usuarioImplementServirce implements usuarioService {

    @Autowired
    private UsuarioDao usuarioDao;

    @Override
    public List<usuario> findAll() {
        return (List<usuario>) usuarioDao.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public usuario save(usuario usuario) {
        return usuarioDao.save(usuario);
    }

    @Override
    @Transactional(readOnly = false)
    public usuario findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public void delete(Integer id) {
        usuarioDao.deleteById(id);
    }

    @Override
    public usuario findByCorreo(String correo) {
        return usuarioDao.findByCorreo(correo);
    }

}
