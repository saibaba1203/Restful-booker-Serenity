package com.booker.restful.model;

import java.util.Date;

public class BookingDates {
    public Date checkin;
    public Date checkout;

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }
        public static BookingDates getBookingDates (Date checkin, Date checkout){
            BookingDates bookingDates = new BookingDates();
            bookingDates.setCheckin(checkin);
            bookingDates.setCheckout(checkout);
            return bookingDates;
        }
    }
