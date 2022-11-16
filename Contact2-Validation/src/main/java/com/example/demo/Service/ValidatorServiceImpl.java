package com.example.demo.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Predicate;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

import org.graalvm.polyglot.Context;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.graalvm.polyglot.*;

@Service
public class ValidatorServiceImpl implements ValidatorService{

	@Override
	public boolean myValidator(String x) throws ScriptException, IOException, NoSuchMethodException {
		// TODO Auto-generated method stub
		
		System.out.println("Inside function");
		
		//Context jsContext = Context.create("js");
		
		ScriptEngineManager manager = new ScriptEngineManager();
		
		//ScriptEngine engine = manager.getEngineByName("JavaScript");
		ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
		
		// read script file
		//FileInputStream fileInputStream = new FileInputStream("C:/Users/pranav_dudhe/Desktop/validate.js");
        System.out.println("okay2");
        
        //if (fileInputStream != null){
	        //BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            File file = ResourceUtils.getFile("classpath:static/validate.js");
	        engine.eval(new FileReader(file));
			//engine.eval(Files.newBufferedReader(Paths.get("C:/Users/pranav_dudhe/Desktop/validate.js"), StandardCharsets.UTF_8));
	
			Invocable inv = (Invocable) engine;
			// call function from script file
			
			int num = 10;
			System.out.println("invocableEngine is : "+inv);
			
			String email = x;
			String phone =x;
//			Object obj = inv.invokeFunction("add", num);
//			System.out.println(obj);
			Object obj2 = inv.invokeFunction("ValidateEmail", email);
			System.out.println("obj2 : "+obj2);
			Object obj3 = inv.invokeFunction("validatePhone", phone);
			System.out.println("obj3 : "+obj3);
			if(obj2.equals(true) || obj3.equals(true)) {
				System.out.println("return true");
				return true;
			}
			else {
				return false;
			}
			
			
		
        //}
	}
}
