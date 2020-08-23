package pl.sdacademy.designpatterns.facade;

public class TriangleDrawer {

  public void draw(final int height) {
    if (height > 1) {
      for (int idx = 0; idx < height; idx++) {
        if (idx == 0) {
          System.out.println("*");
        } else if (idx != height - 1) {
          System.out.println("*" + " ".repeat(idx) + "*");
        } else {
          System.out.println("*".repeat(idx + 2));
        }
      }
    }
  }
}
