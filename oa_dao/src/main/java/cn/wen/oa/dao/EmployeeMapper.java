package cn.wen.oa.dao;

import cn.wen.oa.entity.Employee;
import cn.wen.oa.entity.EmployeeExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * @author user
 */
@Repository("employeeDao")
public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(String sn);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);

		/**
		 * 查询所有
		 * @return
		 */
		List<Employee> selectAll1();

    Employee selectByPrimaryKey(String sn);

		/**
		 * 查询一个
		 * @param sn
		 * @return
		 */
    Employee select1(String sn);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}