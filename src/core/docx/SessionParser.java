package core.docx;

import core.models.Deputy;
import core.models.Session;
import core.models.Vote;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SessionParser {

    SessionParser(){
        /* Парсер налаштований під ключові співпадіння і чітку(незмінну) послідовність стрічок. 
        Щоб використовувати його не лише для Дрогобича,
        необхідно:
        1 - привести файли до вигляду зразка. Виключно формат docx!
        2 - згенерувати файл з депутатами (там просто ручками)
        3 - Замінити пошукові паттерни на свої
        ("Дрогобицька міська рада Львівської області" на "Енська міська рада" - згідно заголовку)
        4 - код потрібно або скомпілювати, або запустити  psvm у класі  Main ( думаю, ви в курсі:)  
        !!!Не забувайте зберегти документ після форматування!!!
        * */
    }
    //
    Session getSession(String parsedSession){
        String sessionName = "";
        String sessionDate = "";
        try (Scanner scanner = new Scanner(parsedSession)) {
            //
            while (scanner.hasNextLine()){
                String tmp = scanner.nextLine();
                //
                if (tmp.contains("Дрогобицька міська рада Львівської області")) {
                     // назва сесії - після заголовку
                    sessionName = scanner.nextLine();
                }
                //
                if (tmp.contains("РЕЗУЛЬТАТИ ПОІМЕННОГО ГОЛОСУВАННЯ")) {
                     // наступною стрічкою буде дата
                    tmp = scanner.nextLine();
                    Integer count = 0;
                    String[] allMatches = new String[2];
                    String regex = "([0-9]{2}).([0-9]{2}).([0-9]{2})\\s+([0-9]{2}):([0-9]{2}):([0-9]{2})";
                    Matcher m = Pattern.compile(regex).matcher(tmp);
                    while (m.find() && count<allMatches.length){
                        allMatches[count] = m.group();
                        tmp = allMatches[count];
                        count++;
                    }
                    sessionDate = tmp.substring(0,8);
                    break;
                }
            }
            scanner.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new Session(sessionDate, sessionName);
    }
    //
    public List<String> getParsedVoteList(String parsedSession){
        //Розділяємо на окремі голосування
        return Arrays.asList(parsedSession.split("Голова "));
    }
    //Один екземпляр голосування в сесії
    public Vote getVote(String parsedVote){
        String voteDate = "";
        String voteName = "";
        Map<Integer,String> namedVoting = new HashMap<>();
        try (Scanner scanner = new Scanner(parsedVote)) {
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                if (line.contains("РЕЗУЛЬТАТИ ПОІМЕННОГО ГОЛОСУВАННЯ")) {
                     // тут беремо дату і час проведення голосування
                    line = scanner.nextLine();
                    Integer count = 0;
                    String[] allMatches = new String[2];
                    String regex = "([0-9]{2}).([0-9]{2}).([0-9]{2})\\s+([0-9]{2}):([0-9]{2}):([0-9]{2})";
                    Matcher m = Pattern.compile(regex).matcher(line);
                    while (m.find() && count<allMatches.length){
                        allMatches[count] = m.group();
                        voteDate = allMatches[count];
                        count++;
                    }
                }
                 // якщо стрічка містить символи quot -  то це назва голосування   
                if (line.contains("“") || line.contains("\"")){
                    voteName = voteName+" "+line;
                }
                 // прибираємо зайві символи(деколи доводиться ставити ці символи в наступні стрічки, 
                 //якщо назва не помістилась в одну)
                voteName = voteName.replace("\"", " ");
                voteName = voteName.replace("“", "");
                voteName = voteName.replace("“", "");
                voteName = voteName.replace("”", "");

                List<String> lst = Arrays.asList(line.split("\t"));
                Iterator<String> lst_iterator = lst.iterator();
                while (lst_iterator.hasNext()){
                    String tmp = lst_iterator.next();
                     // тут вся "магія". Депутати, внесені ручками у файл  DeputySingleton 
                     // порівнюються із стрічками, котрі у нашому файлі. 
                    for (Deputy deputy : DeputySingleton.getInstance().getDeputies()) {
                        String deputyFullName = deputy.getLastName()+" "+
                                deputy.getFirstName()+" "+
                                deputy.getFathersName();
                        if (tmp.equals(deputyFullName) && lst_iterator.hasNext()){
                            tmp = lst_iterator.next();
                            namedVoting.put(deputy.getId(),tmp);
                        }
                    }
                }
            }
            scanner.close();
        }
        return new Vote(voteDate,voteName,namedVoting);
    }
}
