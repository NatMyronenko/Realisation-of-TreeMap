package URLS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Urls2 {
    public static ArrayList<String> createListOfAllUrl() throws FileNotFoundException {
        // Здесь считываю сканером файл и использую Exception с описанием.
        File file = new File("C:\\Users\\USER\\urls.txt");
        Scanner in = null;
        try {
            in = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("It is not possible to read the file, " +
                    "the path to the file is incorrect or the file is missing!");
        }

        // Здесь добавляю строки из файла "в виде стринги" в List.
        List<String> fullSite = new ArrayList<>();
        do {
            assert in != null;
            if (!in.hasNextLine()) break;
            fullSite.add(in.nextLine());
        } while (true);

        return (ArrayList<String>) fullSite;
    }

    public static void normalizwURL(ArrayList<String> fullSite) {
        // Здесь разделяю каждую строку на части, используя в качестве разделителя метод split
        // и избавляюсь от "www." и "m.".
        for (int i = 0; i < fullSite.size(); i++) {
            String shortDomain = fullSite.get(i).split("/")[0];
            if (shortDomain.startsWith("m.")) {
                shortDomain = shortDomain.substring(2);
            } else if (shortDomain.startsWith("www.")) {
                shortDomain = shortDomain.substring(4);
            }
            fullSite.set(i, shortDomain);
        }
    }

    public static HashMap<String, Integer> sortingByKey(ArrayList<String> fullSite) {

        // Здесь я создаю Мар, в которой ключом является домен,
        // а "значением" - количество его упоминаний в файле (для дальнейшей сортировки по "значению").
        HashMap<String, Integer> domainRepeat = new HashMap<>();
        for (int i = 0; i < fullSite.size(); i++) {
            String key = String.valueOf(fullSite.get(i));
            if (!domainRepeat.containsKey(key)) {
                domainRepeat.put(key, 1);
            } else {
                int n = domainRepeat.get(key);
                domainRepeat.replace(key, n + 1);
            }
        }

        return domainRepeat;
    }

    public static void print10Urls(HashMap<String, Integer> domainRepeat) {
        // Здесь производится вывод 10-ти самых часто встречающихся доменов в консоль,
        // решение взято на ru.stackoverflow.com
        domainRepeat.entrySet().stream().sorted(HashMap.Entry.<String, Integer>comparingByValue().reversed())
                .limit(10).forEach(System.out::println);
    }
}
