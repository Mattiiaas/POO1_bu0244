package upm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectanguloTest {
    private Rectangulo rectangulo;
    private Rectangulo rectanguloAuxiliar;

    @BeforeEach
    void before() {
        rectangulo = new Rectangulo(3.5,4.6);
        rectanguloAuxiliar = new Rectangulo(7.8,4.6);

    }

    @Test
    void testRectanguloArea() {
        Assertions.assertEquals(16.1, rectangulo.calcularArea(),10e-5);
    }

    void testRectanguloPerimetro() {
        Assertions.assertEquals(16.2, rectangulo.calcularPerimetro(), 10e-5);
    }
    void testRectanguloEsCuadrado(){
        Assertions.assertFalse(rectangulo.esCuadrado());
    }
    void testRectanguloEscala(){
        rectangulo.escala(2.3);
        Assertions.assertEquals(8.05,rectangulo.getAnchura(),10e-5);
        Assertions.assertEquals(10.58,rectangulo.getAltura(),10e-5);

    }
    void testRectanguloMismaArea(){
        Assertions.assertFalse(rectangulo.mismaArea(rectanguloAuxiliar));
    }
    void testRectanguloDiagonal() {
        Assertions.assertEquals(5.7801, rectangulo.calcularDiagonal(), 10e-5);
    }
    void testRectanguloRotar(){
        double alturaAuxiliar=rectangulo.getAltura();
        double anchuraAuxiliar=rectangulo.getAnchura();
        rectangulo.rotar();
        Assertions.assertEquals(alturaAuxiliar,rectangulo.getAnchura(),10e-5);
        Assertions.assertEquals(anchuraAuxiliar,rectangulo.getAltura(),10e-5);
    }

}
