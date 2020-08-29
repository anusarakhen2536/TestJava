package com.example.app.bean;

import java.util.ArrayList;
import java.util.List;

public class BeanResponse {
	
	private ArrayList<List<Integer>> result;
	private int errorCode;
	private String errorMessage;
	
	public BeanResponse() {
	}

	public ArrayList<List<Integer>> getResult() {
		return result;
	}

	public void setResult(ArrayList<List<Integer>> result) {
		this.result = result;
	}
	
	public int getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	
}
