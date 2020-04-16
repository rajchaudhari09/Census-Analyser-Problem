package censusanalyser;

import com.opencsv.bean.CsvBindByName;

public class IndiaStateCode {
    @CsvBindByName(column = "SrNo",required = true)
    public String srNo;

    @CsvBindByName(column = "StateName",required = true)
    public String stateName;

    @CsvBindByName(column = "TIN",required = true)
    public String tin;

    @CsvBindByName(column = "StateCode",required = true)
    public String stateCode;

    @Override
    public String toString() {
        return "com.bridgelabz.censusanalyserproject.IndianStateCode {"+
                "SrNo='" + srNo + '\'' +
                " ,State='" + stateName + '\'' +
                " ,TIN='" + tin + '\'' +
                " ,StateCode='" + stateCode + '\'' +
                '}';
    }
}
