package login.login.Controller;

import java.util.List;
import login.login.Service.usuarioService;
import login.login.model.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class usuarioController {

    @Autowired
    private usuarioService usuarioService;
    
    //listar
    @GetMapping("/usuarios")
    public List<usuario> listar() {
        return usuarioService.findAll();
    }

    //guardar
    @PostMapping("/usuarios")
    public usuario guardar(@RequestBody usuario tarea) {
        return usuarioService.save(tarea);
    }

    //get una tarea
    @GetMapping("/usuarios/{id}")
    public usuario getUnaTarea(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    //Modificar
    @PutMapping("/usuarios/{id}")
    public usuario modificar(@RequestBody usuario usuario, @PathVariable Integer id) {
        usuario usuarioActual = usuarioService.findById(id);
        usuarioActual.setNombre(usuario.getNombre());
        usuarioActual.setApellido(usuario.getApellido());
        usuarioActual.setDocumento(usuario.getDocumento());
        usuarioActual.setCorreo(usuario.getCorreo());
        usuarioActual.setClave(usuario.getClave());

        return usuarioService.save(usuarioActual);
    }

    @DeleteMapping("/usuarios/{id}")
    public void eliminar(@PathVariable Integer id) {
        usuarioService.delete(id);
    }
}
