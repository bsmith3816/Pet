import java.util.ArrayList;

public class Kennel {
    ArrayList<Pet> arr;
    public Kennel(Pet[] petArray){
        arr = new ArrayList<Pet>();
        for(Pet x: petArray){
            arr.add(x);
        }
    }
    public void allSpeak(){
        for(Pet x: arr){
            System.out.println(x.getName() + " " + x.speak());
        }
    }
}
