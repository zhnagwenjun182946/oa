package cn.wen.oa.biz;

import cn.wen.oa.entity.Employee;

import java.util.List;

/**
 * @Description: 部门业务处
 * @Param:
 * @return:
 * @Author: 张文军
 * @Date: 2019/2/9
 */
public interface EmployeeBiz {
		/**
		 * 添加
		 * @param employee
		 */
    void add(Employee employee);

		/**
		 * 编辑
		 * @param employee
		 */
		void edit(Employee employee);

		/**
		 *
		 * @param sn
		 */
    void remove(String sn);

		/**
		 * 查询一个
		 * @param sn
		 * @return
		 */
		Employee get(String sn);

		/**
		 * 查询所有
		 * @return
		 */
		List<Employee> getAll();
}
