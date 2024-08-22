//Assignment : 4
//Author : Yanir latyshev
package carDealership;

import java.io.File;
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

    /**
     * constructor for a new employee
     * @param name
     * @param ID
     * @param sales
     */
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

    /**
     * car sale will get the available cars from the CarDealership file and update it accordingly, aswell for the Employee file,
     * employee will recive a sale if everything goes right(all info was inputted correctly).
     * @param car
     */
    public void CarSale(Car car){
        sales++;
        try{
            Path filePath = Paths.get("OOPHW4/src/carDealership/Sold.txt");

            Files.writeString(filePath,this+"\n", StandardOpenOption.APPEND);
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

    /**
     * @return calculated salary with bonuses.
     */
    public double salary(){
        return 6000 + 100 * sales;
    }

    /**
     * getName
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @return Sales
     */
    public int getSales() {
        return sales;
    }

    /**
     * @param other the object to be compared.
     * @return -1 if current employee has less sales than other, 0 if same sales count, 1 if current employee has more than other.
     */
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

    /**
     * @return toString
     */
    @Override
    public String toString() {
        return "name: " + name + ", ID: " + ID + ", sales: " + sales + ", Salary:" +salary();
    }
}
