package com.example.tunnel.util;

/**
 * 错误类型
 *
 * @author tiga
 * @version 1.0
 * @since 2019年12月25日15:17:30
 */
public enum ErrorCodeEnum {
    /**
     * 参数为空
     */
    PARAM_IS_NULL(10001, "参数为空"),

    /**
     * 注册失败
     */
    INSERT_FAILED(10002, "添加失败"),

    /**
     * 删除失败
     */
    DELETE_FAILED(10003, "删除失败"),

    /**
     * 隧道不存在
     */
    TUNNEL_NOT_EXIST(10004, "隧道不存在"),

    /**
     * 修改失败
     */
    UPDATE_FAILED(10005, "修改失败"),

    /**
     * 监测点不存在
     */
    MONP_NOT_EXIST(10006, "监测点不存在"),

    /**
     * 监测数据不存在
     */
    MONPDATA_NOT_EXIST(10007, "监测数据不存在"),

    /**
     * 修改信息失败
     */
    UPDATE_INFORMATION_FAILED(10010, "修改信息失败"),

    /**
     * 修改密码失败
     */
    UPDATE_PASSWORD_FAILED(10012, "修改密码失败"),

    /**
     * 修改头像失败
     */
    UPDATE_AVATAR_FAILED(10013, "修改头像失败"),

    /**
     * 动态保存失败
     */
    ACTION_SAVE_FAILED(20001, "动态保存失败"),

    /**
     * 动态不存在
     */
    ACTION_NOT_EXIST(20002, "动态不存在");

    /**
     * 错误代码
     */
    private Integer errorCode;

    /**
     * 错误信息
     */
    private String errorMessage;

    ErrorCodeEnum(Integer errorCode, String errorMessage) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    @Override
    public String toString() {
        return "ErrorCode{" +
                "errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                '}';
    }
}
