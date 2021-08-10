package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.util.Optional;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Autowired
    private ProductDao productDao;

    @Test
    void testProductDaoSave(){
        Product product1 = new Product("Printer");
        Product product2 = new Product("Computer");
        Product product3 = new Product("Camera");

        Item item1 = new Item(new BigDecimal(590), 2, new BigDecimal(200));
        Item item2 = new Item(new BigDecimal(1000), 1, new BigDecimal(300));
        Item item3 = new Item(new BigDecimal(30000), 2, new BigDecimal(300));
        Item item4 = new Item(new BigDecimal(350), 1, new BigDecimal(150));

        product1.addItem(item1);
        product2.addItem(item2);
        product2.addItem(item3);
        product3.addItem(item4);

        //When
        productDao.save(product1);
        int product1Id = product1.getId();
        productDao.save(product2);
        int product2Id = product2.getId();
        productDao.save(product3);
        int product3Id = product3.getId();

        Optional<Product> findProduct1 = productDao.findById(product1Id);
        Optional<Product> findProduct2 = productDao.findById(product2Id);
        Optional<Product> findProduct3 = productDao.findById(product3Id);

        //Then
        assertNotEquals(0, product1Id);
        assertNotEquals(0, product2Id);
        assertNotEquals(0, product3Id);
        assertTrue(findProduct1.isPresent());
        assertTrue(findProduct2.isPresent());
        assertTrue(findProduct3.isPresent());

        //CleanUp
        productDao.deleteById(product1Id);
        productDao.deleteById(product2Id);
        productDao.deleteById(product3Id);
    }
    @Test
    void testInvoiceDaoSave(){
        Item item1 = new Item(new BigDecimal(590), 2, new BigDecimal(200));
        Item item2 = new Item(new BigDecimal(1000), 1, new BigDecimal(300));
        Item item3 = new Item(new BigDecimal(30000), 2, new BigDecimal(300));
        Item item4 = new Item(new BigDecimal(350), 1, new BigDecimal(150));

        Invoice invoice = new Invoice("3434/GDH");

        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);
        invoice.addItem(item4);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        Optional<Invoice> findInvoice = invoiceDao.findById(id);

        //Then
        assertNotEquals(0, id);
        assertTrue(findInvoice.isPresent());

        //CleanUp
        invoiceDao.deleteById(id);

    }

    @Test
    void testCompleteInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Printer");
        Product product2 = new Product("Computer");
        Product product3 = new Product("Camera");

        Item item1 = new Item(new BigDecimal(590), 2, new BigDecimal(200));
        Item item2 = new Item(new BigDecimal(1000), 1, new BigDecimal(300));
        Item item3 = new Item(new BigDecimal(30000), 2, new BigDecimal(300));
        Item item4 = new Item(new BigDecimal(350), 1, new BigDecimal(150));

        Invoice invoice = new Invoice("3434/GDH");

        invoice.addItem(item1);
        invoice.addItem(item2);
        invoice.addItem(item3);
        invoice.addItem(item4);

        product1.addItem(item1);
        product2.addItem(item2);
        product2.addItem(item3);
        product3.addItem(item4);

        //When
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
    }
}
