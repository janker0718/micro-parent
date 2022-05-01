package top.janker.jmall.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.UmsMenu;
import top.janker.jmall.orm.model.UmsResource;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/12
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
public interface UmsRoleDao {
    /**
     * 根据后台用户ID获取菜单
     */
    List<UmsMenu> getMenuList(@Param("adminId") Integer adminId);
    /**
     * 根据角色ID获取菜单
     */
    List<UmsMenu> getMenuListByRoleId(@Param("roleId") Integer roleId);
    /**
     * 根据角色ID获取资源
     */
    List<UmsResource> getResourceListByRoleId(@Param("roleId") Integer roleId);
}
