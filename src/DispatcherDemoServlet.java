import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DispatcherDemoServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//response.setHeader("Context-Type", "text/plain;charset=utf-8");
		response.setHeader("Content-Type", "text/plain;charset=utf-8");
		response.getWriter().write("这是demo1输出的内容");
		
		//跳转到另外一个页面，使用include方法,则两个页面的内容会叠加在一起
		request.getRequestDispatcher("/DispatcherDemo02").include(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
