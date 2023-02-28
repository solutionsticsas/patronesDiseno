package creacion.abstractFactory.practica.fabrica;


import creacion.abstractFactory.practica.shape.Rectangle;
import creacion.abstractFactory.practica.shape.Shape;
import creacion.abstractFactory.practica.shape.Square;

public class ShapeFactory extends AbstractFactory {
   @Override
   public Shape getShape(String shapeType){

      if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
      }else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }

      return null;
   }
}