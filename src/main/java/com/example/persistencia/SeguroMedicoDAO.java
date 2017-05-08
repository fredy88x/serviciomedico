package com.example.persistencia;

import java.util.List;

import com.example.dominio.SeguroMedico;
import com.example.exceptions.BussinesException;

public interface SeguroMedicoDAO {

	public void insert(SeguroMedico seguroMedico)throws BussinesException;
	public void update(int idSeguroMedico, SeguroMedico seguroMedico)throws BussinesException;
	public SeguroMedico get(int idSeguroMedico)throws BussinesException;
	public void delete(int idSeguroMedico)throws BussinesException;
	List<SeguroMedico> findAll()throws BussinesException;
}
