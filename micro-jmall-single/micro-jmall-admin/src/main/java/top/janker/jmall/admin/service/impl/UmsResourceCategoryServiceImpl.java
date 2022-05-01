package top.janker.jmall.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.janker.jmall.admin.service.UmsResourceCategoryService;
import top.janker.jmall.orm.mapper.UmsResourceCategoryMapper;
import top.janker.jmall.orm.model.UmsResourceCategory;
import top.janker.jmall.orm.model.UmsResourceCategoryExample;

import java.util.Date;
import java.util.List;

/**
 * @author janker
 * @date 2022/4/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service
public class UmsResourceCategoryServiceImpl implements UmsResourceCategoryService {
    @Autowired
    private UmsResourceCategoryMapper resourceCategoryMapper;

    @Override
    public List<UmsResourceCategory> listAll() {
        UmsResourceCategoryExample example = new UmsResourceCategoryExample();
        example.setOrderByClause("sort desc");
        return resourceCategoryMapper.selectByExample(example);
    }

    @Override
    public int create(UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setCreateTime(new Date());
        return resourceCategoryMapper.insert(umsResourceCategory);
    }

    @Override
    public int update(Integer id, UmsResourceCategory umsResourceCategory) {
        umsResourceCategory.setId(id);
        return resourceCategoryMapper.updateByPrimaryKeySelective(umsResourceCategory);
    }

    @Override
    public int delete(Integer id) {
        return resourceCategoryMapper.deleteByPrimaryKey(id);
    }
}
