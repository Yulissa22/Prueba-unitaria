package operacionesmatematicas;

import  org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculadoraTest {
    Calculadora calculadora;
    @BeforeEach
    void setUp() {
        calculadora  = new Calculadora();
    }

    @AfterEach
    void tearDown() {
        calculadora = null;
    }
    @BeforeAll
    static void alIniciarTodasLasPruebas(){
        System.out.println("Iniciar todas las pruebas");
    }

    @AfterAll
    static void alFinalizarTodasLasPruebas(){
        System.out.println("Finalizar todas las pruebas");

    }

    @Test
    @Order(1)
    void sumar() {
        int num1 = 5;
        int num2 = 6;
        int resultadoEs = 11;

        int resultado = calculadora.sumar(num1,num2);
        assertEquals(resultadoEs,resultado);
    }

    @Test
    @Order(2)
    void restar() {
        int num1 = 10;
        int num2 = 6;
        int resultadoEs = 4;

        int resultado = calculadora.restar(num1,num2);
        assertTrue(resultadoEs == resultado);
    }

    @Test
    @Order(2)
    void multiplicar() {
        int num1 = 10;
        int num2 = 6;
        int resultadoEs = 60;

        int resultado = calculadora.multiplicar(num1,num2);
        if(resultadoEs!= resultado){
            fail("Fallo la mltiplicacion");
        }
    }

    @Test
    @Order(1)
    void dividir() {
        int num1 = 10;
        int num2 = 0;
        int resultadoEs = 0;
        if(num2!=0){
            int resultado = calculadora.dividir(num1,num2);
            if(resultadoEs!= resultado){
                fail("Fallo la division");
            }
        }else {
            assertThrows(
                    ArithmeticException.class,
                    () ->{
                        int result = calculadora.dividir(num1,num1);
                    }
            );
        }


    }
}