package Abstract;

public class HuaweiPhone implements IphoneProduct{
  @Override
  public void star() {
    System.out.println("开启华为手机");
  }

  @Override
  public void shutoff() {
    System.out.println("关闭华为手机");
  }

  @Override
  public void callup() {
    System.out.println("华为手机打电话");
  }

  @Override
  public void sendSMS() {
    System.out.println("华为手机发信息");
  }
}
