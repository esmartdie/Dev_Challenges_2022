package challenge_4;
/*
 * Crea una única función (importante que sólo sea una) que sea capaz
 * de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 */
public class PolygonArea {

    public static double polygonArea(Polygon myPolygon){

        if(myPolygon instanceof Rectangle){

            Rectangle myRectangle = (Rectangle) myPolygon;
            return myRectangle.getHeight()* myRectangle.getBase();
        }else if(myPolygon instanceof Square){

            Square mySquare= (Square) myPolygon;
            return mySquare.getSide()*mySquare.getSide();
        }else if (myPolygon instanceof Triangle){

            Triangle myTriangle = (Triangle) myPolygon;
            return (myTriangle.getBase()*myTriangle.getHeight())/2;
        }else {
            throw new IllegalArgumentException("Allowed polygon not detected");
        }

    }
}
