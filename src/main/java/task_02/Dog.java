package task_02;

import java.util.Objects;

public class Dog {

    private final double weight;

    public Dog(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Double.compare(weight, dog.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(weight);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "weight=" + weight +
                '}';
    }
}
