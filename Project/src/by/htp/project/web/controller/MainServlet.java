package by.htp.project.web.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import by.htp.project.entity.User;
import by.htp.project.entity.UserRole;

public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		HttpSession session = request.getSession();
		session.setAttribute("locale", "en");
		
		String action = request.getParameter("action");
		if(action != null) {
			switch(action) {
			case "login":
				String login = request.getParameter("login");
				String password = request.getParameter("pass");
				
				if(login.equals("user") && password.equals("password")) {
					List<String> list = new ArrayList<String>();
					list.add("one");
					list.add("two");
					list.add("three");
					list.add("four");
					
					HashSet<User> userSet = new HashSet<>();
					userSet.add(new User(1, "User1", UserRole.USER));
					userSet.add(new User(2, "User2", UserRole.GUEST));
					userSet.add(new User(3, "User3", UserRole.ADMIN));
				
					request.setAttribute("userSetParam", userSet);
					request.setAttribute("numbersU", list);
					
					request.getRequestDispatcher("/jsp/user.jsp").forward(request, response);
					
				}else if(login.equals("admin") && password.equals("password")) {
					List<String> list = new ArrayList<String>();
					list.add("1");
					list.add("2");
					list.add("3");
					list.add("66666666");
				
					request.setAttribute("numbersA", list);
					
					request.getRequestDispatcher("/jsp/admin.jsp").forward(request, response);
				}else if(login.equals("1") && password.equals("1")) {
					ResourceBundle rb = ResourceBundle.getBundle("config");
					String msg = rb.getString("sample.string.servlet");
					String count = rb.getString("sample.string.servlet.number");
					if(count != null) {
						int max = Integer.parseInt(count);
						for(int i = 0; i<max; i++) {
							System.out.println(msg + i);
						}
					}
				}else 
					request.getRequestDispatcher("/jsp/error.jsp").forward(request, response);
				
				break;
			}
			
		}
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
