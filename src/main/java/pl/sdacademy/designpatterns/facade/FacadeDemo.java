package pl.sdacademy.designpatterns.facade;

public class FacadeDemo {
  public static void main(String[] args) {
    final CircleDrawer circleDrawer = new CircleDrawer();
    final SquareDrawer squareDrawer = new SquareDrawer();
    final TriangleDrawer triangleDrawer = new TriangleDrawer();

    final DrawingFacade drawingFacade = new DrawingFacade(circleDrawer, squareDrawer, triangleDrawer);

    drawingFacade.drawCircle();
    drawingFacade.drawSquare();
    drawingFacade.drawTriangle();

    final SingleDrawingOperationFacade singleDrawingOperationFacade = new SingleDrawingOperationFacade(
        circleDrawer, squareDrawer, triangleDrawer);
    singleDrawingOperationFacade.drawAllPossibleShapes();
  }
}
