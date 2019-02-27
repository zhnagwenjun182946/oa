package cn.wen.oa.biz;

import cn.wen.oa.entity.Department;

import java.util.List;
/**
 * @Description: 部门业务处
 * @Param:
 * @return:
 * @Author: 张文军
 * @Date: 2019/2/9
 */
public interface DepartmentBiz {
		/**
		 * 添加
		 * @param department
		 */
    void add(Department department);

		/**
		 * 编辑
		 * @param department
		 */
		void edit(Department department);

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
    Department get(String sn);

		/**
		 * 查询所有
		 * @return
		 */
		List<Department> getAll();
}
