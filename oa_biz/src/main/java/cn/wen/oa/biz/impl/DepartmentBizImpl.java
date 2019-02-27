package cn.wen.oa.biz.impl;

import cn.wen.oa.biz.DepartmentBiz;
import cn.wen.oa.dao.DepartmentMapper;
import cn.wen.oa.dao.EmployeeMapper;
import cn.wen.oa.entity.Department;
import cn.wen.oa.entity.DepartmentExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 张文军
 * @Description:
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/922:58
 */
@Service("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {
		@Autowired
		private DepartmentMapper departmentDao;

		@Autowired
		private EmployeeMapper employeeDao;

		@Override
		public void add(Department department) {
				departmentDao.insert(department);
		}

		@Override
		public void edit(Department department) {
				departmentDao.updateByPrimaryKey(department);
		}

		@Override
		public void remove(String sn) {
				departmentDao.deleteByPrimaryKey(sn);
		}

		@Override
		public Department get(String sn) {

				return departmentDao.selectByPrimaryKey(sn);

		}

		@Override
		public List<Department> getAll() {
				DepartmentExample departmentExample = new DepartmentExample();
				departmentExample.createCriteria();
				return departmentDao.selectByExample(departmentExample);
		}
}
