try 
{
   def arr = new int[3];
   arr[5] = 5;
} 
catch(ArrayIndexOutOfBoundsException ex)
{
   println "Catch ArrayIndexOutOfBoundsException";
   println ex;
}
catch(Exception ex) 
{
   println "Exception";
   println ex;
}
finally 
{
   println("The final block");
}