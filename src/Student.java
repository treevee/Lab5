public class Student extends Person {
    private int group;
    private int number;

    Student(String surname,String name,int age,int group,int number){
        super(surname,name,age);
        this.group=group;
        this.number=number;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String printInfo(){
        return "Студент группы "+group+" "+surname+" "+name+", возраст: "+age+".Номер студенческого билета: "+number;
    }
}
