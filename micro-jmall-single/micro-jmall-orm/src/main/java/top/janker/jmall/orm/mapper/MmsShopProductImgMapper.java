package top.janker.jmall.orm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.MmsShopProductImg;
import top.janker.jmall.orm.model.MmsShopProductImgExample;

public interface MmsShopProductImgMapper {
    long countByExample(MmsShopProductImgExample example);

    int deleteByExample(MmsShopProductImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MmsShopProductImg record);

    int insertSelective(MmsShopProductImg record);

    List<MmsShopProductImg> selectByExample(MmsShopProductImgExample example);

    MmsShopProductImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MmsShopProductImg record, @Param("example") MmsShopProductImgExample example);

    int updateByExample(@Param("record") MmsShopProductImg record, @Param("example") MmsShopProductImgExample example);

    int updateByPrimaryKeySelective(MmsShopProductImg record);

    int updateByPrimaryKey(MmsShopProductImg record);
}