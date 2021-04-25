package Test;

public class Apple extends Fruit{
    String name;
    public void eat(){
        super.eat(name);
    }
}
