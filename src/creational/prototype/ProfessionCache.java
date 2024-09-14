package creational.prototype;

import java.util.HashMap;

public class ProfessionCache {
    private static HashMap<Integer, Profession> cacheMap = new HashMap<>();

    public static Profession getCloneableNewProfession(int id) {
        Profession cachedProfessionInstance = cacheMap.get(id);
        return (Profession) cachedProfessionInstance.cloningMethod();
    }

    public static void loadProfessionCache() {
        Teacher teacher = new Teacher();
        teacher.id = 1;

        Engineer engineer = new Engineer();
        engineer.id = 2;

        cacheMap.put(1, teacher);
        cacheMap.put(2, engineer);
    }
}
