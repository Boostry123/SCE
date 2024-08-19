package carDealership;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CarDealership {
    public static void main(String[] args) {
        Path sold = Paths.get("Sold");
        Path CarDealerShip = Paths.get("OOPHW4/src/carDealership/CarDealership.txt");

        Path EmployeePath = Paths.get("OOPHW4/src/carDealership/Employee.txt");

        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Employee> employees = new ArrayList<>();
        try{
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(CarDealerShip);
            for (String line : lines){
                String[] words = line.split(" ");
                Car car = new Car(Integer.parseInt((words[0])),Integer.parseInt(words[1]),words[2],Double.parseDouble(words[3]),Double.parseDouble(words[4]));
                if((Integer.toString(car.getPlateNumber())).length() != 6 || car.getYearOfMake() < 2017 || car.getBrand().length() < 0 || car.getKilo() < 0 || car.getPrice() < 0){

                }else{
                    cars.add(car);
                }

            }
        }catch (IOException e){
            System.out.println(e);
        }
        try{
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(EmployeePath);
            for (String line : lines){
                String[] words = line.split(" ");
                Employee employee = new Employee(words[0], Integer.parseInt(words[1]), Integer.parseInt(words[2]));
                if(employee.getName().length() < 0 || Integer.toString(employee.getID()).length() != 9 ){

                }else{
                    employees.add(employee);
                }

            }

        }catch (IOException e){
            System.out.println(e);
        }
        Scanner scanner = new Scanner(System.in);
        int userChoice = 0;

    while (userChoice != 5) {
        System.out.println("Enter your choice from the list : \n");
        for(Menu option : Menu.values()){
            System.out.println(option);
        }
        userChoice = scanner.nextInt();


        switch (userChoice) {
            //1st display the employees
            case 1:
                for(Employee employee : sort(employees)){
                    System.out.println(employee);

                }
                break;
                //2nd display the current available
            case 2:
                for(Car car : cars){
                    System.out.println(car);

                }
                break;
                //3rd  case user will be choosing an employee and choosing a car to sell, car will be then removed from the CarDealership file and from array, seller will recive a sale.
            case 3:
                //Here we make two arrays that contains the Ids and PlateNumbers.
                ArrayList<Integer> ids = new ArrayList<>();
                ArrayList<Integer> carPlateNumbers = new ArrayList<>();
                for(Employee employee : employees){
                    ids.add(employee.getID());
                }
                for(Car car : cars) {
                    carPlateNumbers.add(car.getPlateNumber());
                }
                //printing out the list of sellers.
                for(Employee employee : sort(employees)){
                    System.out.println(employee.getName() + employee.getID());
                }
                //choosing a seller.
                int sellerID;
                while(true){
                    System.out.println("choose a Seller by ID: ");
                     sellerID = scanner.nextInt();
                    if(ids.contains(sellerID)){
                        break;
                    }else{
                        System.out.println("Wrong ID , try again: ");
                    }
                }
                //printing out carPlateNumbers.
                for(Car car : cars){
                    System.out.println(car.toString());
                }
                //choosing a car to sell.
                int carPlateNumber;
                while(true){
                    System.out.println("choose Car plate Number: ");
                    carPlateNumber = scanner.nextInt();
                    if(carPlateNumbers.contains(carPlateNumber)){
                        break;
                    }else{
                        System.out.println("Wrong Car number , try again: ");
                    }

                }
                //Finding the chosen employee and Car
                Car ChosenCar=null;
                Employee ChosenEmployee=null;
                for(Employee employee : employees){
                    if(employee.getID() == sellerID){
                        ChosenEmployee = employee;
                    }
                }
                for(Car car : cars){
                    if(car.getPlateNumber() == carPlateNumber){
                        ChosenCar = car;
                    }
                }
                cars.remove(ChosenCar);
                ChosenEmployee.CarSale(ChosenCar);



            //4th case user will be adding a new car to the CarDealership file and you the list, Exception will be thorwn if a missmatch happens in the info provided by user.
            case 4:
                try {
                    System.out.println("Adding a new car:");
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter Car Number (6 digits): ");
                    String carNumber = sc.nextLine();
                    if (carNumber.length() != 6) {
                        throw new InputMismatchException("Car number should be 6 digits");
                    }
                    System.out.println("Enter Year of make(2017 - current year: ");
                    int yearOfMake = sc.nextInt();
                    if (yearOfMake < 2017) {
                        throw new InputMismatchException("Year of make should be 2017 or higher");
                    }
                    System.out.println("Enter Brand: ");
                    String brand = sc.nextLine();
                    if (brand.length() < 0) {
                        throw new InputMismatchException("Brand cannot be empty");
                    }
                    System.out.println("Enter Mileage: ");
                    double mileage = sc.nextDouble();
                    if (mileage < 0) {
                        throw new InputMismatchException("Mileage cannot be negative");
                    }
                    System.out.println("Enter price: ");
                    double price = sc.nextDouble();
                    if (price < 0) {
                        throw new InputMismatchException("Price cannot be negative");
                    }
                }catch (InputMismatchException e){
                    System.out.println(e);
                    break;
                }

            case 5:
                break;
            default:scanner.close();
        }
    }



    }
    public static <E extends Comparable<E>> ArrayList<E> sort(ArrayList<E> list) {
        for(int j = 0; j < list.size(); j++) {
            for(int i = 0 ; i < list.size()-1 ; i++){
                if(list.get(i).compareTo(list.get(i+1)) == -1){
                    E temp = list.get(i);
                    list.set(i,list.get(i+1));
                    list.set(i+1,temp);
                }
            }
        }
        return list;

    }
}
