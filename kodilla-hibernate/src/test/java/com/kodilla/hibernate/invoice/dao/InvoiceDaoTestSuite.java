package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    private final String PRODUCT_NAME = "Product One";
    private final String INVOICE_NUMBER = "11-11-11";

    @Test
    void testInvoiceDaoSave(){
        //Given
        Invoice invoice = new Invoice(INVOICE_NUMBER);
        Product product = new Product(PRODUCT_NAME);

        Item item1 = new Item(new BigDecimal("10"),100,new BigDecimal("10"));
        Item item2 = new Item(new BigDecimal("20"),100,new BigDecimal("20"));
        Item item3 = new Item(new BigDecimal("30"),100,new BigDecimal("30"));

        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        product.getItems().add(item1);
        product.getItems().add(item2);
        product.getItems().add(item3);

        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        item1.setProduct(product);
        item2.setProduct(product);
        item3.setProduct(product);
        //When
        invoiceDao.save(invoice);
        int invoiceId = invoice.getId();
        //Then
        List<Item> items = itemDao.findByQuantity(100);
        assertEquals(3,items.size());
        //Clean up
        invoiceDao.deleteById(invoiceId);
    }
}
