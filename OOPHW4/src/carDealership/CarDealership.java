package carDealership;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class CarDealership {
    public static void main(String[] args) {
        Path sold = Paths.get("carDealership/Sold.txt");
        Path CarDealerShip = Paths.get("carDealership/CarDealerShip.txt");
        Path EmployeePath = Paths.get("carDealership/Employee.txt");
        ArrayList<Car> cars = new ArrayList<>();
        try{
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(CarDealerShip);
            for (String line : lines){
                String[] words = line.split(" ");
                Car car = new Car(Integer.parseInt((words[0])),Integer.parseInt(words[1]),words[2],Double.parseDouble(words[3]),Double.parseDouble(words[4]));
            }

        }catch (IOException e){
            System.out.println(e);
        }
        try{
            ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(EmployeePath);
            for (String line : lines){
                String[] words = line.split(" ");
                Employee Employee = new Employee(words[0], Integer.parseInt(words[1]), Integer.parseInt(words[2]));
            }

        }catch (IOException e){
            System.out.println(e);
        }




    }
    public static <E> ArrayList<E> sort(ArrayList<E> list) {
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
