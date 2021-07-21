package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Product;
import com.thecleancoders.crm.enums.Status;

import java.util.ArrayList;
import java.util.List;

public class Opportunity extends Item{

    //Properties

    private Product product;
    private int quantity;
    private Contact decisionMaker;
    private Status status;
    protected static List<Item> allOpportunities = new ArrayList<>();

    //Constructor

    public Opportunity(Product product, int quantity, Contact decisionMaker) {
        super(allOpportunities);
        setProduct(product);
        setQuantity(quantity);
        setDecisionMaker(decisionMaker);
        setStatus(Status.OPEN);
    }

    // Methods

    public static void addOpportunityToList(Opportunity opportunity){
        allOpportunities.add(opportunity);
    }

    // Setters

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setQuantity(int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("The number of trucks must be greater than zero.");
        }
        this.quantity = quantity;
    }

    public void setDecisionMaker(Contact decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    //Getters

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

    public static List<Item> getAllOpportunities() {
        return allOpportunities;
    }

    public String getOpportunityInfo() {
        return "Product: " + this.product + ". Quantity: " + this.quantity + ". STATUS: " + this.status;
    }

    @Override
    public String toString() {
        return "=== Opportunity " + getId() + " ===" + '\n' +
                "· product : " + product + '\n' +
                "· quantity : " + quantity + '\n' +
                "· decision maker : " + decisionMaker + '\n' +
                "· status : " + status + '\n';
    }
}
