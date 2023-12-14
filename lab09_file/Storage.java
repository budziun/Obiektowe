public interface Storage {
    boolean save(String data);
    boolean delete(String identifier);
    String retrieve(String identifier);
}
