
package calculoarea;

public class Circulo implements FormaGeometrica{

    private double raio;
    
    @Override
    public float calculaArea() {
        return (float) (Math.PI * raio * raio);
    }

    @Override
    public float calculaPerimetro() {
        return (float) (2 * Math.PI * raio);

    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

  
}
