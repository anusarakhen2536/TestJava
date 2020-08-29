package com.example.app;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
    
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.app.bean.BeanResponse;
import com.example.app.service.AppService;
import com.example.app.validate.AppValidate;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTests {

    @InjectMocks
    AppService appService;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void subAttayFindOfSumSuccess()
    {
    	Integer[] array = new Integer[]{ 2,3,6,7};
    	int sum = 8;
    	BeanResponse beanResponse = appService.getSubAttayFindOfSum(array, sum);    	
    	assertEquals(0, beanResponse.getErrorCode());
    	assertNotNull(beanResponse.getResult().size());
    }
    
    @Test
    public void subAttayFindOfSumNullSubAttay()
    {
    	Integer[] array = new Integer[] {};
    	int sum = 8;
    	BeanResponse beanResponse = AppValidate.validateError(array, sum);
    	assertEquals(-2, beanResponse.getErrorCode());
    }
    
    @Test
    public void subAttayFindOfSumSumZero()
    {
    	Integer[] array = new Integer[]{ 2,3,6,7};
    	int sum = 0;
    	BeanResponse beanResponse = AppValidate.validateError(array, sum);
    	assertEquals(-1, beanResponse.getErrorCode());
    }
  
}
