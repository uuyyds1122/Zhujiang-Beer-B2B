package com.beer.sell.portal.app.common.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
@Author XDD
@create 2024--04--26 20:31
**/

/**
 * 经销商用户表
 */
@Data
public class Dealerinfo {
    /**
     * 经销商客户编号
     */
    private Long dealerUserId;

    /**
     * 预留手机号
     */

    private String dealerPhone;

    /**
     * 用户名
     */

    private String dealerUsername;

    /**
     * 密码
     */

    private String dealerPassword;

    /**
     * 状态值
     */

    private String status;

    /**
     * 公司名称
     */

    private String dealerCompany;

    /**
     * 实际法人
     */

    private String dealerRealUsername;


}