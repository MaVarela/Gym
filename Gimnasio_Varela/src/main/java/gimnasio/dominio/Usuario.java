package gimnasio.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "Usuarios")
public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	public Usuario()
	{
		
	}
	
	@Id
	@Column(name = "Dni")
	private int id;

	@Column(name = "Nombre")
	private String nombre;
	
	@Column(name = "Apellido")
	private String apellido;
	
	@Column(name = "Mail")
	private String mail;
	
	@Column(name = "Telefono")
	private String telefono;
	
	@Column(name = "Password")
	private String password;
	
	@OneToOne 
	@JoinColumn (name="IdRol")
	private RolUsuario rol;
	
	@OneToMany(mappedBy = "usuario", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
	private List<Rutina> rutinas = new ArrayList<Rutina>();
	
	@OneToMany(mappedBy = "usuario", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DisciplinaUsuario> disciplinas = new ArrayList<DisciplinaUsuario>();
	
	@OneToMany(mappedBy = "usuario", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PagoUsuario> pagos = new ArrayList<PagoUsuario>();
	
	public Usuario(int dni, String nombre, String apellido, String mail, String telefono, String password, RolUsuario rol ) {
		super();
		this.id = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.mail = mail;
		this.telefono = telefono;
		this.password = password;
		this.rol = rol;
	}
	
	public int getId() {
		return id;
	}	

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RolUsuario getRol() {
		return rol;
	}

	public void setRol(RolUsuario rol) {
		this.rol = rol;
	}

	@Override
	public String toString() {
		return "Usuario" + "\n" +
				"------------------------------------" + "\n" +
				"Dni :" + id + "\n"+
				"Nombre: " + nombre + "\n" +
				"Apellido: " + apellido + "\n" +
				"Teléfono: " + telefono + "\n" +
				"Mail: " + mail + "\n" +
				"Password: " + password + "\n" +
				rol.toString() + "\n" +
				"------------------------------------" + "\n";
	}
}
