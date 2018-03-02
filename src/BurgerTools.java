public class BurgerTools {

    private static String mostPopTopping;
    private static int AvDaysBeforeExp ;
    private static int AvtempWhenCooked;
    private static String popAddOns;

    public static void grill() {
        System.out.println("Grilling burger..");

    }

    public static void setMostPopTopping(String mostPopTopping) {
        BurgerTools.mostPopTopping = mostPopTopping;
    }

    public static void setAvtempWhenCooked(int AvtempWhenCooked) {
        BurgerTools.AvtempWhenCooked = AvtempWhenCooked;
    }

    public static int getAvtempWhenCooked() {
        return AvtempWhenCooked;
    }

    public static void setAvDaysBeforeExp(int avDaysBeforeExp) {
        AvDaysBeforeExp = avDaysBeforeExp;
    }

    public static int getAvDaysBeforeExp() {
        return AvDaysBeforeExp;
    }

    public static String getMostPopTopping() {
        return mostPopTopping;
    }

    public static String getPopAddOns() {
        return popAddOns;
    }

    public static void setPopAddOns(String popAddOns) {
        BurgerTools.popAddOns = popAddOns;
    }
}
