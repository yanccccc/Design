package Test;

public class BConf implements BFruitAndVegetables{
    @Override
    public Fruit CreateF() {
        Apple apple = new Apple();
        apple.name = "apple";
        return apple;
    }

    @Override
    public Vegetables CreatV() {
        return null;
    }
}
