package HomeWork_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return " " +
                food +
                " ";
    }

    boolean decreaseFood(int portion) {
        if (food < portion) {
            return false;
        }
        this.food -= portion;
        return true;
    }

    void increaseFood(int add) {
        this.food += add;
    }
}
