package minhaihuang.request.webObj;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebObj02Servlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//从另外一个servlet获取的属性信息
		String userName=(String)request.getAttribute("userName");
		String passWord=(String)request.getAttribute("passWord");
		System.out.println(userName+"-------"+passWord);
	
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
