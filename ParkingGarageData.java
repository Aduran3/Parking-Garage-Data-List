// Parking garage data

import java.io.*;
import java.util.*;

class Vehicle {
    String name;
    String manufacturer;
    String plateNumber;
    int parkedTime;
    String position;

    Vehicle(String name, String manufacturer, String plateNumber, int parkedTime, String position) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.plateNumber = plateNumber;
        this.parkedTime = parkedTime;
        this.position = position;
    }

    String getName() {
        return name;
    }

    String getManufacturer() {
        return manufacturer;
    }

    String getPlateNumber() {
        return plateNumber;
    }

    int getParkedTime() {
        return parkedTime;
    }

    String getPosition() {
        return position;
    }
}

public class scratch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vehicle[][] vehicle = new Vehicle[10][10];

        int temp = 0;
        while(temp < 100) {
            String name, manufac, plate, position, exitYes;
            int timeParked;

            System.out.println("===================================");
            System.out.println("Vehicle");
            System.out.println("===================================");
            System.out.print("Name: ");
            name = input.nextLine();
            System.out.print("Manufacturer: ");
            manufac = input.nextLine();
            System.out.print("Plate Number: ");
            plate= input.nextLine();
            System.out.print("Parked Time: ");
            timeParked = input.nextInt(); input.nextLine();
            System.out.print("Position: ");
            position = input.nextLine();

            char row = position.charAt(0);
            int column = Integer.parseInt(position.substring(1));
            vehicle[row-'A'][column] = new Vehicle(name, manufac, plate, timeParked, position);
            temp++;

            System.out.println("===================================");
            System.out.println("List");
            System.out.println("===================================");
            for(int i = 0; i < 10; i++) {
                for(int j = 0; j< 10; j++) {
                    if(vehicle[i][j] == null)
                        continue;
                    System.out.println(vehicle[i][j].getName()+" "+vehicle[i][j].getPlateNumber()+" "+vehicle[i][j].getParkedTime()+" "+vehicle[i][j].getPosition());
                }
            }


            System.out.println(">>> ");
            System.out.print("Exit (yes|y): ");
            exitYes = input.nextLine();

            if (exitYes.equals("yes")|exitYes.equals("y")) {
                System.exit(0);
            }
        }
    }
}