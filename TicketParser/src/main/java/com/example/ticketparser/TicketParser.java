package com.example.ticketparser;

import java.util.List;

public class TicketParser {
    public static void main(String[] args) {
        List<Tickets> tickets = JsonReader.readTickets("src/main/resources/tickets.json");

        if (tickets != null) {
            for (Tickets ticket : tickets) {
                System.out.println(ticket);
            }
        } else {
            System.out.println("No tickets found or error reading the file.");
        }
    }
}

