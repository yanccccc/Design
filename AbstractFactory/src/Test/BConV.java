package Test;

public class BConV implements BFruitAndVegetables{
    @Override
    public Fruit CreateF() {

        return null;
    }

    @Override
    public Vegetables CreatV() {
        tomato tomato = new tomato();
        tomato.name = "tomato";
        return tomato;
    }
}
