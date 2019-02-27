package cn.wen.oa.biz;

import cn.wen.oa.entity.Employee;

/**
 * @author 张文军
 * @Description:用户管理业务
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/1113:36
 */
public interface GlobalBiz {

		/**
		 * 登录
		 * @param sn 工号
		 * @param password 密码
		 * @return 员工对象
		 */
		Employee login(String sn,String password);

		/**
		 * 修改密码
		 * @param employee 员工对象
		 */
		void changePassword(Employee employee);
}
