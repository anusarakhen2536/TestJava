package com.example.app.validate;

import com.example.app.bean.BeanResponse;

public class AppValidate {
	
	public static BeanResponse validateError(Integer[] array ,int sum){
		BeanResponse result = new BeanResponse();
		
		if (sum <= 0) {
			result.setErrorCode(-1);
			result.setErrorMessage("the sum is less than or equal to Zero");
		}
		
		if (array.length == 0) {
			result.setErrorCode(-2);
			result.setErrorMessage("the sub array is Empty");
		}
		return result;
	}

}
