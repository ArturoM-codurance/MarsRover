package handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;
import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;
import rover.MarsRover;

import java.util.HashMap;

public class LambdaRequestHandler implements RequestHandler<APIGatewayProxyRequestEvent, APIGatewayProxyResponseEvent> {
    @Override
    public APIGatewayProxyResponseEvent handleRequest(APIGatewayProxyRequestEvent event, Context context) {
        LambdaLogger logger = context.getLogger();
        logger.log("EVENT TYPE: " + event.getClass());

        JsonObject body = Json.parse(event.getBody()).asObject();
        String command = body.getString("command", "");

        MarsRover rover = new MarsRover();

        APIGatewayProxyResponseEvent response = new APIGatewayProxyResponseEvent();

        // Set the HTTP status code
        response.setStatusCode(200);
        String finalPosition = rover.execute(command);
        response.setHeaders(new HashMap<>(){{
            put("Content-Type", "application/json");
        }});

        response.setBody(new JsonObject().add("final position", finalPosition).toString());

        return response;
    }
}
