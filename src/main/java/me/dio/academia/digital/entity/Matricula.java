package me.dio.academia.digital.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
@entity
@Table(name = "tb_matriculas")


public class Matricula {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
      private Long id;
  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "aluno_id")
      private Aluno aluno;

      private LocalDateTime dataDaMatricula = LocalDateTime.now();

    public void setAluno(Aluno aluno2) {
}

public LocalDateTime getDataDaMatricula() {
  return dataDaMatricula;
}

public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
  this.dataDaMatricula = dataDaMatricula;
}
}
