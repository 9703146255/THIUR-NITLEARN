package in.thiru;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import in.thiru.model.Ticket;
import in.thiru.service.TicketService;

@SpringBootApplication
public class Application implements CommandLineRunner{
	
	@Autowired
	private TicketService ticketService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		
	     Ticket tktObj1=new Ticket();
	     tktObj1.setPassengerName("THIRUMALESH");
	     tktObj1.setEmailId("findmethiru@gmail.com");
	     tktObj1.setSourceStation("hyderabad");
	     tktObj1.setDestStation("chennai");
	     tktObj1.setDateOfJourney(new Date());
	     
	     ticketService.createTicket(tktObj1);
	     
	     
	     Ticket tktObj2=new Ticket();
	     tktObj2.setPassengerName("charan");
	     tktObj2.setEmailId("charan@gmail.com");
	     tktObj2.setSourceStation("hyderabad");
	     tktObj2.setDestStation("vijayawada");
	     tktObj2.setDateOfJourney(new Date());
	     ticketService.createTicket(tktObj2);
	     
	     Ticket tktObj3=new Ticket();
	     tktObj3.setPassengerName("vinay");
	     tktObj3.setEmailId("vinay@gmail.com");
	     tktObj3.setSourceStation("hyderabad");
	     tktObj3.setDestStation("kerala");
	     tktObj3.setDateOfJourney(new Date());
	     ticketService.createTicket(tktObj3);
	     
	     
	     Ticket tktObj4=new Ticket();
	     tktObj4.setPassengerName("kiran");
	     tktObj4.setEmailId("kiran@gmail.com");
	     tktObj4.setSourceStation("hyderabad");
	     tktObj4.setDestStation("vijayanagaram");
	     tktObj4.setDateOfJourney(new Date());
	     
	     ticketService.createTicket(tktObj4);
	     Ticket tktObj5=new Ticket();
	     tktObj5.setPassengerName("vasu");
	     tktObj5.setEmailId("vasu@gmail.com");
	     tktObj5.setSourceStation("hyderabad");
	     tktObj5.setDestStation("kurnool");
	     tktObj5.setDateOfJourney(new Date());
	     
	     
	     ticketService.createTicket(tktObj5);
		
		
	}

}
