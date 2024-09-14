package creational.abstractfactory;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(boolean isTrainee) {
        if(isTrainee) {
            return new TraineeProfessionAbsFact();
        } else {
            return new ProfessionAbsFact();
        }
    }
}
