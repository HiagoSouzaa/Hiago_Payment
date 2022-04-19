package univas.edu.HiagoDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import univas.edu.Hiago.model.Payment;

@Repository
public interface PaymentDAO extends JpaRepository<Payment, Long> {}
