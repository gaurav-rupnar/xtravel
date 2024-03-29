
package com.amadeus.xml.cltres_04_1_ia;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.xml.cltres_04_1_ia package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.xml.cltres_04_1_ia
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PNRIgnoreReply }
     * 
     */
    public PNRIgnoreReply createPNRIgnoreReply() {
        return new PNRIgnoreReply();
    }

    /**
     * Create an instance of {@link PNRIgnoreReply.SbrRecLoc }
     * 
     */
    public PNRIgnoreReply.SbrRecLoc createPNRIgnoreReplySbrRecLoc() {
        return new PNRIgnoreReply.SbrRecLoc();
    }

    /**
     * Create an instance of {@link PNRIgnoreReply.ClearInformation }
     * 
     */
    public PNRIgnoreReply.ClearInformation createPNRIgnoreReplyClearInformation() {
        return new PNRIgnoreReply.ClearInformation();
    }

    /**
     * Create an instance of {@link PNRIgnoreReply.SbrRecLoc.Reservation }
     * 
     */
    public PNRIgnoreReply.SbrRecLoc.Reservation createPNRIgnoreReplySbrRecLocReservation() {
        return new PNRIgnoreReply.SbrRecLoc.Reservation();
    }

}
