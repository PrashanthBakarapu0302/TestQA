package com.Utilities;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonUtil {
	
	//master is updating
	
	//serialize POJO into JSON String
	
	private static final ObjectMapper mapper= new ObjectMapper();
	
	public static<T> T fromJsonFile(String filepath,Class<T> clazz)
	{
		
		try
		{
			return mapper.readValue(new File(filepath), clazz);
			
		}
		
		catch(IOException e)
		{
			throw new
			RuntimeException("failed to parse json");
		}
	}

}
