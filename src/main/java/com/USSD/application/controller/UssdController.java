package com.USSD.application.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class UssdController {
    @RequestMapping(value = "/ussd", method = RequestMethod.POST, produces = "text/plain")
    public String handleUssdRequest(@RequestParam("sessionId") String sessionId,
                                    @RequestParam("phoneNumber") String phoneNumber,
                                    @RequestParam("text") String text) {
        // Parse USSD request text to determine current menu state
        String[] parts = text.split("\\*");
        String state = (parts.length > 0) ? parts[parts.length - 1] : "";

        // Route USSD request to appropriate action method
        if (state.equals("")) {
            // Initial menu state
            return "CON Welcome to our booking service.\n" +
                    "Please select an option:\n" +
                    "1. Book Space\n" +
                    "2. Check Bookings\n" +
                    "3. Cancel Bookings";
        } else if (state.equals("1")) {
            // Book Space action
            // TODO: Implement book space logic
            return "CON Enter your name:";
        } else if (state.equals("1*name")) {
            // Book Space action - Enter name
            // TODO: Save user's name and implement other booking details
            return "CON Enter your email address:";
        } else if (state.equals("2")) {
            // Check Bookings action
            // TODO: Implement check bookings logic
            return "CON Your bookings:\n" +
                    "1. Booking 1\n" +
                    "2. Booking 2\n" +
                    "3. Booking 3";
        } else if (state.equals("3")) {
            // Cancel Bookings action
            // TODO: Implement cancel bookings
}