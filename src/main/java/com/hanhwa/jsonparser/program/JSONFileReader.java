package com.hanhwa.jsonparser.program;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JSONFileReader {

    public String readFile(String jsonFilePath) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        // RP! ClassLoader 경로 이용 방법 다시 찾아볼 것
//        ClassLoader classLoader = JSONFileReader.class.getClassLoader();
//        File file = new File(classLoader.getResource("/file/" + jsonFileName).getFile());

        File file = new File(jsonFilePath);

        if (file.isFile()){
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            // StringBuilder : 문자열 연산이 많을 경우, 동기화를 고려하지 않기 때문에 단일 스레드 환경일 경우(StringBuffer보다 성능 뛰어남) 사용
            StringBuilder sb = new StringBuilder();
            String jsonFileContentLine;

            while((jsonFileContentLine = br.readLine()) != null){
                sb.append(jsonFileContentLine);
            }
            br.close();
            return sb.toString();
        } else {
            return null;
        }
    }
}
