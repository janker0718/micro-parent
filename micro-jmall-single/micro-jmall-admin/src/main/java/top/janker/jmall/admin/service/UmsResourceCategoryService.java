package top.janker.jmall.admin.service;

import top.janker.jmall.orm.model.UmsResourceCategory;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface UmsResourceCategoryService {
    /**
     * 获取所有资源分类
     */
    List<UmsResourceCategory> listAll();

    /**
     * 创建资源分类
     */
    int create(UmsResourceCategory umsResourceCategory);

    /**
     * 修改资源分类
     */
    int update(Integer id, UmsResourceCategory umsResourceCategory);

    /**
     * 删除资源分类
     */
    int delete(Integer id);
}
