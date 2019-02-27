package cn.wen.oa.biz.impl;

import cn.wen.oa.biz.EmployeeBiz;
import cn.wen.oa.dao.EmployeeMapper;
import cn.wen.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/1111:45
 */
@Service("EmployeeBiz")
public class EmployeeBizImpl implements EmployeeBiz {
		@Autowired
		private EmployeeMapper employeeDao;
		@Override
		public void add(Employee employee) {
				/**添加默认密码*/
				employee.setPassword("000000");
				employeeDao.insert(employee);
		}

		@Override
		public void edit(Employee employee) {
				employeeDao.updateByPrimaryKeySelective(employee);
		}

		@Override
		public void remove(String sn) {
				employeeDao.deleteByPrimaryKey(sn);
		}

		@Override
		public Employee get(String sn) {
				return employeeDao.select1(sn);
		}

		@Override
		public List<Employee> getAll() {

				List<Employee> list = employeeDao.selectAll1();

				return list;
		}
}
