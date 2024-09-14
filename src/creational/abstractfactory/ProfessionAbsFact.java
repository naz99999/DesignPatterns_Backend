package creational.abstractfactory;

public class ProfessionAbsFact extends AbstractFactory {
    @Override
    public Profession getProfession(String type) {

        if(type.equalsIgnoreCase("Engineer")){
            return new Engineer();
        }
        if(type.equalsIgnoreCase("Teacher")){
            return new Teacher();
        }

        return null;
    }
}
