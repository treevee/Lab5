public class Person {
    protected String surname;
    protected String name;
    protected int age;

    Person(String surname,String name,int age){
        this.surname=surname;
        this.name=name;
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String printInfo(){
        return "Человек "+surname+" "+name+", возраст: "+age;
    }
}
