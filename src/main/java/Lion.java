public class Lion extends Animal { // extends allows the class to become a child class of another class in this case Animal

    private boolean canWaitToBeKing;

    public Lion(String name, boolean canWaitToBeKing) {
        super(name); // add super to child constructor to inherit parent class. Inheritence "is a" relationship. Super call has to come first
        this.canWaitToBeKing = canWaitToBeKing;
    }

    @Override // the annotation Override is optional but keep it as it allows you to see a polymorphic method
    public String makeNoise(){
        return "ROAR!";
    }
}
