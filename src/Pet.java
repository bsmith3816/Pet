public abstract class Pet {
    String myName;
    public Pet(String name){
        myName = name;
    }
    public String getName(){
        return myName;
    }
    public abstract String speak();

}
