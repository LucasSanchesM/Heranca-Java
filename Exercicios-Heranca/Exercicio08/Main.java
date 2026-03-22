package main;

public class Main {
    public static void main(String[] args) {
        //ira exibir a area e perimetro, e ira apresentar o motivo do calculo de perimetro e area falharem
        FormaGeometrica novaForma = new FormaGeometrica();
        novaForma.setArea(12);
        novaForma.setPerimetro(12);
        novaForma.calcularArea();
        novaForma.calcularPerimetro();
        System.out.printf("\n**Forma Geometrica**\nArea: %.2f\nForma: %.2f\n", novaForma.getArea(), novaForma.getPerimetro());
        
        
        Retangulo novoRetangulo = new Retangulo();
        novoRetangulo.setAltura(2);
        novoRetangulo.setBase(4);
        novoRetangulo.calcularArea();
        novoRetangulo.calcularPerimetro();
        System.out.printf("\n**Retangulo**\nBase: %.2f\nAltura: %.2f\nArea: %.2f\nPerimetro: %.2f\n", novoRetangulo.getBase(),
                novoRetangulo.getAltura(), novoRetangulo.getArea(), novoRetangulo.getPerimetro());
        
        Circulo novoCirculo = new Circulo();
        novoCirculo.setRaio(4);
        novoCirculo.calcularArea();
        novoCirculo.calcularPerimetro();
        System.out.printf("\n**Circulo**\nRaio: %.2f\nArea: %.2f\nPerimetro: %.2f\n", novoCirculo.getRaio(), novoCirculo.getArea(), novoCirculo.getPerimetro());
    }
    
}
