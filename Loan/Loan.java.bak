public class Loan{
 private double annalInterestRate;
 private int numberOfYears;
 private double loanAmount;
 private java.util.Date loanDate;
 
 public Loan(){
  this(2.5,1,1000);
 }
 public Loan(double annalInterestRate,int numberOfYears,double loanAmount){
  annalInterestRate=this.annalInterestRate;
  numberOfYears=this.numberOfYears;
  loanAmount=this.loanAmount;
  loanDate=new java.util.Date();
 }
 public double getAnnalInterestRate(){
  return annalInterestRate;
 }
 public void setAnnalInterestRate(double annalInterestRate){
  this.annalInterestRate=annalInterestRate;
 }
 public double getloanAmount(){
  return loanAmount;
 }
 public void setLoanAmount(double loanAmount){
  this.loanAmount=loanAmount;
 }
 public int getNumberOfYears(){
  return numberOfYears;
 }
 public void setNumberOfYears(int numberOfYears){
  this.numberOfYears=numberOfYears;
 }
 public double getMonthlyPayment(){
  double monthlyInterestRate=annalInterestRate/1200;
  double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (Math.pow(1 / (1 + monthlyInterestRate),numberOfYears * 12)));
  return monthlyPayment;
 }
 public double getTotalPayment(){
  double totalPayment = getMonthlyPayment() * numberOfYears * 12;
  return totalPayment;
 }
 public java.util.Date getLoanDate(){
  return loanDate;
 }
 
}