package creational.factory;

public class Client {
    public static void main(String[] args) {
//        Profession doctor = new Doctor();
//        Profession eng = new Engineer();
//        Profession arch = new Architect();
//        ProfessionFactory
        ProfessionFactory pf = new ProfessionFactory();
        Profession doctor = pf.getPro("Doctor");
        doctor.work();
    }
}
