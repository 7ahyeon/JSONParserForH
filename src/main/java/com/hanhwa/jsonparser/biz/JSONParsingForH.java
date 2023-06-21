package com.hanhwa.jsonparser.biz;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class JSONParsingForH {

    public static void jsonParsingAll() {

        Path curPath = Paths.get("");
        String path = curPath.toAbsolutePath().toString();
        String jsonFilePath = path + "/src/main/resources/file/";

        File file = new File(jsonFilePath);
        String[] fileNameList = file.list();
        Arrays.sort(fileNameList);

        for (String fileName : fileNameList) {
            System.out.println(fileName);
            JSONParser.jsonParsing(jsonFilePath + fileName);
            System.out.println("-");
        }
    }
}
