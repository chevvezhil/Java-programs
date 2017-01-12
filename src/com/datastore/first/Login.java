package com.datastore.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.datastore.DatastoreService;
import com.google.appengine.api.datastore.DatastoreServiceFactory;
import com.google.appengine.api.datastore.Entity;

public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();

		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		out.println(" <br> Name: " + name);
		out.println("<br> password: " + password);
		out.println("<br> Email: " + email);

		DatastoreService datastore = DatastoreServiceFactory.getDatastoreService();

		Entity user = new Entity("Employee", "chevvanthi");
		user.setProperty("firstName", "name");
		user.setProperty("last name", "last name");
		user.setProperty("password", "password");
		user.setProperty("email", "email");
		datastore.put(user);
	
	}

}
