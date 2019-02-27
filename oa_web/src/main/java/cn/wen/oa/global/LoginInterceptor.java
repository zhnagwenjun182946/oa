package cn.wen.oa.global;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author 张文军
 * @Description: 判断用户是否登录拦截器
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/1114:09
 */
public class LoginInterceptor implements HandlerInterceptor {
		@Override
		public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
				/**
				 * 过滤请求路径是否包含login，如果包含，放行，不包含就不放行
				 */
				String url = httpServletRequest.getRequestURI();
				if(url.toLowerCase().indexOf("login")>=0){
						return true;
				}

				/**
				 * 判断是否已经登录
				 */
				HttpSession session = httpServletRequest.getSession();
				if(session.getAttribute("employee")!=null){
						return true;
				}
				/**
				 * 打回到登录界面
				 */
				httpServletResponse.sendRedirect("/to_login");
				return false;
		}

		@Override
		public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

		}

		@Override
		public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

		}
}
