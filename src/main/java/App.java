/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        BankAccount account1 = new BankAccount("SuperPerson", 1000.0);
        //account1.getBalance(100.0);
        account1.deposit(500.0);
        BankAccount account2 = new BankAccount("Person", 500.0);
        //account2.getBalance(100.0);
        BankAccount.transfer(300.0, account2, account1);

        System.out.println("балансы после перевода 300р:");
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println(account1.toStrings());
        System.out.println(account2.toStrings());




    }
}
