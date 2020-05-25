package com.example.soap.endpoint;

import com.example.soap.entity.User;
import com.example.soap.generated.AddUserRequest;
import com.example.soap.generated.AddUserResponse;
import com.example.soap.generated.GetUserRequest;
import com.example.soap.generated.GetUserResponse;
import com.example.soap.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class UserEndpoint {

    @Autowired
    private UserService userService;


    @PayloadRoot(namespace = "http://example.com/spring-boot-soap-example",
            localPart = "getUserRequest")
    @ResponsePayload
    public GetUserResponse getUserRequest(@RequestPayload GetUserRequest request) {
        GetUserResponse response = new GetUserResponse();
        response.setUser(userService.findByName(request.getName()));
        return response;
    }

    @PayloadRoot(namespace = "http://example.com/spring-boot-soap-example",
            localPart = "addUserRequest")
    @ResponsePayload
    public AddUserResponse addUserRequest(@RequestPayload AddUserRequest request) {
        AddUserResponse response = new AddUserResponse();

        User user = new User();
        user.setName(request.getName());
        user.setSalary(request.getSalary());

        response.setUser(userService.save(user));
        return response;
    }
}
