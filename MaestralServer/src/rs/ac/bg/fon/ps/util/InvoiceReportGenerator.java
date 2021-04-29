/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rs.ac.bg.fon.ps.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.HashMap;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import rs.ac.bg.fon.ps.constants.Constants;
import rs.ac.bg.fon.ps.domain.Invoice;

/**
 *
 * @author Katarina
 */
public class InvoiceReportGenerator {
    
    public static byte[] generateReport(Invoice invoice) throws JRException {
        byte[] report;
        int vatPercentage = Constants.VAT_PERCENTAGE;
        BigDecimal vatAmount = getVatAmount(vatPercentage, invoice.getTotal());
        
        
        HashMap params = new HashMap();
        params.put("ImagePath", "report/");
        params.put("items", new JRBeanCollectionDataSource(invoice.getItems()));
        params.put("VAT_%", vatPercentage);
        params.put("VAT", vatAmount);
        
        JasperPrint jp = JasperFillManager.fillReport("report/InvoiceReportPDV.jasper", params, new JRBeanCollectionDataSource(Arrays.asList(invoice)));
        report = JasperExportManager.exportReportToPdf(jp);
        
        return report;
    }

    private static BigDecimal getVatAmount(int vatPercentage, BigDecimal total) {
        double vat = vatPercentage / 100.0;
        BigDecimal amount = total.subtract(total.divide(BigDecimal.ONE.add(new BigDecimal(vat)), 2, RoundingMode.HALF_UP));
        return amount;
    }
}
