package core.json;

import core.docx.DeputySingleton;
import core.models.Deputy;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        JSONReader jsonReader = new JSONReader("SessionsJSONs");
        for (Map.Entry<String,JSONObject> sessionJSONEntry : jsonReader.getJSONsessionsMap().entrySet()){
            JSONObject session = sessionJSONEntry.getValue();
            JSONObject rebuildedSession = new JSONObject();
            String sessionDate = session.get("sessionDate").toString();
            String sessionName = session.get("sessionName").toString();
            JSONArray voting = (JSONArray) session.get("voting");
            JSONArray idVoting = new JSONArray();
            Iterator<JSONObject> votingIterator =voting.iterator();
            while (votingIterator.hasNext()){
                JSONObject vote = votingIterator.next();
                String voteName = vote.get("voteName").toString();
                String voteTimestamp = vote.get("voteTimestamp").toString();
                JSONArray namedVoting = (JSONArray) vote.get("namedVoting");
                JSONArray idNamedVoting = new JSONArray();
                Iterator<JSONObject> namedVotingIterator = namedVoting.iterator();
                while (namedVotingIterator.hasNext()){
                    JSONObject deputyVote = namedVotingIterator.next();
                    JSONObject idVote = new JSONObject();
                    List<Deputy> deputies = DeputySingleton.getInstance().getDeputies();
                    for (Deputy deputy : deputies) {
                        String deputyFullName = deputy.getLastName()+" "+
                                deputy.getFirstName()+" "+
                                deputy.getFathersName();
                        if (deputyVote.containsKey(deputyFullName)){
                            idVote.put(deputy.getId(),deputyVote.get(deputyFullName));
                        }
                    }
                    if(!idVote.isEmpty()){
                        idNamedVoting.add(idVote);
                    }
                }
                if(!idNamedVoting.isEmpty()){
                    JSONObject idVote = new JSONObject();
                    idVote.put("voteName",voteName);
                    idVote.put("voteTimestamp",voteTimestamp);
                    idVote.put("namedVoting",idNamedVoting);
                    idVoting.add(idVote);
                }
            }
            rebuildedSession.put("sessionDate",sessionDate);
            rebuildedSession.put("sessionName",sessionName);
            rebuildedSession.put("voting",idVoting);
            try (FileWriter writer = new FileWriter(sessionJSONEntry.getKey())){
                writer.write(rebuildedSession.toJSONString());
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
