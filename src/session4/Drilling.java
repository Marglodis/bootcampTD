package session4;

public class Drilling {
    public static void main(String[] args) {
        Persona[] personas = new Persona[5];
        personas[0] = new Persona("Alicia Plaza", 25, 68.0, 165);
        personas[1] = new Persona("Dora Mazzone", 17, 70.0, 180);
        personas[2] = new Persona("Nohely Arteaga", 30, 90.0, 175);
        personas[3] = new Persona("Tania Sarabia", 16, 50.0, 160);
        personas[4] = new Persona("Valentina Quintero", 22, 80.0, 175);

        // Imprimir la información de cada persona
        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ":");
            System.out.println("Calculando su IMC...");
            System.out.println("Su índice de masa corporal es: " + String.format("%.1f", persona.calcularIMC()));
            System.out.println(persona.diagnosticoIMC());
            System.out.println("Su edad es: " + persona.getEdad());
            System.out.println(persona.esMayorDeEdad());
            System.out.println(persona);
            System.out.println();
        }
    }
}
