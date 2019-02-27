package cn.wen.oa.dao;

import cn.wen.oa.entity.ClaimVoucherItem;
import cn.wen.oa.entity.ClaimVoucherItemExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author user
 */
@Repository("claimVoucherItemDao")
public interface ClaimVoucherItemMapper {
    int countByExample(ClaimVoucherItemExample example);

    int deleteByExample(ClaimVoucherItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ClaimVoucherItem record);

    int insertSelective(ClaimVoucherItem record);

    List<ClaimVoucherItem> selectByExample(ClaimVoucherItemExample example);

    ClaimVoucherItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ClaimVoucherItem record, @Param("example") ClaimVoucherItemExample example);

    int updateByExample(@Param("record") ClaimVoucherItem record, @Param("example") ClaimVoucherItemExample example);

    int updateByPrimaryKeySelective(ClaimVoucherItem record);

    int updateByPrimaryKey(ClaimVoucherItem record);
}