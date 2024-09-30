import java.io.*;

public class JavaFiles2 {
    public static void main(String[] args) {
        File sourceFile = new File("file2.txt");
        File targetFile = new File("file.txt");
        mergeFiles(sourceFile.getName(), targetFile.getName(), "file3.txt");
        System.out.println(getCount("file2.txt"));
        try (BufferedReader fileReader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter  fileWriter = new BufferedWriter(new FileWriter(targetFile));
        ) {
            byte[] buffer = new byte[1024];
            int length;
            String line1="";
            while ((line1 = fileReader.readLine()) !=null) {

               fileWriter.write(line1);
               fileWriter.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getCount(String fileName) {
        int wordCount = 0;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line = "";
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s");
                wordCount  += words.length;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return wordCount;
    }

    public static void mergeFiles(String file1, String file2, String mergedFile) {
        try (BufferedReader bufferedReader1 = new BufferedReader(new FileReader(file1));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader(file2));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(mergedFile))) {
             String line;
             while((line= bufferedReader1.readLine())!=null){
                 bufferedWriter.write(line);
                 bufferedWriter.newLine();
             }
             while((line= bufferedReader2.readLine())!=null){
                 bufferedWriter.write(line);
                 bufferedWriter.newLine();
             }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
