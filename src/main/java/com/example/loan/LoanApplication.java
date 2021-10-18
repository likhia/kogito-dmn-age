package com.example.loan;

import java.math.BigDecimal;

public class LoanApplication {
    
    private Integer age;
    private BigDecimal loanamt;
    private Integer loantenure;
    
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }
    public BigDecimal getLoanamt() {
        return loanamt;
    }
    public void setLoanamt(BigDecimal loanamt) {
        this.loanamt = loanamt;
    }
    public Integer getLoantenure() {
        return loantenure;
    }
    public void setLoantenure(Integer loantenure) {
        this.loantenure = loantenure;
    }

    
}
