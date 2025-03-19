public abstract class Main {
    public static void main(String[] args) {
        Estudiante est1 = new Estudiante(210217, "Andrid", "Ordoñez");
        Estudiante est2 = new Estudiante(970217, "Kevin", "Gomez");
        System.out.println("ESTUDIANTE 1");
        System.out.println("ID: "+ est1.getId());
        System.out.println("NOMBRE: "+ est1.getNombre());
        System.out.println("APELLIDO: " + est1.getApellido());
        System.out.println("ESTUDIANTE 2");
        System.out.println("ID: "+ est2.getId());
        System.out.println("NOMBRE: "+ est2.getNombre());
        System.out.println("APELLIDO: " + est2.getApellido());



    }
}