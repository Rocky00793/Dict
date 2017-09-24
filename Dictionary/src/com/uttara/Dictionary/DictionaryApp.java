package com.uttara.Dictionary;

import java.util.Scanner;

public class DictionaryApp 
{

	public static void main(String[] args) 
	{
		try
		{
			Scanner sc1 = new Scanner (System.in);
			Scanner sc2 = new Scanner (System.in);
			int ch1 =0;
			String DictName;
			String Word;
			
			Logger.getInstance().log("Strating");
			
			while(ch1!=6)
			{
				System.out.println("Press 1 to Create Dictionary");
				System.out.println("Press 2 to Load Dictionary");
				System.out.println("Press 3 to Exit");
				
				ch1 = sc1.nextInt();
				
				switch(ch1)
				{
					case 1:
							System.out.println("Enter the name of Dictionary");
							DictName = sc2.nextLine();
							
							/*while(TaskUtil.ValidateName(DictName))
							{
								System.out.println("Dictionary Name is not valid");
								System.out.println("Enter another Name");
								DictName = sc2.nextLine();
							}*/
							
							TaskUtil.CreatDictionary(DictName);
							
							
							System.out.println("Press 1 to Add a word");
							System.out.println("Press 2 to Edit a word");
							System.out.println("Press 3 to Remove a word");
							System.out.println("Press 4 to List the words");
							System.out.println("Press 5 to Search words");
							System.out.println("Press 6 to Go back");
							
							ch1 = sc1.nextInt();

								switch(ch1)
								{
									case 1:
										System.out.println("Enter a word for adding to a Dictionary");
										Word = sc2.nextLine();
										
										TaskUtil.WriteToFile(Word,DictName);
										
									case 2:
										break;
										
									case 3:
										break;
										
									case 4:
										break;
								
									case 5:
										break;
										
									case 6:
										break;
										
									default:System.out.println("Denied");
										break;
								}
								break;
					case 2:
							break;
					case 3:
							break;
							
					default:System.out.println("Denied");
							break;
				}
			}	
			
		}
		catch(Throwable tw)
		{
			tw.printStackTrace();
			
		}
		
		
	}

}
