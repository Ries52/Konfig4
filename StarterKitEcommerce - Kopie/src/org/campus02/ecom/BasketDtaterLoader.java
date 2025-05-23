package org.campus02.ecom;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.DataInput;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class BasketDtaterLoader {


    public static List<BasketData> loadFromJson(String filePath) throws DataFileException{
        try(FileReader reader = new FileReader(filePath)) {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<BasketData>>(){
            }.getType();
            return gson.fromJson(reader, listType);
        }catch (IOException e){
            throw new DataFileException("Fehler beim Laden"+ filePath,e);
        }
    }
}


