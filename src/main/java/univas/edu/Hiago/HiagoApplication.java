package univas.edu.Hiago;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import univas.edu.Hiago.model.Payment;
import univas.edu.Hiago.model.support.PaymentCategory;
import univas.edu.HiagoDAO.PaymentDAO;

@SpringBootApplication
public class HiagoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(HiagoApplication.class, args);
	}

	@Autowired
	private PaymentDAO product;

	@Override
	public void run(String... args) throws Exception {
		Payment payment_1 = new Payment("SSD", "Armazenador de Arquivos", 400, PaymentCategory.MEDIUM);
		product.save(payment_1);

		Payment payment_2 = new Payment("HD", "Armazenador de Arquivos", 100, PaymentCategory.MEDIUM);
		product.save(payment_2);
	}
}
