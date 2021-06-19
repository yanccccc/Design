public class ForcumAccount {
  private AbstractState state;
  private String name;

  public AbstractState getState() {
    return state;
  }

  public void setState(AbstractState state) {
    this.state = state;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ForcumAccount(String name) {
    this.name = name;
    this.state = new PrimaryState(this);
    System.out.println(this.name + "注册成功!");
    System.out.println("===========================");
  }

  public void downloadFile(int score){
    state.downloadFile(score);
  }

  public void writeNote(int score){
    state.writeNote(score);
  }

  public void replyNote(int score) {
    state.replyNote(score);
  }
}
