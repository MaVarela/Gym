package gimnasio.dominio;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class PagoUsuarioId  implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "Dni")
    private int dni;

    @Column(name = "IdDisciplina")
    private int idDisciplina;
    
    @Column(name = "FechaPago")
    private Date fechaPago;
    
    public PagoUsuarioId()
    {
    	
    }
    
    public PagoUsuarioId(int dni, int idDisciplina)
    {
    	this.dni = dni;
		this.idDisciplina = idDisciplina;
		this.fechaPago = new Date();
    }
    
    public int getDni()
    {
    	return this.dni;
    }
    
    public void setDni(int dni)
    {
    	this.dni = dni;
    }
    
    public int getIdDisciplina()
    {
    	return this.idDisciplina;
    }
    
    public void setIdDisciplina(int idDisciplina)
    {
    	this.idDisciplina = idDisciplina;
    }
    
    public String getFechaPago() {
    	FechasUtils conversor = new FechasUtils();
		return conversor.GetDateToString(fechaPago);
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
	}

	@Override
    public boolean equals(Object o)
    {
    	boolean esIgual = false;
		esIgual = !(o == null);
		esIgual = (o == this);
    	esIgual =  !(o instanceof PagoUsuarioId);
    	PagoUsuarioId obj = (PagoUsuarioId)o;
    	esIgual = (this.dni == obj.dni && this.idDisciplina == obj.idDisciplina && this.fechaPago == obj.fechaPago);
    	
    	return esIgual;
    }
    
    @Override
    public int hashCode() {
      int hsCode;
      Integer dni = this.dni;
      Integer disciplina = this.idDisciplina;
      int fecha = this.fechaPago.hashCode();
      hsCode = dni.hashCode();
      hsCode = 19 * hsCode + disciplina.hashCode() + fecha;
      return hsCode;
    }

}
