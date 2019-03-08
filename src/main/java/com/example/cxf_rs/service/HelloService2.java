package com.example.cxf_rs.service;

import javax.jws.WebService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

public interface HelloService2 {

    @GET
    @Path("/sayHello2/{id}")
    String sayHello(@PathParam("id") String string);
}
