public class Parrot extends Bird{

    public Parrot(String name){
        super(name);
    }

    @Override
    public String makeNoise(){
        return "Squawk!";
    }

    public String sayName(){
        // need to add super instead of this to access the private variables in parent class
        return "My name is " + super.name +".";
    }
}
