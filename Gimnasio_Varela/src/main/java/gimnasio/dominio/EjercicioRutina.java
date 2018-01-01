package gimnasio.dominio;

import java.io.Serializable;
//import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(
	name = "getAllEjerciciosByIdRutina",
	query = "SELECT e FROM EjercicioRutina e WHERE e.rutina.id = :Id"
	)
})


@Entity
@Table(name = "EjerciciosRutinas")
public class EjercicioRutina implements Serializable {

	private static final long serialVersionUID = 1L;
	
	public EjercicioRutina ()
	{
		
	}
	
	@Id
	@Column(name = "IdEjercicioRutina")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne 
	@JoinColumn (name="IdRutina")
	private Rutina rutina;
	
	@Column(name = "Descripcion")
	private String descripcion;
	
	@Column(name = "Series")
	private int series;
	
	@Column(name = "Repeticiones")
	private int repeticiones;
	
	public EjercicioRutina(Rutina rutina, String descripcion, int series, int repeticiones)
	{
		super();
		this.rutina = rutina;
		this.descripcion = descripcion;
		this.series = series;
		this.repeticiones = repeticiones;
	}
	
	public int getId() {
		return id;
	}	

	public void setId(int id) {
		this.id = id;
	}

	public Rutina getRutina() {
		return rutina;
	}

	public void setRutina(Rutina rutina) {
		this.rutina = rutina;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getRepeticiones() {
		return repeticiones;
	}

	public void setRepeticiones(int repeticiones) {
		this.repeticiones = repeticiones;
	}
	
	@Override
	public String toString() {
		
		return "Ejercicio:" + "\n" +
			    "------------------------------------" + "\n" +
				"Descripción: " + descripcion + "\n" +
				"Series: " + series + "\n" +
				"Repeticiones: " + repeticiones + "\n" +
				"------------------------------------" + "\n";
	}
}
