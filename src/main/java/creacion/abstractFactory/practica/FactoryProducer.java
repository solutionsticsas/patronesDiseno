package creacion.abstractFactory.practica;

import creacion.abstractFactory.practica.fabrica.AbstractFactory;
import creacion.abstractFactory.practica.fabrica.RoundedShapeFactory;
import creacion.abstractFactory.practica.fabrica.ShapeFactory;

public class FactoryProducer {
   public static AbstractFactory getFactory(boolean rounded){
      if(rounded){
         return new RoundedShapeFactory();
      }else{
         return new ShapeFactory();
      }
   }
}