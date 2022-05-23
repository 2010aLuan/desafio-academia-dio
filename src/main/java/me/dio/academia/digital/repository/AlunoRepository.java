package me.dio.academia.digital.repository;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

  List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);

}
