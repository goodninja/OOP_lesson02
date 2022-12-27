// Имеются данные о группе студентов. У каждого студента есть средний балл (например, 4.6).
// Создайте родительский класс ЗаписывательВФайл. 
// Создайте три детских класса, которые записывают в файл информацию о студентах в разных формах

package Lesson02;

import java.io.*;
import java.util.*;

public class Program {
    public static void main(String[] args) throws IOException {

        Map<String, Float> students = new HashMap<>();
        students.put("Иван Иванов", 4.8f);
        students.put("Мария Кузнецова", 5.0f);
        students.put("Степан Кузьмин", 3.6f);

        TxtWriteFile.saveAs(students);
        JsonWriteFile.saveAs(students);
        XmlWriteFile.saveAs(students);
    }

}