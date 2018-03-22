class Question9 {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/fileFrom.txt")
        File file2 = new File("src/main/resources/fileTo.txt")


        int lineNo = 1
        def line
        file1.withReader { reader ->
            while ((line = reader.readLine())!=null)
           {

               if (lineNo%2!=0)
               {
                   file2<<"${lineNo}. ${line} \n"
               }
               lineNo++
            }
        }

        println("operation performed...")

    }
}
