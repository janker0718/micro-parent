package top.janker.jmall.orm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.MmsMerchant;
import top.janker.jmall.orm.model.MmsMerchantExample;

public interface MmsMerchantMapper {
    long countByExample(MmsMerchantExample example);

    int deleteByExample(MmsMerchantExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MmsMerchant record);

    int insertSelective(MmsMerchant record);

    List<MmsMerchant> selectByExample(MmsMerchantExample example);

    MmsMerchant selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MmsMerchant record, @Param("example") MmsMerchantExample example);

    int updateByExample(@Param("record") MmsMerchant record, @Param("example") MmsMerchantExample example);

    int updateByPrimaryKeySelective(MmsMerchant record);

    int updateByPrimaryKey(MmsMerchant record);
}