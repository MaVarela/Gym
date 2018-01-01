package gimnasio.dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DisciplinaUsuarioId implements Serializable{

	private static final long serialVersionUID = 1L;

	@Column(name = "Dni")
    private int dni;

    @Column(name = "IdDisciplina")
    private int idDisciplina;
    
    public DisciplinaUsuarioId()
    {
    	
    }
    
    public DisciplinaUsuarioId(int dni, int idDisciplina)
    {
    	this.setDni(dni);
		this.setIdDisciplina(idDisciplina);
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
    
    @Override
    public boolean equals(Object o)
    {
    	boolean esIgual = false;
		esIgual = !(o == null);
		esIgual = (o == this);
    	esIgual =  !(o instanceof DisciplinaUsuarioId);
    	
    	return esIgual;
    }
    
    @Override
    public int hashCode() {
      int hsCode;
      Integer dni = this.dni;
      Integer disciplina = this.idDisciplina;
      hsCode = dni.hashCode();
      hsCode = 19 * hsCode + disciplina.hashCode();
      return hsCode;
    }
}
