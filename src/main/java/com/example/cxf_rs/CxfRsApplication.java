package com.example.cxf_rs;

import com.example.cxf_rs.service.impl.HelloServiceImpl1;
import com.example.cxf_rs.service.impl.HelloServiceImpl2;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Server;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class CxfRsApplication {
    @Autowired
    private Bus bus;

    public static void main(String[] args) {
        SpringApplication.run(CxfRsApplication.class, args);
    }

    @Bean
    public Server rsServer() {
        JAXRSServerFactoryBean endpoint = new JAXRSServerFactoryBean();
        endpoint.setBus(bus);
        endpoint.setAddress("/endpoint");
        // Register 2 JAX-RS root resources supporting "/sayHello/{id}" and "/sayHello2/{id}" relative paths
        endpoint.setServiceBeans(Arrays.<Object>asList(new HelloServiceImpl1(), new HelloServiceImpl2()));
        endpoint.setFeatures(Arrays.asList(new Swagger2Feature()));
        return endpoint.create();
    }

}
