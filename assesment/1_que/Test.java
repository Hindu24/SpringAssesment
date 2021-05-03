package com.org;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.*;  
  
public class Test {  
    public static void main(String[] args) {  
          
        Resource r=new ClassPathResource("applicationContext.xml");  
        BeanFactory factory=new XmlBeanFactory(r);  
          
        Cohorts s=(Cohorts)factory.getBean("coh");  
        s.show(); 
       DXC d=(DXC)factory.getBean("dxc");  
        d.show1(); 
          
    }  
}