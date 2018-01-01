package gimnasio.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Disciplinas")
public class Disciplina implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public Disciplina()
	{
		
	}
	
	public Disciplina(String descripcion, int precio, int cupos)
	{
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.cupos = cupos;
	}
	
	@Id
	@Column(name = "IdDisciplina")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "Descripcion")
	private String descripcion;
	
	@Column(name = "Precio")
	private int precio; 
	
	@Column(name = "Cupos")
	private int cupos;
	
	@OneToMany(mappedBy = "disciplina", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    private List<DisciplinaUsuario> disciplinas = new ArrayList<DisciplinaUsuario>();
	
	@OneToMany(mappedBy = "disciplina", fetch= FetchType.LAZY, cascade = CascadeType.ALL)
    private List<PagoUsuario> pagos = new ArrayList<PagoUsuario>();

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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCupos() {
		return cupos;
	}

	public void setCupos(int cupos) {
		this.cupos = cupos;
	}
	
	public List<DisciplinaUsuario> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<DisciplinaUsuario> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<PagoUsuario> getPagos() {
		return pagos;
	}

	public void setPagos(List<PagoUsuario> pagos) {
		this.pagos = pagos;
	}

	public int getDisponibilidad()
	{
		int disponibilidad = this.cupos;
		for(DisciplinaUsuario socio : this.disciplinas)
		{
			if(socio.estaInscripto())
				disponibilidad -= 1;
		}
		
		return disponibilidad;
	}
	
	@Override
	public String toString() {
		
		return "Disciplina:" + "\n" +
			    "------------------------------------" + "\n" +
				"Descripción: " + descripcion + "\n" +
				"Precio: " + precio + "\n" +
				"Cupo: " + cupos+ "\n" +
				"------------------------------------" + "\n";
	}
}
