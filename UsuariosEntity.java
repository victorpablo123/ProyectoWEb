package pe.edu.ulima.pw.proyectofinal.model.dao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name= "usuarios")
public class UsuariosEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name= "usuario", length = 50)
    private String usuario;
    @Column(name= "contrasena", length = 50)
    private String contrasena;
//[usuario] ------- [categoria]
    //1 usuario puede tener varias categorias--> maestro o alumno o admin
    @ManyToOne
   private CategoriaEntity categoria;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<PantallasEntity> pantallas;

    public UsuariosEntity(long id, String usuario, String contrasena) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public UsuariosEntity(long id, String usuario, String contrasena, CategoriaEntity categoria) {
        this.id = id;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.categoria = categoria;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public List<PantallasEntity> getPantallas() {
        return pantallas;
    }

    public void setPantallas(List<PantallasEntity> pantallas) {
        this.pantallas = pantallas;
    }
}
