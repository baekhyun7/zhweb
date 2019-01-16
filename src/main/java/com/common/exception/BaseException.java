package com.common.exception;

/**
 * 功能描述： 基础异常类
 * @author 王赢方
 * @date @date 2018-07-31 10:26:32
 * @version 1.0
 */
public class BaseException extends Exception {

	private static final long serialVersionUID = 2087985250386141377L;

	private String errorCode;
	
	public BaseException() {
		super();
	}

	public BaseException(String message, Throwable cause,
                         boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BaseException(String message, Throwable cause) {
		super(message, cause);
	}

	public BaseException(String message) {
		super(message);
	}

	public BaseException(Throwable cause) {
		super(cause);
	}

	public BaseException(String message , String errorCode) {
		super(message);
		this.errorCode = errorCode;
	}
	
	public String getErrorCode(){
		return this.errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
}	
