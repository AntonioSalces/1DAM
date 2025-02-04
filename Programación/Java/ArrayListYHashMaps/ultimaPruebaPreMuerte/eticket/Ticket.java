package eticket;

import java.util.Date;
import java.util.HashMap;

public class Ticket implements TicketInterface{
    private static int nextCode = 1;
    private int code;
    private Date date;
    private HashMap<Product, TicketLine> lines;

    public Ticket() {
        code = nextCode++;
        date = new Date();
        lines = new HashMap<>();
    }
    
    @Override
    public void add(Product p, int amount) {
        if (p == null) {
            System.out.println("El producto no existe");
        }
        if (amount <= 0) {
            System.out.println("La cantidad debe de ser mayor a 0");
        }
        if (lines.containsKey(p)) {
            TicketLine line = lines.get(p);
            line.modifyAmount(line.getAmount() + amount);
        } else {
            lines.put(p, new TicketLine(p, amount));
        }
    }

    @Override
    public void remove(Product p, int amount) throws ProductDoesNotExists, NotEnoughStock{
        if (p == null) {
            throw new ProductDoesNotExists();
        }
        TicketLine line = lines.get(p);
        if (amount > line.getAmount()) {
            throw new NotEnoughStock();
        }
        if (amount == line.getAmount()) {
            lines.remove(p);
        } else {
            line.modifyAmount(line.getAmount() - amount);
        }
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public double getTotalPrice() {
        double total = 0;
        for (TicketLine line : lines.values()) {
            total += line.getTotalPrice();
        }
        return total;
    }
    
    @Override
    public String toString() {
        String totalLines = "";
        for (TicketLine line : lines.values()) {
            totalLines += line.toString();
        }
        totalLines += String.format("""
            %50s %-10.2f $""", "Total", getTotalPrice());
        return totalLines;
    }
}
