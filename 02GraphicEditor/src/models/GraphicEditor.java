/*
 * Created By Ananda Bayu Fauzan.
 */
package models;

import interfaces.IShape;
/**
 *
 * @author Ananda Bayu
 */
public class GraphicEditor{
    public void DrawShape(IShape shape){
        System.out.println(shape.Drow());
    }
}
