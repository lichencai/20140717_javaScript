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
        
        //  ��õ�ǰ��������֧�ֵ�jdk��������
        List<ScriptEngineFactory> engineFactories = manager.getEngineFactories();
        
        //  scriptָ��ʹ�����ֽű�����ȥ���Ͷ�ȡ���ļ�
        ScriptEngine engine = manager.getEngineByName(script);
        engine.eval(scriptReader);
    }
}
