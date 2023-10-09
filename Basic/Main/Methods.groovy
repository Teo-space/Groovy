class Example 
{
    static def DisplayName()
    {
        println("This is how methods work in groovy");
        println("This is an example of a simple method");
    } 

    static void Sum(int a,int b) 
    {
        int c = a+b;
        println(c);
    }  


    static void main(String[] args)
    {
        DisplayName();
        Sum(10,5);

    } 
}

class Calculator
{
    
}
