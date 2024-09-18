package upm;

public class Circulo {
    private int radio;
    public Circulo(int radio){
        this.radio=radio;
    }
    public double area(){
        return Math.pow(radio,2)*Math.PI;
    }

    public double perimetro(){
        return 2*Math.PI*radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
