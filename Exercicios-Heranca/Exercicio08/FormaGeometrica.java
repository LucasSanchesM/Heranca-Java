package main;

public class FormaGeometrica {
    private double area;
    private double perimetro;
    
    public void setArea(double entraArea){
        this.area= entraArea;
    }
    public double getArea(){
        return this.area;
    }
    public void setPerimetro(double entraPerimetro){
        this.perimetro = entraPerimetro;
    }
    public double getPerimetro(){
        return this.perimetro;
    }
    
    public void calcularArea(){
        System.out.println("\nA forma geometrica nao esta definida, nao eh possivel calcular area");
    }
    public void calcularPerimetro(){
        System.out.println("\nA forma geometrica nao esta definida, nao eh possivel calcular Perimetro");
    }
    
}
