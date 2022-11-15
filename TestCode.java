 /////////////////////////////
// DO NOT MODIFY THIS FILE //
/////////////////////////////

import java.util.*;

/**
 *  Code package for running program tests
 *
 *  @author N. Howe
 *  @version Spring 2022
 */
public class TestCode {
  /** Holds error messages from sub-tests */
  private static HashMap<String,ArrayList<String>> errors = new HashMap<>();

  /** Keeps track of currently open multipart test */
  private static String currentTest = null;

  /** 
   *  Runs a standalone test
   *  
   *  @param name  The name of the test
   *  @param test  The truth value of the test
   */
  public static void runTest(String name,boolean test) {
    if (test) {
      System.err.println("Passed:  "+name);
    } else {
      System.err.println("* not passed:  "+name);
    }
  }

  /** 
   *  Begins a test with subparts
   *  
   *  @param name  The name of the test
   */
  public static void beginTest(String name) {
    errors.put(name,new ArrayList<String>());
    currentTest = name;
  }

  /** 
   *  Conducts a test subpart
   *  
   *  @param name  The name of the test
   *  @param test  The truth value of the test
   */
  public static void subTest(String subName, boolean test) {
    if (currentTest == null) {
      throw new RuntimeException("No test currently active.");
    }
    subTest(currentTest,subName,test);
  }

  /** 
   *  Conducts a test subpart
   *  
   *  @param name  The name of the test
   *  @param message  Name or message for the subtest
   *  @param test  The truth value of the test
   */
  public static void subTest(String name, String message, boolean test) {
      ArrayList<String> e = errors.get(name);
      if (e==null) {
        beginTest(name);
      }
      if (!test) {
        e.add(message);
      }
    }

  /** 
   *  Logs a message in a test subpart
   *  
   *  @param subName  Name or message for the subtest
   */
  public static void logError(String message) {
    if (currentTest == null) {
      throw new RuntimeException("No test currently active.");
    }
    logError(currentTest,message);
  }

  /** 
   *  Logs a message in a test subpart
   *  
   *  @param name  The name of the test
   *  @param subName  Name or message for the subtest
   */
  public static void logError(String name, String subName) {
      ArrayList<String> e = errors.get(name);
      if (e==null) {
        beginTest(name);
      }
      e.add(subName);
    }

  /** 
   *  Concludes a test with subparts
   */
  public static void concludeTest() {
    concludeTest(currentTest);
  }

  /** 
   *  Concludes a test with subparts
   *  
   *  @param name  The name of the test
   */
  public static void concludeTest(String name) {
    ArrayList<String> e = errors.get(name);
    if (e==null) {
      throw new RuntimeException("Concluding test that was never begun:  "+name);
    } else if (e.size() == 0) {
      System.err.println("Passed:  "+name);
    } else {
      System.err.println("* not passed:  "+name);
      for (String s:e) {
        System.err.println("  X "+s);
      }
    }
    errors.put(name,null);
    currentTest = null;
  }
}
