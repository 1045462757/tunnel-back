package com.example.tunnel.util;

import java.io.Serializable;

/**
 * 业务执行结果
 *
 * @author tiga
 * @version 1.0
 * @since 2019年6月13日16:02:19
 */
public class BusinessResult implements Serializable {

    /**
     * 业务是否执行成功
     */
    private Boolean status;

    /**
     * 错误代码
     */
    private Integer errorCode;

    /**
     * 错误信息
     */
    private String errorMessage;

    /**
     * 数据
     */
    private Object data;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public BusinessResult(Boolean status) {
        this.status = status;
    }

    public BusinessResult(Boolean status, Object data) {
        this.status = status;
        this.data = data;
    }

    public BusinessResult(Integer errorCode, String errorMessage) {
        this.status = false;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public BusinessResult(ErrorCodeEnum errorCode) {
        this.status = false;
        this.errorCode = errorCode.getErrorCode();
        this.errorMessage = errorCode.getErrorMessage();
    }

    public BusinessResult(ErrorCodeEnum errorCode, Object data) {
        this.status = false;
        this.errorCode = errorCode.getErrorCode();
        this.errorMessage = errorCode.getErrorMessage();
        this.data = data;
    }

    @Override
    public String toString() {
        return "BusinessResult{" +
                "status=" + status +
                ", errorCode=" + errorCode +
                ", errorMessage='" + errorMessage + '\'' +
                ", data=" + data +
                '}';
    }
}