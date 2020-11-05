import java.util.*;

public class StackInt  {
  
  private Stack<Integer> _stack;
  private StackRestore stackRestore;
  
  
  /**
   * Constructor.
  */
  public StackInt() {
    _stack = new Stack<Integer>();
    stackRestore = new StackRestore();
  }
  
  /**
   * Stack push.
  */
  public void stackpush(Integer anInt)  {
    _stack.push(anInt);
  }
  
  /**
   * Stack push.
  */
  public int stackpop() {
    Integer retInt = _stack.pop();
    //stackRestore.stackpush(retInt); //saving for a rainy day
    return retInt;
  }
  
  /**
   * Stack peek.
  */
  public int stackpeek()  {
    int retInt =  _stack.peek();
    return retInt;
  }
  
  /**
   * Checking for empty stack.
  */
  public int stacksize()  {
    int size = _stack.size();
    return size;
  }
  
  /**
   * Stack clear.
  */
  public void stackclear()  {
    _stack.clear();
    stackRestore.stackclear();
  }
  
  /**
   * Restore the last value popped from the stack.
  */
  public int ctrlz()  {
    int retVal = stackRestore.stackpop();
    //_stack.push(retVal); //push the restored value back onto the stack
    return retVal;
  }
}