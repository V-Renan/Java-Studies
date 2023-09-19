package br.com.victor.Modulo15.src.factory;

/**
 * @author Victor$
 * @date 9/19/2023$
 * Description:
 */
public class Customer {

    private String gradeRequest;

    private boolean hasCompanyContract;

    public Customer(String gradeRequest, boolean hasCompanyContract) {
        this.gradeRequest = gradeRequest;
        this.hasCompanyContract = hasCompanyContract;
    }

    public boolean hasCompanyContract() {
        return hasCompanyContract;
    }

    public String getGradeRequest() {
        return gradeRequest;
    }
}
