package time;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//Servlet: web에서 수행되는 또다른 자바
//Servlet(MVC Model1): Client에 요청을 받아(http://localhost/time) 서버에서 처리한 후 
//					   Client에 html문서 형식으로 Browser에 전달
//Servlet(MVC Model2): Client 요청을 받아서 서버에서 처리한 후 Jsp에 전달해서 Browser 실행
@WebServlet("/time")
public class Time_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("서버의 시간을 콘솔 출력 - "+hour+":"+minute+":"+second);
		PrintWriter pw = response.getWriter();
		pw.println("<html><body><br><br>");
		pw.println("web 출력 - "+hour+":"+minute+":"+second+"<br>");
		pw.println("</body></html>");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
