package top.janker.jmall.admin.dao;

import org.apache.ibatis.annotations.Param;
import top.janker.jmall.orm.model.UmsAdminRoleRelation;
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
public interface UmsAdminRoleRelationDao {
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    List<UmsResource> getResourceList(@Param("adminId") Integer adminId);

    List<UmsRole> getRoleList(@Param("adminId") Integer adminId);
}
