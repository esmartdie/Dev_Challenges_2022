package challenge_36;

import java.awt.event.MouseAdapter;
import java.util.*;

public class SauronArmy {

    public SauronArmy(int southMenQuantity, int orcsQuantity, int goblinsQuantity,
                      int wargsQuantity, int trollsQuantity ) {

        sauronArmyMap = new HashMap<String, Integer>();
        sauronArmyMap.put("MEN",southMenQuantity );
        sauronArmyMap.put("ORCS",orcsQuantity );
        sauronArmyMap.put("GOBLINS",goblinsQuantity );
        sauronArmyMap.put("WARGS",wargsQuantity );
        sauronArmyMap.put("TROLLS",trollsQuantity );

    }
    public int getMEN() {
        return MEN;
    }

    public int getORCS() {
        return ORCS;
    }

    public int getGOBLINS() {
        return GOBLINS;
    }

    public int getWARGS() {
        return WARGS;
    }

    public int getTROLLS() {
        return TROLLS;
    }

    public Map<String, Integer> getSauronArmyMap() {
        return sauronArmyMap;
    }

    public int sauronArmyPower(Map<String, Integer> sauronArmyMap) {
        List<Integer> sauronArmyArray = new ArrayList<>();
        Set<String> keys = sauronArmyMap.keySet();

        for (String key : keys) {
            int quantity = sauronArmyMap.get(key);
            if ("MEN".equals(key)) {
                sauronArmyArray.add(quantity * MEN);
            } else if ("ORCS".equals(key)) {
                sauronArmyArray.add(quantity * ORCS);
            } else if ("GOBLINS".equals(key)) {
                sauronArmyArray.add(quantity * GOBLINS);
            } else if ("WARGS".equals(key)) {
                sauronArmyArray.add(quantity * WARGS);
            } else if ("TROLLS".equals(key)) {
                sauronArmyArray.add(quantity * TROLLS);
            }
        }
        int sauronArmyPower = 0;
        for (Integer e : sauronArmyArray){
            sauronArmyPower+=e;
        }

        return sauronArmyPower;
    }

    private Map<String, Integer> sauronArmyMap;
    private final int MEN = 2;
    private final int ORCS = 2;
    private final int GOBLINS = 2;
    private final int WARGS = 3;
    private final int TROLLS = 5;

}
