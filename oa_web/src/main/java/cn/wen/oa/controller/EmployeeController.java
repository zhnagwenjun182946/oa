package cn.wen.oa.controller;

import cn.wen.oa.biz.DepartmentBiz;
import cn.wen.oa.biz.EmployeeBiz;
import cn.wen.oa.entity.Employee;
import cn.wen.oa.global.Contant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * @author 张文军
 * @Description:部门控制器
 * @Company:南京农业大学工学院
 * @version:1.0
 * @date 2019/2/1011:39
 */
@Controller
@RequestMapping("/employee")
public class EmployeeController {
		@Autowired
		private EmployeeBiz employeeBiz;

		@Autowired
		private DepartmentBiz departmentBiz;

		/**
		 * 展示所有
		 * @param map
		 * @return
		 */
		@RequestMapping("/list")
		public String List(Map<String,Object> map){
				map.put("list", employeeBiz.getAll());

				return "employee_list";
		}

		/**
		 * 跳转到添加页面
		 * @param map
		 * @return
		 */
		@RequestMapping("/to_add")
		public String toAdd(Map<String,Object> map){
				map.put("employee",new Employee());
				map.put("dlist", departmentBiz.getAll());
				map.put("plist", Contant.getPost());
				return "employee_add";
		}

		/**
		 * 添加
		 * @param employee
		 * @return
		 */
		@RequestMapping("/add")
		public String add(Employee employee){
				employeeBiz.add(employee);
				return "redirect:list";
		}

		/**
		 * 跳转到修改页面
		 * @param map
		 * @return
		 */
		@RequestMapping(value = "/to_update",params = "sn")
		public String toUpdate(String sn, Map<String,Object> map){
				map.put("employee",employeeBiz.get(sn));
				map.put("dlist", departmentBiz.getAll());
				map.put("plist", Contant.getPost());

				return "employee_update";
		}

		/**
		 * 修改
		 * @param employee
		 * @return
		 */
		@RequestMapping("/update")
		public String edit(Employee employee){
				employeeBiz.edit(employee);
				return "redirect:list";
		}

		/**
		 * 删除
		 * @param sn
		 * @return
		 */
		@RequestMapping(value = "/remove",params = "sn")
		public String remove(String sn){
				employeeBiz.remove(sn);
				return "redirect:list";
		}

}
