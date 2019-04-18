public class Dog extends Pet{
    String myName;
    public Dog(String myName){
        super(myName);
    }
    public String speak(){
        return "Woof!";
    }
}
