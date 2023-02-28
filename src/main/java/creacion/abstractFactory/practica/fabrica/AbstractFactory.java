package creacion.abstractFactory.practica.fabrica;

import creacion.abstractFactory.practica.shape.Shape;

public abstract class AbstractFactory {
   public abstract Shape getShape(String shapeType) ;
}