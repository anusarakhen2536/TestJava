package com.example.app;

import static org.junit.Assert.assertEquals;
 
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.example.app.service.AppService;

@RunWith(MockitoJUnitRunner.class)
public class ApplicationTests {

    @InjectMocks
    AppService appService;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void validateTest()
    {
    	 assertEquals(true, true);
    }
  
}
