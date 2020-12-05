package pe.edu.ulima.pw.proyectofinal.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pe.edu.ulima.pw.proyectofinal.model.dao.UsuariosEntity;
import pe.edu.ulima.pw.proyectofinal.repositorios.UsuariosRepositorio;

import java.util.List;

@Controller
public class usuariosControladores {
    @Autowired
    private UsuariosRepositorio usRepositorio;

    @RequestMapping(value="/usuarios/listar",method = RequestMethod.GET)
    public String mostrarListadoUsuarios(Model model){
        List<UsuariosEntity> usuarios = usRepositorio.findAll();
        model.addAttribute("listaUsuarios",usuarios);
        return "usuarios";
    }
}
