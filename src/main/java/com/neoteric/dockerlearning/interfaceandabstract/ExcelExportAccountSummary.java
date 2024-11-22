package com.neoteric.dockerlearning.interfaceandabstract;

public class ExcelExportAccountSummary implements ExportAccountSummary {

        @Override
        public String export (AccountSummary accountSummary){
            System.out.println("Export to excel is done");
            return "Data exported to excel is done";
        }

}
