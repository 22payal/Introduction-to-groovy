class NewPerson extends Person
{
    Integer empId
    String  company
    Integer salary


    @Override
    public String toString() {
        return "$name is a man aged $age who lives at $address. He works for $company " +
                "with employee id $empId and draws $salary which is a lot of money !!!!."
    }
}

class Question2
{
    public static void main(String[] args) {

        NewPerson newPerson = new NewPerson()

        newPerson.salary=10000

        println("salary is:")
        println(newPerson.@salary)
        println(newPerson.salary)

        println("employee id is :")
        newPerson.empId=11
        println(newPerson.@empId)
        println(newPerson.empId)

        println("name of company :")
        newPerson.company="Intelligrape"
        println(newPerson.@company)
        println(newPerson.company)

        println("name is:")
        newPerson.name="Sachin"
        println(newPerson.name)

        println("age is:")
        newPerson.age=24
        println(newPerson.age)

        println("gender is:")
        newPerson.gender="male"
        println(newPerson.gender)

        println("address is:")
        newPerson.address="Delhi"
        println(newPerson.address)

        println("output of question 4: ")
        println(newPerson.toString())

    }
}
