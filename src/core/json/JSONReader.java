package core.json;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JSONReader {
    private String folderPath;

    public JSONReader(String folderPath) {
        this.folderPath = folderPath;
    }

    Map<String,JSONObject> getJSONsessionsMap(){
        File[] list = filesList();
        Map<String,JSONObject> map =new HashMap<>();
        for (File sessionJSON : list){
            String sessionName = sessionJSON.getPath();
            JSONObject sessionContent = readSessionJSON(sessionName);
            map.put(sessionName,sessionContent);
        }
        return map;
    }

    private File[] filesList(){
        File dir = new File(folderPath);
        return dir.listFiles((file, name) -> name.endsWith(".json"));
    }

    private JSONObject readSessionJSON(String sessionName) {
        JSONParser parser = new JSONParser();
        Object obj = null;
        try {
            obj = parser.parse(new FileReader(sessionName));
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return (JSONObject) obj;
    }
}
