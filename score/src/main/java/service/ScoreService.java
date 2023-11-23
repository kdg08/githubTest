package service;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ScoreService {
	HttpServletRequest request;
	HttpServletResponse response;
	public ScoreService(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
	}

	public String execute() {
		// 파라미터 수집
		String name = request.getParameter("name");
		int year = Integer.parseInt(request.getParameter("birth").substring(0, 4));
		int java = Integer.parseInt(request.getParameter("java"));
		int mysql = Integer.parseInt(request.getParameter("mysql"));
		int web = Integer.parseInt(request.getParameter("web"));
		
		// 성적 계산 ( 성적 처리가 너무 복잡하면 메소드나 클래스 정의 )
		ScoreOper score = new ScoreOper();
		int age = score.getAge(year);
		int total = score.getTotal(java, mysql, web);
		double avg = score.getAvg(total, 3);
		String grade = score.getGrade((int)avg);
		
		// request 영역 저장
		request.setAttribute("name", name);
		request.setAttribute("age", age);
		request.setAttribute("java", java);
		request.setAttribute("mysql", mysql);
		request.setAttribute("web", web);
//		request.setAttribute("total", total);
//		request.setAttribute("avg", avg);
//		request.setAttribute("grade", grade);
		String result = makeHtmlResult(total, avg, grade);
		request.setAttribute("result", result);
		// 포워딩 할 jsp or url 리턴
		String path = null;
		path = "./score/result.jsp";
		return path;
	}

	private String makeHtmlResult(int total, double avg, String grade) {
		StringBuilder sb = new StringBuilder();
		sb.append("<h2> total: "+total+"</h2>");
		sb.append("<h2> avg: "+avg+"</h2>");
		sb.append("<h2> grade: "+grade+"</h2>");
		return sb.toString();
	}

}






















