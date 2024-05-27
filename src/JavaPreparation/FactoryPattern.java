package JavaPreparation;

import java.util.Scanner;

interface Food {
    String getType();
}

class Pizza implements Food {
    public Pizza() {
    }

    @Override
    public String getType() {

        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public Cake() {
    }

    @Override
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    Food getFood(String food) {
        if (food.equals("pizza")) return new Pizza();
        else return new Cake();

    }
}

public class FactoryPattern {
    public static void main(String[] args) {



            Scanner sc = new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();

            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());


            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());

    }
}

