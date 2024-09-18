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
    void testRectanguloMismaArea(){
        Assertions.assertFalse(rectangulo.mismaArea(rectanguloAuxiliar));
    }
    void testRectanguloDiagonal() {
        Assertions.assertEquals(5.7801, rectangulo.calcularDiagonal(), 10e-5);
    }

}
