class Question5
{
    public static void main(String[] args) {
        println("obersvation 1:")
        if('test') { println "test evaluated to true inside if \n" }

        println("observation 2:")
        if("Test") { println "test evaluated to true inside if \n" }

        println("observation 3:")
        if('null') { println "test evaluated to true inside if \n" }

        println("observation 4:")
        if(null) { println "test evaluated to true inside if \n" }


        println("\nobservation 5:")
        if(100) { println "test evaluated to true inside if \n" }


        println("observation 6:")
        if(0) { println "test evaluated to true inside if \n" }

        List list
        println("observation 7:")
        if(list) { println "test evaluated to true inside if \n" }

        List list1 = new ArrayList()
        list1.add(null)
        list1.add(null)
        list1.add(null)
        list1.add(null)

        println("observation 8:")
        if(list) { println "test evaluated to true inside if \n" }

        println("observation 9 :")
        HourMinute hourMinute = new HourMinute()
        hourMinute.hour=12
        hourMinute.minute=45

        println("when overloading plus operator -> "+hourMinute.hour.plus(hourMinute.minute))

        println("when overloading minus operator -> "+hourMinute.hour.minus(hourMinute.minute))

    }
}

class HourMinute
{
    int hour
    int minute
}
