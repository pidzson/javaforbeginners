package Beginner;

public class FirstClass {

    public static void main (String[] args){
        //static: the method belongs to this class
        //primitive variables
        byte numberOfSeats = 5;
        byte numberOfDoors = 3;
        byte numberOfVehicleOwners = 1;
        byte emissionSticker = 4;

        short kwPower = 362;
        short horsePower = 492;
        short co2Emission = 333;
        short cubicCapacity = 6417;

        int price = 29999;
        int mileage = 14999;

        long registrationNumber = 5122345683489671L;

        float fuelConsumptionCombined = 15.5F;
        float fuelConsumptionUrban = 21.4F;
        float fuelConsumptionExtraUrban = 13.6F;

        double fuelConsumptionPreciseAverage = 1.536483474e1;

        boolean isDamaged = true;

        char energyEfficiencyCategory = 'G';

        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price: €" + price);
        System.out.println("Mileage: " + mileage + " km");
        System.out.println("Damaged: " + isDamaged);
        System.out.println("Registration number: " + registrationNumber);
        System.out.println("Cubic capacity: " + cubicCapacity + " ccm");
        System.out.println("Power: " + kwPower + " kW," + horsePower + " HP");
        System.out.println("CO2 emission: " + co2Emission + " g/km" );
        System.out.println("Emission sticker: " + emissionSticker );
        System.out.println("Emission sticker: " + emissionSticker +
                           " (, Energy efficiency category: " + energyEfficiencyCategory);
        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Urban fuel consumption: " + fuelConsumptionUrban + " l/100km");
        System.out.println("Extra urban fuel consumption: " + fuelConsumptionExtraUrban + " l/100km");
        System.out.println("Number of previous owners: " + numberOfVehicleOwners);
        System.out.println("Number of doors: " + numberOfDoors);
        System.out.println("Number of seats: " + numberOfSeats);

        //conversions
        short newNumberOfSeats = numberOfSeats;
        double newFuelConsumptionCombined = fuelConsumptionCombined;
        //widening: automatic; narrowing needs a (cast)
        /* narrowing:
        byte newPower = (byte) power
        power val is 362, newPower value is 106 --> byte values can range from -128 to +127, value overflow
         */

        System.out.println(" The new values (seats, consumption): " + newNumberOfSeats + ", " + newFuelConsumptionCombined);


    }

}
