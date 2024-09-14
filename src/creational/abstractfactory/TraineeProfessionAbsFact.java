package creational.abstractfactory;

public class TraineeProfessionAbsFact extends AbstractFactory {
    @Override
    public Profession getProfession(String type) {
        if(type.equalsIgnoreCase("Engineer")){
            return new TraineeEngineer();
        }
        if(type.equalsIgnoreCase("Teacher")){
            return new TraineeTeacher();
        }

        return null;
    }
}
