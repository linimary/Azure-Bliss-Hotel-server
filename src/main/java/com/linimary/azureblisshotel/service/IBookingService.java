package com.linimary.azureblisshotel.service;

import com.linimary.azureblisshotel.model.BookedRoom;

import java.util.List;

public interface IBookingService {
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);

    void cancelBooking(Long bookingId);

    String saveBooking(Long roomId, BookedRoom bookingRequest);

    BookedRoom findByBookingConfirmationCode(String confirmationCode);

    List<BookedRoom> getAllBookings();

    List<BookedRoom> getBookingByUserEmail(String email);
}
