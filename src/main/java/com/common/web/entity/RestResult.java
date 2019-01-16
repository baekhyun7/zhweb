package com.common.web.entity;




import com.common.constants.CommonConstants;

import java.io.Serializable;

/**
 * 功能描述：Rest结果数据封装类
 *
 * @author 张浩
 * @version 1.0
 * @date 2019-01-15 10:12:36
 */
public class RestResult<T> implements Serializable {

    private static final long serialVersionUID = -1280612301030187904L;

    private static final String DEFAULT_SUCCESS_MSG = "成功";
    private static final String DEFAULT_FAIL_MSG = "失败";

    /**
     * 提示编码
     */
    private String code;

    /**
     * 是否成功标志
     */
    private Boolean successful;

    /**
     * 提示消息
     */
    private String message;

    /**
     * 数据信息
     */
    private T data;

    public RestResult(String code, Boolean successful, String message,
                      T data) {
        this.code = code;
        this.successful = successful;
        this.message = message;
        this.data = data;
    }

    public RestResult() {

    }

    /**
     * 功能描述：表示成功的结果数据
     *
     * @param code    提示编码
     * @param message 提示消息
     * @param data    数据信息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restSuccess(String code, String message, T data) {
        return new RestResult<>(code, true, message == null ? DEFAULT_SUCCESS_MSG : message, data);
    }

    /**
     * 功能描述：表示成功的结果数据
     *
     * @param code    提示编码
     * @param message 提示消息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restSuccess(String code, String message) {
        return restSuccess(code, message, null);
    }

    /**
     * 功能描述：表示成功的结果数据
     *
     * @param code 提示编码
     * @param data 数据信息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restSuccess(String code, T data) {
        return restSuccess(code, null, data);
    }

    /**
     * 功能描述：表示成功的结果数据
     *
     * @param data 数据信息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restSuccess(T data) {
        return restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE, null, data);
    }

    /**
     * 功能描述：表示成功的结果数据
     *
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restSuccess() {
        return restSuccess(CommonConstants.SUCCESS_RESPONSE_CODE, null);
    }

    /**
     * 功能描述：表示失败的结果数据
     *
     * @param code    提示编码
     * @param message 提示消息
     * @param data    数据信息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restFail(String code, String message, T data) {
        return new RestResult<>(code, false, message == null ? DEFAULT_FAIL_MSG : message, data);
    }

    /**
     * 功能描述：表示失败的结果数据
     *
     * @param code    提示编码
     * @param message 提示消息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restFail(String code, String message) {
        return restFail(code, message, null);
    }

    /**
     * 功能描述：表示失败的结果数据
     *
     * @param code 提示编码
     * @param data 数据信息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restFail(String code, T data) {
        return restFail(code, null, data);
    }


    /**
     * 功能描述：表示失败的结果数据
     *
     * @param msg 错误消息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restFail(String msg) {
        return restFail(CommonConstants.ERROR_RESPONSE_CODE, msg, null);
    }


    /**
     * 功能描述：表示失败的结果数据
     *
     * @param data 数据信息
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restFail(T data) {
        return restFail(CommonConstants.ERROR_RESPONSE_CODE, null, data);
    }

    /**
     * 功能描述：表示失败的结果数据
     *
     * @return 返回值：返回Rest结果数据
     */
    public static <T> RestResult<T> restFail() {
        return restFail(CommonConstants.ERROR_RESPONSE_CODE, null);
    }


    public String getCode() {
        return code;
    }

    public RestResult<T> setCode(String code) {
        this.code = code;
        return this;
    }

    public Boolean getSuccessful() {
        return successful;
    }

    public RestResult<T> setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public RestResult<T> setMessage(String message) {
        this.message = message;
        return this;
    }

    public T getData() {
        return data;
    }

    public RestResult<T> setData(T data) {
        this.data = data;
        return this;
    }

    @Override
    public String toString() {
        return "RestResult{" +
                "code='" + code + '\'' +
                ", successful=" + successful +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

