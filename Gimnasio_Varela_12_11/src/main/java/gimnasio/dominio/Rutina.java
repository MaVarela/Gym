package gimnasio.dominio;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

@NamedQueries({
	@NamedQuery(
	name = "getAllRutinasByDni",
	query = "SELECT r FROM Rutina r WHERE r.usuario.id = :Id"
	)
})

@Entity
@Table(name = "Rutinas")
public class Rutina implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Rutina ()
	{
		
	}
	
	@Id
	@Column(name = "IdRutina")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne 
	@JoinColumn (name="Dni")
	private Usuario usuario;
	
	@Column(name = "Fecha")
	private Date fecha;
	
	@OneToMany(mappedBy = "rutina", fetch= FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval=true)
	private List<EjercicioRutina> ejercicios = new ArrayList<EjercicioRutina>();
	
	public Rutina (Usuario usuario)
	{
		super();
		this.usuario = usuario;
		this.fecha = new Date();
	}
	
	public List<EjercicioRutina> getEjercicios()
	{
		return this.ejercicios;
	}
	
	public void setDisciplinas(List<EjercicioRutina> ejercicios)
	{
		this.ejercicios = ejercicios;
	}
	
	public int getId() {
		return id;
	}	

	public void setId(int id) {
		this.id = id;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		FechasUtils conversor = new FechasUtils();
		
		return "Rutina" + "\n" +
			    "------------------------------------" + "\n" +
				"Id: " + id + "\n" +
				"Dni: " + usuario.getId() + "\n" +
				"Nombre: " + usuario.getNombre() + "\n" +
				"Apellido: " + usuario.getApellido() + "\n" +
				"Fecha: " + conversor.GetDateToString(fecha) + "\n" +
				"------------------------------------" + "\n";
	}
}
