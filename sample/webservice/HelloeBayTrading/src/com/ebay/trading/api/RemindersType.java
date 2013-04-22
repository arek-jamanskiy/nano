// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Specifies the type of reminders for which you want information.
 * 
 */
public class RemindersType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "PaymentToSendCount")
	@Order(value=0)
	public Integer paymentToSendCount;	
	
	@Element(name = "FeedbackToReceiveCount")
	@Order(value=1)
	public Integer feedbackToReceiveCount;	
	
	@Element(name = "FeedbackToSendCount")
	@Order(value=2)
	public Integer feedbackToSendCount;	
	
	@Element(name = "OutbidCount")
	@Order(value=3)
	public Integer outbidCount;	
	
	@Element(name = "PaymentToReceiveCount")
	@Order(value=4)
	public Integer paymentToReceiveCount;	
	
	@Element(name = "SecondChanceOfferCount")
	@Order(value=5)
	public Integer secondChanceOfferCount;	
	
	@Element(name = "ShippingNeededCount")
	@Order(value=6)
	public Integer shippingNeededCount;	
	
	@Element(name = "RelistingNeededCount")
	@Order(value=7)
	public Integer relistingNeededCount;	
	
	@Element(name = "TotalNewLeadsCount")
	@Order(value=8)
	public Integer totalNewLeadsCount;	
	
	@Element(name = "DocsForCCProcessingToSendCount")
	@Order(value=9)
	public Integer docsForCCProcessingToSendCount;	
	
	@Element(name = "RTEToProcessCount")
	@Order(value=10)
	public Integer rteToProcessCount;	
	
	@Element(name = "ItemReceiptToConfirmCount")
	@Order(value=11)
	public Integer itemReceiptToConfirmCount;	
	
	@Element(name = "RefundOnHoldCount")
	@Order(value=12)
	public Integer refundOnHoldCount;	
	
	@Element(name = "RefundCancelledCount")
	@Order(value=13)
	public Integer refundCancelledCount;	
	
	@Element(name = "ShippingDetailsToBeProvidedCount")
	@Order(value=14)
	public Integer shippingDetailsToBeProvidedCount;	
	
	@Element(name = "ItemReceiptConfirmationToReceiveCount")
	@Order(value=15)
	public Integer itemReceiptConfirmationToReceiveCount;	
	
	@Element(name = "RefundInitiatedCount")
	@Order(value=16)
	public Integer refundInitiatedCount;	
	
	@Element(name = "PendingRTERequestCount")
	@Order(value=17)
	public Integer pendingRTERequestCount;	
	
	@Element(name = "DeclinedRTERequestCount")
	@Order(value=18)
	public Integer declinedRTERequestCount;	
	
	@AnyElement
	@Order(value=19)
	public List<Object> any;	
	
    
}