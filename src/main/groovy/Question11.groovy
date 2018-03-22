class Question11
{
    public static void main(String[] args) {
//
//        def reqFile = request.getFile("photos")
//        InputStream file = reqFile.inputStream
//        byte[] bytes = file.bytes
//
//        byte[] photo=request.getFile("photos").bytes

        File src = new File("/home/payal/Desktop/groovy_begin/src/main/resources/image.png" )

        new File("/home/payal/Desktop/groovy_begin/src/main/resources/empty.png" ).withOutputStream{ out ->
            out.write src.readBytes()
        }



    }
}
