public class FileStorage implements Storage{
    @Override
    public boolean save(String data){
        return true;
    }
    @Override
    public boolean delete(String identifier){
        return true;
    }
    @Override
    public String retrieve(String identifier){
        return "Pobrane dane z pliku";
    }
}
