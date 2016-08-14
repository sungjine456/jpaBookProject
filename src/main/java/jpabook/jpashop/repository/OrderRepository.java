package jpabook.jpashop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import jpabook.jpashop.domain.Order;

/**
 * User: HolyEyE
 * Date: 2013. 12. 3. Time: 오후 10:28
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long>, JpaSpecificationExecutor<Order>{

}
