package sec03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet2
 */
@WebServlet("/login2")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	//클라이언트에 <form>태그를 통해 데이터 전달 받아서 콘솔창에 출력
	//request: 클라이언트 --> 서버
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트 요청처리
		//클라이언트-> 서버로 전송되는 데이터 인코딩
		request.setCharacterEncoding("utf-8");
		// <form>태그 안에 입력된 데이터 받아오기
		String id = request.getParameter("user_id");
		String pw = request.getParameter("user_pw");
		
		System.out.println("아이디: " + id );
		System.out.println("비밀번호: " + pw );
		
		//응답 처리
		// 서버-> 클라이언트로 setContentType
		response.setContentType("text/html;charset=utf-8");
		
		//서버에서 클라이언트 데이터 전송에 자바 I/O 스트림을 이용
		PrintWriter out = response.getWriter(); //ctrl + shift + o
		//HTML 문서 형식으로 데이터 전송
		out.println("<html><head></head><body>");
		out.println("아이디: "+ id + "<br>");
		out.println("비밀번호: "+ pw + "<br>");
		out.println("</body></html>");
	}

}