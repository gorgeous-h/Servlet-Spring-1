package com.hello.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;

import com.hello.entity.User;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/testServlet")
public class TestServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletContext servletContext = getServletContext();
		ApplicationContext ctx = (ApplicationContext)servletContext.getAttribute("ApplicationContext");
		User user = ctx.getBean(User.class);
		user.setName(req.getParameter("name"));
		user.hello();
	}

}
