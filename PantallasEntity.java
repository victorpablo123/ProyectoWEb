package pe.edu.ulima.pw.proyectofinal.model.dao;

import javax.persistence.*;
import java.util.List;

//un usuario se puede ver en distintas pantallas

@Entity
@Table(name ="pantallas")
public class PantallasEntity {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
@Column(name="nombre", length = 50)
    private String nombre;
@ManyToMany(mappedBy = "pantallas")
 private List<UsuariosEntity> usuarios;
    public PantallasEntity(long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<UsuariosEntity> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<UsuariosEntity> usuarios) {
        this.usuarios = usuarios;
    }
}
