package com.beer.sell.portal.app.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
@Author XDD
@create 2024--04--28 9:02
**/

/**
 * 经销商用户表
 */
@Data
@TableName(value = "dealer")
public class Dealer {
    /**
     * 经销商客户编号
     */
    @TableId(value = "dealer_user_id", type = IdType.INPUT)
    private Long dealerUserId;

    /**
     * 预留手机号
     */
    @TableField(value = "dealer_phone")
    private String dealerPhone;

    /**
     * 用户名
     */
    @TableField(value = "dealer_username")
    private String dealerUsername;

    /**
     * 密码
     */
    @TableField(value = "dealer_password")
    private String dealerPassword;

    /**
     * 状态值
     */
    @TableField(value = "`status`")
    private String status;

    /**
     * 公司名称
     */
    @TableField(value = "dealer_company")
    private String dealerCompany;

    /**
     * 实际法人
     */
    @TableField(value = "dealer_real_username")
    private String dealerRealUsername;

    public static final String COL_DEALER_USER_ID = "dealer_user_id";

    public static final String COL_DEALER_PHONE = "dealer_phone";

    public static final String COL_DEALER_USERNAME = "dealer_username";

    public static final String COL_DEALER_PASSWORD = "dealer_password";

    public static final String COL_STATUS = "status";

    public static final String COL_DEALER_COMPANY = "dealer_company";

    public static final String COL_DEALER_REAL_USERNAME = "dealer_real_username";
}