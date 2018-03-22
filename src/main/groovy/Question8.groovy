class Question8 {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/fileInput1.txt")
        File file2 = new File("src/main/resources/fileInput2.txt")

        File file3 = new File("src/main/resources/fileOutput.txt")

        file3 << file1.text
        file3 << file2.text 

        println(file3.text)
    }
}
