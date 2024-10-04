package session4;

public class Persona {

        private String nombre;
        private int edad;
        private double peso;
        private double altura;

        public Persona(String nombre, int edad, double peso, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.peso = peso;
            this.altura = altura / 100;
        }

        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public double getPeso() {
            return peso;
        }

        public double getAltura() {
            return altura/100;
        }

        public double calcularIMC() {
            return peso / (altura * altura);
        }

        public String esMayorDeEdad() {
            return edad >= 18 ? "Usted es mayor de edad" : "Usted es menor de edad";
        }

        public String diagnosticoIMC() {
            double imc = calcularIMC();
            if (imc < 18.5) {
                return "Usted se encuentra en bajo peso";
            } else if (imc >= 18.5 && imc < 24.9) {
                return "Usted tiene un peso normal";
            } else if (imc >= 25 && imc < 29.9) {
                return "Usted se encuentra con sobrepeso";
            } else {
                return "Usted se encuentra con obesidad";
            }
        }

        @Override
        public String toString() {
            return "Persona [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", altura=" + altura + "]";
        }
}
