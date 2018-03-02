public class RestaurantTest {

    public static void main(String[] args) {

        RestaurantDish dish = new RestaurantDish(95, "bean and cheese", true);

        RestaurantDish dishconstructor = new RestaurantDish(70, "potato and egg", true);

        System.out.println("Cost: " + dish.getCostInCents() + " " + "Dish Name: " + dish.getNameOfDish()+ " " + "Recommend? " + dish.getWouldRecommend());
        System.out.println("Cost: " + dishconstructor.getCostInCents() + " " + "Dish Name: " + dishconstructor.getNameOfDish()+ " " + "Recommend? " +
                dishconstructor.getWouldRecommend());
        System.out.println(dish.eat());

    }

}
