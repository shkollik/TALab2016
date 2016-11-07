package talab.xml.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.File;
import java.io.IOException;

/**
 * Created by Vladyslav_Shkola on 10/5/2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        //1-st method Read
       Clients clients = new Clients(5, "Cohan", "Robert", "245245245", "+93450920405");

        JSONObject json = new JSONObject();
        json.put("id", clients.getId());
        json.put("surname", clients.getSurname());
        json.put("name", clients.getName());
        json.put("identificationCode", clients.getIdentificationCode());
        json.put("phoneNumber", clients.getPhoneNumber());
        System.out.println(json.toJSONString());

        //2-nd method Read
        JSONObject json2 = new JSONObject();
        String jString = json2.toJSONString();
        ObjectMapper mapper = new ObjectMapper();
        Clients wasRead = mapper.readValue(jString, Clients.class);
        System.out.println(wasRead);

        //method Write
        //ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("D:\\examples\\clients.json"), clients);

    }
}
