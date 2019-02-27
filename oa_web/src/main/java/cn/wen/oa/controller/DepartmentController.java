package cn.wen.oa.controller;

import cn.wen.oa.biz.DepartmentBiz;
import cn.wen.oa.entity.Department;
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
@RequestMapping("/department")
public class DepartmentController {
		@Autowired
		private DepartmentBiz departmentBiz;

		/**
		 * 展示所有
		 * @param map
		 * @return
		 */
		@RequestMapping("/list")
		public String List(Map<String,Object> map){
				map.put("list", departmentBiz.getAll());

				return "department_list";
		}

		/**
		 * 跳转到添加页面
		 * @param map
		 * @return
		 */
		@RequestMapping("/to_add")
		public String toAdd(Map<String,Object> map){
				map.put("department",new Department());

				return "department_add";
		}


		/**
		 * 添加
		 * @param map
		 * @return
		 */
		@RequestMapping("/add")
		public String add(Department department){
				departmentBiz.add(department);

				return "redirect:list";
		}

		/**
		 * 跳转到修改页面
		 * @param map
		 * @return
		 */
		@RequestMapping(value = "/to_update",params = "sn")
		public String toUpdate(String sn, Map<String,Object> map){
				map.put("department",departmentBiz.get(sn));

				return "department_update";
		}


		/**
		 * 修改
		 * @param map
		 * @return
		 */
		@RequestMapping("/update")
		public String edit(Department department){
				departmentBiz.edit(department);
				return "redirect:list";
		}



		/**
		 * 删除
		 * @param map
		 * @return
		 */
		@RequestMapping(value = "/remove",params = "sn")
		public String remove(String sn){
				departmentBiz.remove(sn);
				return "redirect:list";
		}

}
