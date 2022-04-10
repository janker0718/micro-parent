package top.janker.jmall.orm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.MmsShop;
import top.janker.jmall.orm.model.MmsShopExample;

public interface MmsShopMapper {
    long countByExample(MmsShopExample example);

    int deleteByExample(MmsShopExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MmsShop record);

    int insertSelective(MmsShop record);

    List<MmsShop> selectByExample(MmsShopExample example);

    MmsShop selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MmsShop record, @Param("example") MmsShopExample example);

    int updateByExample(@Param("record") MmsShop record, @Param("example") MmsShopExample example);

    int updateByPrimaryKeySelective(MmsShop record);

    int updateByPrimaryKey(MmsShop record);
}