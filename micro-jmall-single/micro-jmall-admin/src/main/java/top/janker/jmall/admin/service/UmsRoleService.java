package top.janker.jmall.admin.service;

import top.janker.jmall.orm.model.UmsMenu;

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
}
