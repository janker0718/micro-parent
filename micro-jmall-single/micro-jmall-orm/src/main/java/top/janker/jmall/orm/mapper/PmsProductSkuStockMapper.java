package top.janker.jmall.orm.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.PmsProductSkuStock;
import top.janker.jmall.orm.model.PmsProductSkuStockExample;

public interface PmsProductSkuStockMapper {
    long countByExample(PmsProductSkuStockExample example);

    int deleteByExample(PmsProductSkuStockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsProductSkuStock record);

    int insertSelective(PmsProductSkuStock record);

    List<PmsProductSkuStock> selectByExample(PmsProductSkuStockExample example);

    PmsProductSkuStock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsProductSkuStock record, @Param("example") PmsProductSkuStockExample example);

    int updateByExample(@Param("record") PmsProductSkuStock record, @Param("example") PmsProductSkuStockExample example);

    int updateByPrimaryKeySelective(PmsProductSkuStock record);

    int updateByPrimaryKey(PmsProductSkuStock record);
}