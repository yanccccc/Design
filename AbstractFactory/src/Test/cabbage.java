package Test;

public class cabbage extends Vegetables{
    String name;
    public void getname(String name){
        this.name = name;
    }
    public void eat(){

        super.eat(name);
    }
}
