package demo2;

public class Product {
  private String builderA = "汉堡";
  private String builderB = "可乐";
  private String builderC = "甜筒";
  private String builderD = "炸鸡";

  @Override
  public String toString() {
    return "Product{" +
        "builderA='" + builderA + '\'' +
        ", builderB='" + builderB + '\'' +
        ", builderC='" + builderC + '\'' +
        ", builderD='" + builderD + '\'' +
        '}';
  }

  public String getBuilderA() {
    return builderA;
  }

  public void setBuilderA(String builderA) {
    this.builderA = builderA;
  }

  public String getBuilderB() {
    return builderB;
  }

  public void setBuilderB(String builderB) {
    this.builderB = builderB;
  }

  public String getBuilderC() {
    return builderC;
  }

  public void setBuilderC(String builderC) {
    this.builderC = builderC;
  }

  public String getBuilderD() {
    return builderD;
  }

  public void setBuilderD(String builderD) {
    this.builderD = builderD;
  }


}
