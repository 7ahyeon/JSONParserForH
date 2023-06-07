package com.hanhwa.jsonparser;

import java.io.BufferedReader;
import java.io.FileReader;

public class JSONFileReader {
    private String jsonFileContent;

    public String read(String jsonFilePath) {
        // jsonFilePath = 파일 경로 + '/' + 파일 이름
        BufferedReader br = new BufferedReader(new FileReader(jsonFilePath));
        // StringBuilder : 단일 스레드
        StringBuilder sb = new StringBuilder();
        String jsonFileContentLine;

        while((jsonFileContentLine = br.readLine()) != null)){
            sb.append(jsonFileContentLine);
        }
        jsonFileContent = sb.toString();
        return jsonFileContent;
    }
}
