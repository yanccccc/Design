public abstract class Member {
  protected AbstractChatroom abstractChatroom;
  protected String name;

  public Member(String name) {
    this.name = name;
  }

  public AbstractChatroom getAbstractChatroom() {
    return abstractChatroom;
  }

  public void setAbstractChatroom(AbstractChatroom abstractChatroom) {
    this.abstractChatroom = abstractChatroom;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public abstract void sendText(String to,String message);
  public abstract void sendImage(String to,String image);

  public void receiveText(String from,String message) {
    System.out.println(from+" 发送文本给 "+this.name+",内容为:"+message);
  }

  public void receiveImage(String from,String image) {
    System.out.println(from+" 发送图片给 "+this.name+",内容为:"+image);
  }
}
