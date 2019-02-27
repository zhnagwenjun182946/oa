package cn.wen.oa.dao;

import cn.wen.oa.entity.ClaimVoucher;
import cn.wen.oa.entity.ClaimVoucherExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author user
 */
@Repository("claimVoucherMapper")
public interface ClaimVoucherMapper {
    int countByExample(ClaimVoucherExample example);

    int deleteByExample(ClaimVoucherExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClaimVoucher record);

    int insertSelective(ClaimVoucher record);

    List<ClaimVoucher> selectByExample(ClaimVoucherExample example);

    ClaimVoucher selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClaimVoucher record, @Param("example") ClaimVoucherExample example);

    int updateByExample(@Param("record") ClaimVoucher record, @Param("example") ClaimVoucherExample example);

    int updateByPrimaryKeySelective(ClaimVoucher record);

    int updateByPrimaryKey(ClaimVoucher record);
}