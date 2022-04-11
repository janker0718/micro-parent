package top.janker.jmall.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.janker.jmall.admin.service.UmsResourceService;
import top.janker.jmall.orm.mapper.UmsResourceMapper;
import top.janker.jmall.orm.model.UmsResource;
import top.janker.jmall.orm.model.UmsResourceExample;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/12
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Service
public class UmsResourceServiceImpl implements UmsResourceService {

    @Autowired
    private UmsResourceMapper resourceMapper;

    @Override
    public List<UmsResource> listAll() {
        return resourceMapper.selectByExample(new UmsResourceExample());
    }
}
