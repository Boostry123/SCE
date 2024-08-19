package carDealership;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>{
    private String name;
    private int ID;
    private int sales;

    public Employee(String name, int ID, int sales) {
        try{
            for(int i =0; i < name.length(); i++){
                if(Character.isAlphabetic(name.charAt(i))){

                }else{
                    throw new Exception("Name must contain only Alphabetical characters.");
                }
            }
            this.name = name;
            if(Integer.toString(ID).length() != 9){
                throw new Exception("ID must contain 9 digits.");
            }else{
                this.ID = ID;
            }
            if(sales>= 0){
                this.sales = sales;
            }else{
                throw new Exception("Sales must be a positive or 0.");
            }

        }catch (Exception e){
            System.out.println(e);

        }
    }
    public void CarSale(Car car){
        sales++;
        try{
            Path filePath = Paths.get("OOPHW4/src/carDealership/Sold.txt");

            Files.writeString(filePath,"\n"+this, StandardOpenOption.APPEND);
            car.carSale();

            Path carsPath = Paths.get("OOPHW4/src/carDealership/CarDealership.txt");
            List<String> cars = Files.readAllLines(carsPath);

            ArrayList<String[]> carDetails = new ArrayList<>();
            for(String carLine : cars){
                carDetails.add(carLine.split(" "));
            }

            for(String[] plate : carDetails){
                if(plate[0].equals(Integer.toString(car.PlateNumber))){
                    carDetails.remove(plate);
                    break;
                }
            }
            Files.delete(carsPath);
            Files.createFile(carsPath);

            for(int j = 0; j < carDetails.size(); j++){
                for(int i = 0; i < carDetails.get(0).length;i++){
                    Files.writeString(carsPath, carDetails.get(j)[i]+" ",StandardOpenOption.APPEND);
                }
                Files.writeString(carsPath,"\n", StandardOpenOption.APPEND);
            }

        }catch (Exception e){
            System.out.println(e);
        }


    }
    public double salary(){
        return 6000 + 100 * sales;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public int getSales() {
        return sales;
    }

    @Override
    public int compareTo(Employee other) {
        if(this.sales > other.sales){
            return 1;
        }else if(this.sales < other.sales){
            return -1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "name: " + name + ", ID: " + ID + ", sales: " + sales + ", Salary:" +salary();
    }
}
