package univas.edu.Hiago.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import javax.validation.Valid;
import java.util.List;

import univas.edu.Hiago.dto.PaymentDTO;
import univas.edu.Hiago.model.Auditing;
import univas.edu.Hiago.model.Payment;
import univas.edu.Hiago.service.AuditingService;
import univas.edu.Hiago.service.PaymentService;
import univas.edu.HiagoDAO.AuditingDAO;

@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
    private PaymentService service;
	private AuditingDAO auditingDAO;

    @GetMapping()
    public List<PaymentDTO> getAllPayments() {
        return service.getAllPayments();
    }

    @GetMapping("/{code}")
    public PaymentDTO getPaymentById(@PathVariable Long code) {
    	Payment payment = service.getPaymentById(code);
        return new PaymentDTO(payment);
    }

    @PutMapping("/{code}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePayment(@RequestBody @Valid PaymentDTO dto, @PathVariable Long code) {
        service.updatePayment(dto, code);
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public void createPayment(@RequestBody @Valid PaymentDTO dto) {
        service.createPayment(dto);
    }

    @DeleteMapping("/{code}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePayment(@PathVariable PaymentDTO code) {
        service.createPayment(code);
    }
}
