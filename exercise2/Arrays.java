package exercise2;

class Arrays {
    //Take the arrays.js file, and refactor the code into Java in this file.
    int[] nums = {10,23,3,4,5,2,1};
    String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
    boolean[] binaries = {false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false};

    void printNums() {
        System.out.println(
                "binaries=" + java.util.Arrays.toString(nums) +
                        '}');
    };
    void printGreetings() {
        System.out.println(
                "binaries=" + java.util.Arrays.toString(greetings) +
                        '}');
    };
    void printBinaries() {
        System.out.println(
                "binaries=" + java.util.Arrays.toString(binaries) +
                '}');
    };

    @Override
    public String toString() {
        return "Arrays{" +
                "nums=" + java.util.Arrays.toString(nums) +
                ", greetings=" + java.util.Arrays.toString(greetings) +
                ", binaries=" + java.util.Arrays.toString(binaries) +
                '}';
    }

    public static void main(String[] args) {
       Arrays test = new Arrays();


        test.printNums();
        test.printGreetings();
        test.printBinaries();

    }
}







