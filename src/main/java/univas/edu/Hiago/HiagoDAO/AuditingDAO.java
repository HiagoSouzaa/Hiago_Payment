package univas.edu.HiagoDAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import univas.edu.Hiago.model.Auditing;

@Repository
public interface AuditingDAO extends JpaRepository<Auditing, Long>{

}
