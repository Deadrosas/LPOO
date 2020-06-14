public class Ticket {

    private int  ticketNumber;
    private Concert concert;

    public Ticket(int ticketNumber, Concert concert) throws InvalidTicket {
        if(ticketNumber<1){
            throw new InvalidTicket("Invalid Ticket");
        }
        this.ticketNumber = ticketNumber;
        this.concert = concert;
    }

    public Concert getConcert(){
        return this.concert;
    }

    public int getNumber(){
        return this.ticketNumber;
    }
}
