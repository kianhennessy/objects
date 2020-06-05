class Ticket{
	private String ticketName;
	private Date ticketDate;

	public Ticket(String name, Date date){
		this.ticketName = name;
		this.ticketDate = date;
	}

	public void display(){
		System.out.println("Ticket name: " + ticketName);
		System.out.println("Ticket date: " + ticketDate.toString());
	}
}


