import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter type of car : ");
        String typeOfCar = sc.next().toLowerCase();
        System.out.println("Enter service codes: ");
        sc.nextLine();
        String codesString = sc.nextLine().trim().toLowerCase();
        String[] codes = codesString.split(", ");

        Car car = null;
        if (typeOfCar.equals("hatchback")) {
            car = new HatchBack();
        } else if (typeOfCar.equals("sedan")) {
            car = new Sedan();
        } else {
            car = new SUV();
        }

        int total = 0;
        for (String code : codes) {
            switch (code) {
                case "bs01":
                    System.out.println("Charges for Basic Servicing - " + car.getBasicServicing());
                    total += car.getBasicServicing();
                    break;
                case "ef01":
                    System.out.println("Charges for Engine Fixing - " + car.getEngineFixing());
                    total += car.getEngineFixing();
                    break;
                case "cf01":
                    System.out.println("Charges for Clutch Fixing - " + car.getClutchFixing());
                    total += car.getClutchFixing();
                case "bf01":
                    System.out.println("Charges for Brake Fixing - " + car.getBrakeFixing());
                    total += car.getBrakeFixing();
                    break;
                default:
                    System.out.println("Charges for Gear Fixing - " + car.getGearFixing());
                    total += car.getGearFixing();
            }
        }

        if(total > 10000){
            System.out.println("Added a complementary cleaning : "+0);
        }

        System.out.println("Total Bill : " + total);
    }
}