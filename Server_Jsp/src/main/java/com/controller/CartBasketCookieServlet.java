package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ch09_cookie/study09/CartBasketCookie")
public class CartBasketCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.print("<html><body>장바구니 리스트"+"<br>");
		
		Cookie[] cookies = request.getCookies();
		
		if(cookies != null) {
			for(Cookie c : cookies)
				out.print(c.getName()+" : "+c.getValue()+"<br>");
		}else {
			out.print("장바구니가 비어있습니다.<br><br>");
		}
		
		out.print("<a href= 'cookie.html'>상품 선택 페이지</a><br>");
		out.print("<a href= 'CartDeleteCookie'>장바구니 비우기</a><br>");
		out.print("</body></html>");
		
	}

}
