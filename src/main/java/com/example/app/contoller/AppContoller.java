package com.example.app.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.bean.BeanRequest;
import com.example.app.bean.BeanResponse;
import com.example.app.service.AppService;
import com.example.app.validate.AppValidate;
   
@RestController
public class AppContoller {

	@Autowired
	AppService appService;
	
	@PostMapping("/")
    public BeanResponse getResult(@RequestBody BeanRequest req) {		
		
		BeanResponse response =  AppValidate.validateError(req.getSubArray(), req.getSummary());
		if (response.getErrorCode() != 0) {
			return response;
		}
		
		return appService.getSubAttayFindOfSum(req.getSubArray(), req.getSummary());
    }
	
}
