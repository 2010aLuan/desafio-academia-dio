package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

  Matricula create(MatriculaForm form);
  Matricula get(Long id);
  List<Matricula> getAll();

  void delete(Long id);

}
