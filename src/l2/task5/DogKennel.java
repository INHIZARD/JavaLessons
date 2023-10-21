package l2.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class DogKennel {
    private final ArrayList<Dog> dogs = new ArrayList<>();

    public void addDog(Dog... newDogs){
        dogs.addAll(Arrays.asList(newDogs));
    }

    @Override
    public String toString() {
        return "DogKennel{" +
                "dogs=" + dogs +
                '}';
    }
}
