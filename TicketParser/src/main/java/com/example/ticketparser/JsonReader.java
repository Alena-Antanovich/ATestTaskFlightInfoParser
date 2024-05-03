package com.example.ticketparser;

import com.google.gson.Gson;
import java.io.FileReader;
import java.util.List;

public class JsonReader {
    public static List<Tickets> readTickets(String filePath) {
        Gson gson = new Gson();
        try (FileReader reader = new FileReader("src/main/resources/tickets.json")) {
            TicketContainer ticketContainer = gson.fromJson(reader, TicketContainer.class);
            return ticketContainer.getTickets();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}