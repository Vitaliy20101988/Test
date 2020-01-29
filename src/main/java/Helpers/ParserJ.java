package Helpers;

import com.google.gson.Gson;

public class ParserJ {

    public ParserJ (){
    Gson g = new Gson();
    Step step = g.fromJson("auth.fitcha.json", Step.class);
    }
}
