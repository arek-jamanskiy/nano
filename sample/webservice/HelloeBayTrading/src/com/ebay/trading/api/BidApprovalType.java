// Generated by xsd compiler for android/java
// DO NOT CHANGE!
package com.ebay.trading.api;

import java.io.Serializable;
import com.leansoft.nano.annotation.*;
import java.util.List;

/**
 * 
 * Information that a Live Auction seller selects when approving or denying
 * a user who wants to bid on items in the seller's Live Auctions catalog.
 * 
 */
public class BidApprovalType implements Serializable {

    private static final long serialVersionUID = -1L;

	@Element(name = "UserID")
	@Order(value=0)
	public String userID;	
	
	@Element(name = "ApprovedBiddingLimit")
	@Order(value=1)
	public AmountType approvedBiddingLimit;	
	
	@Element(name = "DeclinedComment")
	@Order(value=2)
	public String declinedComment;	
	
	@Element(name = "Status")
	@Order(value=3)
	public BidderStatusCodeType status;	
	
	@AnyElement
	@Order(value=4)
	public List<Object> any;	
	
    
}