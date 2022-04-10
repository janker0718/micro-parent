package top.janker.jmall.orm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.LmsLogisticsOrder;
import top.janker.jmall.orm.model.LmsLogisticsOrderExample;

public interface LmsLogisticsOrderMapper {
    long countByExample(LmsLogisticsOrderExample example);

    int deleteByExample(LmsLogisticsOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LmsLogisticsOrder record);

    int insertSelective(LmsLogisticsOrder record);

    List<LmsLogisticsOrder> selectByExample(LmsLogisticsOrderExample example);

    LmsLogisticsOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LmsLogisticsOrder record, @Param("example") LmsLogisticsOrderExample example);

    int updateByExample(@Param("record") LmsLogisticsOrder record, @Param("example") LmsLogisticsOrderExample example);

    int updateByPrimaryKeySelective(LmsLogisticsOrder record);

    int updateByPrimaryKey(LmsLogisticsOrder record);
}