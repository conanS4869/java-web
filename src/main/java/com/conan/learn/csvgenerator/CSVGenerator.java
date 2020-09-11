package com.conan.learn.csvgenerator;

import com.alibaba.fastjson.JSON;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.stream.IntStream;

public class CSVGenerator {
    private CSV csv = new CSV();

    public void setCsv(int num) {
        IntStream.range(0,num).forEach(item->{
            String arg1 = UUID.randomUUID().toString();
            String arg2 = UUID.randomUUID().toString();
            String arg3 = String.valueOf(System.currentTimeMillis());
            Map<String, String> content = new HashMap<String, String>();
            content.put("name", "123456");
            String arg4 = JSON.toJSONString(content);
            csv.addLine(arg1,arg2,arg3,arg4);
        });
    }

    public void toFile(String path) throws IOException {
        FileUtils.writeStringToFile(new File(path),
                csv.getText(),"UTF-8");
    }
}
