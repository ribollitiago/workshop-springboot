package devspring.ribolli.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import devspring.ribolli.course.entities.OrderItem;
import devspring.ribolli.course.entities.User;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}