//Assignment : 4
//Author : Yanir latyshev
package carDealership;

public enum Menu {
    EMPLOYEES_LIST("1. הצגת רשימת העובדים בסוכנות") , CARS_NOT_SOLD("2.הצגת הרכבים בסוכנות שטרם נמכרו") , SELL_CAR("3.מכירת רכב") , ADD_CAR("4.הוספת רכב לסוכנות") , END("5.סיום התוכנית");

    private String option;
     Menu(String option){
        this.option = option;

    }

    @Override
    public String toString() {

         return option;
    }
}


