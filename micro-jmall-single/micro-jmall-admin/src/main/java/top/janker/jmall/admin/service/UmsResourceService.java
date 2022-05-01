package top.janker.jmall.admin.service;

import top.janker.jmall.orm.model.UmsResource;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/12
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface UmsResourceService {

    List<UmsResource> listAll();

    /**
     * 添加资源
     */
    int create(UmsResource umsResource);

    /**
     * 修改资源
     */
    int update(Integer id, UmsResource umsResource);

    /**
     * 获取资源详情
     */
    UmsResource getItem(Integer id);

    /**
     * 删除资源
     */
    int delete(Integer id);

    /**
     * 分页查询资源
     */
    List<UmsResource> list(Integer categoryId, String nameKeyword, String urlKeyword, Integer pageSize, Integer pageNum);
}
