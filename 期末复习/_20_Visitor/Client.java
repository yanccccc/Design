public class Client {
  public static void main(String[] args) {
    Product b1 = new Book();
    Product b2 = new Book();
    Product a1 = new Apple();
    Visitor visitor;

    BuyBasket basket = new BuyBasket();
    basket.addProduct(b1);
    basket.addProduct(b2);
    basket.addProduct(a1);
    visitor = (Visitor)new Customer();
    visitor.setName("张三");
    basket.accept(visitor);
  }
}
