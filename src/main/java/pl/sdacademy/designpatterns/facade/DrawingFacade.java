package pl.sdacademy.designpatterns.facade;

public class DrawingFacade {

    private final CircleDrawingService circleDrawingService;
    private final SquareDrawingService squareDrawingService;
    private final TriangleDrawingService triangleDrawingService;
    private final LineDrawingService lineDrawingService;

    public DrawingFacade(CircleDrawingService circleDrawingService,
                         SquareDrawingService squareDrawingService,
                         TriangleDrawingService triangleDrawingService,
                         LineDrawingService lineDrawingService) {
        this.circleDrawingService = circleDrawingService;
        this.squareDrawingService = squareDrawingService;
        this.triangleDrawingService = triangleDrawingService;
        this.lineDrawingService = lineDrawingService;
    }

    public void drawCircle() {
        circleDrawingService.draw();
    }

    public void drawSquare() {
        squareDrawingService.draw();
    }

    public void drawTriangle() {
        triangleDrawingService.draw();
    }

    public void drawLine(int len) {
        lineDrawingService.drawLine(len);
    }

    public void drawAllShapes() {
        drawCircle();
        drawSquare();
        drawTriangle();
    }



    // NIE ROBIMY
//    public DrawingFacade() {
//        circleDrawingService = new CircleDrawingService();
//        squareDrawingService = new SquareDrawingService();
//        triangleDrawingService = new TriangleDrawingService();
//    }
}
