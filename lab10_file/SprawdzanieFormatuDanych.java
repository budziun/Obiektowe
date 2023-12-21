public class SprawdzanieFormatuDanych {

    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        if (!dane.contains("@")) {
            throw new NiepoprawnyFormatDanychException("Niepoprawny format danych. Brak '@'.");
        }
    }

    public static void main(String[] args) {

        try {
            sprawdzFormatDanych("jan@example.com");

            sprawdzFormatDanych("toNieJestAdresEmail");

        } catch (NiepoprawnyFormatDanychException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}