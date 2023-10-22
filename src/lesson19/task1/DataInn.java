package lesson19.task1;

import java.util.*;

public class DataInn {
    private static final int LENGTH = 12;
    private static final String[] NAMES = {
            "Иванов_Иван_Иванович",
            "Никитин_Никита_Никитович",
            "Александров_Александр_Александрович",
            "Егоров_Егор_Егорович",
            "Евграфов_Евграф_Евграфович",
            "Дмитров_Дмитрий_Дмитриевич"
    };

    private final Map<String, String> inn = new HashMap<>();

    DataInn() {
        String[] randomInn = new String[12];
        for (String name: NAMES) {
            for (int i = 0; i < LENGTH; i++) {
                randomInn[i] = String.valueOf((int) (Math.random() * 10));
            }
            inn.put(String.join("", randomInn), name);
        }
    }

    public Map<String, String> getInn() {
        return inn;
    }

    public String validInn(String userInn) throws DataInnException{
        if (inn.containsKey(userInn)) {
            return inn.get(userInn);
        }
        throw new DataInnException("Несуществующий ИНН");
    }

}
