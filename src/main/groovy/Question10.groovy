class Question10 {
    public static void main(String[] args) {
        File file1 = new File("src/main/resources/fileRead.txt")
        File file2 = new File("src/main/resources/fileWrite.txt")

        def line

        file1.withReader { reader ->
            while ((line = reader.readLine())!=null)
            {

                    line = line.trim().replaceAll("\\s", "")

                    file2<<"${line}"


            }
        }

    }
}
