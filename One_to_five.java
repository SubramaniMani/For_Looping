package for_looping;

public class One_to_five {

	public static void main(String[] args) {
	
		 One_to_five object=new  One_to_five();
		// object.One(1);
		// object.one_to_five();
		// object.five();
		 object.five_print();
		//object.pattern();
		//object.reverse();
		//object.tsak();
		 //object.task1();
	     // object.task2();
		 //object.task3( );
		 //object.task4();
		//object.one_to_15();
		 //object.task5();
		 //object.star();
//		  object.v();
		// object.Y();
		// object.M();
//		 object.W();
		// object.P();
		// object.EtoA();
		//object.AtoE();
		// object.AtoO();
		// object.tryangle();
	    //object.startryangle();
		// object.L();
		// object.N();
		 //object.Z();
		// object.Q();
		// object.I();
		// object.S();
		// object.U();
	      // object.F();
		 //object.J();
		 //object.X();
		//object.O();
		//bject.K();
		 //object.D();
		 //object.C();
		 
		 
		 
		 
		 
		 
	    	   
		
		 
		 
		 
		 
		 
	}

private void C() {
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{
				if(row==1 || row==5 || col==1)
				{
					if (row==1 && col==1 ||  row==5 && col==1)
					{
						System.out.print("  ");
					}
				else
					System.out.print("* ");
				}
				else 
					System.out.print("  ");
			}
				System.out.println();
			}
		}
		
	

private void D() {
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{
			if(row==1 || row==5 || col==1 || col==5)
			{
				if (row==1 && col==5 || row==5 && col==5)
				{
					System.out.print("* ");
				}
				else
				
					System.out.print("* ");
				}
				else
				
					System.out.print("   ");
					
			
			}
			System.out.println();
		}
		
	}

private void K() {
		for( int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{
				if(col==1  || row==1 &&  col==4 || row==2 && col==3 || row==4 && col==3 || row==5 && col==4 || row==3 && col==2)
					
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

private void O() {
	for(int row=1; row<=5; row++)
	{
		for(int col=1; col<=5; col++)
		{
			if(row==1 || row==5 || col==1 || col==5)
				System.out.print("* ");
			
			else
				System.out.print("  ");
		}
		System.out.println();
	}
		
		
	}

private void X() {
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{
				if(col==row || col==6-row)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

private void J() {
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{
				if(row==1|| col==3 || row==3 && col==1 || row==4 && col==2)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

private void F() {
		for(int row=1; row<=5; row++)
		{
			for(int col=1;col<=5; col++)
			{
			if(col==1 || row==1 || row==3)
			System.out.print("* ");
			else
				System.out.print("  ");
			}
			System.out.println();
		}
		
	}

private void S() {
	    for (int row = 1; row <= 5; row++) 
	    {
	       for (int col = 1; col <= 5; col++)
	       {
	           if(row==1  || row==3  || row==5 || row==2 && col==1 || row==4 && col==5)
	        	   
	        	   
	                System.out.print("* ");
	            else
	                System.out.print("  ");
	        }
	        System.out.println();
	    }
	}

	

private void U() {
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{  
				if(col==1 || col==5 || row==5)
				System.out.print("* ");
	
			
				
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

private void I() {
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{ 
				if (col==5 ||  row==1  || col==5  || row==5 )
				System.out.print("* ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

private void Q() 
{
	      for(int row=1;row<=6;row++)                                //   * * * 
	       {                                                         // *       *
		   for(int col=1;col<=6;col++)                               // *       *
		   {                                                         // *     * *
		    if(row<=5 && col<=5)                                     //   * * * *
		    {                                                        //           *
		     if(row==1  || col==1||row==5||col==5) 
		     {
		      if(col==1 &&  row==1 || row==1 && col==5
		        || row==5  &&  col==1) 
		      {
		       System.out.print("  ");
		      }
		      else
		      System.out.print("* ");
		     }
		     else if(col==4  &&  row==4) 
		     {
		      System.out.print("* ");
		     }
		     else
		      System.out.print("  ");
		     
		    }else if(col==row)
		    {
		     System.out.print("* ");
		    }else 
		     System.out.print("  ");
		   }
		   System.out.println();
			    }}
private void Z() {
		for(int row=1; row<=5; row++)
		{
			for(int col=1; col<=5; col++)
			{
				if (row==1 || row==5 )
						System.out.print("* ");
				else 
					if(col==6-row)
						System.out.print("*  ");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

private void N() {                                // *       *
	for(int row=1; row<=5; row++)                 // * *     *
	{                                             // *   *   *
		for(int col=1; col<=5; col++)             // *     * *
		{                                         // *       *
			if(col==1 || col==row)
			{
				System.out.print("* ");
			}
			else 
				if(col==row|| col==5)
				{
					System.out.print("* ");
			}
				
			else 
			{
				System.out.print("  ");
			}
		
	}
		System.out.println();
	}	
	}
		
	

private void L() {                                  // *
		for(int row=1; row<=5; row++)               // *
		{                                           // *
			for(int col=1; col<=5; col++)           // *
			{                                       // * * * * *
				if(col==1) 
				{
					System.out.print("* ");
				}
				else 
					if(col==1 || row==5)
					{
						System.out.print("* ");
					}
					else
					{
						System.out.print(" ");
					}
				
			}
				System.out.println();
			
		}
}

private void startryangle() {
	
	  {
	   for (int row =1; row<= 5; row++)
	   {
	     for (int col =5; col>= row+1; col--) 
	         {
	       System.out.print("  ");
	         }
	       for (int no=1; no<=row; no++) 
	       {
	      System.out.print("*"+ " ");
	        }
	        System.out.println();
	   }
	     for (int row=4; row>=1; row--) 
	        {
	         for (int col=5; col >=row+1; col--) 
	         {
	         System.out.print("  ");
	            }
	           for (int no=1; no<=row; no++) {
	            System.out.print("*" + " ");
	            }
	            System.out.println();
	        }
	    }
	}
private void tryangle() {                           // 1 
		for(int row=1; row<=9; row++ )              // 1 2 
		{                                           // 1 2 3
			for(int col=1; col<=row; col++)         // 1 2 3 4
			{                                       // 1 2 3 4 5
				if(row<=5)                          // 1 2 3 4
					System.out.print(col+" ");      // 1 2 3 
				else                                // 1 2 
					if(col<=10-row)                 // 1
						System.out.print(col+" ");
			}
			System.out.println();
		}
	
	} 
private void AtoO() {                              // A
	char ch='A';                                   // B C
		for(int row=1; row<=5; row++)              // D E F 
		{                                          // G H I J
			for (int col=1; col<=row; col++)       // K L M N O
			{
				System.out.print(ch+ " ");
				ch++;
			}
			System.out.println();
		}
		
	}
private void AtoE() {
	for(int row='A'; row<='E';row++)            //A B C D E 
	{                                           //A B C D  
	for (int col=row; col<='E'; col++)          //A B C
	{                                           //A B
		System.out.print((char)col+" ");        //A
	}
	System.out.println();
	}

	}
	
	
private void EtoA() {                                      // E D C B A 
		for(int row='A'; row<='E'; row++)                  // E D C B
		{                                                  // E D C 
			for(int col='E'; col>=row; col--)              // E D
			{                                              // E
			System.out.print((char)col+" ");	
			}
			System.out.println();
		}
		
	}
private void P() {
		for(int row=1; row<=6; row++)
		{
			for(int col=1; col<=5; col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
private void W() {                                   //*      *    
	for(int row=5; row>=1; row--)                    //*      *
	{                                                //*  *   *
		for(int col=1; col<=5; col++)                //*      *
		{                                   
			if(col==1 ||  col==5)           
			{
				System.out.print("* ");
			}
			else if(row<=3)
			{
				if(col==row || col==6-row)
				{	
				System.out.print("*  ");	
			}
				else 
					System.out.print("   ");
			}
			
         else {
				System.out.print("   ");
         }
	}	
		System.out.println(); 
	}
}
			
		
	
private void M() {
		for(int row=1; row<=6; row++)           //  *      *
		{                                       //  * *  * *
			for(int col=1; col<=5; col++)       //  *   *  *
			{                                   //  *      *
				if(col==1 ||  col==5)           //  *      *
				{
					System.out.print("*  ");
				}
				else if(row<=3)
				{
					if(col==row || col==6-row)
					{	
					System.out.print("*  ");	
				}
					else 
						System.out.print("   ");
				}
             else
					System.out.print("   ");
		}	
			System.out.println(); 
		}
}
		

private void Y() {                               //  *       *
		for(int row=1; row<=6; row++)            //    *   *
		{                                        //      *
			for( int col=1; col<=5; col++)      //       *
			{                                    //      *
				if(row<=3)                        //     *
				{                             
					{
						
					}
					if(col==row || col==6-row)
					{
						System.out.print("*  ");
					}
					else 
						System.out.print("  ");
					}
					else 
						if(col==3)
						{
							
						System.out.print("*  ");
			}
						else
						
							System.out.print("  ");
					    
				}
			System.out.println();
			}
		}

	
private void v() {                                    // *       *  
		for(int row = 1; row<=6; row++)               //  *     *
		{                                             //   *   *
			for(int col = 1; col<=10; col++)           //     *
			{
				if(row<=3)	
				{
					if(col==row || col==6-row)
					{
						System.out.print("*");
				    }					
				else 
					System.out.print(" ");
			}
			
		}
			System.out.println();
		}
	}
private void star() {                           // * * * * *
		for(int row=1; row<=7 ; row++)          // * * * * *
		//while(row<=9)                         // * * * * *
		{                                       // * * * * *
			for(int col=1; col<=7; col++)       // * * * * *
			{                                   // * * * * *
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
private void task5() {                             //2 4 6 8 10 3 5 7 9 
		for(int row=2; row<=10; row=row+2)
		{
		System.out.print(" "+row);
		if(row==10)
		{
			System.out.println();
			row=-1;
			
		}
	}
}

private void one_to_15() {                        // 1 2 3 
	for(int row=1; row<=5; row++ )                // 4 5 6            
	{                                             // 7 8 9
		for(int col=1; col<=3; col++)             // 10 11 12
		{                                         // 13 14 15 
			int number=(row-1)*3+col;
			System.out.print("  "+number);
		}
		System.out.println();
	}
	}
private void task4() {                          //1 2 3 4 5
		for(int row=1; row<=5;row++)            //2 3 4 5
		{                                       //3 4 5  
		for (int col=row; col<=5; col++)        //4 5
		{                                       //5
			System.out.print("  "+col);
		}
		System.out.println();
		}
		
	}
private void task3() { 
	                                                 //1 2 3 
                                                     //4 5 6
		for(int row=1; row<=3; row++ )               //7 8 9
		{
			for(int col=1; col<=3; col++)
			{
				int number=(row-1)*3+col;
				System.out.print("  "+number);
				
			}
			System.out.println();
		}
		
	}
private void task2()                           //10
{                                              //10 8
for (int row = 5; row >= 1; row--)             //10 8 6 
  {                                            //10 8 6 4 
    for (int col = 5; col<=10* 2; col-=2 )     //10 8 6 4 2 
    {
        System.out.print("  " + col);
    }
    System.out.println();
}

}
private void task1() {
	for( int row=0; row<=5; row++)          //5 4 3 2 1 0
	{                                       //5 4 3 2 1 0
		for(int col=5; col>=0; col--)       //5 4 3 2 1 0 
		{                                   //5 4 3 2 1 0
			System.out.print(" "+col);      //5 4 3 2 1 0
		}
		System.out.println();
	}
	
	
		
	}
@SuppressWarnings("unused")
private void tsak() {                           // 0 1 2 3 4 5 
		for( int row=0; row<=5; row++)          // 0 1 2 3 4 5
		{                                       // 0 1 2 3 4 5
			for(int col=0; col<=5; col++)       // 0 1 2 3 4 5 
			{                                   // 0 1 2 3 4 5
				System.out.print(" "+col);
			}
			System.out.println();
		}
		
	}
private void reverse() {                         //5 4 3 2 1
		for(int row=1;row<=5;row++)              //5 4 3 2 
		{                                        //5 4 3
			for(int col=5; col>=row;col--)       //5 4
			{                                    //5
				System.out.print(" "+col);
			}
			System.out.println();
		}
		
	}
@SuppressWarnings("unused")
private void pattern() {                  //1 2 3 4 5
	for(int row=5;row>=1;row--)           //1 2 3 4
	{                                     //1 2 3 
		for(int col=1;col<=row;col++)     //1 2
		{                                 //1
         System.out.print(" "+col);
		}
		System.out.println();
		
		
	}
}
@SuppressWarnings("unused")
private void five_print()                       //1 2 3 4 5
{                                               //1 2 3 4 5
	{                                           //1 2 3 4 5
		for(int row=1;row<=5;row++)             //1 2 3 4 5 
		{                                       //1 2 3 4 5
			//for(int col=1;col<=5;col++)
			//{
				System.out.print(row+"");
			//}
			//System.out.println();
		}
	}
		
		
		
	}
@SuppressWarnings("unused")
private void five() {
		for(int row=5;row>=1;row--)
		{
			for(int col=1;col<=5;col++)
			{
				System.out.print(row+"  " );
			}
			System.out.println();
		}
		
	}
@SuppressWarnings("unused")
private void one_to_five() {
		for(int row=5;row<=5;row++)
		{
			for(int col = 1;col<=5;col++)
			{
				System.out.print(row+"  ");
			}
			System.out.println();
		}
		
	}
public void  One(int i)
{
 for(; i<=5; i++)
	 System.out.println(i);
}
}
