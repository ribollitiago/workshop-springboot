package devspring.ribolli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devspring.ribolli.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}