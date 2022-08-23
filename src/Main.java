public class Main {
    public static void main(String[] args) {

        Perro perro = new Perro("Ramon", "Pitbull",9);

        System.out.println(perro.getNombre());
        System.out.println(perro.getRaza());

        perro.setNombre("Firulay");
        perro.setRaza("Pincher");

        System.out.println(perro.getNombre());
        System.out.println(perro.getRaza());


    }
}
