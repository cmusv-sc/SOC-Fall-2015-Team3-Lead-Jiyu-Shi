package models;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import util.APICall;
import util.Constants;

/**
 * Created by jiyushi1 on 11/7/15.
 */
public class UserService {
    private static final String SEND_USER_INFO = Constants.NEW_BACKEND+"application/getAllClimateServices/json";

    public static String register(User user){

        ObjectMapper mapper = new ObjectMapper();
        ObjectNode queryJson = mapper.createObjectNode();
        queryJson.put("userName", user.getUserName());
        queryJson.put("id", user.getId());
        queryJson.put("password", user.getPassword());
        queryJson.put("firstName", user.getFirstName());
        queryJson.put("lastName", user.getLastName());
        queryJson.put("email", user.getEmail());
        JsonNode userServiceNode = APICall
                .postAPI(SEND_USER_INFO,queryJson);

        if (userServiceNode == null || userServiceNode.has("error")
                || !userServiceNode.isArray()) {
            return "error";
        }
        JsonNode json = userServiceNode.path(0); //only one string message is returned!
        String result = json.path("result").asText();
        return result;
    }


}
