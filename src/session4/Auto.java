package session4;

class Auto {
    private String marca;
    private String modelo;
    private String color;
    private int velocidadMaxima;
    private boolean encendido;


    public Auto(String marca, String modelo, String color, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidadMaxima = velocidadMaxima;
        this.encendido = false;  // El auto inicia apagado
    }

    public void encender() {
        if (this.encendido) {
            System.out.println("El auto ya está encendido.");
        } else {
            this.encendido = true;
            System.out.println("El auto ha sido encendido.");
        }
    }

    public void apagar() {
        if (!this.encendido) {
            System.out.println("El auto ya está apagado.");
        } else {
            this.encendido = false;
            System.out.println("El auto ha sido apagado.");
        }
    }

    public void acelerar() {
        if (!this.encendido) {
            System.out.println("No se puede acelerar porque el auto está apagado.");
        } else {
            System.out.println("El auto está acelerando.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Velocidad máxima: " + this.velocidadMaxima + " km/h");
        System.out.println("Estado: " + (this.encendido ? "Encendido" : "Apagado"));
    }
}