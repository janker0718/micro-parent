package top.janker.jmall.admin.service;

import org.springframework.transaction.annotation.Transactional;
import top.janker.jmall.orm.model.UmsMenu;
import top.janker.jmall.orm.model.UmsResource;
import top.janker.jmall.orm.model.UmsRole;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/11
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface UmsRoleService {
    List<UmsMenu> getMenuList(Integer id);

    /**
     * 获取所有角色列表
     */
    List<UmsRole> list();

    /**
     * 分页获取角色列表
     */
    List<UmsRole> list(String keyword, Integer pageSize, Integer pageNum);

    /**
     * 创建角色
     * @param role
     * @return
     */
    int create(UmsRole role);

    /**
     * 更新角色
     * @param id
     * @param role
     * @return
     */
    int update(Integer id, UmsRole role);

    /**
     * 批量删除角色
     * @param ids
     * @return
     */
    int delete(List<Integer> ids);

    /**
     * 获取角色相关菜单
     */
    List<UmsMenu> listMenu(Integer roleId);


    /**
     * 获取角色相关资源
     */
    List<UmsResource> listResource(Integer roleId);


    /**
     * 给角色分配菜单
     */
    @Transactional
    int allocMenu(Integer roleId, List<Integer> menuIds);

    /**
     * 给角色分配资源
     */
    @Transactional
    int allocResource(Integer roleId, List<Integer> resourceIds);

}
