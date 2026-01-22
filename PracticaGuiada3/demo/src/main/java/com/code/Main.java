package com.code;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import com.code.model.Food;
import com.code.model.Person;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Juan",19,true);
        Gson gson = new Gson();
        // String json = gson.toJson(person);
        // System.out.println(json);

        // try (FileWriter writer = new FileWriter("person.json")) {
        //     gson.toJson(person,writer);
        // } catch (IOException e) {
        //     System.out.println("Error al escribir el archivo");
        // }

        // try(FileReader reader = new FileReader("PracticasGuiadas_DesarrolloDeSoftware2/PracticaGuiada3/person.json")){
        //     // Person person2 = gson.fromJson(reader,Person.class);
        //     // System.out.println(person2);

        //     Type type = new TypeToken<ArrayList<Person>>(){}.getType();
        //     List<Person> people = gson.fromJson(reader, type);
        //     for(Person p: people){
        //         System.out.println(p.getName());
        //     }
        // } catch (IOException e) {
        //     System.out.println("Error al leer el archivo");
        //     e.printStackTrace();
        // }

        try(FileReader reader = new FileReader("PracticasGuiadas_DesarrolloDeSoftware2/PracticaGuiada3/recipe.json")){
            Type type = new TypeToken<ArrayList<Food>>(){}.getType();
            List<Food> food = gson.fromJson(reader, type);
            for(Food f: food){
                System.out.println(f.toString());
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo");
            e.printStackTrace();
        }
    }
}