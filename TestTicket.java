public class TestTicket{

	public static void main(String[] args){
		Date u2concertDate = new Date(5,5,2020);

		Ticket ticket1 = new Ticket("U2 Slane Concert",u2concertDate);
		Ticket ticket2 = new Ticket("Cinema Ticket",new Date(6,8,2021));

		Ticket [] tickets = new Ticket[4];
		tickets[0] = new Ticket("U2 Slane Concert",u2concertDate);
		tickets[1] = new Ticket("Cinema Ticket",new Date(2,11,2020));
		tickets[2] = new Ticket("Bus Ticket",new Date(10,1,2021));
		tickets[3] = new Ticket("Electric Picnic",new Date(1,9,2020));

		for(int i = 0; i < tickets.length; i++){
			tickets[i].display();
		}
	}
}




