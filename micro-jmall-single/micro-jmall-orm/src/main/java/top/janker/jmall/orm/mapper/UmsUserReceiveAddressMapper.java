package top.janker.jmall.orm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.UmsUserReceiveAddress;
import top.janker.jmall.orm.model.UmsUserReceiveAddressExample;

public interface UmsUserReceiveAddressMapper {
    long countByExample(UmsUserReceiveAddressExample example);

    int deleteByExample(UmsUserReceiveAddressExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UmsUserReceiveAddress record);

    int insertSelective(UmsUserReceiveAddress record);

    List<UmsUserReceiveAddress> selectByExample(UmsUserReceiveAddressExample example);

    UmsUserReceiveAddress selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UmsUserReceiveAddress record, @Param("example") UmsUserReceiveAddressExample example);

    int updateByExample(@Param("record") UmsUserReceiveAddress record, @Param("example") UmsUserReceiveAddressExample example);

    int updateByPrimaryKeySelective(UmsUserReceiveAddress record);

    int updateByPrimaryKey(UmsUserReceiveAddress record);
}