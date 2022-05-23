package me.dio.academia.digital.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {
 @Autowired 
 private getAllAvaliacaoFisicaServiceImpl service;
 @PostMapping
 public AvaliacaoFisica creat (@RequestBody AvaliacaoFisica form) {
     return service.create(form)
 }
}


