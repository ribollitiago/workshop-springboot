package devspring.ribolli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devspring.ribolli.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
