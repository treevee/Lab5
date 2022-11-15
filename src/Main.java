
public class Main {
    public static void main(String[] args) {
        Person[] persons = new Person[]{
                new Person("Захарченко","Ленар",22),
                new Student("Полюнько","Олег",18,212,345874),
                new Lecturer("Задерейко","Александр",54,"IT",15000),
                new Student("Щербина","Игорь",19,212,593845),
                new Student("Дыбчук","Алексей",19,212,198567),
                new Person("Андреев","Мирослав",12),
                new Lecturer("Чепурна","Елена",45,"Math",12000)
        };


        for (Person person : persons)
        {
            System.out.println(person.printInfo());
        }
    }
}
