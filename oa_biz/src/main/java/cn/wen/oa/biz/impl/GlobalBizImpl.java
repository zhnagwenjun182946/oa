package cn.wen.oa.biz.impl;

import cn.wen.oa.biz.GlobalBiz;
import cn.wen.oa.dao.EmployeeMapper;
import cn.wen.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/1113:39
 */
@Service("globalBiz")
public class GlobalBizImpl implements GlobalBiz {
		@Autowired
		private EmployeeMapper employeeMapper;

		@Override
		public Employee login(String sn, String password) {
				Employee employee = employeeMapper.select1(sn);
				if (employee != null && employee.getPassword().equals(password)){
						return employee;
				}
				return null;
		}

		@Override
		public void changePassword(Employee employee) {
				employeeMapper.updateByPrimaryKeySelective(employee);
		}
}
