package com.hanhwa.jsonparser.util;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JsonFileReader { // JSON 파일 읽기

    public String readFile(String jsonFilePath) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        // RP! ClassLoader 경로 이용 방법 다시 찾아볼 것 (null)
//        ClassLoader classLoader = JSONFileReader.class.getClassLoader();
//        File file = new File(classLoader.getResource(jsonFileName).getFile());

        File file = new File(jsonFilePath);

        if (file.isFile()){ //파일이 존재하면 읽기
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr);

            // StringBuilder : 문자열 연산이 많을 경우, 동기화를 고려하지 않기 때문에 단일 스레드 환경일 경우(StringBuffer보다 성능 뛰어남) 사용
            StringBuilder sb = new StringBuilder();
            String jsonFileContentLine;

            while((jsonFileContentLine = br.readLine()) != null){ // 빈 문자열이 없도록 주의(NPE)
                sb.append(jsonFileContentLine);
            }
            br.close();
            return sb.toString();
        } else { // 없을 시 처리 필요
            return null;
        }
    }
}
