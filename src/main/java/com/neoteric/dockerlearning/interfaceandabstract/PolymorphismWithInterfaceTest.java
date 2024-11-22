package com.neoteric.dockerlearning.interfaceandabstract;

public class PolymorphismWithInterfaceTest {


    public static void main (String[] args) {
        ExportAccountSummary excelExportAccountSummary = new ExcelExportAccountSummary();
        excelExportAccountSummary.export(new AccountSummary());


        ExportAccountSummary pdfExportAccountSummary = new PDExportAccountSummary();
        pdfExportAccountSummary.export(new AccountSummary());


    }
}
