public class Butelka {

    int id;
    String name; //nazwa
    double capacity; //pojemnosc
    String type; // szklana, plastikowa
    String content; // woda, piwo, itp.
    int year; //rok producji

    Butelka(int i, String n, double c, String t, String cn, int yr) {

        id = i;
        name = n;
        capacity = c;
        type = t;
        content = cn;
        year = yr;


    }

    void opiszButelke(){

        System.out.println("Opis butelki nr " + id + ":");
        System.out.println("Nazwa butelki: " + name + ", Pojemność: " + capacity + ", Rodzaj butelki: " + type + ", Zawartość i rok produkcji: " + content + " " + year);



    }

}
