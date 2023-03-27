package devspring.ribolli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devspring.ribolli.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}