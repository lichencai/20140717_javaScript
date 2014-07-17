package javaScript.reader;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineFactory;
import javax.script.ScriptEngineManager;

public class RunScript {
	public static void main(String[] args) throws Exception {
        String script = "javascript";
        String file = "config/run.js";
        InputStream input = RunScript.class.getClassLoader().getResourceAsStream(file);
        InputStreamReader scriptReader = new InputStreamReader(input);
        ScriptEngineManager manager = new ScriptEngineManager();
        
        List<ScriptEngineFactory> engineFactories = manager.getEngineFactories();
        
        //  script指定使用哪种脚本引擎去解释读取的文件
        ScriptEngine engine = manager.getEngineByName(script);
        engine.eval(scriptReader);
    }
}
