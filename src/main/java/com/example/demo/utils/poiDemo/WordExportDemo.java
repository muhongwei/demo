package com.example.demo.utils.poiDemo;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lzx on 2018/8/12
 */

public class WordExportDemo {
    public static void main(String[] args) throws Exception {
        // 添加假数据 这里你也可以从数据库里获取数据
        List<Map<String, String>> list = new ArrayList<>();
        for (int i =0;i < 30; i++){
            Map<String,String> map = new HashMap<>();
            map.put("time", "2018"+i);
            map.put("begin", "我在这"+i);
            map.put("end", "你好"+i);
            map.put("content", "加班啊"+i);
            map.put("money", "123");
            list.add(map);
        }
        // 模板文件输入输出地址
        String filePath = "F:/zyxx/project/demo/src/main/java/templet/demo.docx";
        String outPath = "F:/zyxx/project/demo/src/main/java/templet/demo1.docx";
        WordReporter wordReporter = new WordReporter();
        wordReporter.setTempLocalPath(filePath);
        wordReporter.init();
        wordReporter.export(list,0);
        wordReporter.generate(outPath);

    }
}
