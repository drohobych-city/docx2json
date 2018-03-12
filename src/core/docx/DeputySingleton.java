package core.docx;

import core.models.Deputy;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeputySingleton {
    private List<String> deputiesString = new ArrayList<>();
    private List<Deputy> deputies = new ArrayList<>();
    private static DeputySingleton ourInstance = new DeputySingleton();

    public static DeputySingleton getInstance() {
        return ourInstance;
    }

    private DeputySingleton() {
    }

    public List<String> getDeputiesString() {
        deputiesString.add("Андрухів Андрій Васильович");
        deputiesString.add("Балог Олег Богданович");
        deputiesString.add("Бернадович Володимир Анатолійович");
        deputiesString.add("Бичковяк Олена Вікторівна");
        deputiesString.add("Броварський Назарій Ярославович");
        deputiesString.add("Броницький Роман Зіновійович");
        deputiesString.add("Вітульська Марія Іванівна");
        deputiesString.add("Городинський Михайло Мар'янович");
        deputiesString.add("Городиський Тарас Іванович");
        deputiesString.add("Грицай Роман Миколайович");
        deputiesString.add("Дацюк Олег Юрійович");
        deputiesString.add("Демко Тарас Іванович");
        deputiesString.add("Дзюрах Ірина Василівна");
        deputiesString.add("Жуковська Олена Генадіївна");
        deputiesString.add("Курчик Роман Михайлович");
        deputiesString.add("Куць Іван Миколайович");
        deputiesString.add("Кучма Тарас Ярославович");
        deputiesString.add("Кушлик Юрій Орестович");
        deputiesString.add("Лазарів Ігор Ярославович");
        deputiesString.add("Лужецький Мирослав Богданович");
        deputiesString.add("Майданюк Олег Євгенійович");
        deputiesString.add("Милян Юрій Михайлович");
        deputiesString.add("Муль Роман Миколайович");
        deputiesString.add("Настьошин Степан Євгенович");
        deputiesString.add("Оленич Сергій Романович");
        deputiesString.add("Петруняк Тарас Мирославович");
        deputiesString.add("Пристай Богдан Романович");
        deputiesString.add("Розлуцький Ігор Миколайович");
        deputiesString.add("Семенишин Зіновій Миронович");
        deputiesString.add("Скірко Орест Володимирович");
        deputiesString.add("Тюска Віктор Миколайович");
        deputiesString.add("Хрущ Олег Васильович");
        deputiesString.add("Шагала Роман Миколайович");
        deputiesString.add("Шевкенич Андрій Іванович");
        deputiesString.add("Шеремета Михайло Михайлович");
        deputiesString.add("Янів Андрій Євстахійович");
        deputiesString.add("Янів Олена Георгіївна");
        return sortDeputiesList(deputiesString);
    }

    @NotNull
    private List<String> sortDeputiesList(List<String> deputies){
        List<String> subList = deputies.subList(0, deputies.size());
        Collections.sort(subList);
        return subList.subList(0, subList.size());
    }

    public List<Deputy> getDeputies(){
        deputies.add(new Deputy(1001,
                                "Андрій",
                                "Васильович",
                                "Андрухів",
                                "Об'єднання \"Самопоміч\"",
                                "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Vasylovych.jpg"));
        deputies.add(new Deputy(1002,
                                "Олег",
                                "Богданович",
                                "Балог",
                                "Громадянська позиція",
                                "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Oleg-Balog.jpg"));
        deputies.add(new Deputy(1003,
                                "Володимир",
                                "Анатолійович",
                                "Бернадович",
                                "БПП \"Солідарність\"",
                                "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2016-06-08-o-09.33.29.png"));
        deputies.add(new Deputy(1004,
                                "Олена",
                                "Вікторівна",
                                "Бичковяк",
                                "Громадський рух \"Народний контроль\"",
                                "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Bychkovyak-Olena.jpg"));
        deputies.add(new Deputy(1005,
                                "Назарій",
                                "Ярославович",
                                "Броварський",
                                "БПП \"Солідарність\"",
                                "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Brovarskyj-nazar.jpg"));
        deputies.add(new Deputy(1006,
                                "Роман",
                                "Зіновійович",
                                "Броницький",
                                "Громадянська позиція",
                                "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2016-06-08-o-09.35.35.png"));
        deputies.add(new Deputy(1007,
                                "Марія",
                                "Іванівна",
                                "Вітульська",
                                "ВО \"Свобода\"",
                                "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/vitulska.jpg"));
        deputies.add(new Deputy(1008,
                                "Михайло",
                                "Мар'янович",
                                "Городинський",
                                "Громадський рух \"Народний контроль\"",
                                "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Gorodynskyj.jpg"));
        deputies.add(new Deputy(1009,
                                "Тарас",
                                "Іванович",
                                "Городиський",
                                "Громадський рух \"Народний контроль\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/11140010_520648338111841_2121099113220804826_n.jpg"));
        deputies.add(new Deputy(1010,
                                "Роман",
                                "Миколайович",
                                "Грицай",
                                "ВО \"Батьківщина\"",
                             "20.10.2015",
                               "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Roman-Grytsaj.jpg"));
        deputies.add(new Deputy(1011,
                                "Олег",
                                "Юрійович",
                                "Дацюк",
                                "ВО \"Батьківщина\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Datsyuk.jpg"));
        deputies.add(new Deputy(1012,
                                "Тарас",
                                "Іванович",
                                "Демко",
                                "Громадянська позиція",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Demko-Taras.jpg"));
        deputies.add(new Deputy(1013,
                                "Ірина",
                                "Василівна",
                                "Дзюрах",
                                "Громадський рух \"Народний контроль\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/P4590147.jpg"));
        deputies.add(new Deputy(1014,
                                "Олена",
                                "Генадіївна",
                                "Жуковська",
                                "Українське об’єднання патріотів - УКРОП",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/ZHukovska.jpg"));
        deputies.add(new Deputy(1015,
                                "Роман",
                                "Михайлович",
                                "Курчик",
                                "Народний Рух України",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Kurchyk.jpg"));
        deputies.add(new Deputy(1016,
                                "Іван",
                                "Миколайович",
                                "Куць",
                                "Громадський рух \"Народний контроль\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2016-06-08-o-09.31.49.png"));
        deputies.add(new Deputy(1017,
                                "Юрій",
                                "Орестович",
                                "Кушлик",
                                "Громадський рух \"Народний контроль\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2016-04-26-o-23.30.40.png"));
        deputies.add(new Deputy(1018,
                                "Ігор",
                                "Ярославович",
                                "Лазарів",
                                "Позафракційний",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/274900.png"));
        deputies.add(new Deputy(1019,
                                "Мирослав",
                                "Богданович",
                                "Лужецький",
                                "Позафракційний",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2017-09-06-o-09.55.29.png"));
        deputies.add(new Deputy(1020,
                                "Олег",
                                "Євгенійович",
                                "Майданюк",
                                "ВО \"Свобода\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/majdanyuk.jpg"));
        deputies.add(new Deputy(1021,
                                "Юрій",
                                "Михайлович",
                                "Милян",
                                "Українське об’єднання патріотів - УКРОП",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Mylyan.jpg"));
        deputies.add(new Deputy(1022,
                                "Роман",
                                "Миколайович",
                                "Муль",
                                "Об'єднання \"Самопоміч\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Mul.jpg"));
        deputies.add(new Deputy(1023,
                                "Степан",
                                "Євгенович",
                                "Настьошин",
                                "Об'єднання \"Самопоміч\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Nastoshyn.jpg"));
        deputies.add(new Deputy(1024,
                                "Сергій",
                                "Романович",
                                "Оленич",
                                "Об'єднання \"Самопоміч\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Olenych-S.R.-.jpg"));
        deputies.add(new Deputy(1025,
                                "Тарас",
                                "Мирославович",
                                "Петруняк",
                                "ВО \"Батьківщина\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2017-09-06-o-10.03.26.png"));
        deputies.add(new Deputy(1026,
                                "Богдан",
                                "Романович",
                                "Пристай",
                                "Позафракційний",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/image004.jpg"));
        deputies.add(new Deputy(1027,
                                "Ігор",
                                "Миколайович",
                                "Розлуцький",
                                "ВО \"Свобода\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/rozlutskyj.jpg"));
        deputies.add(new Deputy(1028,
                                "Зіновій",
                                "Миронович",
                                "Семенишин",
                                "Громадський рух \"Народний контроль\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Semanyshyn.jpg"));
        deputies.add(new Deputy(1029,
                                "Орест",
                                "Володимирович",
                                "Скірко",
                                "БПП \"Солідарність\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2016-06-08-o-09.49.18.png"));
        deputies.add(new Deputy(1030,
                                "Віктор",
                                "Миколайович",
                                "Тюска",
                                "Об'єднання \"Самопоміч\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Tyuska.jpg"));
        deputies.add(new Deputy(1031,
                                "Олег",
                                "Васильович",
                                "Хрущ",
                                "ВО \"Свобода\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/hrushh.jpg"));
        deputies.add(new Deputy(1032,
                                "Роман",
                                "Миколайович",
                                "Шагала",
                                "Народний Рух України",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/SHagala-Roman.jpg"));
        deputies.add(new Deputy(1033,
                                "Андрій",
                                "Іванович",
                                "Шевкенич",
                                "БПП \"Солідарність\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2016-06-08-o-09.50.35.png"));
        deputies.add(new Deputy(1034,
                                "Михайло",
                                "Михайлович",
                                "Шеремета",
                                "ВО \"Свобода\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/sheremeta.jpg"));
        deputies.add(new Deputy(1035,
                                "Андрій",
                                "Євстахійович",
                                "Янів",
                                "БПП \"Солідарність\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/YAniv-Andrij.jpg"));
        deputies.add(new Deputy(1036,
                                "Тарас",
                                "Ярославович",
                                "Кучма",
                                "Громадський рух \"Народний контроль\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/Znimok-ekrana-2016-04-17-o-20.27.10.png"));
        deputies.add(new Deputy(1037,
                                "Олена",
                                "Георгіївна",
                                "Янів",
                                "ВО \"Свобода\"",
                              "20.10.2015",
                                "20.10.2020",
                                "http://drohobych-rada.gov.ua/wp-content/uploads/2016/04/yaniv-olena.jpg"));
        return deputies;
    }
}
