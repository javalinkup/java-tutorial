import java.io.*;

public class JavaFiles {
    public static void main(String[] args) {
        String fileName = "file2.txt";
        StringBuilder builder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName)
        )){

           // writer.close();
            String  line="";
            String oldString = "Hello";
            String newString = "Hi";

            while((line= br.readLine())!=null){
               // System.out.println(line);
                builder.append(line.replace(oldString, newString));
                builder.append(System.lineSeparator());
            }
            BufferedWriter writer2 = new BufferedWriter(new FileWriter(fileName));
            writer2.write(builder.toString());
            writer2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


}
}
