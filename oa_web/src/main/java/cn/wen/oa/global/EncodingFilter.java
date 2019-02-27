package cn.wen.oa.global;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 张文军
 * @Description:字符编码过滤器
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/912:33
 */
public class EncodingFilter implements Filter {
		private String encoding = "utf-8";


		@Override
		public void init(FilterConfig filterConfig) throws ServletException {
				if (filterConfig.getInitParameter("encoding") !=null){
						encoding = filterConfig.getInitParameter("encoding");
				}
		}

		@Override
		public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
				HttpServletRequest request = (HttpServletRequest) servletRequest;
				HttpServletResponse response = (HttpServletResponse)servletResponse;
				request.setCharacterEncoding(encoding);
				response.setCharacterEncoding(encoding);
				filterChain.doFilter(request,response);
		}

		@Override
		public void destroy() {

		}
}
