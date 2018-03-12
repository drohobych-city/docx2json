package core.json;

import core.docx.DeputySingleton;
import core.models.Deputy;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.Iterator;
import java.util.List;

public class JSONRebuilder {
    private JSONObject session;
    private List<Deputy> deputies = DeputySingleton.getInstance().getDeputies();
    //
    private String sessionDate;
    private String sessionName;
    private JSONArray voting;
    private JSONArray namedVoting;
    private String voteName;
    private String voteTimestamp;


    public JSONRebuilder(JSONObject session) {
        this.session = session;
        getVotingQuestions();
        getNamedVoting();
    }

    private void getVotingQuestions(){
        sessionDate = session.get("sessionDate").toString();
        sessionName = session.get("sessionName").toString();
        voting = (JSONArray) session.get("voting");
    }
    private void getNamedVoting(){
        Iterator<JSONObject> iterator =voting.iterator();
        while (iterator.hasNext()){
            JSONObject voting = iterator.next();
            voteName = voting.get("voteName").toString();
            voteTimestamp = voting.get("voteTimestamp").toString();
            namedVoting = (JSONArray) voting.get("namedVoting");
        }
    }

    private JSONArray getIdVoting(){
        JSONArray idVotes = new JSONArray();
            Iterator<JSONObject> iterator = namedVoting.iterator();
            while (iterator.hasNext()){

            }
        return idVotes;
    }

    private JSONArray rebuildVotingQuestions(){
        JSONArray rebuildedVotingQuestions = new JSONArray();
        while (!getIdVoting().isEmpty()){
            JSONObject rebuildedVotingQuestion = new JSONObject();
            rebuildedVotingQuestion.put("voteName",voteName);
            rebuildedVotingQuestion.put("voteTimestamp",voteTimestamp);
            rebuildedVotingQuestion.put("namedVoting", getIdVoting());
            rebuildedVotingQuestions.add(rebuildedVotingQuestion);
        }
        return rebuildedVotingQuestions;
    }

    public JSONObject rebuildSession(){
        JSONObject rebuildedSession = new JSONObject();
        rebuildedSession.put("sessionDate",sessionDate);
        rebuildedSession.put("sessionName",sessionName);
        rebuildedSession.put("voting",rebuildVotingQuestions());
        return rebuildedSession;
    }
}
