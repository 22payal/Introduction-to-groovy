public class Person {
    String name;
    Integer age;
    String gender;
    String address;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class Question1
{
    public static void main(String[] args)
    {
      Person person =new Person();

        System.out.println("name is :");
        person.setName("Sachin");
        System.out.println("one way ->"+person.getName());
        System.out.println("other way ->"+person.name);

        System.out.println("age is :");
        person.setAge(24);
        System.out.println("one way ->"+person.getAge());
        System.out.println("other way ->"+person.age);

        System.out.println("gender is:");
        person.setGender("male");
        System.out.println("one way ->"+person.getGender());
        System.out.println("other way ->"+person.gender);

        System.out.println("address is:");
        person.setAddress("Delhi");
        System.out.println("one way->"+person.getAddress());
        System.out.println("other way ->"+person.address);




    }
}
