package creational.abstractfactory;

public class Client {
    public static void main(String[] args)  {
        //AbstractFactoryProducer abstractFactoryProducer = new AbstractFactoryProducer();

        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);

        Profession profession = abstractFactory.getProfession("teacher");

        profession.work();
    }

}
