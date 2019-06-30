package com.zxbking.dzfpkpfw;

import com.ihyht.alyxjs.nbjcpt.component.generator.CodeGenerator;
import com.ihyht.commons.lang.StringUtils;
import org.junit.Test;

import java.util.Date;

/**
 * Created by zxbking on 2019/5/6.
 */
public class CodeGeneratorTest {

    @Test
    public void run() throws Exception {
        //模型路径
        String base = "D:\\Codebase\\mystart\\kfk_zk\\dzfpkpfw\\module-service\\src\\main\\java\\com\\zxbking\\dzfpkpfw\\";
        String path = base+"model";
        String controllerPath = "D:\\Codebase\\mystart\\kfk_zk\\dzfpkpfw\\app-dzfpkpfw\\src\\main\\java\\com\\zxbking\\dzfpkpfw\\console";
        String daoPath = base;
        String packageController = "com.zxbking.dzfpkpfw.console";
        String dao = "com.zxbking.dzfpkpfw";
        String rooturi = "/rest";
        String abstractRestControllerUri = "com.zxbking.dzfpkpfw.base.AbstractRestController";
        String baseVoUri = "com.ihyht.alyxjs.nbjcpt.base.BaseVo";
        CodeGenerator.run(path,controllerPath,daoPath,packageController,dao,rooturi,abstractRestControllerUri,baseVoUri,true);
    }
}