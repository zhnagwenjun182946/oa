package cn.wen.oa.controller;

import cn.wen.oa.biz.GlobalBiz;
import cn.wen.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author 张文军
 * @Description:用户操作控制器
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/1113:46
 */
@Controller("globalController")
public class GlobalController {

		@Autowired
		private GlobalBiz globalBiz;

		/**
		 * 跳转到登录页面
		 * @return
		 */
		@RequestMapping("/to_login")
		public String toLogin(){
				return "login";
		}

		/**
		 * 登录
		 * @param sn 员工编号
		 * @param password 密码
		 * @return
		 */
		@RequestMapping("/login")
		public String login(HttpSession session, @RequestParam String sn, @RequestParam String password){
				Employee employee = globalBiz.login(sn,password);
				if (employee == null) {
						return "redirect:to_login";
				}
				session.setAttribute("employee",employee);
				return "redirect:self";
		}

		/**
		 * 跳转到个人信息界面
		 * @return
		 */
		@RequestMapping("/self")
		public String self(){
				return "self";
		}

		/**
		 * 退出，将session中的employee设置为空，之后跳转到登录页面
		 * @param session
		 * @return
		 */
		@RequestMapping("/quit")
		public String quit(HttpSession session){
				session.setAttribute("employee",null);
				return "redirect:to_login";
		}

		/**
		 * 跳转到修改密码界面
		 * @return
		 */
		@RequestMapping("/to_change_password")
		public String toChangePassword(){
				return "change_password";
		}

		/**
		 * 修改密码
		 * @param session
		 * @param old 旧密码
		 * @param new1 第一次输入的新密码
		 * @param new2 第二次输入的新密码
		 * @return
		 */
		@RequestMapping("/change_password")
		public String changePassword(HttpSession session, @RequestParam String old, @RequestParam String new1, @RequestParam String new2){
				Employee employee = (Employee) session.getAttribute("employee");
				//判断是否输入的旧密码正确
				if (employee.getPassword().equals(old)) {
						//判断两次输入的新密码是否相同
						if (new1.equals(new2)){
								employee.setPassword(new1);
								globalBiz.changePassword(employee);

								return "redirect:self";
						}
				}
				return "redirect:to_change_password";
		}



}
