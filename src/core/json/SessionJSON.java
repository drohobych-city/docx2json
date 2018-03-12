package core.json;

import core.models.Session;
import core.models.Vote;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.List;
import java.util.Map;

public class SessionJSON {
    private List<Session> sessionsList;

    public SessionJSON(List<Session> sessionsList) {
        this.sessionsList = sessionsList;
    }
}
