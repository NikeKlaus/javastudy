package com.mao.test.config;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mao
 * @createTime 2022/12/13 16:30
 * @Description: Mybatis-plus自动生成代码
 */
public class MybatisAtuoCode {

    // 新版本
    @Test
    public void testNew(){
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/ems?&characterEncoding=utf-8&userSSL=false", "root", "123456")
                .globalConfig(builder -> {//全局配置
                    builder.author("coffeemao") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .disableOpenDir()
                            .outputDir(System.getProperty("user.dir")+"/src/main/java"); // 指定输出目录
                })
                .packageConfig(builder -> {//包配置
                    builder.parent("com.mao") // 设置父包名
                            .moduleName("test") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml,System.getProperty("user.dir")+"/src/main/resources/mybatis/mapper"));// 设置mapperXml生成路径

                })
                .strategyConfig(builder -> {//策略配置
                    builder.addInclude("user"); // 设置需要生成的表名
                })
                .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker 引擎模板，默认的是Velocity引擎模板
                .execute();
    }

    // 旧版本依赖

//    <!--mybatis-plus-->
//        <dependency>
//            <groupId>com.baomidou</groupId>
//            <artifactId>mybatis-plus-boot-starter</artifactId>
//            <version>3.0.5</version>
//        </dependency>
//        <!-- 代码生成器 -->
//        <dependency>
//            <groupId>com.baomidou</groupId>
//            <artifactId>mybatis-plus-generator</artifactId>
//            <version>3.0.5</version>
//        </dependency>
//        <!-- 模板引擎 -->
//        <dependency>
//            <groupId>org.apache.velocity</groupId>
//            <artifactId>velocity-engine-core</artifactId>
//            <version>2.3</version>
//        </dependency>

    @Test
    public void testOld(){
//        // 需要构建一个 代码自动生成器 对象
//        AutoGenerator mpg = new AutoGenerator();
//        // 配置策略
//        // 1、全局配置
//        GlobalConfig gc = new GlobalConfig();
//        String projectPath = System.getProperty("user.dir");
//        gc.setOutputDir(projectPath+"/src/main/java");
//        gc.setAuthor("coffee");
//        gc.setOpen(false);
//        gc.setFileOverride(false); // 是否覆盖
//        gc.setServiceName("%sService"); // 去Service的I前缀
//        gc.setIdType(IdType.ID_WORKER);
//        gc.setDateType(DateType.ONLY_DATE);
//        gc.setSwagger2(true);
//        mpg.setGlobalConfig(gc);
//        //2、设置数据源
//        DataSourceConfig dsc = new DataSourceConfig();
//        dsc.setUrl("jdbc:mysql://localhost:3306/ems?useSSL=false&useUnicode=true&characterEncoding=utf-8&serverTimezone=GMT%2B8");
//        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
//        dsc.setUsername("root");
//        dsc.setPassword("123456");
//        dsc.setDbType(DbType.MYSQL);
//        mpg.setDataSource(dsc);
//        //3、包的配置
//        PackageConfig pc = new PackageConfig();
//        pc.setModuleName("demo");
//        pc.setParent("com.mao");
//        pc.setEntity("entity");
//        pc.setMapper("mapper");
//        pc.setService("service");
//        pc.setController("controller");
//        mpg.setPackageInfo(pc);
//        //4、策略配置
//        StrategyConfig strategy = new StrategyConfig();
//        // 设置要映射的表名
//        strategy.setInclude("blog_tags","course","links","sys_settings","user_record");
//        strategy.setNaming(NamingStrategy.underline_to_camel);
//        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
//        strategy.setEntityLombokModel(true); // 自动lombok；
//        strategy.setLogicDeleteFieldName("deleted");
//        // 自动填充配置
//        TableFill gmtCreate = new TableFill("gmt_create", FieldFill.INSERT);
//        TableFill gmtModified = new TableFill("gmt_modified", FieldFill.INSERT_UPDATE);
//        ArrayList<TableFill> tableFills = new ArrayList<>();
//        tableFills.add(gmtCreate);
//        tableFills.add(gmtModified);
//        strategy.setTableFillList(tableFills);
//        // 乐观锁
//        strategy.setVersionFieldName("version");
//        strategy.setRestControllerStyle(true);
//        strategy.setControllerMappingHyphenStyle(true);
//        mpg.setStrategy(strategy);
//        //执行
//        mpg.execute();
    }
}
