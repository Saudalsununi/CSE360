package cse360assignment02;

// This is a class named by AddingMachine having 1 attribute and 6 methods
// It is empty all
public class AddingMachine {
  private int total;
  private String Transactions;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    Transactions = "";
    AddMove("" + total);
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) {
	  total = total + value;
	  AddMove(" + " + value);
  }

  public void subtract (int value) {
	  total = total - value;
	  AddMove(" - " + value);
  }
  
  public void AddMove(String Move) {
	  Transactions = Transactions + Move;
  }

  public String toString () {
    return Transactions;
  }

  public void clear() {
  }
}