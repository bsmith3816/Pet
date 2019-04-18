public class KennelRunner {
    public static void main(String[] args){
        Cat c = new Cat("bob1");
        Dog d = new Dog("bob2");
        LoudDog ld = new LoudDog("bob3");;
        Pet[] petArray = new Pet[3];
        petArray[0] = c;
        petArray[1] = d;
        petArray[2] = ld;

        Kennel k = new Kennel(petArray);
        k.allSpeak();
    }
}
