package com.mea.controller;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class OperationFilter
 */
public class OperationFilter implements Filter {

    /**
     * Default constructor. 
     */
    public OperationFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		//---------Since request,response is not http so make it http first
		HttpServletRequest req=(HttpServletRequest) request;
		HttpServletResponse res=(HttpServletResponse) response;
		String uri=req.getRequestURI();
		if(uri.endsWith("loginPage.san")|| uri.endsWith("signUpPage.san")|| uri.endsWith("Signup.san")|| uri.endsWith("login.san")){
			chain.doFilter(request, response);
		}else{
			try {
				String role=(String) req.getSession().getAttribute("role");
				if(role.equals("admin")){
					chain.doFilter(request, response);
				}
			} catch (Exception e) {
				// TODO: handle exception
			request.setAttribute("msg","Please Login First");
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			rd.forward(req,res);
			}
		}
		// pass the request along the filter chain
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
