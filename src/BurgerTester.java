public class BurgerTester {

    public static void main(String[] args) {

        BurgerTools.setMostPopTopping("Meat patty");
        BurgerTools.setAvDaysBeforeExp(5);
        BurgerTools.setAvtempWhenCooked(180);
        BurgerTools.setPopAddOns("Mayo, tomato, lettuce, cheese, pickles, avocado...");

        RestaurantDish eat = new RestaurantDish(40, "bacon slice", true);
        eat.eat();

        System.out.println("topping: " + BurgerTools.getMostPopTopping());
        System.out.println("Expires: " + BurgerTools.getAvDaysBeforeExp() + " days");
        System.out.println("Cook temp: " + BurgerTools.getAvtempWhenCooked() + " degrees F");
        System.out.println("Add ons!: " + BurgerTools.getPopAddOns());

        BurgerTools.grill();
        System.out.println(eat.eat());

    }
}
