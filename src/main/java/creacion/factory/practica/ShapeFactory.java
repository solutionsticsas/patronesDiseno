package creacion.factory.practica;

import creacion.factory.practica.producto.Circle;
import creacion.factory.practica.producto.Rectangle;
import creacion.factory.practica.producto.Shape;
import creacion.factory.practica.producto.Square;

public  class ShapeFactory {
	
   //use getShape method to get object of type shape 
   public Shape getShape(String shapeType){
      if(shapeType == null){
         return null;
      }		
      if(shapeType.equalsIgnoreCase("CIRCLE")){
         return new Circle();
         
      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
         return new Rectangle();
         
      } else if(shapeType.equalsIgnoreCase("SQUARE")){
         return new Square();
      }
      
      return null;
   }
}