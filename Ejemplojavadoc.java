/**

 * La clase {@code Calculadora} proporciona métodos para realizar operaciones matemáticas básicas.

 *

 * <p>Esta clase incluye métodos para sumar, restar, multiplicar y dividir números.</p>

 *

 * <p>Ejemplo de uso:</p>

 * <pre>

 *     Calculadora calc = new Calculadora();

 *     int suma = calc.sumar(5, 3);

 * </pre>

 *

 * @author Tu Nombre

 * @version 1.0

 */

 class javadoc {


    /**

     * Suma dos números enteros.

     *

     * @param a el primer número a sumar

     * @param b el segundo número a sumar

     * @return la suma de {@code a} y {@code b}

     */

    public int sumar(int a, int b) {

        return a + b;

    }


    /**

     * Resta dos números enteros.

     *

     * @param a el número del cual se resta

     * @param b el número que se resta

     * @return la diferencia entre {@code a} y {@code b}

     * @throws IllegalArgumentException si {@code b} es mayor que {@code a}

     */

    public int restar(int a, int b) {

        if (b > a) {

            throw new IllegalArgumentException("El segundo número no puede ser mayor que el primero.");

        }

        return a - b;

    }


    /**

     * Multiplica dos números enteros.

     *

     * @param a el primer número a multiplicar

     * @param b el segundo número a multiplicar

     * @return el producto de {@code a} y {@code b}

     */

    public int multiplicar(int a, int b) {

        return a * b;

    }


    /**

     * Divide dos números enteros.

     *

     * @param a el numerador

     * @param b el denominador

     * @return el cociente de {@code a} dividido por {@code b}

     * @throws ArithmeticException si {@code b} es cero

     */

    public double dividir(int a, int b) {

        if (b == 0) {

            throw new ArithmeticException("No se puede dividir por cero.");

        }

        return (double) a / b;

    }

}
