package com.hanhwa.jsonparser.program;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class JSONFileReader {

    public String readFile(String jsonFileName) throws FileNotFoundException, UnsupportedEncodingException, IOException {
        if (isExistedFile(jsonFileName)){
            // jsonFilePath = 파일 경로 + '/' + 파일 이름
            File file = new File("./file/" + jsonFileName);
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
    private boolean isExistedFile(String jsonFileName) {
        File file = new File("./file/" + jsonFileName);
        return file.exists();
    }

}
