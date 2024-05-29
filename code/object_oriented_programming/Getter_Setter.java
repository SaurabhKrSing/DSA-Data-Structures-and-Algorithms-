public class Getter_Setter {
  public static void main(String[] args) {

  }
}

class Pen {
  String color;
  int price;
  int tip;
  int size;

  void setColor(String newColor) {
    color = newColor;
  }

  void setPrice(int newPrice) {
    price = newPrice;
  }

  void setTip(int newTip) {
    tip = newTip;
  }

  void setSize(int newSize) {
    size = newSize;
  }

  public String getColor() {
    return this.color;
  }

  public int getPrice() {
    return this.price;
  }

  public int getTip() {
    return this.tip;
  }

  public int getSize() {
    return this.size;
  }

}
