class Main {
  public static void main(String[] args) {
    System.out.println(Animals.check("Fido","sits up and begs"));
    System.out.println("Expected: Fido sits up and begs");
    
    System.out.println(Animals.check("Socks",null));
    System.out.println("Expected: Meow has no tricks");
    
    System.out.println(Animals.check("Bella","fetches my slippers"));
    System.out.println("Expected: Bella fetches my slippers");
  }
}