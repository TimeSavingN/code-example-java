package com.taogen.demo.springbootcrud.core.web.model;

import java.io.Serializable;

/**
 * @author Taogen
 */
public class ResponseModel implements Serializable
{
	private static final long serialVersionUID = 1L;
	public static final ResponseModel OK = new ResponseModel(0, "success!");
	protected Integer errorCode;
	protected String errorMessage;
	protected String requestId;

	public Integer getErrorCode()
	{
		return this.errorCode;
	}

	public void setErrorCode(Integer errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getErrorMessage()
	{
		return this.errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	public String getRequestId()
	{
		return this.requestId;
	}

	public void setRequestId(String requestId)
	{
		this.requestId = requestId;
	}

	public ResponseModel()
	{
	}

	public ResponseModel(String requestId)
	{
		this.requestId = requestId;
	}

	public ResponseModel(Integer errorCode, String errorMessage)
	{
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public ResponseModel(Integer errorCode, String errorMessage,
                         String requestId)
	{
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
		this.requestId = requestId;
	}
}
