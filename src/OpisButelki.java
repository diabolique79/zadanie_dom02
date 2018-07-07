public class OpisButelki {

    public static void main(String[] args) {

        Butelka butelka1 = new Butelka();
        butelka1.name = "Muszynianka";
        butelka1.capacity = 1.5;
        butelka1.content = "woda";
        butelka1.year = 2018;
        butelka1.type = "plastikowa";
        Butelka butelka2 = new Butelka();
        butelka2.name = "Ryczyn";
        butelka2.capacity = 0.5;
        butelka2.year = 2017;
        butelka2.content = "piwo";
        butelka2.type = "szklana";

        System.out.println("Opis butelki nr 1:");
        System.out.println("Nazwa butelki: " + butelka1.name + ", Pojemność: " + butelka1.capacity + ", Rodzaj butelki: " + butelka1.type + ", Zawartość i rok produkcji: " + butelka1.content + " " + butelka1.year);
        System.out.println("Opis butelki nr 2:");
        System.out.println("Nazwa butelki: " + butelka2.name + ", Pojemność: " + butelka2.capacity + ", Rodzaj butelki: " + butelka2.type + ", Zawartość i rok produkcji: " + butelka2.content + " " + butelka2.year);
    }
}
