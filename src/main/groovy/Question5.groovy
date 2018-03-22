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

        HourMinute obj1= new HourMinute(9,58)
        HourMinute obj2= new HourMinute(1,20)

        HourMinute obj3= obj1-obj2
        println("subtraction :")
        println(obj3)

        HourMinute obj4= obj1+obj2
        println("addition :")
        println(obj4)

    }
}

class HourMinute
{
    Integer hour
    Integer minute

    HourMinute(Integer hour, Integer minute) {
        this.hour = hour
        this.minute = minute
    }


    @Override
    public String toString() {
        return "HourMinute{" +
                "hour=" + hour +
                ", minute=" + minute +
                '}'
    }

    HourMinute plus(HourMinute a){
        this.minute+=a.minute
        this.hour+=a.hour
        if(this.minute>=60){
            this.minute=this.minute%60
            this.hour=(this.hour+1)%24
        }
        return this
    }

    HourMinute minus(HourMinute a){
        this.minute-=a.minute
        this.hour-=a.hour
        if(this.minute<0)
        {
            this.minute=60+this.minute
            this.hour--
            if(this.hour<0)
            {
                this.hour=23
            }
        }
        return this
    }


}
