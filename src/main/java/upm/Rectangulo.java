package upm;

public class Rectangulo {
    private double anchura;
    private double altura;
    public Rectangulo (double anchura, double altura){
        this.anchura=anchura;
        this.altura=altura;
    }

    public double getAnchura() {
        return anchura;
    }

    public void setAnchura(double anchura) {
        this.anchura = anchura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double calcularArea(){
        return altura*anchura;
    }
    public double calcularPerimetro(){
        return altura*2+anchura*2;
    }
    public boolean esCuadrado(){
        return altura==anchura;
    }
    public void escala(double factor){
        this.altura*=factor;
        this.anchura*=factor;
    }
    public boolean mismaArea(Rectangulo otro){
        return this.calcularArea()==otro.calcularArea();
    }
    public double calcularDiagonal(){
        return Math.sqrt(Math.pow(anchura,2)+Math.pow(altura,2));
    }
    public void rotar(){
        double aux=altura;
        altura=anchura;
        anchura=aux;
    }
}
