package Beginner;

public class ObjectReferenceApp {
    public static void main(String[] args) {
        Byte numberOfSeats = 5;
        Short horsePower = 492;
        Integer price = 29999;
        Long registrationNumber = 5122345683489671L;

        Float fuelConsumptionCombined = 15.5F;
        Double fuelConsumptionPreciseAverage = 1.536483474e1;

        Boolean isDamaged = true;

        Character energyEfficiencyCategory = 'G';

        String carModel = "Dodge Challenger SRT 392";
        String carModelNew = new String("Dodge Challenger SRT 392");

        System.out.println("Number of seats: " + numberOfSeats);
        System.out.println("Power: " + horsePower + " HP");
        System.out.println("Price: €" + price.floatValue());
        System.out.println("Registration number: " + registrationNumber);

        System.out.println("Combined fuel consumption: " + fuelConsumptionCombined + " l/100km");
        System.out.println("Precise average fuel consumption: " + fuelConsumptionPreciseAverage.intValue() + " l/100km");

        System.out.println("Damaged: " + isDamaged);
        System.out.println("Energy efficiency category: " + energyEfficiencyCategory);

        System.out.println("Car model: " + carModel);
        System.out.println("Car model with uppercase: " + carModel.toUpperCase());
        System.out.println("Car model with lowercase: " + carModel.toLowerCase());
        System.out.println("Car model with new keyword: " + carModelNew);
        System.out.println("Are car model with new keyword & car model equals?: " + carModelNew.equals(carModel));


    }
}
