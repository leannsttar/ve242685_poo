package EJERCICIOS.ejercicio3;

public class Mascotas {
    public class Animal {
        protected String nombre;
        protected int edad;
        protected String alimento;

        public Animal(String nombre, int edad, String alimento) {
            this.nombre = nombre;
            this.edad = edad;
            this.alimento = alimento;
        }

        public void showInfo() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad + " años");
            System.out.println("Alimento: " + alimento);
        }
    }

    public class Gallo extends Animal {
        private String color_plumas;

        public Gallo(String nombre, int edad, String alimento, String color_plumas) {
            super(nombre, edad, alimento);
            this.color_plumas = color_plumas;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("Color de plumas: " + color_plumas);
        }

    }

    public class Perro extends Animal {
        private String color_pelaje;

        public Perro(String nombre, int edad, String alimento, String color_pelaje) {
            super(nombre, edad, alimento);
            this.color_pelaje = color_pelaje;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("Color de pelaje: " + color_pelaje);
        }
    }

    public class Gato extends Animal {
        private String color_ojos;

        public Gato(String nombre, int edad, String alimento, String color_ojos) {
            super(nombre, edad, alimento);
            this.color_ojos = color_ojos;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("Color de pelaje: " + color_ojos);
        }
    }

    public class Hamster extends Animal {
        private String cantidad_pulgas;

        public Hamster(String nombre, int edad, String alimento, String cantidad_pulgas) {
            super(nombre, edad, alimento);
            this.cantidad_pulgas = cantidad_pulgas;
        }

        @Override
        public void showInfo() {
            super.showInfo();
            System.out.println("Color de pelaje: " + cantidad_pulgas);
        }
    }

    public static void main(String[] args) {
        Mascotas m = new Mascotas();

        Gallo gallo = m.new Gallo("nomedejessecopicante", 10, "Arroz", "Negras");
        Perro perro = m.new Perro("Iggy", 5, "Chocolate", "Negro");
        Gato gato = m.new Gato("Yoruichi", 300, "Noodles", "Amarillos");
        Hamster hamster = m.new Hamster("Pichu", 2, "Azúcar", "0");

        System.out.println("\n--- Datos de las mascotas de Edgardo ---");
        gallo.showInfo();
        System.out.println();
        perro.showInfo();
        System.out.println();
        gato.showInfo();
        System.out.println();
        hamster.showInfo();
    }
}
