package cn.mycookies.pojo.dto;

import cn.mycookies.common.TagTypes;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.NotNull;

/**
 * @ClassName TagAdd
 * @Description TODO
 * @Author Jann Lee
 * @Date 2018-11-18 20:17
 **/
@ApiModel(value = "标签对象")
@Setter
@Getter
@ToString
public class TagAdd {

    @Length(min = 1,max = 10,message = "tagName长度需在1-10之间")
    @ApiModelProperty(value="标签名", required = true)
    private String tagName;

    @Length(max = 50,message = "tagDesc长度须在50之内")
    @ApiModelProperty(value = "标签描述",required = false)
    private String tagDesc;

    @ApiModelProperty(value = "标签类型",required = false,dataType = "Byte")
    private Byte type;
}
