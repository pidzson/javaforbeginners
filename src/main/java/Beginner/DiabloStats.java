package Beginner;

public class DiabloStats {

    public static void main (String[] args){
        //Setting: my favorite demon hunter character's main stats from Diablo 3
        /*using this opportunity to hiss at Blizzard for disabling your online character profiles
        and having to copy everything off of the tiny Nintendo screen like a pedestrian >:( */

        /*
        //Basic info
        String characterName = "Namira";
        String characterClass = "Demon Hunter";
        String serverRegion = "EU";
        boolean seasonalCharacter = false;
         */

        //Damage
        double damagePerSecond = 1943790.5;
        double attacksPerSecond = 2.17;
        short criticalHitChance = 100; //%
        short criticalHitDamage = 511; //%
        short areaDamage = 38; //%
        short cooldownReduction = 7; //%

        //Sustainability
        int armorValue = 14820;
        double healPerSecond = 18882.02;
        int maxLife = 578804;
        int maxResource = 222;
        double resourceCostReduction = 16.34; //%

        //Base stats
        int strengthPoints = 77;
        int dexterityPoints = 8621;
        int intelligencePoints = 77;

        //XP
        short level = 70;
        int paragonLevel = 354;
        long totalExperience = 382046607L;
        double experiencePerKill = 459.00;

        //Currencies
        long goldAmount = 267958588L;
        int bloodShards = 143; //max: 1100

        System.out.println("Character statistics:");
        System.out.println("DPS: " + damagePerSecond);
        System.out.println("Hits per second: " + attacksPerSecond);
        System.out.println("Critical modifiers: Damage: " + criticalHitDamage + "%, Chance: " + criticalHitChance + "%");
        System.out.println("Area damage modifier: " + areaDamage + "%");
        System.out.println("Cooldown reduction: " + cooldownReduction + "%");
        System.out.println("Max healthpool: " + maxLife);
        System.out.println("Health regen per second: " + healPerSecond);
        System.out.println("Armor value: " + armorValue);
        System.out.println("Max spellcasting resource reserve: " + maxResource +
                           ", cost reduction: " + resourceCostReduction + "%");
        System.out.println("Base stats: " + "INT: " + intelligencePoints + ", STR: " + strengthPoints + ", DEX: " + dexterityPoints);
        System.out.println("Total experience: " + totalExperience + "(XP per kill: " + experiencePerKill +")");
        System.out.println("Levels: Character: " + level + ", Paragon: " + paragonLevel);
        System.out.println("Currency collected: " + goldAmount + " gold, " + bloodShards + " blood shards");


    }
}
