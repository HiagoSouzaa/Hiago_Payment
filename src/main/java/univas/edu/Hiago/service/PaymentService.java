package univas.edu.Hiago.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import univas.edu.Hiago.Exceptions.InvalidDataException;
import univas.edu.Hiago.Exceptions.ObjectNotFoundException;
import univas.edu.Hiago.dto.PaymentDTO;
import univas.edu.Hiago.model.Auditing;
import univas.edu.Hiago.model.Payment;
import univas.edu.HiagoDAO.PaymentDAO;

@Service
public class PaymentService {

	@Autowired
    private PaymentDAO payment_typeDAO;
	private JpaRepository<Payment,Long> paymentDAO;
	private Object payment;
	private Object Product_code;
	private Object Due_date;
	private Object Value;
	private Object Payment_type;

    public List<PaymentDTO> getAllPayments() {
        List<Payment> listPayment = paymentDAO.findAll();

        return listPayment.stream()
                .map(payment -> new PaymentDTO(payment))
                .collect(Collectors.toList());
    }

    public Payment getPaymentById(@PathVariable Long code) {
        if(code == null) {
            throw new InvalidDataException("Identificador não pode ser null.");
        }
        Optional<Payment> obj = paymentDAO.findById(code);

        return obj.orElseThrow(() -> new ObjectNotFoundException("payment não encontrado: " + code));
    }

    public void createPayment(PaymentDTO dto) {
        Payment payment = toPayment(dto);
        paymentDAO.save(payment);
    }

    private Payment toPayment(PaymentDTO dto) {
        Payment payment = new Payment(null, null, null, 0, null);

        this.Product_code = getProduct_code();
        this.payment = getPayment_date();
        this.Due_date = Due_date();
        this.Value = getValue();
        this.Payment_type = Payment_type();
		return payment;
        		
        
    }

    private Object Payment_type() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object Due_date() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getProduct_code() {
		// TODO Auto-generated method stub
		return null;
	}

	public void updatePayment(PaymentDTO dto, Long code) {
        if(dto == null) {
            throw new InvalidDataException("Product não pode ser null.");
        }
        Payment product = getPaymentById(code);
        updateProduct(dto, payment);
      //  paymentDAO.save(payment);
    }

    private void updateProduct(PaymentDTO dto, Object payment2) {
		// TODO Auto-generated method stub
		
	}

	private void updatePayment(PaymentDTO dto, Payment payment) {
		this.Product_code = getProduct_code();
        this.payment = getPayment_date();
        this.Due_date = getPayment_date();
        this.Value = getValue();
        this.Payment_type = getPayment_date();
    }

    private Object getValue() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object getPayment_date() {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteProduct(Long code) {
        Payment payment = getPaymentById(code);
        paymentDAO.delete(payment);
    }
}
