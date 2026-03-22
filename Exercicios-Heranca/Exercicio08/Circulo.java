package main;

public class Circulo extends FormaGeometrica{
    private double raio;
    
    public void setRaio(double entraRaio){
        this.raio = entraRaio;
    }
    public double getRaio(){
        return this.raio;
    }
    
    @Override
    public void calcularArea(){
        super.setArea(3.14*(raio*raio));
    }
    
    @Override
    public void calcularPerimetro(){
        super.setPerimetro((2*raio)*3.14);
    }
}
