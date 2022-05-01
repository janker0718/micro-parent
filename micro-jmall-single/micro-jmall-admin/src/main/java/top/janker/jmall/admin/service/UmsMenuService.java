package top.janker.jmall.admin.service;

import top.janker.jmall.admin.model.param.UmsMenuNode;
import top.janker.jmall.orm.model.UmsMenu;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface UmsMenuService {

    /**
     * 创建后台菜单
     */
    int create(UmsMenu umsMenu);

    /**
     * 修改后台菜单
     */
    int update(Integer id, UmsMenu umsMenu);

    /**
     * 根据ID获取菜单详情
     */
    UmsMenu getItem(Integer id);

    /**
     * 根据ID删除菜单
     */
    int delete(Integer id);

    /**
     * 分页查询后台菜单
     */
    List<UmsMenu> list(Integer parentId, Integer pageSize, Integer pageNum);

    /**
     * 树形结构返回所有菜单列表
     */
    List<UmsMenuNode> treeList();

    /**
     * 修改菜单显示状态
     */
    int updateHidden(Integer id, Integer hidden);
}
