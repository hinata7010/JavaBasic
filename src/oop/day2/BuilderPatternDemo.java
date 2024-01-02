package oop.day2;

public class BuilderPatternDemo {

    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showitems();
        System.out.println("Total Cost : " + vegMeal.getCost());

        Meal chickenMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nVeg Meal");
        chickenMeal.showitems();
        System.out.println("Total Cost : " + chickenMeal.getCost());
    }
}
