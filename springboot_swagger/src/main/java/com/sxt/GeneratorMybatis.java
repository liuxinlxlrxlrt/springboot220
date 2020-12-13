package com.sxt;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class GeneratorMybatis {
    public static void main(String[] args) throws Exception{
        String filepath="D:\\javaCode\\21_ProjectStorageFolder\\TestNG\\springboot220\\springboot_swagger\\src\\main\\resources\\generatorConfig.xml";
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File(filepath);
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

    }
}
