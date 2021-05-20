package ThirdTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> fruits;

    public Box(T... fruits) {
        this.fruits = new ArrayList<T>();
    }

    public float getWeight() {
       float boxWeight = 0;
       for (T fruit : fruits) {
           boxWeight += fruit.getWeight();
       }
       return boxWeight;
    }

    public boolean compare(Box<?> anotherBox){
        return this.getWeight() == anotherBox.getWeight();
    }

    public void add(T... fruits){
    this.fruits.addAll(Arrays.asList(fruits));
    }

    public void toAnotherBox(Box<T> anotherBox){
        anotherBox.fruits.clear();
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }


}
