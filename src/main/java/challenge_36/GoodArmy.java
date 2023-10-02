package challenge_36;

import java.util.*;

public class GoodArmy {

    public GoodArmy(int hobbitsQuantity, int menQuantity,
                    int dwarvesQuantity, int numenoreansQuantity, int elvesQuantity) {

        goodArmyMap = new HashMap<>();
        goodArmyMap.put("HOBBITS", hobbitsQuantity);
        goodArmyMap.put("MEN", menQuantity);
        goodArmyMap.put("DWARVES", dwarvesQuantity);
        goodArmyMap.put("NUMENOREANS", numenoreansQuantity);
        goodArmyMap.put("ELVES", elvesQuantity);
    }

    public int getHobbits() {
        return HOBBITS;
    }

    public int getMen() {
        return MEN;
    }

    public int getDwarves() {
        return DWARVES;
    }

    public int getNumenoreans() {
        return NUMENOREANS;
    }

    public int getElves() {
        return ELVES;
    }

    public Map<String, Integer> getGoodArmyMap() {
        return goodArmyMap;
    }

    public int goodArmyPower(Map<String, Integer> goodArmyMap) {
        List<Integer> goodArmyArray = new ArrayList<>();
        Set<String> keys = goodArmyMap.keySet();

        for (String key : keys) {
            int quantity = goodArmyMap.get(key);
            if ("HOBBITS".equals(key)) {
                goodArmyArray.add(quantity * HOBBITS);
            } else if ("MEN".equals(key)) {
                goodArmyArray.add(quantity * MEN);
            } else if ("DWARVES".equals(key)) {
                goodArmyArray.add(quantity * DWARVES);
            } else if ("NUMENOREANS".equals(key)) {
                goodArmyArray.add(quantity * NUMENOREANS);
            } else if ("ELVES".equals(key)) {
                goodArmyArray.add(quantity * ELVES);
            }
        }

        int goodArmyPower = 0;
        for (Integer e : goodArmyArray){
            goodArmyPower+=e;
        }

        return goodArmyPower;
    }

    private Map<String, Integer> goodArmyMap;
    private final int HOBBITS = 1;
    private final int MEN = 2;
    private final int DWARVES = 3;
    private final int NUMENOREANS = 4;
    private final int ELVES = 5;
}
