package main;

public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;
    
    public void setAltura(double entraAltura){
        this.altura= entraAltura;
    }
    public double getAltura(){
        return this.altura;
    }
    
    public void setBase(double entraBase){
        this.base = entraBase;
    }
    public double getBase(){
        return this.base;
    }
    
    @Override
    public void calcularArea(){
        super.setArea(base*altura);
    }
    
    @Override
    public void calcularPerimetro(){
        super.setPerimetro(2*(base+altura));
    }
    
}
