package kafkawithses;

import java.time.LocalDate;

import services.SESService;

public class KafkaWithSes {

	public static void main(String[] args) {
		SESService.sendMessage("Uma mensagem - " + LocalDate.now());
	}
	
}
