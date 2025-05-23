package org.campus02.ecom;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BasketLoader {

    public Arraylist<BasketData> load(String path) throws DataFileException{
        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line;
            while ((line = br.readLine())!= null){
                BasketData bd = new Gson().fromJson(line,BasketData.class);

                if (bd != )
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
