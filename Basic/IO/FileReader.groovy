new File("File.txt").withWriter('utf-8') 
{ 
    writer -> writer.writeLine 'Hello World1'
}

File File1 = new File("File.txt") ;
println File1.text ;

File File2 = new File("File.txt");
println "The file ${File2.absolutePath} has ${File2.length()} bytes";

File1.delete();



/*
        Копирование файлов
        def src = new File("E:/Example.txt")
        def dst = new File("E:/Example1.txt")
        dst << src.text
*/