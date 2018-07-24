package com.spring.Listener;

import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import javax.servlet.ServletContext;
import java.util.List;

@Component
public class DataListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private UserService userService;


    public void onApplicationEvent(ContextRefreshedEvent cre) {
// TODO Auto-generated method stub
        ApplicationContext applicationContext = cre.getApplicationContext();
        WebApplicationContext webApplicationContext = (WebApplicationContext)applicationContext;
        ServletContext servletContext = webApplicationContext.getServletContext();
//        userService = (UserService) applicationContext.getBean("articleService");
//        List ls = userService.selectHomeDate();
//        servletContext.setAttribute("alist", ls);

    }
}