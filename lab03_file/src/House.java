public class House {
    public int area; // powierzchnia
    public boolean garage; // czy ma garaz
    public int rooms; // liczba pokoi
    public boolean garden; // czy ma ogrod
    public int floors; // ile pieter

    public int getValue(){
        return area * 3000;
    }

}
