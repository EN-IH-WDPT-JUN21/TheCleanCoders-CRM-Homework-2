package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Product;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpportunityTest {

    @Test
    @DisplayName("Id of different Opportunity objects are not the same")
    public void generateNewOpportunityObject_opportunityIdNotEqual(){
        Lead lead = new Lead("Travis", "666778899", "travis@onecompany.com", "Company One");
        Contact contact = new Contact(lead);
        Opportunity op1 = new Opportunity(Product.BOX, 200, contact);
        Opportunity op2 = new Opportunity(Product.FLATBED, 100, contact);
        assertNotEquals(op1.getId(), op2.getId());
    }
}