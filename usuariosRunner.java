package pe.edu.ulima.pw.proyectofinal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pe.edu.ulima.pw.proyectofinal.model.dao.CategoriaEntity;
import pe.edu.ulima.pw.proyectofinal.model.dao.UsuariosEntity;
import pe.edu.ulima.pw.proyectofinal.repositorios.CategoriaRepositorio;
import pe.edu.ulima.pw.proyectofinal.repositorios.UsuariosRepositorio;

@Component
public class usuariosRunner implements CommandLineRunner {
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;
    @Autowired
    private UsuariosRepositorio usuariosRepositorio;

    @Override
    public void run(String... args) throws Exception {
        CategoriaEntity cat1 = new CategoriaEntity(null,"maestro");
        CategoriaEntity cat2 = new CategoriaEntity(null,"alumno");
        CategoriaEntity cat3 = new CategoriaEntity(null,"admin");
        categoriaRepositorio.save(cat1);
        categoriaRepositorio.save(cat2);
        categoriaRepositorio.save(cat3);

        //agregar usuarios donde ser vera la imagen de los usuarios

        UsuariosEntity user1= new UsuariosEntity(1,"alumno1","alu1");
        UsuariosEntity user2= new UsuariosEntity(2,"alumno2","alu2");
        UsuariosEntity user3= new UsuariosEntity(3,"alumno3","alu3");
        UsuariosEntity user4= new UsuariosEntity(4,"profe1","pro1");
        UsuariosEntity user5= new UsuariosEntity(5,"profe2","pro2");
        UsuariosEntity user6= new UsuariosEntity(6,"profe3","pro3");
        UsuariosEntity user7= new UsuariosEntity(7,"admin1","adm1");
        usuariosRepositorio.save(user1);
        usuariosRepositorio.save(user2);
        usuariosRepositorio.save(user3);
        usuariosRepositorio.save(user4);
        usuariosRepositorio.save(user5);
        usuariosRepositorio.save(user6);
        usuariosRepositorio.save(user7);
    }


}
