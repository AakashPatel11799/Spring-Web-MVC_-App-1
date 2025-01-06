package in.aakash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.aakash.entity.StudentEntity;

public interface StudentEntityRepository extends JpaRepository<StudentEntity, Integer> {

}
