package gimnasio.servicio;

import java.util.ArrayList;

import gimnasio.dominio.Usuario;

public interface IServiceUsuarios extends IServiceGenerico<Usuario, Integer>{
	
	//Recupera los usuarios con el rol de socio que no pertenecen a una clase
	ArrayList<Usuario> obtenerSociosNoInscriptos(Integer idClase);
	
	//Recupera los usuarios con el rol de socio que están inscriptos en una clase
	ArrayList<Usuario> obtenerSociosInscriptos(Integer idClase);
	
	//Recupera los usuarios con el rol de socio
	ArrayList<Usuario> obtenerSocios();
}