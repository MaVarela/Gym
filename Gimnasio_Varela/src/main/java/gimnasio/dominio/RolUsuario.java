package gimnasio.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;


@Entity
@Table(name = "Roles")
public class RolUsuario implements Serializable {

	public RolUsuario()
	{
		
	}
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "IdRol")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Descripcion")
	private String descripcion;
	
	@OneToMany(mappedBy = "rol", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	public RolUsuario(String descripcion) {
		super();
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Rol [Id:" + id + ", Descripción:" + descripcion + "]";
	}

	public int getId() {
		return id;
	}	

	public void setId(int id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
