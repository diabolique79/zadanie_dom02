public class OpisButelki {

    public static void main(String[] args) {

        Butelka butelka1 = new Butelka(1,"Muszynianka",1.5, "plastikowa", "woda", 2018);

        Butelka butelka2 = new Butelka(2,"Ryczyn", 0.5, "szklana", "piwo", 2017);


        butelka1.opiszButelke();
        butelka2.opiszButelke();
    }
}
