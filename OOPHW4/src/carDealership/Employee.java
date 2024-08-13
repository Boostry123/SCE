package carDealership;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

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
    public void CarSale(Car car,String path){
        sales++;
        try{
            Path filePath = Paths.get(path);
            Files.writeString(filePath,toString(), StandardOpenOption.APPEND);
            car.carSale();
        }catch (Exception e){
            System.out.println(e);
        }


    }
    public double salary(){
        return 6000 + 100 * sales;
    }

    @Override
    public String toString() {
        return "name: " + name + ", ID: " + ID + ", sales: " + sales + ", Salary:" +salary();
    }
}
