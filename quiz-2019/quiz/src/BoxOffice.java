import java.util.ArrayList;
import java.util.List;

public class BoxOffice {

    static public List<Ticket> buy(Concert concert, int amount) throws InvalidTicket {
        List<Ticket> ticketList = new ArrayList<>();

        for(int i = 0; i < amount ; i++) {
            ticketList.add(new Ticket(concert.getCount(), concert));
            concert.incrementCount();
        }
        return ticketList;
    }
}
