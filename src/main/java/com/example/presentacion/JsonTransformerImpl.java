package com.example.presentacion;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTransformerImpl implements JsonTransformer {

	@Override
	public String toJson(Object data) {
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			return objectMapper.writeValueAsString(data);
		}catch(JsonProcessingException e){
			throw new RuntimeException();
		}
	}

	@Override
	public Object fromJson(String json, Class clazz) {
		try{
			ObjectMapper mapper = new ObjectMapper();
			return mapper.readValue(json, clazz);
		}catch(IOException e){
			throw new RuntimeException();
		}
	}

}
