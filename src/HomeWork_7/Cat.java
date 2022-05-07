package HomeWork_7;

public class Cat {
    private String name;
    private int appetit;
    private boolean fullnes;

    public Cat(String name, int appetit, boolean fullnes) {
        this.name = name;
        this.appetit = appetit;
        fullnes = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetit() {
        return appetit;
    }

    public void setAppetit(int appetit) {
        this.appetit = appetit;
    }

    public boolean isFullnes() {
        return fullnes;
    }

    public void setFullnes(boolean fullnes) {
        this.fullnes = fullnes;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", appetit=" + appetit +
                ", fullnes=" + fullnes +
                '}';
    }

    void eat(Plate plate) {
        if(!fullnes) {
            fullnes = plate.decreaseFood(appetit);
        }
    }


}
