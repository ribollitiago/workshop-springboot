package devspring.ribolli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devspring.ribolli.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}