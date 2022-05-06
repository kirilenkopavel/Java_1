package HomeWork_6;

class Cat extends Animals {
    public Cat(String name, int limitRun, int limitSwim) {
        super(name, limitRun, limitSwim);
    }
    @Override
    public String swim(int distance) {
            return getName() + " can't swim";
    }
}
