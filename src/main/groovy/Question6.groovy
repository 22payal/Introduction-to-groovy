class Question6
{
    public static void main(String[] args) {

        println("method 1 -> using .times")

        10.times {

            println(3*it)
        }

        println("method 2 -> using .upto")

        1.upto(10) {
            println (3*it)
        }

        println("method 3 -> using .steps")

        0.step 30, 3, {
            println it
        }
    }
}
