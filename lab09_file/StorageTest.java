public class StorageTest {
    public static void main(String[] args){
        Storage plik = new FileStorage();
        Storage baza = new DatabaseStorage();

        System.out.println(plik.save("Dane do pliku"));
        System.out.println(plik.delete("plik123"));
        System.out.println(plik.retrieve("plik123"));

        System.out.println(baza.save("Dane do zapisu w bazie danych"));
        System.out.println(baza.delete("rekord123"));
        System.out.println(baza.retrieve("rekord123"));
    }
}
