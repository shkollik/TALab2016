package FileFormats.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.json.simple.JSONObject;

import java.io.IOException;

/**
 * Created by Vladyslav_Shkola on 10/3/2016.
 */
public class Runner {
    public static void main(String[] args) throws IOException {
        Goods g = new Goods(3, "Beacon", "Beacon", 100, 3);
        JSONObject json = new JSONObject();
        json.put("id", g.getId());
        json.put("name", g.getName());
        json.put("description", g.getDescription());
        json.put("manufactureId", g.getManufactureId());
        json.put("price", g.getPrice());
        System.out.println(json.toJSONString());

        String jString = json.toJSONString();

        ObjectMapper mapper = new ObjectMapper();
        Goods wasRead = mapper.readValue(jString, Goods.class);
        System.out.println(wasRead);

    }
}
