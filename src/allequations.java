/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author WEBEJA
 */
public class allequations {
    
    public double a;
    public double b;
    public double c;
    public double delta;
    public double X1;
    public double X2;
    public double X1X2;
    
    
    public void Resolutionequation(double a, double b, double c){
        
        delta = ((b*b)-(4*a*c));      
        X1 = (-b-Math.sqrt(delta))/(2*a); 
        X2 = (-b+Math.sqrt(delta))/(2*a);        
        X1X2 = -b / (2*a);
    }
    
}
