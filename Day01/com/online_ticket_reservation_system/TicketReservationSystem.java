package com.online_ticket_reservation_system;

public class TicketReservationSystem {
    private Ticket head;
    private Ticket tail;
    private int ticketCount;

    public TicketReservationSystem() {
        this.head = null;
        this.tail = null;
        this.ticketCount = 0;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(int ticketID, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketID, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            tail = newTicket;
            tail.next = head;
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head;
        }
        ticketCount++;
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) return;
        Ticket curr = head, prev = null;
        do {
            if (curr.ticketID == ticketID) {
                if (curr == head && head.next == head) {
                    head = null;
                    tail = null;
                } else if (curr == head) {
                    tail.next = head.next;
                    head = head.next;
                } else {
                    prev.next = curr.next;
                    if (curr == tail) tail = prev;
                }
                ticketCount--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display the current tickets in the list
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        Ticket temp = head;
        do {
            System.out.println("Ticket ID: " + temp.ticketID + " | Customer: " + temp.customerName + " | Movie: " + temp.movieName + " | Seat: " + temp.seatNumber + " | Time: " + temp.bookingTime);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets found.");
            return;
        }
        Ticket temp = head;
        boolean found = false;
        do {
            if (temp.customerName.equalsIgnoreCase(query) || temp.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket Found: " + "Ticket ID: " + temp.ticketID + " | Customer: " + temp.customerName + " | Movie: " + temp.movieName + " | Seat: " + temp.seatNumber + " | Time: " + temp.bookingTime);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);
        if (!found) System.out.println("No matching ticket found.");
    }

    // Calculate the total number of booked tickets
    public int getTotalTickets() {
        return ticketCount;
    }
}
