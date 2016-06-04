package minhaihuang.request.webObj;
/**
 * 测试web域对象中的HttpServletRequest
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebObjServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//设置两个属性，看看能不能被其他的servlet访问.
		//结论：若没有转移请求信息，则不会被其他的servlet访问
		//若有servletContext,则不用转移也会被访问
		request.setAttribute("userName", "hhm");
		request.setAttribute("passWord", "123");
		
		//转移请求信息，访问成功
		request.getRequestDispatcher("/WebObj02").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
