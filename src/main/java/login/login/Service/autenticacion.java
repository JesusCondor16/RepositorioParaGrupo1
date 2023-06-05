
package login.login.Service;

import login.login.model.usuario;
import org.springframework.stereotype.Service;

//@Service?
public class autenticacion {
    
    private usuarioService usuarioService;
    
    public autenticacion(usuarioService usuarioService){
        this.usuarioService = usuarioService;
    }
    
    public boolean validar(String correo, String clave){
        usuario usuario = usuarioService.findByCorreo(correo);
        
        if(usuario != null && usuario.getClave().equals(clave)){
            return true;
        }else{
            return false;
        }
    }
}
