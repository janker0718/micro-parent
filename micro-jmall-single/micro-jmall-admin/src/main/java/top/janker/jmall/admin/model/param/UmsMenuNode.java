package top.janker.jmall.admin.model.param;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import top.janker.jmall.orm.model.UmsMenu;

import java.util.List;

/**
 * @author janker
 * @date 2022/4/30
 * <p>
 * Blog: https://www.share-java.com
 * Github: https://github.com/janker0718
 */
@Getter
@Setter
public class UmsMenuNode extends UmsMenu {
    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNode> children;
}
