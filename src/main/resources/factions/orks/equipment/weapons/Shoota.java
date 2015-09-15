package main.resources.factions.orks.equipment.weapons;

/**
 * Created by lars on 15.09.2015.
 */
public class Shoota extends Weapon_Master {
    public static final String TYPE = "Assault 2";
    public static final int ARMOURPIERCING = 6;
    public static final int STRENGTH = 4;
    public static final int RANGE = 18;

    public Shoota() {
    }

    public static String getTYPE() {
        return TYPE;
    }

    public static int getARMOURPIERCING() {
        return ARMOURPIERCING;
    }

    public static int getSTRENGTH() {
        return STRENGTH;
    }

    public static int getRANGE() {
        return RANGE;
    }
}
