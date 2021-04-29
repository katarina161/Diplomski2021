/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.so;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import rs.ac.bg.fon.ps.domain.Invoice;
import rs.ac.bg.fon.ps.domain.InvoiceItem;

/**
 *
 * @author Katarina
 */
public class UpdateInvoice extends AbstractSystemOperation {

    private Invoice invoice;
    private List<InvoiceItem> itemsToRemove;

    public UpdateInvoice(Invoice invoice) {
        this.invoice = invoice;
        this.itemsToRemove = new ArrayList<>();
    }

    @Override
    protected void checkPreconditions() throws Exception {
    }

    @Override
    protected void executeSpecificOperation() throws Exception {
        repository.update(invoice);
        
        for (InvoiceItem item : invoice.getItems()) {
            if (item.getStatus() != null) {
                switch (item.getStatus()) {
                    case INSERT:
                        repository.add(item);
                        break;
                    case UPDATE:
                        repository.update(item);
                        break;
                    case DELETE:
                        repository.delete(item);
                        itemsToRemove.add(item);
                        break;
                }
                item.setStatus(null);
            }
        }
        
        itemsToRemove.forEach((item) -> {
            invoice.getItems().remove(item);
        });
    }

    public Invoice getInvoice() {
        return invoice;
    }

}
