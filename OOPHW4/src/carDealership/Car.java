package carDealership;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Car {
    int PlateNumber;
    int YearOfMake;
    String brand;
    double kilo;
    double price;

    public Car(int PlateNumber, int YearOfMake, String brand, double kilo, double price) throws IllegalArgumentException {
        try{
            if((Integer.toString(PlateNumber).length()) != 6){
                throw new Exception("The plate Number must be 6 digits");
            }else{
                this.PlateNumber = PlateNumber;
            }
            if(YearOfMake < 2017){
                throw new Exception("The YearOfMake must be 2017 and above");
            }else{
                this.YearOfMake = YearOfMake;
            }
            if(brand.length() == 0){
                throw new Exception("The brand cannot be empty");
            }else{
                this.brand = brand;
            }if(kilo < 0){
                throw new Exception("The kilo cannot be negative");
            }else{
                this.kilo = kilo;
            }if(price < 0){
                throw new Exception("The price cannot be negative");
            }else{
                this.price = price;
            }

        }catch(Exception e){
            System.out.println(e);
        }

    }

    public void depreciation(int num){
        try{
            if(num < 0){
                throw new Exception("num must be above 0%");
            }
            if((num * price / 100) > 5000){
                throw new Exception("The price depreceiation is too high");
            }else{
                double numToDecrease = num * price / 100;
                price -= numToDecrease;
            }
        }catch(Exception e){
            System.out.println(e);
        }


    }

    public void carSale() throws IOException {
        try{
            Path filePath = Paths.get("OOPHW4/src/carDealership/Sold.txt");

            Files.writeString(filePath,"\n", StandardOpenOption.APPEND);
            Files.writeString(filePath,toString(),StandardOpenOption.APPEND);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    public int getPlateNumber() {
        return PlateNumber;
    }

    public int getYearOfMake() {
        return YearOfMake;
    }

    public String getBrand() {
        return brand;
    }

    public double getKilo() {
        return kilo;
    }

    public double getPrice() {
        return price;
    }


    @Override
    public String toString() {
        return "PlateNumber: %d YearOfMake: %d Brand: %s Kilo: %f Price: %f".formatted(PlateNumber, YearOfMake, brand, kilo, price);
    }
}
