package top.janker.jmall.orm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.OmsRefundOrderItem;
import top.janker.jmall.orm.model.OmsRefundOrderItemExample;

public interface OmsRefundOrderItemMapper {
    long countByExample(OmsRefundOrderItemExample example);

    int deleteByExample(OmsRefundOrderItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OmsRefundOrderItem record);

    int insertSelective(OmsRefundOrderItem record);

    List<OmsRefundOrderItem> selectByExample(OmsRefundOrderItemExample example);

    OmsRefundOrderItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OmsRefundOrderItem record, @Param("example") OmsRefundOrderItemExample example);

    int updateByExample(@Param("record") OmsRefundOrderItem record, @Param("example") OmsRefundOrderItemExample example);

    int updateByPrimaryKeySelective(OmsRefundOrderItem record);

    int updateByPrimaryKey(OmsRefundOrderItem record);
}