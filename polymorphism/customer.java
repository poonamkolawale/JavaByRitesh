//Business logic
class redbus
{
		void ticket()//cash
     {	System.out.println("pay by cash");}
		void ticket(int card)
     {	System.out.println("pay by card");}// connect to card payment gateway-master/visa
		void ticket(float netbanking)
     {	System.out.println("pay by netbanking");}// connect to bank payment gateway
		void ticket(boolean wallet)
     {	System.out.println("pay by wallet");}// connect to payment gateway-wallet
}
//controller logic
class customer
   {
		public static void main(String[]args)
	 {	redbus book= new redbus();
		book.ticket();book.ticket(10);book.ticket(10.5f);book.ticket(true);
}   }