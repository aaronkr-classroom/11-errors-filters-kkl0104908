package ch12.com.filter;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;





public class Authenfilter implements Filter {
	public class Authenfilter implements Filter {
		@Override
		public void init(FilterConfig filterConfig) throws ServletException{
			System.out.println("Filter 초기화");
			
			
		}
	
		@Override
		public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException,ServletException{
			System.out.println("Filter01.jsp 수행...");
			String name = request.getParameter("name");
			
			if(name == null || name.equals("")) {
				res.setCharacterEncoding("UTF-8");
				res.setContentType("text/html; charset=UTF-8");
				
				PrintWriter writer = res.getWriter();
				String msg = "입력된 name 값은 null 입니다.";
				writer.println(msg);
				return;
			}
			
			filterChain.doFilter(req, res); //없으면 여기까지 수행하고 있음
		}
		
		@Override
		public void destory() {
			System.out.println("Filter01 해제...");
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException{
		System.out.println("Filter 초기화");
		
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException,ServletException{
		System.out.println("Filter01.jsp 수행...");
		String name = request.getParameter("name");
		
		if(name == null || name.equals("")) {
			res.setCharacterEncoding("UTF-8");
			res.setContentType("text/html; charset=UTF-8");
			
			PrintWriter writer = res.getWriter();
			String msg = "입력된 name 값은 null 입니다.";
			writer.println(msg);
			return;
		}
		
		filterChain.doFilter(req, res); //없으면 여기까지 수행하고 있음
	}
	
	@Override
	public void destory() {
		System.out.println("Filter01 해제...");
	}
}
