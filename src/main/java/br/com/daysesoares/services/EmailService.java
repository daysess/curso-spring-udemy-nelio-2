package br.com.daysesoares.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.daysesoares.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmtionEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
