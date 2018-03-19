package com.topcheer.service.a;


import com.topcheer.model.User;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by feng on 2018/3/6.
 */
@WebService
public interface UserService {
@WebMethod
User getUserByUsername(String  username);
@WebMethod
String getName(@WebParam(name = "id") String id);
}
