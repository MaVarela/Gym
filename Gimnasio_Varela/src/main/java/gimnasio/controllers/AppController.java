package gimnasio.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import gimnasio.dominio.Disciplina;
import gimnasio.dominio.RolUsuario;
import gimnasio.dominio.Usuario;
import gimnasio.servicio.IServiceDisciplinas;
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
	
	@RequestMapping(value = {"Inicio.html"})
	public ModelAndView IrAInicio(){		
		ModelAndView MV = new ModelAndView();
		MV.setViewName("Inicio");
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
	
	@RequestMapping(value = { "/Borrar-Usuario-{Id}" }, method = RequestMethod.GET)
    public String deleteUser(@PathVariable Integer Id) {
		Usuario usuario = serviceUsuarios.obtenerUnRegistro(Id);
		if(usuario != null)
			serviceUsuarios.eliminar(usuario);
		return "redirect:/ListarUsuarios.html";
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
		MV.setViewName("AltaDisciplina");
		return MV;
	}
	
	@RequestMapping(value = "/AltaDisciplina.html", method = RequestMethod.POST)
	public String SaveDisciplina(Disciplina disciplina){
		
		serviceDisciplinas.insertar(disciplina);
		
		return "redirect:/ListarDisciplinas.html";
	}
	
	@RequestMapping(value = {"Login.html"})
	public ModelAndView IrLogin(){		
		ModelAndView MV = new ModelAndView();
		MV.setViewName("Login");
		return MV;
	}
	
	@RequestMapping("ValidarUsuario.html")
	public ModelAndView validarUsuario(Usuario user)
	{
		ModelAndView MV = new ModelAndView();
		MV.addObject("Usuario", user.getId());
		MV.addObject("Pass", user.getPassword());
		Usuario usuario = serviceUsuarios.obtenerUnRegistro(user.getId());
		if(usuario != null)
		{
			if(usuario.getPassword().equals(user.getPassword()))
			{
				MV.setViewName("Inicio");
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
