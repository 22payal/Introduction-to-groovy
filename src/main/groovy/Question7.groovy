class Question7 {

    public static void main(String[] args) {


        List list = [1, 2, 3, 4, 5, 6, 7, 8, 9]

        //int number=5

        Scanner scanner = new Scanner(System.in)
        println("enter the no. to be searched in the list")
        int number= scanner.nextInt()


Closure closure= { List list1,number1->
                    if (list1.contains(number1))
                    return println("it is contained in the list")
                  else
                        return println("it is not contained in the list")
                }

        closure(list,number)
    }
}
