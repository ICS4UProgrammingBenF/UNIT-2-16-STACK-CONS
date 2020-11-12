import java.util.*;

public class StackRestore  {
  
  private Stack<Integer> stRes;
  
  /**
   * Constructor.
  */
  public StackRestore() {
    stRes = new Stack<Integer>();
  }
  
  /**
   * User pops from _stack.
  */
  public void stackpush(int anInt) {
    stRes.push(anInt);
    System.out.println(anInt);
  }
  
  /**
   * Restoring to the old stack.
  */
  public int stackpop() {
    int retInt = stRes.pop();
    return retInt;
  }
  
  /**
   * Clearing the stack.
  */
  public void stackclear()  {
    stRes.clear();
  }
  
  /**
   * This method returns the size of the stack.
  */
  public int stacksize()  {
    int size = stRes.size();
    System.out.println(size);
    return size;
  }
}