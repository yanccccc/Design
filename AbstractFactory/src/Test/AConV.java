package Test;

public class AConV implements AFruitAndVegetables{
    @Override
    public Fruit CreateF() {

        return null;
    }

    @Override
    public Vegetables CreatV() {
        cabbage cabbage = new cabbage();
        cabbage.name = "cabbage";
        return cabbage;
    }
}
