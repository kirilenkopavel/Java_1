package HomeWork_6;

public abstract class Animals implements InAnimals {
    protected String name;
    protected int limitRun;
    protected int limitSwim;
    private static int number = 0;

    public Animals(String name, int limitRun, int limitSwim) {
        this.name = name;
        this.limitRun = limitRun;
        this.limitSwim = limitSwim;
        number++;
    }

    public String run(int distance) {
        if (distance >= limitRun) {
            return name + " couldn't run " + distance;
        } else {
            return name + " successfully ran " + distance;
        }
    }

    @Override
    public String swim(int distance) {
        if (distance >= limitSwim) {
            return name + " couldn't swim " + distance;
        } else {
            return name + " successfully swim " + distance;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimitRun() {
        return limitRun;
    }

    public void setLimitRun(int limitRun) {
        this.limitRun = limitRun;
    }

    public int getSwimDistance() {
        return limitSwim;
    }

    public void setLimitSwim(int limitSwim) {
        this.limitSwim = limitSwim;
    }

    public static int getNumber() {
        return number;
    }

    public static void setNumber(int number) {
        Animals.number = number;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", limitRun=" + limitRun +
                ", limitSwim=" + limitSwim +
                '}';
    }
}
