package univas.edu.Hiago.model.support;

import java.util.stream.Stream;

import univas.edu.Hiago.Exceptions.InvalidDataException;

public enum PaymentCategory {
	
	LOW(1), MEDIUM(2), HIGH(3);
	
	private int code;
	
	private PaymentCategory(int code) {
		this.code = code;
	}
	
	public static PaymentCategory getPriority(Integer code) {
		return Stream.of(PaymentCategory.values())
				.filter(t -> t.getCode() == code)
				.findFirst()
				.orElseThrow(() -> new InvalidDataException("Prioridade inválida: " + code));
	}
	
	public int getCode() {
		return code;
	}
}
