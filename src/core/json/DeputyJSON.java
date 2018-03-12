package core.json;

import core.docx.DeputySingleton;
import core.models.Deputy;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;

public class DeputyJSON {
    List<Deputy> deputiesList = DeputySingleton.getInstance().getDeputies();

    public JSONArray getDeputiesJSON(){
        JSONArray deputiesArray = new JSONArray();
        for (Deputy deputy:deputiesList
             ) {
            JSONObject deputyObject = new JSONObject();
            deputyObject.put("id",deputy.getId());
            deputyObject.put("firstName",deputy.getFirstName());
            deputyObject.put("fathersName",deputy.getFathersName());
            deputyObject.put("lastName",deputy.getLastName());
            deputyObject.put("faction",deputy.getFaction());
            deputyObject.put("startDate",deputy.getStartDate());
            deputyObject.put("endDate",deputy.getEndDate());
            deputyObject.put("photoLink",deputy.getPhotoLink());
            deputiesArray.add(deputyObject);
        }
        return deputiesArray;
    }
}
