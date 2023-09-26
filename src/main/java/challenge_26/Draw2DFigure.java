package challenge_26;

/*
 * Crea un programa que dibuje un cuadrado o un triángulo con asteriscos "*".
 * - Indicaremos el tamaño del lado y si la figura a dibujar es una u otra.
 * - EXTRA: ¿Eres capaz de dibujar más figuras?
 */

public class Draw2DFigure {

    public void drawFigure(int sideNumber, int sizeSide){

        if (sizeSide <2){
            System.out.println("The minimum available size is 2");
        }

        if(sideNumber==3)
            drawTriangle(sizeSide);
        else if (sideNumber ==4) {
            drawSquare(sizeSide);
        }
    }

    public void drawTriangle(int height){
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    private void drawSquare(int sizeSide){
        for (int i = 0; i < sizeSide; i++) {
            for (int j = 0; j < sizeSide; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


}
