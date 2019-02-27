package cn.wen.oa.dao;

import cn.wen.oa.entity.DealRecord;
import cn.wen.oa.entity.DealRecordExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author user
 */
@Repository("dealRecordMapper")
public interface DealRecordMapper {
    int countByExample(DealRecordExample example);

    int deleteByExample(DealRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DealRecord record);

    int insertSelective(DealRecord record);

    List<DealRecord> selectByExample(DealRecordExample example);

    DealRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DealRecord record, @Param("example") DealRecordExample example);

    int updateByExample(@Param("record") DealRecord record, @Param("example") DealRecordExample example);

    int updateByPrimaryKeySelective(DealRecord record);

    int updateByPrimaryKey(DealRecord record);
}