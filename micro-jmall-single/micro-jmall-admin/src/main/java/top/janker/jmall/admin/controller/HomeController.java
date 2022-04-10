package top.janker.jmall.admin.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import top.janker.jmall.admin.model.TestModel;
import top.janker.micro.common.sentinel.RateLimit;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author janker
 * @date 2021/12/17
 * <p>
 * Blog: https://janker.top
 * Github: https://github.com/janker0718
 */
@Api(tags = "管理后台主页api")
@RequestMapping("/home")
@RestController
public class HomeController {

    @ApiOperation(value = "测试接口")
    @SuppressWarnings("unchecked")
    @GetMapping("/{testId}")
    @RateLimit(value = "testModelList",param = "#testId")
    public List<TestModel> testModelList(@PathVariable String testId) {
        List<TestModel> result = new ArrayList<>();
        return result;
    }

}
