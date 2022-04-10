package top.janker.jmall.orm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.OmsRefundOrder;
import top.janker.jmall.orm.model.OmsRefundOrderExample;

public interface OmsRefundOrderMapper {
    long countByExample(OmsRefundOrderExample example);

    int deleteByExample(OmsRefundOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OmsRefundOrder record);

    int insertSelective(OmsRefundOrder record);

    List<OmsRefundOrder> selectByExample(OmsRefundOrderExample example);

    OmsRefundOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OmsRefundOrder record, @Param("example") OmsRefundOrderExample example);

    int updateByExample(@Param("record") OmsRefundOrder record, @Param("example") OmsRefundOrderExample example);

    int updateByPrimaryKeySelective(OmsRefundOrder record);

    int updateByPrimaryKey(OmsRefundOrder record);
}