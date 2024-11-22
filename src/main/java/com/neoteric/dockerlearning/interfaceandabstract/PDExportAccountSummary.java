package com.neoteric.dockerlearning.interfaceandabstract;

public class PDExportAccountSummary implements ExportAccountSummary{
    @Override
    public String export(AccountSummary accountSummary) {
        System.out.println("Export to pdf is done");
        return "Data exported to pdf is done";
    }
}
