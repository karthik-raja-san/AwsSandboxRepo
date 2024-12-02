package com.task01;
import java.util.HashMap;
import com.syndicate.deployment.*;
import java.util.Map;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.logging.LogLevel;

@LambdaHandler(lambdaName="cmtr-1e70b2bd-hello_world-test", roleName="hello_world-role", isPublishVersion= false )
public class HelloWorld implements RequestHandler<Object, Map<String,Object>> {

	@Override
	public Map<String,Object> handleRequest(Object input, Context context) {
		 Map<String, Object> resultMap = new HashMap<>();
		 resultMap.put("statusCode", 200);
		 resultMap.put("message", "Hello from Lambda");
		 return resultMap;
	}

}