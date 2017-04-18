public class Copy {

  public static void main(String[] args) {
    // This should be the basic replica of the 'cp' command
    // If ran from the command line without arguments
    // It should print out the usage:
    // copy [source] [destination]
    // When just one argument is provided print out
    // No destination provided
    // When both arguments provided and the source is a file
    // Read all contents from it and write it to the destination

    appInput(args);
  }

  public static void appInput(String[] args) {
    if (args.length == 0) {
      System.out.println("copy [source] [destination]");
    }
    else if (args.length == 1){
      System.out.println("No destination provided");
    }
    else if (args.length == 2){
      String origin = args[0];
      String destination = args[1];
      copyFile(origin, destination);
    }
    else {
      System.out.println("Invalid input");
    }
  }
  public static void copyFile(String origin, String destination){

    
  }
}