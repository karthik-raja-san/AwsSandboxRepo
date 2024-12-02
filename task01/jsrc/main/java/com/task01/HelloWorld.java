package com.task01;

import java.util.*;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.syndicate.deployment.*;

@LambdaHandler(lambdaName="cmtr-1e70b2bd-hello_world-test", roleName="hello_world-role", isPublishVersion= false )
class HelloWorld implements RequestHandler<Object, Map<String, Object>> {

    @Override
    public Map<String, Object> handleRequest(Object request, Context context) {
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("statusCode", 200);
        resultMap.put("message", "Hello from Lambda")
        return resultMap;
    }
}