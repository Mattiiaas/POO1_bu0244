package upm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CirculoTest{
    private Circulo circulo;
    @BeforeEach
    void before(){
        circulo=new Circulo(3);
    }
    @Test
    void testCirculoArea(){
        Assertions.assertEquals(28.2743,circulo.area(),10e-5);
    }
    void testCirculoPerimetro(){
        Assertions.assertEquals(18.8495,circulo.perimetro(),10e-5);
    }
}
