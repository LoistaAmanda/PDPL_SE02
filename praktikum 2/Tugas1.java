public class Tugas1 {
    public static void main(String[] args) {
        String names = "Loista Amanda Noviar";
        String rombel = "SE02";
        String nim = "0110223271";

        double a = 45.00; 
        double b = 90.00; 
        double gamma = Math.toRadians(45); 

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - 2 * a * b * Math.cos(gamma));

        System.out.println("Nama Saya " + names);
        System.out.println("Rombel Peminatan saya adalah " + rombel);
        System.out.println("Nim saya adalah " + nim);
        
        System.out.println(" Hasil dari Rumus berikut adalah C bernilai " + c);
    }
}
