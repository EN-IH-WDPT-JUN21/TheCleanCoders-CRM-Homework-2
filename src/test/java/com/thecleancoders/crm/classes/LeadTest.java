package com.thecleancoders.crm.classes;

import com.thecleancoders.crm.enums.Industry;
import com.thecleancoders.crm.enums.Product;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeadTest {

    static Lead lead;
    static Contact contact;
    static Opportunity opportunity;
    static Account account;

    @BeforeEach
    void setUp() {
        lead = new Lead("Travis", "666778899", "travis@onecompany.com", "Company One");
        contact = new Contact(lead);
        opportunity = new Opportunity(Product.BOX, 200, contact);
        account = new Account(lead, contact, opportunity, Industry.MANUFACTURING, 2, "Ostrava", "Czech Republic");
    }


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
        Lead lead2 = new Lead("Georg", "123456789", "georg_is_fun@fun.com","Georg Fun");

        int sizeLeadListBeforeConvert = Lead.allLeads.size();
        int sizeContactListBeforeConvert = Contact.allContacts.size();
        int sizeOpportunityListBeforeConvert = Opportunity.allOpportunities.size();
        int sizeAccountListBeforeConvert = Account.allAccounts.size();

        lead2.convertToOpportunity(Product.HYBRID, 2, Industry.ECOMMERCE, 10, "Munich", "Germany");

        int sizeLeadListAfterConvert = Lead.allLeads.size();
        int sizeOpportunityListAfterConvert = Opportunity.allOpportunities.size();
        int sizeContactListAfterConvert = Contact.allContacts.size();
        int sizeAccountListAfterConvert = Account.allAccounts.size();

        assertEquals(sizeContactListBeforeConvert + 1, sizeContactListAfterConvert);
        assertEquals(sizeOpportunityListBeforeConvert + 1, sizeOpportunityListAfterConvert);
        assertEquals(sizeAccountListBeforeConvert + 1, sizeAccountListAfterConvert);
        assertEquals(sizeLeadListBeforeConvert - 1, sizeLeadListAfterConvert);
    }

    @Test
    void removeLead() {
        Lead lead = new Lead("Georg", "123456789", "georg_is_fun@fun.com","Georg Fun");
       // int sizeLeadListBeforeRemoveLead = Lead.allLeads.size();
        Lead.removeAllFromItemList();
        int sizeLeadListAfterRemoveLead = Lead.allLeads.size();
        assertEquals(0,sizeLeadListAfterRemoveLead);
        //assertEquals(sizeLeadListBeforeRemoveLead-1,sizeLeadListAfterRemoveLead);
    }


    @Test
    void setPhoneNumber() {
        Lead lead = new Lead("Georg", "12 345 67 89", "georg_is_fun@fun.com","Georg Fun");
        assertEquals("12 345 67 89", lead.getPhoneNumber());

        Lead lead2 = new Lead("Georg", "ala ma kota", "georg_is_fun@fun.com","Georg Fun");
        assertNull(lead2.getPhoneNumber());
       // assertEquals("123456789", lead.getPhoneNumber());
    }

    @Test
    void setEmail() {
        Lead lead = new Lead("Georg", "12 345 67 89", "georg_is_fun@fun.com","Georg Fun");
        assertEquals("georg_is_fun@fun.com", lead.getEmail());

        Lead lead2 = new Lead("Georg", "123456789", "georg_is_fun@.com","Georg Fun");
        assertNull(lead2.getEmail());
       // assertTrue(lead.setEmail("georg@fun.com"));
    }
}