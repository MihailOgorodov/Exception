package org.example.hw3;

import java.io.*;
import java.nio.file.FileSystemException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class hw3 {
    public static void main(String[] args) throws IOException {

        try {
            createRecord();
            System.out.println("success");
        } catch (FileSystemException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }

    }

    public static void createRecord() throws Exception{
        System.out.println("Введите фамилию, имя, отчество, дату рождения (в формате dd.mm.yyyy), номер телефона (число без разделителей) и пол(символ латиницей f или m), разделенные пробелом");

        String text;
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            text = bf.readLine();
        }catch (IOException e){
            throw new Exception("Ошибка");
        }

        String[] array = text.split(" ");
        if (array.length != 6){
            throw new Exception("Введено неверное количество параметров");
        }

        String lastname = array[0];
        String name = array[1];
        String middlename = array[2];

        SimpleDateFormat format = new SimpleDateFormat("dd.mm.yyyy");
        Date birthdate;
        try {
            birthdate = format.parse(array[3]);
        }catch (ParseException e){
            throw new ParseException("Введен неверный формат даты рождения", e.getErrorOffset());
        }

        int phone;
        try {
            phone = Integer.parseInt(array[4]);
        }catch (NumberFormatException e){
            throw new NumberFormatException("Введен неверный формат телефона");
        }

        String sex = array[5];
        if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("f")){
            throw new RuntimeException("Неверно введен пол");
        }

        String fileName = "files\\" + lastname.toLowerCase() + ".txt";
        File file = new File(fileName);
        try (FileWriter fileWriter = new FileWriter(file, true)){
            if (file.length() > 0){
                fileWriter.write('\n');
            }
            fileWriter.write(String.format("%s %s %s %s %s %s", lastname, name, middlename, format.format(birthdate), phone, sex));
        }catch (IOException e){
            throw new FileSystemException("Ошибка при работе с файлом");
        }

    }
}

