package pl.sdacademy.designpatterns.facade;

//SOLID - D - dependency inversion
public class DrawingFacade {

  private final CircleDrawer circleDrawer;
  private final SquareDrawer squareDrawer;
  private final TriangleDrawer triangleDrawer;

  // źle! BARDZO źle!
  // NIE tworzymy zależności bezpośrednio w klasie
  public DrawingFacade() {
    circleDrawer = new CircleDrawer();
    squareDrawer = new SquareDrawer();
    triangleDrawer = new TriangleDrawer();
  }

  // DOBRZE - wykorzystanie SOLID - 'D'
  public DrawingFacade(final CircleDrawer circleDrawer, final SquareDrawer squareDrawer, final TriangleDrawer triangleDrawer) {
    this.circleDrawer = circleDrawer;
    this.squareDrawer = squareDrawer;
    this.triangleDrawer = triangleDrawer;
  }

  public void drawTriangle() {
    triangleDrawer.draw(3);
  }

  public void drawCircle() {
    circleDrawer.draw();
  }

  public void drawSquare() {
    squareDrawer.putOnConsole();
  }
}
