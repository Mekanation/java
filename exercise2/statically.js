class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    static #glue = "Epoxy";
    jello = "Jello";

    getPrivateInstanceFieldGlue(){
        return Statically.#glue;
    }
    static moveAndShake() {
        console.log("Never stagnate in life.  Be agile, change, and improve...");
    }

    static stubborn() {

        this.moveAndShake();
        console.log("Please don't make me change... I just don't like it...");
    }

    static explain() {
        Statically.stubborn();
        console.log(this.#glue);
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
        console.log("Static makes things global in java. In JS it makes them global as well, and shared between all instances of the class. -variables. Static methods in java mean they dont need an object instance to call. whereas static methods in js need the ClASSNAME as the caller. I.e STATICALLY.DOMETHOD() ")
    }

}

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain() method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.

const stats = new Statically();

Statically.moveAndShake();
Statically.stubborn();
Statically.explain();

console.log(stats.getPrivateInstanceFieldGlue());
console.log(stats.jello);

//Once you have finished getting statistically.js to run, refactor the code here in Java.
