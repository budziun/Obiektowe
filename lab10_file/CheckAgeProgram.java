public class CheckAgeProgram {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Wiek nie może być mniejszy niż 18.");
        } else {
            System.out.println("Wiek zaakceptowany: " + age);
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(25);
            checkAge(12);
            checkAge(30);
        } catch (IllegalArgumentException e) {
            System.err.println("Błąd: " + e.getMessage());
        }
    }
}