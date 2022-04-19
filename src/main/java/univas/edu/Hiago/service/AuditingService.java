package univas.edu.Hiago.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import univas.edu.Hiago.Exceptions.ObjectNotFoundException;
import univas.edu.Hiago.model.Auditing;
import univas.edu.HiagoDAO.AuditingDAO;

import java.util.List;
import java.util.Optional;

@Service
public class AuditingService {
	@Autowired
    private AuditingDAO auditingDAO;

    public List<Auditing> getAllAuditings() {
        return auditingDAO.findAll();
    }

    public Auditing getAuditingById(Long id) {
        Optional<Auditing> obj = auditingDAO.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Auditing not found."));
    }

    public void createAuditing(Auditing auditing) {
        auditingDAO.save(auditing);
    }
}
