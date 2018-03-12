package core.docx;

import core.json.DeputyJSON;
import core.models.Session;
import core.models.Vote;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //
        SessionReader sessionReader = new SessionReader("files");
        SessionParser sessionParser = new SessionParser();
        List<Session> sessionsList = new ArrayList<>();
        //
        for (Map.Entry<String, String> entry : sessionReader.sessionMap().entrySet()) {
            Session session = sessionParser.getSession(entry.getValue());
            List<Vote> votes = new ArrayList<>();
            for (String parsedVote : sessionParser.getParsedVoteList(entry.getValue())
                 ) {
                Vote vote = sessionParser.getVote(parsedVote);
                votes.add(vote);
            }
            session.setVoting(votes);
            sessionsList.add(session);
        }
        //
        for (Session session:sessionsList
             ) {
            JSONObject sessionJSON = new JSONObject();
            sessionJSON.put("sessionName",session.getName());
            sessionJSON.put("sessionDate", session.getDate());
            JSONArray votingArray = new JSONArray();
            for (Vote vote: session.getVoting()
                 ) {
                if (vote.getTimestamp() != "" && vote.getName() != "") {
                    JSONObject votingJSON = new JSONObject();
                    votingJSON.put("voteTimestamp", vote.getTimestamp());
                    votingJSON.put("voteName", vote.getName());
                    JSONArray namedVotingJSONArray = new JSONArray();
                    for (Map.Entry<Integer, String> entry : vote.getVoting().entrySet()
                            ) {
                        JSONObject voteJSON = new JSONObject();
                        voteJSON.put(entry.getKey(), entry.getValue());
                        namedVotingJSONArray.add(voteJSON);
                    }
                    votingJSON.put("namedVoting", namedVotingJSONArray);
                    votingArray.add(votingJSON);
                    sessionJSON.put("voting", votingArray);
                }
            }
            try (FileWriter file = new FileWriter(session.getName()+" від "+session.getDate()+".json")) {
                file.write(sessionJSON.toJSONString());
                file.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        //It`s make JSON array with deputies
        /*DeputyJSON deputyJSON = new DeputyJSON();
        try (FileWriter file = new FileWriter("deputies.json")) {
            file.write(deputyJSON.getDeputiesJSON().toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
