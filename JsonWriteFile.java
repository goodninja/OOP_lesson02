package Lesson02;

import java.io.FileWriter;
import java.util.Map;

public class JsonWriteFile extends WriteFile {

    @Override
    public void write() {
    }

    public static void saveAs(Map<String, Float> students) {
        StringBuilder stringBuilder = new StringBuilder();
        try (FileWriter writer = new FileWriter("studentsList.json", true)) {
            writer.append("Write file JSON -> \n");
            writer.append("{\n");
            int counter = 0;
            for (Map.Entry<String, Float> entry : students.entrySet()) {
                stringBuilder.delete(0, stringBuilder.length());
                stringBuilder.append("\"" + entry.getKey() + "\"" + ":" + entry.getValue() + ",\n");
                counter++;
                if (counter == students.size()) {
                    stringBuilder.deleteCharAt(stringBuilder.length() - 2);
                }
                writer.append(stringBuilder);
            }
            writer.append('}');
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}