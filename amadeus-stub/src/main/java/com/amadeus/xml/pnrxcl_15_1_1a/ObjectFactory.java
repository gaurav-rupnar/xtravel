
package com.amadeus.xml.pnrxcl_15_1_1a;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.xml.pnrxcl_15_1_1a package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.xml.pnrxcl_15_1_1a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PNRCancel }
     * 
     */
    public PNRCancel createPNRCancel() {
        return new PNRCancel();
    }

    /**
     * Create an instance of {@link PNRCancel.CancelElements }
     * 
     */
    public PNRCancel.CancelElements createPNRCancelCancelElements() {
        return new PNRCancel.CancelElements();
    }

    /**
     * Create an instance of {@link PNRCancel.ReservationInfo }
     * 
     */
    public PNRCancel.ReservationInfo createPNRCancelReservationInfo() {
        return new PNRCancel.ReservationInfo();
    }

    /**
     * Create an instance of {@link PNRCancel.PnrActions }
     * 
     */
    public PNRCancel.PnrActions createPNRCancelPnrActions() {
        return new PNRCancel.PnrActions();
    }

    /**
     * Create an instance of {@link PNRCancel.CancelElements.Element }
     * 
     */
    public PNRCancel.CancelElements.Element createPNRCancelCancelElementsElement() {
        return new PNRCancel.CancelElements.Element();
    }

    /**
     * Create an instance of {@link PNRCancel.ReservationInfo.Reservation }
     * 
     */
    public PNRCancel.ReservationInfo.Reservation createPNRCancelReservationInfoReservation() {
        return new PNRCancel.ReservationInfo.Reservation();
    }

}
