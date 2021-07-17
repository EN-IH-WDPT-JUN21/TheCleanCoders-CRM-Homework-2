package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Product;
import com.thecleancoders.crm.enums.Status;

public class Opportunity {
    //Properties

    private String id;
    private Product product;
    private int quantity;
    private Contact decisionMaker;
    private Status status;

    //Constructor

    public Opportunity(String id, Product product, int quantity, Contact decisionMaker, Status status) {
        setId(id);
        setProduct(product);
        setQuantity(quantity);
        setDecisionMaker(decisionMaker);
        setStatus(status);
    }


    // Setters

    public void setId(String id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setDecisionMaker(Contact decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    //Getters

    public String getId() {
        return this.id;
    }

    public Product getProduct() {
        return this.product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public Contact getDecisionMaker() {
        return this.decisionMaker;
    }

    public Status getStatus() {
        return status;
    }

    public String getOpportunityInfo() {
        return "Product: " + this.product + ". Quantity: " + this.quantity + ". STATUS: " + this.status;
    }

    @Override
    public String toString() {
        return "=== Opportunity " + id + " ===" + '\n' +
                "· product : " + product + '\n' +
                "· quantity : " + quantity + '\n' +
                "· decision maker : " + decisionMaker + '\n' +
                "· status : " + status + '\n';
    }
}
