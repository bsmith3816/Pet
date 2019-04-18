public class LoudDog extends Dog {
    String myName;
    public LoudDog(String name){
        super(name);
    }
    public String speak(){
        return super.speak() + " " + super.speak();
    }
}
