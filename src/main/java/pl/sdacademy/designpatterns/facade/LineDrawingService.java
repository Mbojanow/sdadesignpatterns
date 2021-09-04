package pl.sdacademy.designpatterns.facade;

public class LineDrawingService {

    public void drawLine(int len) {
        for (int i = 0; i < len; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
