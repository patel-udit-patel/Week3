package com.online_ticket_reservation_system;

public class OnlineTicketReservation {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        system.addTicket(101, "Alice", "Inception", 5, "10:00 AM");
        system.addTicket(102, "Bob", "Interstellar", 8, "1:00 PM");
        system.addTicket(103, "Charlie", "Dune", 12, "3:30 PM");

        System.out.println("Current Ticket Reservations:");
        system.displayTickets();

        System.out.println("\nSearching for tickets for 'Alice':");
        system.searchTicket("Alice");

        System.out.println("\nRemoving ticket with ID 102...");
        system.removeTicket(102);
        system.displayTickets();

        System.out.println("\nTotal tickets booked: " + system.getTotalTickets());
    }
}
