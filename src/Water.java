public class Water extends Pokemon{

    private int defencePower;
    private boolean hasTrainer;

    public Water(String name, String type, int level, int defencePower, boolean hasTrainer) {
        super(name, type, level);
        this.defencePower = defencePower;
        this.hasTrainer = hasTrainer;

    }

    public int getDefencePower() {
        return defencePower;
    }

    public void setDefencePower(int defencePower) {
        this.defencePower = defencePower;
    }

    public boolean isHasTrainer() {
        return hasTrainer;
    }

    public void setHasTrainer(boolean hasTrainer) {
        this.hasTrainer = hasTrainer;
    }

    @Override
    public void attackMove() {
        System.out.println(getName() + " wants to attack");
    }
}
