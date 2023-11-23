package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.ScoreService;

import java.io.IOException;
@WebServlet({"/score"})
public class ScoreController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getServletPath();
		System.out.println("cmd="+cmd);
		// 성적처리 서비스 클래스
		ScoreService scSer = new ScoreService(request, response);
//		scSer.execute(request, response);
		String path = scSer.execute();
		// 포워딩
//		response.sendRedirect(path);
		request.getRequestDispatcher(path).forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
