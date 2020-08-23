package pl.sdacademy.designpatterns.facade;

public class SingleDrawingOperationFacade {

  private final CircleDrawer circleDrawer;
  private final SquareDrawer squareDrawer;
  private final TriangleDrawer triangleDrawer;

  // POPRAWNE PODEJSCIE - SOLID - D - dependency inversion
  public SingleDrawingOperationFacade(final CircleDrawer circleDrawer, final SquareDrawer squareDrawer,
                                      final TriangleDrawer triangleDrawer) {
    this.circleDrawer = circleDrawer;
    this.squareDrawer = squareDrawer;
    this.triangleDrawer = triangleDrawer;
  }

  public void drawAllPossibleShapes() {
    circleDrawer.draw();
    squareDrawer.putOnConsole();
    triangleDrawer.draw(3);
  }


}
