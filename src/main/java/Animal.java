public abstract class Animal { // abstract means it exists, but you cannot create a new animal object anymore.
    // abstract means you cannot instantiate it.

    protected String name; // only the class and sub classes can access it indicated by
    //String type; Delete as we are creating the animal child classes so they dont need type anymore.

    public Animal(String name){
        this.name = name;
    }

    public String makeNoise(){
        //  you can access the variables of the parent class when you make variables in the parent class
        // protected.
     return "Hello, my name is " + this.name + ".";
    }

    public String eat(){
        return "Mmm, that was tasty!";
    }

}
