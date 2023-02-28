package creacion.abstractFactory.practica.fabrica;

import creacion.abstractFactory.practica.shape.RoundedRectangle;
import creacion.abstractFactory.practica.shape.RoundedSquare;
import creacion.abstractFactory.practica.shape.Shape;

public class RoundedShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){

      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new RoundedRectangle();
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new RoundedSquare();
      }	 

       return null;
   }
}