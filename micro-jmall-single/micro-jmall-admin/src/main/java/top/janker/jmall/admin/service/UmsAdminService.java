package top.janker.jmall.admin.service;

import org.springframework.security.core.userdetails.UserDetails;
import top.janker.jmall.admin.model.param.UmsAdminParam;
import top.janker.jmall.admin.model.param.UpdateAdminPasswordParam;
import top.janker.jmall.orm.model.UmsAdmin;
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
public interface UmsAdminService {

    UmsAdmin register(UmsAdminParam umsAdminParam);

    String login(String username, String password);

    String refreshToken(String token);

    UmsAdmin getAdminByUsername(String username);

    List<UmsRole> getRoleList(Integer id);

    List<UmsResource> getResourceList(Integer adminId);

    List<UmsAdmin> list(String keyword, Integer pageSize, Integer pageNum);

    UmsAdmin getItem(Integer id);

    int update(Integer id, UmsAdmin admin);

    int updatePassword(UpdateAdminPasswordParam updatePasswordParam);

    int delete(Integer id);

    int updateRole(Integer adminId, List<Integer> roleIds);
    /**
     * 获取用户信息
     */
    UserDetails loadUserByUsername(String username);

}
