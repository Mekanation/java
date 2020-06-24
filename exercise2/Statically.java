package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
    private static String glue = "epoxy";
    public String jello = "Jello";

    public static String getGlue() {
        return glue;
    }

    private static void moveAndShake(){
        System.out.println("Never stagnate in life. Be agile, change, and improve...");
    }

    private static void stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");

    }

    private static void explain(){
        stubborn();
        System.out.println(getGlue());
        System.out.println("Static makes things global in java. In JS it makes them global as well, and shared between all instances of the class. -variables. Static methods in java mean they dont need an object instance to call. whereas static methods in js need the ClASSNAME as the caller. I.e STATICALLY.DOMETHOD() \"");
    }

    public static void main(String[] args) {
        Statically stats = new Statically();
        moveAndShake();
        stubborn();
        explain();
        System.out.println(getGlue());
        System.out.println(stats.jello);
    }


}
