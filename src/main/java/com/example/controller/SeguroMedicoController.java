package com.example.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SeguroMedicoController {

	@RequestMapping(value="/SeguroMedico/{idSeguroMedico}", method=RequestMethod.GET, produces="application/json")
	public void read(@PathVariable("idSeguroMedico")int idSeguroMedico){

	}
	@RequestMapping(value="/SeguroMedico", method=RequestMethod.POST, consumes="application/json", produces="application/json")
	public void insert(HttpServletRequest request,@RequestBody String jsonEntrada){

	}
}
