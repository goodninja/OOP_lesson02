package Lesson02;

import java.io.FileWriter;
import java.util.Map;

public class TxtWriteFile extends WriteFile {

    @Override
    public void write() {
    }

    public static void saveAs(Map<String, Float> students) {
        try (FileWriter writer = new FileWriter("studentsList.txt", true)) {
            writer.append("Write file TXT -> \n");
            for (Map.Entry<String, Float> entry : students.entrySet()) {
                writer.append(entry.toString());
                writer.append("\n");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}