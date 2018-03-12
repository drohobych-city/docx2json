package core.docx;

import java.util.ArrayList;
import java.util.List;

public class VotesSingleton {
    private static VotesSingleton ourInstance = new VotesSingleton();
    private List<String> votes = new ArrayList<>();

    public static VotesSingleton getInstance() {
        return ourInstance;
    }

    private VotesSingleton() {
    }

    List<String> getVotes() {
        votes.add("ЗА");
        votes.add("ПРОТИ");
        votes.add("ВІТСУТНІЙ");
        votes.add("НЕ ГОЛОСУВАВ");
        return votes;
    }
}
