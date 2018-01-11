
package com.amadeus.xml.quqmdr_03_1_1a;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.amadeus.xml.quqmdr_03_1_1a package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.amadeus.xml.quqmdr_03_1_1a
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link QueueRemoveItemReply }
     * 
     */
    public QueueRemoveItemReply createQueueRemoveItemReply() {
        return new QueueRemoveItemReply();
    }

    /**
     * Create an instance of {@link QueueRemoveItemReply.ErrorReturn }
     * 
     */
    public QueueRemoveItemReply.ErrorReturn createQueueRemoveItemReplyErrorReturn() {
        return new QueueRemoveItemReply.ErrorReturn();
    }

    /**
     * Create an instance of {@link QueueRemoveItemReply.ErrorReturn.ErrorText }
     * 
     */
    public QueueRemoveItemReply.ErrorReturn.ErrorText createQueueRemoveItemReplyErrorReturnErrorText() {
        return new QueueRemoveItemReply.ErrorReturn.ErrorText();
    }

    /**
     * Create an instance of {@link QueueRemoveItemReply.ErrorReturn.ErrorDefinition }
     * 
     */
    public QueueRemoveItemReply.ErrorReturn.ErrorDefinition createQueueRemoveItemReplyErrorReturnErrorDefinition() {
        return new QueueRemoveItemReply.ErrorReturn.ErrorDefinition();
    }

    /**
     * Create an instance of {@link QueueRemoveItemReply.GoodResponse }
     * 
     */
    public QueueRemoveItemReply.GoodResponse createQueueRemoveItemReplyGoodResponse() {
        return new QueueRemoveItemReply.GoodResponse();
    }

    /**
     * Create an instance of {@link QueueRemoveItemReply.ErrorReturn.ErrorText.FreeTextDetails }
     * 
     */
    public QueueRemoveItemReply.ErrorReturn.ErrorText.FreeTextDetails createQueueRemoveItemReplyErrorReturnErrorTextFreeTextDetails() {
        return new QueueRemoveItemReply.ErrorReturn.ErrorText.FreeTextDetails();
    }

    /**
     * Create an instance of {@link QueueRemoveItemReply.ErrorReturn.ErrorDefinition.ErrorDetails }
     * 
     */
    public QueueRemoveItemReply.ErrorReturn.ErrorDefinition.ErrorDetails createQueueRemoveItemReplyErrorReturnErrorDefinitionErrorDetails() {
        return new QueueRemoveItemReply.ErrorReturn.ErrorDefinition.ErrorDetails();
    }

}
