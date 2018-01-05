package Pruebas;
//import java.util.List;

//import gimnasio.dominio.*;

public class Principal {

	public static void main(String[] args) {

		//AddRoles();
		//AddUsuarios();
		//AddRutinas();
		//AddEjerciciosEnRutinas();
		//AddDisciplinas();
		//AddUsuarioDisciplina();
		//AddPagoUsuario();
		//UpdateRol();
		//UpdateUsuario();
		//UpdateEjerciciosRutina();;
		//UpdateDisciplinas();
		//ReadAllRoles();
		//ReadAllUsuarios();
		//ReadAllRutinas();
		//ReadAllDisciplinas();
		//ReadAllDisciplinasUsuario();
		//ReadAllPagosUsuarios();
		//DeleteRol();
		//DeleteRutina();
		//DeleteUsuario();
		//DeleteDisciplinas();
		//DeleteDisciplinaUsuario();
		
	}
	
	/*public static void DeleteRol()
	{
		public Service service;
		GenericDAO<RolUsuario> dao = new GenericDAO<RolUsuario>(new RolUsuario());
		RolUsuario rol = dao.GetById(5);
		if (rol != null)
		{
			if(dao.Delete(rol))
				System.out.println("El rol: " + rol.getId() + " ha sido eliminado con éxito.");
			else
				System.out.println("Ha ocurrido un error al eliminar el rol: " + rol.getId());
		}
		else
		{
			System.out.println("El rol no existe");
		}
	}
	
	public static void DeleteRutina()
	{
		GenericDAO<Rutina> dao = new GenericDAO<Rutina>(new Rutina());
		Rutina rutina = dao.GetById(3);
		if (rutina != null)
		{
			if(dao.Delete(rutina))
				System.out.println("La rutina: " + rutina.getId() + " ha sido eliminada con éxito.");
			else
			{
				System.out.println("Ocurrió un error al eliminar la rutina: " + rutina.getId());
			}
		}
		else
		{
			System.out.println("La rutina no existe");
		}
	}
	
	public static void DeleteUsuario()
	{
		GenericDAO<Usuario> dao = new GenericDAO<Usuario>(new Usuario());
		Usuario usuario = dao.GetById(34493016);
		Usuario usuario2 = dao.GetById(34493018);
		if (usuario != null)
		{
			if(dao.Delete(usuario))
				System.out.println("El usuario: " + usuario.getId() + " ha sido eliminado con éxito.");
			else
			{
				System.out.println("Ocurrió un error al eliminar el usuario: " + usuario.getId());
			}
		}
		else
		{
			System.out.println("El usuario con dni: 34493016 no existe");
		}
		if (usuario2 != null)
		{
			if(dao.Delete(usuario2))
				System.out.println("El usuario: " + usuario2.getId() + " ha sido eliminado con éxito.");
			else
			{
				System.out.println("Ocurrió un error al eliminar el usuario: " + usuario2.getId());
			}
		}
		else
		{
			System.out.println("El usuario con dni: 34493018 no existe");
		}
	}
	
	public static void UpdateRol()
	{
		GenericDAO<RolUsuario> dao = new GenericDAO<RolUsuario>(new RolUsuario());
		RolUsuario rol = dao.GetById(3);
		if (rol != null)
		{
			rol.setDescripcion("Profesor/a");
			if(dao.Update(rol))
				System.out.println("El rol: " + rol.getId() + " ha sido modificado con éxito.");
			else
				System.out.println("Ocurrió un error al modificar el rol: " + rol.getId());
		}
		else
		{
			System.out.println("El Rol no existe");
		}
	}
	
	public static void UpdateUsuario()
	{
		GenericDAO<Usuario> dao = new GenericDAO<Usuario>(new Usuario());
		Usuario usuario = dao.GetById(34493013);
		if (usuario != null)
		{
			usuario.setApellido("Pérez");
			if(dao.Update(usuario))
				System.out.println("El usuario: " + usuario.getId() + " ha sido modificado con éxito.");
			else
				System.out.println("Ocurrió un error al modificar el usuario: " + usuario.getId());
		}
		else
		{
			System.out.println("El Usuario no existe");
		}
	}
	
	public static void UpdateEjerciciosRutina()
	{		
		GenericDAO<Rutina> dao = new GenericDAO<Rutina>(new Rutina());
		GenericDAO<EjercicioRutina> daoEjercicios = new GenericDAO<EjercicioRutina>(new EjercicioRutina());
		RutinasDAO daoRutinas = new RutinasDAO();
		Rutina rutina = dao.GetById(3);
		
		if(rutina != null)
        {
			List<EjercicioRutina> ejercicios = daoRutinas.GetAllEjerciciosByIdRutinas(rutina.getId());
        	for(EjercicioRutina e : ejercicios)
        	{
        		e.setRepeticiones(30);
        		e.setSeries(3);
        		if(daoEjercicios.Update(e))
        			System.out.println("El ejercicio: " + e.getId() + " perteneciente a la rutina: " + e.getRutina().getId() +  " ha sido modificado con éxito.");
      			else
      				System.out.println("Ocurrió un error al modificar el ejercicio: " + e.getId() + "perteneciente a la rutina: " + e.getRutina().getId());  
        	}
		}
		else
		{
			System.out.println("La rutina no existe");
		}
	}
	
	public static void AddRoles()
	{
		GenericDAO<RolUsuario> dao = new GenericDAO<RolUsuario>(new RolUsuario());
        RolUsuario r1= new RolUsuario("Administrador");
        RolUsuario r2 = new RolUsuario("Profesor de Musculación");
        RolUsuario r3 = new RolUsuario("Profesor");
        RolUsuario r4 = new RolUsuario("Socio");
        RolUsuario r5 = new RolUsuario("No Socio");
        
		dao.Insert(r1);
		dao.Insert(r2);
		dao.Insert(r3);
		dao.Insert(r4);
		dao.Insert(r5);
	}¨*/

	public static void ReadAllRoles()
	{		
		//GenericDAO<RolUsuario> dao = new GenericDAO<RolUsuario>(new RolUsuario());
		/*List<RolUsuario> roles = dao.GetAll();
		
		if(roles.size() > 0)
        {
			for (RolUsuario p : roles) {
        	  System.out.println(p.toString());	
			}
        }
		else
		{
			System.out.println("No se ha encontrado ningún registro.");
		}*/
	}
	
	/*public static void AddUsuarios()
	{
		GenericDAO<Usuario> daoUsuarios = new GenericDAO<Usuario>(new Usuario());
		GenericDAO<RolUsuario> daoRoles = new GenericDAO<RolUsuario>(new RolUsuario());
        RolUsuario rol1 = daoRoles.GetById(1);
        RolUsuario rol2 = daoRoles.GetById(2);
        RolUsuario rol3 = daoRoles.GetById(3);
        RolUsuario rol4 = daoRoles.GetById(4);
        
        if(rol1 != null)
        {
        	Usuario usuario1 = new Usuario(34493011, "Mariano", "Varela", "Marianovarela89@yahoo.es", "4736-7808", "Admin123", rol1);
        	daoUsuarios.Insert(usuario1);
        }
        if(rol2 != null)
        {
        	Usuario usuario2 = new Usuario(34493012, "Marcela", "Costas", "MarceCostas@gmail.com", "4736-4532", "Profe123", rol2);
            Usuario usuario3 = new Usuario(34493013, "Carlos", "Perez", "CarlosPerez@live.com.ar", "4736-1800", "Profe123", rol2);
            daoUsuarios.Insert(usuario2);
            daoUsuarios.Insert(usuario3);
        }
        if(rol3 != null)
        {
        	Usuario usuario4 = new Usuario(34493014, "Romina", "Gonzalez", "RomyGon@gmail.com", "4740-5569", "Profe123", rol3);
        	Usuario usuario7 = new Usuario(34493017, "Micaela", "Gimenez", "MicaGim@gmail.com", "4740-5099", "Profe123", rol3);
        	Usuario usuario8 = new Usuario(34493018, "Lorena", "Palermo", "LorePal@gmail.com", "4740-1269", "Profe123", rol3);
            daoUsuarios.Insert(usuario4);
            daoUsuarios.Insert(usuario7);
            daoUsuarios.Insert(usuario8);
        }
        if(rol4 != null)
        {
        	Usuario usuario5 = new Usuario(34493015, "Gustavo", "Castillo", "Gus.Castillo@gmail.com", "4736-4567", "Socio123", rol4);
        	Usuario usuario6 = new Usuario(34493016, "Juan Manuel", "Vazquez Crossetto", "Juanma.Crossetto@gmail.com", "4736-4543", "Socio123", rol4);
            daoUsuarios.Insert(usuario5);
            daoUsuarios.Insert(usuario6);
        }
	}
	
	public static void ReadAllUsuarios()
	{
		GenericDAO<Usuario> dao = new GenericDAO<Usuario>(new Usuario());
		RutinasDAO daoRutinas = new RutinasDAO();
		List<Usuario> usuarios = dao.GetAll();
		
		if(usuarios.size() > 0)
        {
			for (Usuario p : usuarios) {
        	  System.out.println(p.toString());
        	  if(p.getRol().getId() == 4){
        		  List<Rutina> rutinas = daoRutinas.GetAllRutinasByDni(p.getId());
        		  for(Rutina r : rutinas)
        		  {
        			  System.out.println(r.toString());
        		  }
        	  }
			}
        }
		else
		{
			System.out.println("No se ha encontrado ningún registro.");
		}
	}
	
	public static void AddRutinas()
	{
		GenericDAO<Usuario> daoUsuarios = new GenericDAO<Usuario>(new Usuario());
		GenericDAO<Rutina> daoRutinas = new GenericDAO<Rutina>(new Rutina());
		
		Usuario usuario1 = daoUsuarios.GetById(34493015);
		Usuario usuario2 = daoUsuarios.GetById(34493016);
		
		if(usuario1 != null)
		{
			Rutina rutina1 = new Rutina(usuario1);
			Rutina rutina2 = new Rutina(usuario1);
			daoRutinas.Insert(rutina1);
			daoRutinas.Insert(rutina2);
		}
		if(usuario2 != null)
		{
			Rutina rutina1 = new Rutina(usuario2);
			daoRutinas.Insert(rutina1);
		}
	}
	
	public static void AddEjerciciosEnRutinas()
	{
		GenericDAO<Rutina> daoRutinas = new GenericDAO<Rutina>(new Rutina());
		GenericDAO<EjercicioRutina> daoEjerciciosRutina = new GenericDAO<EjercicioRutina>(new EjercicioRutina());
		
		Rutina rutina1 = daoRutinas.GetById(1);
		Rutina rutina2 = daoRutinas.GetById(2);
		Rutina rutina3 = daoRutinas.GetById(3);
		
		if(rutina1 != null)
		{
			EjercicioRutina ej1 = new EjercicioRutina(rutina1, "Sentadillas", 4, 20);
			EjercicioRutina ej2 = new EjercicioRutina(rutina1, "Peso Muerto", 4, 20);
			EjercicioRutina ej3 = new EjercicioRutina(rutina1, "Banco de Cuadriceps", 4, 20);
			EjercicioRutina ej4 = new EjercicioRutina(rutina1, "Estocadas", 4, 20);
			EjercicioRutina ej5 = new EjercicioRutina(rutina1, "Hawk", 4, 20);
			daoEjerciciosRutina.Insert(ej1);
			daoEjerciciosRutina.Insert(ej2);
			daoEjerciciosRutina.Insert(ej3);
			daoEjerciciosRutina.Insert(ej4);
			daoEjerciciosRutina.Insert(ej5);
		}
		if(rutina2 != null)
		{
			EjercicioRutina ej1 = new EjercicioRutina(rutina2, "Apertura Plana", 4, 20);
			EjercicioRutina ej2 = new EjercicioRutina(rutina2, "Apertura Inclinada", 4, 20);
			EjercicioRutina ej3 = new EjercicioRutina(rutina2, "Flexiones de Brazos", 4, 20);
			EjercicioRutina ej4 = new EjercicioRutina(rutina2, "PullOver", 4, 20);
			EjercicioRutina ej5 = new EjercicioRutina(rutina2, "Press Vertical", 4, 20);
			daoEjerciciosRutina.Insert(ej1);
			daoEjerciciosRutina.Insert(ej2);
			daoEjerciciosRutina.Insert(ej3);
			daoEjerciciosRutina.Insert(ej4);
			daoEjerciciosRutina.Insert(ej5);
		}
		if(rutina3 != null)
		{
			EjercicioRutina ej1 = new EjercicioRutina(rutina3, "Apertura Plana", 4, 20);
			EjercicioRutina ej2 = new EjercicioRutina(rutina3, "Apertura Inclinada", 4, 20);
			EjercicioRutina ej3 = new EjercicioRutina(rutina3, "Flexiones de Brazos", 4, 20);
			EjercicioRutina ej4 = new EjercicioRutina(rutina3, "PullOver", 4, 20);
			EjercicioRutina ej5 = new EjercicioRutina(rutina3, "Press Vertical", 4, 20);
			daoEjerciciosRutina.Insert(ej1);
			daoEjerciciosRutina.Insert(ej2);
			daoEjerciciosRutina.Insert(ej3);
			daoEjerciciosRutina.Insert(ej4);
			daoEjerciciosRutina.Insert(ej5);
		}
	}
	
	public static void ReadAllRutinas()
	{
		GenericDAO<Rutina> dao = new GenericDAO<Rutina>(new Rutina());
		RutinasDAO daoRutinas = new RutinasDAO();
		List<Rutina> rutinas = dao.GetAll();
		
		if(rutinas.size() > 0)
        {
			for (Rutina r : rutinas) {
        	  System.out.println(r.toString());
        		  List<EjercicioRutina> ejercicios = daoRutinas.GetAllEjerciciosByIdRutinas(r.getId());
        		  for(EjercicioRutina e : ejercicios)
        		  {
        			  System.out.println(e.toString());
        		  }
        	  }
		}
		else
		{
			System.out.println("No se ha encontrado ningún registro.");
		}
	}

	public static void AddDisciplinas()
	{
		GenericDAO<Disciplina> daoDisciplinas = new GenericDAO<Disciplina>(new Disciplina());
        
		Disciplina disciplina1 = new Disciplina("Spinning", 100, 30);
        daoDisciplinas.Insert(disciplina1);
        Disciplina disciplina2 = new Disciplina("Clases de Step", 100, 30);
        daoDisciplinas.Insert(disciplina2);
        Disciplina disciplina3 = new Disciplina("CrossFit", 100, 30);
        daoDisciplinas.Insert(disciplina3);
        
	}
	
	public static void AddUsuarioDisciplina()
	{
		GenericDAO<Usuario> daoUsuarios = new GenericDAO<Usuario>(new Usuario());
		GenericDAO<Disciplina> daoDisciplinas = new GenericDAO<Disciplina>(new Disciplina());
		GenericDAO<DisciplinaUsuario> daoDisciplinaUsuario = new GenericDAO<DisciplinaUsuario>(new DisciplinaUsuario());
		
		Usuario profesor1 = daoUsuarios.GetById(34493014);
		Usuario profesor2 = daoUsuarios.GetById(34493018);
		Usuario socio = daoUsuarios.GetById(34493016);
		Usuario socio2 = daoUsuarios.GetById(34493015);
		Disciplina disciplina1 = daoDisciplinas.GetById(1);
		Disciplina disciplina2 = daoDisciplinas.GetById(2);
		Disciplina disciplina3 = daoDisciplinas.GetById(3);
		
		if(profesor1 != null && disciplina1 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(profesor1, disciplina1, false);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al profesor: " + profesor1.getId() + " a la disciplina: " + disciplina1.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al profesor : " + profesor1.getId() + " a la disciplina: " + disciplina1.getDescripcion());
		}
		if(profesor1 != null && disciplina2 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(profesor1, disciplina2, false);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al profesor: " + profesor1.getId() + " a la disciplina: " + disciplina2.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al profesor : " + profesor1.getId() + " a la disciplina: " + disciplina2.getDescripcion());
		}
		if(profesor1 != null && disciplina3 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(profesor1, disciplina3, false);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al profesor: " + profesor1.getId() + " a la disciplina: " + disciplina3.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al profesor : " + profesor1.getId() + " a la disciplina: " + disciplina3.getDescripcion());
		}
		if(profesor2 != null && disciplina1 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(profesor2, disciplina1, false);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al profesor: " + profesor2.getId() + " a la disciplina: " + disciplina1.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al profesor : " + profesor2.getId() + " a la disciplina: " + disciplina1.getDescripcion());
		}
		if(profesor2 != null && disciplina2 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(profesor2, disciplina2, false);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al profesor: " + profesor2.getId() + " a la disciplina: " + disciplina2.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al profesor : " + profesor1.getId() + " a la disciplina: " + disciplina2.getDescripcion());
		}
		if(socio != null && disciplina3 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(socio, disciplina3, true);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al Socio: " + socio.getId() + " a la disciplina: " + disciplina3.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al Socio : " + socio.getId() + " a la disciplina: " + disciplina3.getDescripcion());
		}
		if(socio2 != null && disciplina3 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(socio2, disciplina3, true);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al Socio: " + socio2.getId() + " a la disciplina: " + disciplina3.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al Socio : " + socio2.getId() + " a la disciplina: " + disciplina3.getDescripcion());
		}
		if(socio != null && disciplina2 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(socio, disciplina2, true);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al Socio: " + socio.getId() + " a la disciplina: " + disciplina2.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al Socio : " + socio.getId() + " a la disciplina: " + disciplina2.getDescripcion());
		}
		if(socio2 != null && disciplina2 != null)
		{
			DisciplinaUsuario disciplinaUsuario = new DisciplinaUsuario(socio2, disciplina2, true);
			if(daoDisciplinaUsuario.Insert(disciplinaUsuario))
				System.out.println("Se ha asociado al Socio: " + socio2.getId() + " a la disciplina: " + disciplina2.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar asociar al Socio : " + socio2.getId() + " a la disciplina: " + disciplina2.getDescripcion());
		}
		
	}

	public static void ReadAllDisciplinas()
	{
		GenericDAO<Disciplina> dao = new GenericDAO<Disciplina>(new Disciplina());
		List<Disciplina> disciplinas = dao.GetAll();
		
		if(disciplinas.size() > 0)
        {
			for (Disciplina d : disciplinas) {
        	  System.out.println(d.toString());
			}
        }
		else
		{
			System.out.println("No se ha encontrado ningún registro.");
		}
	}
	
	public static void ReadAllDisciplinasUsuario()
	{
		GenericDAO<DisciplinaUsuario> dao = new GenericDAO<DisciplinaUsuario>(new DisciplinaUsuario());
		List<DisciplinaUsuario> disciplinasUsuario = dao.GetAll();
		
		if(disciplinasUsuario.size() > 0)
        {
			for (DisciplinaUsuario d : disciplinasUsuario) {
        	  System.out.println(d.toString());
			}
        }
		else
		{
			System.out.println("No se ha encontrado ningún registro.");
		}
	}

	public static void DeleteDisciplinas()
	{
		GenericDAO<Disciplina> dao = new GenericDAO<Disciplina>(new Disciplina());
		Disciplina disciplina = dao.GetById(3);
		Disciplina disciplina2 = dao.GetById(2);
		if (disciplina != null)
		{
			if(dao.Delete(disciplina))
				System.out.println("La disciplina: " + disciplina.getId() + " ha sido eliminada con éxito.");
			else
				System.out.println("Ha ocurrido un error al eliminar la disciplina: " + disciplina.getId());
		}
		else
		{
			System.out.println("La disciplina 3 no existe");
		}
		if (disciplina2 != null)
		{
			if(dao.Delete(disciplina2))
				System.out.println("La disciplina: " + disciplina2.getId() + " ha sido eliminada con éxito.");
			else
				System.out.println("Ha ocurrido un error al eliminar la disciplina: " + disciplina2.getId());
		}
		else
		{
			System.out.println("La disciplina 3 no existe");
		}
	}
	
	public static void UpdateDisciplinas()
	{
		GenericDAO<Disciplina> dao = new GenericDAO<Disciplina>(new Disciplina());
		Disciplina disciplina = dao.GetById(1);
		if (disciplina != null)
		{
			disciplina.setCupos(50);
			if(dao.Update(disciplina))
				System.out.println("La disciplina: " + disciplina.getId() + " ha sido modificada con éxito.");
			else
				System.out.println("Ocurrió un error al modificar la disciplina: " + disciplina.getId());
		}
		else
		{
			System.out.println("La disciplina 1 no existe");
		}
	}

	public static void DeleteDisciplinaUsuario()
	{
		GenericDAO<DisciplinaUsuario> dao = new GenericDAO<DisciplinaUsuario>(new DisciplinaUsuario());
		DisciplinaUsuarioId disciplinaUsuarioId = new DisciplinaUsuarioId(34493014, 1);
		
		DisciplinaUsuario disciplinaUsuario = dao.GetById(disciplinaUsuarioId);
		if (disciplinaUsuario != null)
		{
			if(dao.Delete(disciplinaUsuario))
				System.out.println("El Usuario: " + disciplinaUsuario.getId().getDni() + " ha sido desvinculado de la disciplina: " + disciplinaUsuario.getDisciplina().getDescripcion());
			else
				System.out.println("Ha ocurrido un error al desvincular al usuario: " + disciplinaUsuario.getId().getDni() + " de la disciplina: " + disciplinaUsuario.getDisciplina().getDescripcion());
		}
		else
		{
			System.out.println("El usuario 34493014 no está vinculado con la disciplina 1");
		}
	}

	public static void AddPagoUsuario()
	{
		GenericDAO<Usuario> daoUsuarios = new GenericDAO<Usuario>(new Usuario());
		GenericDAO<Disciplina> daoDisciplinas = new GenericDAO<Disciplina>(new Disciplina());
		GenericDAO<PagoUsuario> daoPagoUsuario = new GenericDAO<PagoUsuario>(new PagoUsuario());
		
		Usuario socio = daoUsuarios.GetById(34493016);
		Usuario socio2 = daoUsuarios.GetById(34493015);
		Disciplina disciplina = daoDisciplinas.GetById(3);
		Disciplina disciplina2 = daoDisciplinas.GetById(2);
		
		if(socio != null && disciplina != null)
		{
			PagoUsuario pagoUsuario = new PagoUsuario(socio, disciplina);
			if(daoPagoUsuario.Insert(pagoUsuario))
				System.out.println("Se ha registrado el pago del Socio: " + socio.getId() + " a la disciplina: " + disciplina.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar registrar el pago del Socio : " + socio.getId() + " a la disciplina: " + disciplina.getDescripcion());
		}
		if(socio != null && disciplina2 != null)
		{
			PagoUsuario pagoUsuario = new PagoUsuario(socio, disciplina2);
			if(daoPagoUsuario.Insert(pagoUsuario))
				System.out.println("Se ha registrado el pago del Socio: " + socio.getId() + " a la disciplina: " + disciplina2.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar registrar el pago del Socio : " + socio.getId() + " a la disciplina: " + disciplina2.getDescripcion());
		}
		if(socio2 != null && disciplina != null)
		{
			PagoUsuario pagoUsuario = new PagoUsuario(socio2, disciplina);
			if(daoPagoUsuario.Insert(pagoUsuario))
				System.out.println("Se ha registrado el pago del Socio: " + socio2.getId() + " a la disciplina: " + disciplina.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar registrar el pago del Socio : " + socio2.getId() + " a la disciplina: " + disciplina.getDescripcion());
		}
		if(socio2 != null && disciplina2 != null)
		{
			PagoUsuario pagoUsuario = new PagoUsuario(socio2, disciplina2);
			if(daoPagoUsuario.Insert(pagoUsuario))
				System.out.println("Se ha registrado el pago del Socio: " + socio2.getId() + " a la disciplina: " + disciplina2.getDescripcion() + " con éxito.");
			else
				System.out.println("Ocurrió un error al intentar registrar el pago del Socio : " + socio2.getId() + " a la disciplina: " + disciplina2.getDescripcion());
		}
	}
	
	public static void ReadAllPagosUsuarios()
	{
		GenericDAO<PagoUsuario> dao = new GenericDAO<PagoUsuario>(new PagoUsuario());
		List<PagoUsuario> pagos = dao.GetAll();
		
		if(pagos.size() > 0)
        {
			for (PagoUsuario p : pagos) {
        	  System.out.println(p.toString());	
			}
        }
		else
		{
			System.out.println("No se ha encontrado ningún registro.");
		}
	}
*/
}
