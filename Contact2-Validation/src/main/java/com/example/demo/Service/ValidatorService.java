package com.example.demo.Service;

import java.io.IOException;

import javax.script.ScriptException;

public interface ValidatorService {
	
	boolean myValidator(String x) throws ScriptException, IOException, NoSuchMethodException;

}
