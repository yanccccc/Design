package Test;

public class tomato extends Vegetables{
    String name;
    public void getname(String name){
        this.name = name;
    }
    public void eat(){

        super.eat(name);
    }
}
