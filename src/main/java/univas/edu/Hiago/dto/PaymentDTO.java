package univas.edu.Hiago.dto;

import univas.edu.Hiago.model.Payment;
import univas.edu.Hiago.model.support.PaymentCategory;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.util.Date;

public class PaymentDTO {

    private Long code;

    @NotNull(message = "O nome não pode ser nulo.")
    @NotEmpty(message = "o nome não pode ser vazio.")
    @Size(min = 1, max = 30, message = "Nome deve possuir entre 1 e 30 caracteres.")
    private String name;

    @NotNull(message = "O preço não pode ser null.")
    @Positive(message = "O preço deve ser um valor positivo.")
    private float price;

    @NotNull(message = "O fornecedor não pode ser nulo.")
    @NotEmpty(message = "O fornecedor não pode ser vazio.")
    private String description;

    private PaymentCategory category;

	private Long Product_code;

	private Date Payment_date;

	private Object Due_date;

	private Object Value;

	private Object Payment_type;

    public PaymentDTO() {}

    public PaymentDTO(Payment payment) {
    	 this.Product_code = getProduct_code();
         this.Payment_date = getPayment_date();
         this.Due_date = getDue_date();
         this.Value = getValue();
         this.Payment_type = getPayment_type();
     }
    

public Long getProduct_code() {
	return Product_code;
}

public void setProduct_code(Long product_code) {
	Product_code = product_code;
}

public Date getPayment_date() {
	return Payment_date;
}

public void setPayment_date(Date payment_date) {
	Payment_date = payment_date;
}

public Date getDue_date() {
	return (Date) Due_date;
}

public void setDue_date(Date due_date) {
	Due_date = due_date;
}

public float getValue() {
	return (float) Value;
}

public void setValue(float value) {
	Value = value;
}

public String getPayment_type() {
	return (String) Payment_type;
}

public void setPayment_type(String payment_type) {
	Payment_type = payment_type;
}



	

}