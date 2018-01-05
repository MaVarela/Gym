package gimnasio.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "DisciplinaUsuario")
public class DisciplinaUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public DisciplinaUsuario()
	{
		
	}
	
	@EmbeddedId
    private DisciplinaUsuarioId id;
	
	@Column(name = "Inscripto")
	private boolean inscripto;
	
	@Column(name = "Reservado")
	private Boolean reservado;
	
	@Column(name = "FechaInscripto", nullable = true)
	private Date fechaInscripto;
	
	@ManyToOne
	@MapsId("dni")
    @JoinColumn(name = "dni", insertable = false, updatable = false)
    private Usuario usuario;
	
	@ManyToOne
	@MapsId("idDisciplina")
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Disciplina disciplina;

	public DisciplinaUsuario(Usuario usuario, Disciplina disciplina , boolean inscripto)
	{
		super(); 
		this.id = new DisciplinaUsuarioId(usuario.getId(), disciplina.getId());
		this.usuario = usuario;
		this.disciplina = disciplina;
		this.inscripto = inscripto;
		this.fechaInscripto = inscripto ? new Date() : null;
	}
	
	public Usuario getUsuario()
	{
		return usuario;
	}
	
	public void setUsuario(Usuario usuario)
	{
		this.usuario = usuario;
	}
	
	public Disciplina getDisciplina()
	{
		return disciplina;
	}
	
	public void setDisciplina(Disciplina disciplina)
	{
		this.disciplina = disciplina;
	}
	
	public DisciplinaUsuarioId getId()
	{
		return this.id;
	}
	
	public void setId(DisciplinaUsuarioId id)
	{
		this.id = id;
	}

	public boolean estaInscripto() {
		return inscripto;
	}

	public void setInscripto(boolean inscripto) {
		this.inscripto = inscripto;
	}

	public Date getFechaInscripto() {
		return fechaInscripto;
	}

	public void setFechaInscripto(Date fechaInscripto) {
		this.fechaInscripto = fechaInscripto;
	}
	
	public Boolean estaReservado() {
		return reservado;
	}

	public void setReservado(Boolean reservado) {
		this.reservado = reservado;
	}

	@Override
	public String toString() {
		
		FechasUtils conversor = new FechasUtils();
		String fecha = inscripto ? conversor.GetDateToString(fechaInscripto) : "N/A";
		
		return "Disciplina Por Usuario:" + "\n" +
			    "------------------------------------" + "\n" +
				"Descripción: " + disciplina.getDescripcion() + "\n" +
				"Dni: " + usuario.getId() + "\n" +
				"Nombre: " + usuario.getNombre() + "\n" +
				"Apellido: " + usuario.getApellido() + "\n" +
				"Rol: " + usuario.getRol().getDescripcion() + "\n" +
				"Fecha Inscripcion: " + fecha + "\n" +
				"------------------------------------" + "\n";
	}
	
	@Override
    public boolean equals(Object o)
    {
    	boolean esIgual = false;
		esIgual = !(o == null);
    	esIgual =  !(o instanceof DisciplinaUsuario);
    	
    	DisciplinaUsuario obj = (DisciplinaUsuario) o;
    	esIgual = (this.id.getDni() == obj.id.getDni() && this.id.getIdDisciplina() == obj.id.getIdDisciplina());
    	
    	return esIgual;
    }
}