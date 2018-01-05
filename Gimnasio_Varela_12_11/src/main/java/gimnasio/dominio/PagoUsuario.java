package gimnasio.dominio;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(
	name = "getPagosFechaDesc",
	query = "SELECT P FROM PagoUsuario P ORDER BY P.id.fechaPago DESC"
	)
})

@Entity
@Table(name = "PagoUsuario")
public class PagoUsuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public PagoUsuario()
	{
		
	}
	
	@EmbeddedId
    private PagoUsuarioId id;
	
	@ManyToOne
	@MapsId("dni")
    @JoinColumn(name = "dni", insertable = false, updatable = false)
    private Usuario usuario;
	
	@ManyToOne
	@MapsId("idDisciplina")
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private Disciplina disciplina;
	
	public PagoUsuario(Usuario usuario, Disciplina disciplina)
	{
		super();
		PagoUsuarioId pagoUsuarioId = new PagoUsuarioId(usuario.getId(), disciplina.getId());
		this.id = pagoUsuarioId;
		this.disciplina = disciplina;
		this.usuario = usuario;
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
	
	public PagoUsuarioId getId()
	{
		return this.id;
	}
	
	public void setId(PagoUsuarioId id)
	{
		this.id = id;
	}
	
	public Integer getImporte()
	{
		return this.disciplina.getPrecio();
	}
	
	@Override
	public String toString() {
		
		return "Pago de Disciplina Por Usuario:" + "\n" +
			    "------------------------------------" + "\n" +
				"Descripción: " + disciplina.getDescripcion() + "\n" +
				"Dni: " + usuario.getId() + "\n" +
				"Nombre: " + usuario.getNombre() + "\n" +
				"Apellido: " + usuario.getApellido() + "\n" +
				"Fecha Pago: " + id.getFechaPago() + "\n" +
				"------------------------------------" + "\n";
	}
}
