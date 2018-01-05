package gimnasio.controllers;

import java.util.ArrayList;
import javax.servlet.ServletConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import gimnasio.dominio.Disciplina;
import gimnasio.dominio.DisciplinaUsuario;
import gimnasio.dominio.DisciplinaUsuarioId;
import gimnasio.dominio.PagoUsuario;
import gimnasio.dominio.RolUsuario;
import gimnasio.dominio.Rutina;
import gimnasio.dominio.Usuario;
import gimnasio.servicio.IServiceDisciplinaUsuario;
import gimnasio.servicio.IServiceDisciplinas;
import gimnasio.servicio.IServicePagoUsuario;
import gimnasio.servicio.IServiceRoles;
import gimnasio.servicio.IServiceUsuarios;

@Controller
public class AppController {
	
	@Autowired
    IServiceUsuarios serviceUsuarios;
	
	@Autowired
    IServiceRoles serviceRoles;
	
	@Autowired
	IServiceDisciplinas serviceDisciplinas;
	
	@Autowired
	IServiceDisciplinaUsuario serviceDisciplinaUsuario;
	
	@Autowired
	IServicePagoUsuario servicePagoUsuario;
	
	
	private Usuario usuarioLog;
	
	public void init(ServletConfig config) {
		ApplicationContext ctx = WebApplicationContextUtils
				.getRequiredWebApplicationContext(config.getServletContext());
		
		this.usuarioLog = (Usuario) ctx.getBean("usuarioLogueadoBean");
	}
	
	
	@RequestMapping(value = {"Inicio.html"})
	public ModelAndView IrAInicio(){
		
		ModelAndView MV = new ModelAndView();
		if(usuarioLog.getRol().getId() == 1)
			MV.setViewName("InicioAdmin");
		else
			MV.setViewName("InicioProfesor");
		return MV;
	}
	
	@RequestMapping(value = "/RegistrarPagos.html")
	public ModelAndView RegistrarPagos(){
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = serviceUsuarios.obtenerSocios();
		ModelAndView MV = new ModelAndView();
		MV.addObject("listaUsuarios", usuarios);
		MV.setViewName("ListarSocios");
		return MV;
	}
	
	//Listar-Inscripciones
	@RequestMapping(value = { "/Listar-Inscripciones-{Id}" }, method = RequestMethod.GET)
    public ModelAndView listarInscripciones(@PathVariable Integer Id) {
		Usuario usuario = serviceUsuarios.obtenerUnRegistro(Id);
		
		ModelAndView MV = new ModelAndView();
		MV.addObject("listaClases", usuario.getDisciplinas());
		MV.addObject("dniSocio", Id);
		MV.setViewName("RegistrarPagos");
		return MV;
    }
	
	@RequestMapping(value = "/Registrar-Pago-{IdClase}-{IdUsuario}")
	public ModelAndView registrarPago(@PathVariable Integer IdClase, @PathVariable Integer IdUsuario){
		
		ModelAndView MV = new ModelAndView();
		MV.addObject("dniSocio", IdUsuario);
		MV.setViewName("RegistrarPagos");
		
		String mensaje;
		String claseMensaje;
		
		try
		{
			Usuario usuario = serviceUsuarios.obtenerUnRegistro(IdUsuario);
			Disciplina clase = serviceDisciplinas.obtenerUnRegistro(IdClase);
			PagoUsuario pago = new PagoUsuario(usuario, clase);
			clase.addPagoUsuario(pago);
			
			for(DisciplinaUsuario d : clase.getDisciplinas())
			{
				if(d.getDisciplina().getId() == clase.getId() && d.getUsuario().getId() == usuario.getId())
				{
					if(d.estaReservado() != null && d.estaReservado()){
						d.setReservado(false);
						d.setInscripto(true);
					}
				}
			}
			
			serviceDisciplinas.actualizar(clase);
			MV.addObject("listaClases", usuario.getDisciplinas());
			
			claseMensaje = "mensajeInfo";
			mensaje = "El pago ha sido realizado con éxito";
		}
		catch(Exception e)
		{
			claseMensaje = "mensajeError";
			mensaje = "Ha ocurrido un error inesperado";
			System.out.println(e.getMessage());
		}
		MV.addObject("Info", "cntInfo");
		MV.addObject("styleMsg", claseMensaje);
		MV.addObject("mensaje", mensaje);
		
		return MV;
	}
	
	@RequestMapping(value = "/ListarUsuarios.html")
	public ModelAndView ListarUsuarios(){
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = serviceUsuarios.obtenerTodos();
		ModelAndView MV = new ModelAndView();
		MV.addObject("listaUsuarios", usuarios);
		MV.setViewName("ListarUsuarios");
		return MV;
	}
	
	@RequestMapping(value = "/ListarPagos.html")
	public ModelAndView ListarPagos(){
		
		ArrayList<PagoUsuario> pagos = new ArrayList<PagoUsuario>();
		pagos = servicePagoUsuario.obtenerPagosPorFechaDesc();
		ModelAndView MV = new ModelAndView();
		MV.addObject("listaPagos", pagos);
		MV.setViewName("ListarPagos");
		return MV;
	}
	
	@RequestMapping(value = { "/Borrar-Usuario-{Id}" }, method = RequestMethod.GET)
    public String deleteUser(@PathVariable Integer Id) {
		Usuario usuario = serviceUsuarios.obtenerUnRegistro(Id);
		if(usuario != null)
			serviceUsuarios.eliminar(usuario);
		return "redirect:/ListarUsuarios.html";
    }
	
	//AnotarEn-Disciplina
	@RequestMapping(value = { "/AnotarEn-Disciplina-{Id}" }, method = RequestMethod.GET)
    public ModelAndView anotarEnDisciplina(@PathVariable Integer Id) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = serviceUsuarios.obtenerSociosNoInscriptos(Id);
		Disciplina disciplina = serviceDisciplinas.obtenerUnRegistro(Id);
		ModelAndView MV = new ModelAndView();
		MV.addObject("listaUsuarios", usuarios);
		MV.addObject("idClase", Id);
		MV.addObject("clase", disciplina.getDescripcion());
		MV.setViewName("ListarSociosNoInscriptos");
		return MV;
    }
	
	@RequestMapping(value = "/Anotar-Usuario-{IdUsuario}-{IdClase}")
	public String inscribirSocio(@PathVariable Integer IdUsuario, @PathVariable Integer IdClase){
		Usuario usuario = serviceUsuarios.obtenerUnRegistro(IdUsuario);
		Disciplina clase = serviceDisciplinas.obtenerUnRegistro(IdClase);
		
		DisciplinaUsuario inscripcion = new DisciplinaUsuario(usuario, clase, true);
		
		clase.addDisciplinaUsuario(inscripcion);
		
		try
		{
			serviceDisciplinas.actualizar(clase);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		
		return "redirect:/ListarDisciplinas.html";
	}
	
	//Liberar Cupos
	@RequestMapping(value = { "/Liberar-Cupos-{Id}" }, method = RequestMethod.GET)
    public ModelAndView liberarCupos(@PathVariable Integer Id) {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = serviceUsuarios.obtenerSociosInscriptos(Id);
		Disciplina disciplina = serviceDisciplinas.obtenerUnRegistro(Id);
		ModelAndView MV = new ModelAndView();
		MV.addObject("listaUsuarios", usuarios);
		MV.addObject("idClase", Id);
		MV.addObject("clase", disciplina.getDescripcion());
		MV.setViewName("ListarSociosInscriptos");
		return MV;
    }
		
	@RequestMapping(value = "/Liberar-Cupo-{IdUsuario}-{IdClase}")
	public String liberarCupo(@PathVariable Integer IdUsuario, @PathVariable Integer IdClase){
		Disciplina clase = serviceDisciplinas.obtenerUnRegistro(IdClase);
		DisciplinaUsuarioId id = new DisciplinaUsuarioId(IdUsuario, IdClase); 	
		DisciplinaUsuario inscripcion = serviceDisciplinaUsuario.obtenerUnRegistro(id);
		clase.removeDisciplinaUsuario(inscripcion);
		
		try
		{
			serviceDisciplinas.actualizar(clase);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		return "redirect:/ListarDisciplinas.html";
	}
	
	@RequestMapping(value = "/AltaUsuario.html", method = RequestMethod.GET)
	public ModelAndView AltaUsuario(){
		ArrayList<RolUsuario> roles = new ArrayList<RolUsuario>();
		roles = serviceRoles.obtenerTodos();
		ModelAndView MV = new ModelAndView();
		MV.addObject("listaRoles", roles);
		MV.setViewName("AltaUsuario");
		return MV;
	}
	
	@RequestMapping(value = "/AltaUsuario.html", method = RequestMethod.POST)
	public String SaveUsuario(Usuario usuario, int idRol){
		RolUsuario rol = serviceRoles.obtenerUnRegistro(idRol);
		
		usuario.setRol(rol);
		serviceUsuarios.insertar(usuario);
		
		return "redirect:/ListarUsuarios.html";
	}
	
	@RequestMapping(value = { "/Editar-Usuario-{Id}" }, method = RequestMethod.GET)
    public ModelAndView EditarUsuario(@PathVariable Integer Id) {
		Usuario usuario = serviceUsuarios.obtenerUnRegistro(Id);
		ArrayList<RolUsuario> roles = new ArrayList<RolUsuario>();
		roles = serviceRoles.obtenerTodos();
		ModelAndView MV = new ModelAndView();
		MV.addObject("usuario", usuario);
		MV.addObject("idRol", usuario.getRol().getId());
		MV.addObject("listaRoles", roles);
		MV.setViewName("EditarUsuario");
		return MV;
    }
	
	@RequestMapping(value = "/EditarUsuario.html", method = RequestMethod.POST)
	public String UpdateUsuario(Usuario usuario, int idRol){
		RolUsuario rol = serviceRoles.obtenerUnRegistro(idRol);
		usuario.setRol(rol);
		serviceUsuarios.actualizar(usuario);
		
		return "redirect:/ListarUsuarios.html";
	}
	
	@RequestMapping(value = "/ListarDisciplinas.html")
	public ModelAndView ListarDisciplinas(){
		ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
		disciplinas = serviceDisciplinas.obtenerTodos();
		ModelAndView MV = new ModelAndView();
		MV.addObject("listaDisciplinas", disciplinas);
		MV.setViewName("ListarDisciplinas");
		return MV;
	}
	
	@RequestMapping(value = "/AltaDisciplina.html", method = RequestMethod.GET)
	public ModelAndView AltaDisciplina(){
		ModelAndView MV = new ModelAndView();
		MV.addObject("command", new Disciplina());
		MV.setViewName("AltaDisciplina");
		return MV;
	}
	
	@RequestMapping(value = "/AltaDisciplina.html", method = RequestMethod.POST)
	public String SaveDisciplina(Disciplina disciplina){
		
		serviceDisciplinas.insertar(disciplina);
		
		return "redirect:/ListarDisciplinas.html";
	}
	
	@RequestMapping(value = "/AltaRutinas.html", method = RequestMethod.GET)
	public ModelAndView AltaRutinas(){
		ModelAndView MV = new ModelAndView();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = serviceUsuarios.obtenerSociosInscriptos(6);
		MV.addObject("listaUsuarios", usuarios);
		MV.setViewName("ListarSociosMusculacion");
		return MV;
	}
	
	@RequestMapping(value = "/AltaRutina.html", method = RequestMethod.POST)
	public ModelAndView SaveRutinas(Integer dniSocio)
	{
		/*@SuppressWarnings("unused")
		int numero = dniSocio;*/
		
		ModelAndView MV = new ModelAndView();
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios = serviceUsuarios.obtenerSociosInscriptos(6);
		MV.addObject("listaUsuarios", usuarios);
		MV.setViewName("ListarSociosMusculacion");
		return MV;
	}
	
	@RequestMapping(value = { "/Alta-Rutina-{Id}" }, method = RequestMethod.GET)
    public ModelAndView AltaRutina(@PathVariable Integer Id) {
		Usuario usuario = serviceUsuarios.obtenerUnRegistro(Id);

		ModelAndView MV = new ModelAndView();
		MV.addObject("dniSocio", usuario.getId());
		MV.addObject("command", new Rutina());
		MV.setViewName("AltaRutina");
		return MV;
    }
	
	@RequestMapping(value = { "/Editar-Disciplina-{Id}" }, method = RequestMethod.GET)
    public ModelAndView EditarDisciplina(@PathVariable Integer Id) {
		Disciplina disciplina = serviceDisciplinas.obtenerUnRegistro(Id);
		ModelAndView MV = new ModelAndView();
		MV.addObject("disciplina", disciplina);
		
		MV.setViewName("EditarDisciplina");
		return MV;
    }
	
	@RequestMapping(value = "/EditarDisciplina.html", method = RequestMethod.POST)
	public String UpdateDisciplina(Disciplina disciplina){
		
		serviceDisciplinas.actualizar(disciplina);
		
		return "redirect:/ListarDisciplinas.html";
	}
	
	@RequestMapping(value = { "/Borrar-Disciplina-{Id}" }, method = RequestMethod.GET)
    public String deleteDisciplina(@PathVariable Integer Id) {
		Disciplina disciplina = serviceDisciplinas.obtenerUnRegistro(Id);
		if(disciplina != null)
			serviceDisciplinas.eliminar(disciplina);
		return "redirect:/ListarDisciplinas.html";
    }
	
	@RequestMapping(value = {"Login.html"})
	public ModelAndView IrLogin(){
		this.usuarioLog = new Usuario();
		ModelAndView MV = new ModelAndView();
		MV.setViewName("Login");
		return MV;
	}
	
	@RequestMapping(value = {"ValidarUsuario.html"}, method = RequestMethod.POST)
	public ModelAndView validarUsuario(Usuario user)
	{
		ModelAndView MV = new ModelAndView();
		MV.addObject("id", user.getId());
		MV.addObject("password", user.getPassword());
		Usuario usuario = serviceUsuarios.obtenerUnRegistro(user.getId());
		if(usuario != null)
		{
			if(usuario.getPassword().equals(user.getPassword()))
			{
				this.usuarioLog = usuario;
				if(usuario.getRol().getId() == 1)
					MV.setViewName("InicioAdmin");
				else
					MV.setViewName("InicioProfesor");
			}
			else
			{
				MV.addObject("ErrorPass", "Contraseña Incorrecta");
				MV.addObject("command", new Usuario());
				MV.setViewName("Login");
			}
		}
		else
		{
			MV.addObject("ErrorUsuario", "Usuario Incorrecto");
			MV.addObject("command", new Usuario());
			MV.setViewName("Login");
		}
		
		return MV;
	}
}
