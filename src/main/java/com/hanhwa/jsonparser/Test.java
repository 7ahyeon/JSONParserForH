package com.hanhwa.jsonparser;

import com.hanhwa.jsonparser.program.JSONFileReader;
import com.hanhwa.jsonparser.program.JSONParser;
import com.hanhwa.jsonparser.program.ObjectBinder;

public class Test {
    public static void main(String[] args) {
        final JSONParser jsonParser = new JSONParser();
        final JSONFileReader jsonFileReader = new JSONFileReader();
        final ObjectBinder objectBinder = new ObjectBinder();
        final String jsonFileName = "RsrvReqRq.json";

        // when (실행)
        JSONParser.jsonParsing(jsonFileName, jsonFileReader, objectBinder);
    }
}
