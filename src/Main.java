public class Main {
    public static void main(String[] args) {

        //Opgave 1
        Kursus K1 = new Kursus(1, "league Tut", 22,"Mandag", "8:30");

        //Opgave 2
        Kursus [] kursusTabel=new Kursus[5];
        kursusTabel[0] = new Kursus(1, "league Tut", 22,"Mandag", "8:30");

        //Opgave 3
        //K1.tilfoejStuderende("jax");
        //System.out.println(K1);

        //Opgave 4
        //udskrivKursus(K1);

        //Opgave 5
        Klasse E1 = new Klasse("Andreas", "Rahbek","Nær haslev","23 36 58 33");

        //Opgave 6
        K1.tilfoejStuderende(E1);
        System.out.println(K1);
    }
    public static void udskrivKursus(Kursus K1){
        //System.out.println(K1);

    }
}