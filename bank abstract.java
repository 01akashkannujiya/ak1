abstract class Bank{  
abstract void getRateOfInterest();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class SBI extends Bank{  
void getRateOfInterest(){System.out.println("10%");}  
}  
class hdfc extends Bank{  
void getRateOfInterest(){System.out.println("9%");}  
}  
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
public static void main(String args[]){  
Bank s=new SBI();//In a real scenario, object is provided through method, e.g., getShape() method  
s.getRateOfInterest();  
}  
}