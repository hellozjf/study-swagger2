package com.hellozjf.study.studyswagger2;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by Trace on 2017-12-01.<br/>
 * Desc: 用户表tb_user
 */
@SuppressWarnings("unused")
@Data @NoArgsConstructor @AllArgsConstructor
@ApiModel
public class User {
    @ApiModelProperty(value = "ID", name = "id") private Integer id;
    @ApiModelProperty(value = "USERNAME", name = "userName") private String userName;
    @ApiModelProperty("用户昵称") private String nickName;
    @ApiModelProperty("真实姓名") private String realName;
    @ApiModelProperty("身份证号码") private String identityCard;
    @ApiModelProperty("性别") private String gender;
    @ApiModelProperty("出生日期") private LocalDate birth;
    @ApiModelProperty("手机号码") private String phone;
    @ApiModelProperty("邮箱") private String email;
    @ApiModelProperty("密码") private String password;
    @ApiModelProperty("用户头像地址") private String logo;
    @ApiModelProperty("账户状态 0:正常; 1:冻结; 2:注销") private Byte status;
    @ApiModelProperty("个性签名") private String summary;
    @ApiModelProperty("用户所在区域码") private String areaCode;
    @ApiModelProperty("注册时间") private LocalDateTime registerTime;
    @ApiModelProperty("最近登录时间") private LocalDateTime lastLoginTime;

}
