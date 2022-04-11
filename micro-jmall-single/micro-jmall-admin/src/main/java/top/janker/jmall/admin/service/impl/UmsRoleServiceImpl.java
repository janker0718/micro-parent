package top.janker.jmall.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.janker.jmall.admin.dao.UmsRoleDao;
import top.janker.jmall.admin.service.UmsRoleService;
import top.janker.jmall.orm.model.UmsMenu;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/12
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service
public class UmsRoleServiceImpl implements UmsRoleService {
    @Autowired
    private UmsRoleDao roleDao;
    @Override
    public List<UmsMenu> getMenuList(Integer adminId) {
        return roleDao.getMenuList(adminId);
    }

}
