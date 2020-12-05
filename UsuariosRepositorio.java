package pe.edu.ulima.pw.proyectofinal.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.ulima.pw.proyectofinal.model.dao.UsuariosEntity;

public interface UsuariosRepositorio extends JpaRepository<UsuariosEntity,Long> {
}
