package cn.wen.oa.entity;
/**
 * @Description: 员工
 * @Param:
 * @return: 
 * @Author: 张文军
 * @Date: 2019/2/10
 */
public class Employee {
    private String sn;

    private String password;

    private String name;

    private String departmentSn;

    private String post;

		/**
		 * 部门
		 */
		private Department department;

		public Department getDepartment() {
				return department;
		}

		public void setDepartment(Department department) {
				this.department = department;
		}

		public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn == null ? null : sn.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDepartmentSn() {
        return departmentSn;
    }

    public void setDepartmentSn(String departmentSn) {
        this.departmentSn = departmentSn == null ? null : departmentSn.trim();
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post == null ? null : post.trim();
    }

		@Override
		public String toString() {
				return "Employee{" +
								"sn='" + sn + '\'' +
								", password='" + password + '\'' +
								", name='" + name + '\'' +
								", departmentSn='" + departmentSn + '\'' +
								", post='" + post + '\'' +
								'}';
		}
}
