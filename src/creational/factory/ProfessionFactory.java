package creational.factory;

public class ProfessionFactory {
    public Profession getPro(String t) {
        if(t.equalsIgnoreCase("Doctor")) {
            return new Doctor();
        }
        if(t.equalsIgnoreCase("Engineer")) {
            return new Engineer();
        }
        if(t.equalsIgnoreCase("Architect")) {
            return new Architect();
        }
        return null;
    }
}
