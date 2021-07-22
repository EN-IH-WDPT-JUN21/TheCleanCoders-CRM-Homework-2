package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeadTest {

    @AfterEach
    void tearDown() {
        Lead.removeAllFromItemList();
        Contact.removeAllFromItemList();
        Opportunity.removeAllFromItemList();

    }

    @Test
    void addLeadToList() {
        int sizeLeadListBeforeAddNewLead = Lead.allLeads.size();
        Lead lead = new Lead("Georg", "123456789", "georg_is_fun@fun.com","Georg Fun");
        int sizeLeadListAfterAddNewLead = Lead.allLeads.size();
        assertEquals(sizeLeadListBeforeAddNewLead+1,sizeLeadListAfterAddNewLead);
    }

    @Test
    void convertToOpportunity() {
        Lead lead = new Lead("Georg", "123456789", "georg_is_fun@fun.com","Georg Fun");
        int sizeLeadListBeforeConvert = Lead.allLeads.size();

        Contact contact = new Contact(lead);
        int sizeContactListBeforeConvert = Contact.allContacts.size();

        Opportunity opportunity = new Opportunity(Product.BOX, 200, contact);
        int sizeOpportunityListBeforeConvert = Opportunity.allOpportunities.size();

        lead.convertToOpportunity(Product.HYBRID, 2);

        int sizeLeadListAfterConvert = Lead.allLeads.size();
        int sizeOpportunityListAfterConvert = Opportunity.allOpportunities.size();
        int sizeContactListAfterConvert = Contact.allContacts.size();

        assertEquals(sizeContactListBeforeConvert + 1, sizeContactListAfterConvert);
        assertEquals(sizeOpportunityListBeforeConvert + 1, sizeOpportunityListAfterConvert);
        assertEquals(sizeLeadListBeforeConvert - 1, sizeLeadListAfterConvert);
    }

    @Test
    void removeLead() {
        Lead lead = new Lead("Georg", "123456789", "georg_is_fun@fun.com","Georg Fun");
        int sizeLeadListBeforeRemoveLead = Lead.allLeads.size();
        lead.removeAllFromItemList();
        int sizeLeadListAfterRemoveLead = Lead.allLeads.size();
        assertEquals(sizeLeadListBeforeRemoveLead-1,sizeLeadListAfterRemoveLead);
    }
}