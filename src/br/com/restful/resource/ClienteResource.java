package br.com.restful.resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;

import com.sun.jersey.api.view.Viewable;

import br.com.restful.controller.ClienteController;
import br.com.restful.model.Cliente;

/**
 * 
 * Classe respons醰el por conter os metodos REST de acesso ao webservice
 *
 * @author Douglas Costa <douglas.cst90@gmail.com>
 * @since 17/02/2013 02:05:23
 * @version 1.0
 */
@Path("/mysfuck")
public class ClienteResource {

	/**
	 * 
	 * M閠odo respons醰el por fazer chamada ao controller
	 *
	 * @return ArrayList<Cliente> 
	 * @author Douglas Costa <douglas.cst90@gmail.com.br>
	 * @since 17/02/2013 02:07:08
	 * @version 1.0
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 * @throws SQLException 
	 */
	@GET
	@Path("/gange")
	@Produces("application/json")
	public ArrayList<Cliente> listarTodos() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException{
		ArrayList<Cliente> pp = new ClienteController().listarTodos();
		return pp;
	}
	////////////////////////////////////////////////下面是jsp/////////////////////////////////////////////////////
//	      
//	    @Context HttpServletRequest request;  
//	    @Context HttpServletResponse response;  
//	      
//	    /** 
//	     * 单条新建 
//	     * @return 
//	     */  
//	    @GET  
//	    @POST
//	    @Path("/newTask")  
//	    public Viewable newTask()throws Exception{  
//	        Long userId=1L;  
//	        String userName="admin";  
//	        request.setAttribute("userId", userId);  
//	        request.setAttribute("userName", userName);  
//	        return new Viewable("newTask.jsp");  
//	    }  
	 
}
