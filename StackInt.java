import java.util.*;

public class StackInt  {
  
  private Stack<Integer> _stack;
  
  /**
   * Constructor.
  */
  public StackInt() {
    _stack = new Stack<Integer>();
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
    int retInt = _stack.pop();
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
   * checking for empty stack.
  */
  public int stacksize()  {
    int size = _stack.size();
    return size;
  }
}