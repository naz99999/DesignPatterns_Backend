package creational.prototype;

public class Client {
    public static void main(String[] args) {
        ProfessionCache.loadProfessionCache();

        Profession teacherProfession = ProfessionCache.getCloneableNewProfession(1);
        System.out.println(teacherProfession);

        Profession teacherProfession2 = ProfessionCache.getCloneableNewProfession(1);
        System.out.println(teacherProfession2);

        Profession engineerProfession = ProfessionCache.getCloneableNewProfession(2);
        System.out.println(engineerProfession);

    }
}
