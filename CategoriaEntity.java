package pe.edu.ulima.pw.proyectofinal.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="categorias")
public class CategoriaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //aca en nombre seria categoria alumno y maestro
    @Column(name="nombre", length = 50)
    private String nombre;

   //[usuario ] -----[categoria]
    //1 categoria (maestro,alumno,admin) pertenece a varios usuarios
   @OneToMany(mappedBy = "categoria")
    private List<UsuariosEntity> usuarios;

    public CategoriaEntity(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public CategoriaEntity(Long id, String nombre, List<UsuariosEntity> usuarios) {
        this.id = id;
        this.nombre = nombre;
        this.usuarios = usuarios;
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
