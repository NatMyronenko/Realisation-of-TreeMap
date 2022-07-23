package URLS;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> fullSite = Urls.createListOfAllUrl();

        Urls.normalizwURL(fullSite);

        HashMap<String, Integer> domainRepeat = Urls.sortingByKey(fullSite);


        Urls.print10Urls(domainRepeat);


    }
}
