package gimnasio.dominio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechasUtils {

	public Date ConvertirFecha(String f)
	{
		DateFormat formatter ;  
		formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date fecha = null;
		try {
			fecha = formatter.parse(f);
		} catch (ParseException e) {
			System.out.println("Formato de fecha inválido: " + f);
		}
		return fecha;
	}
	
	public String GetDateToString(Date fecha)
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(fecha);
	}
}