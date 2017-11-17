package com.amazonaws.lambda.demo;

import com.amazonaws.lambda.demo.model.InputModel;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<InputModel, String> {

	@Override
	public String handleRequest(InputModel input, Context context) {
		context.getLogger().log("Input: " + input);

		return "Hello from Lambda!" + input.getName();
	}

}
