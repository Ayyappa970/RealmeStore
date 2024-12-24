import java.util.Scanner;
class RealmeStore 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		int price=0;
		int status=0;
		int choice=0;
		int qty=0;
		int amount=0;
		do
		{
		System.out.println("                                     Realme Store                                                                    ");
		System.out.println();
		System.out.println("1.Phone		2.Audio		3.Smart Life		4.Accessories		5.Smart TV");
		System.out.println();
		System.out.println("Enter Product number");
		choice=scan.nextInt();
		switch (choice)
		{
			case 1: System.out.println("                                     Phones");
					System.out.println();
					System.out.println("1. C Series		2. Narzo Series		3. Number Series		4. GT Series		5. X Series");
					System.out.println();
					System.out.println("Enter Product number");
					choice=scan.nextInt();
					switch (choice)
					{
					case 1: System.out.println("                               C Series Phones");
							System.out.println();
							System.out.println("1.realme C30s	               ");
							System.out.println("  Camera            | Battery               | Display");
							System.out.println("  8MP AI            | 5000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+7499);
							System.out.println();
							System.out.println("2.realme C33	               ");
							System.out.println("  Camera            | Battery               | Display");
							System.out.println("  50MP AI           | 5000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+8999);
							System.out.println();
							System.out.println("3.realme C30	               ");
							System.out.println("  Processor         | Battery               | Display");
							System.out.println("  Unisoc T612       | 5000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+6999);
							System.out.println();
							System.out.println("4.realme C31                   ");
							System.out.println("  Processor         | Battery               | Display");
							System.out.println("  Unisoc T612       | 5000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+9299);
							System.out.println();
							System.out.println("5.realme C35                   ");
							System.out.println("  Camera            | Design                | Display");
							System.out.println("  50MP AI Triple    | 8.1 mm  ultra Slim    | 6.6 inch Fullscreen");
							System.out.println("                                                                            Price:"+11999);
							System.out.println();
							System.out.println("6.realme C11 2021              ");
							System.out.println("  RAM               | Battery               | Display");
							System.out.println("  2+32G             | 5000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+7499);
							System.out.println();
							System.out.println("7.realme C25_Y	               ");
							System.out.println("  Processor         | Battery               | Camera");
							System.out.println("  Unisoc T612       | 5000mAh               | 50MP AI Triple");
							System.out.println("                                                                            Price:"+10999);
							System.out.println();
							System.out.println("8.realme C25Y	               ");
							System.out.println("  RAM               | Battery               | Display");
							System.out.println("  2+32GB            | 5000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+10999);
							System.out.println();
							System.out.println("9.realme C20	               ");
							System.out.println("  Camera            | RAM                   | Display");
							System.out.println("  8MP AI            | 2+32GB                | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+7499);
							System.out.println();
							System.out.println("10.realme C25	               ");
							System.out.println("  Camera            | Battery               | Display");
							System.out.println("  13MP AI           | 6000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+9999);
							System.out.println();
							System.out.println("11.realme C25s	               ");
							System.out.println("  Camera            | Battery               | Display");
							System.out.println("  13MP AI           | 6000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+10999);
							System.out.println();
							System.out.println("12.realme C21Y	               ");
							System.out.println("  Camera            | Battery               | Display");
							System.out.println("  13MP AI           | 5000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+9499);
							System.out.println();
							System.out.println("Enter Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=7499;
									System.out.println();
									System.out.println("realme C30s	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera        Charging & Battery       Display             Storage & RAM   FingerPrint  ");
									System.out.println();
									System.out.println(" PowerFul Octa      8MP AI        5000mAh Massive          16.5 cm(6.5 inch)   2GB + 32GB/     Side Mounted   ");
									System.out.println(" Core Processor                         Battery                Fullscreen       4GB + 64GB     FingerPrint Sensor");
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Strip Blue");
									System.out.println("Strip Black");
									System.out.println();
									System.out.println("Press 1 for Strip Blue");
									System.out.println("Press 2 for Strip Black");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Strip Blue");
											break;
									case 2: System.out.println("Strip Black");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("RAM & Storage");
									System.out.println("2GB + 32GB     "+7499);
									System.out.println("4GB + 64GB     "+8999);
									System.out.println();
									System.out.println("Press 1 for 2GB + 32GB");
									System.out.println("Press 2 for 4GB + 64GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("2GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C30s "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1500));
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1500)*qty;
											System.out.println("realme C30s "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 2: price=8999;
									System.out.println();
									System.out.println("realme C33	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery      Design                 Display               Storage & RAM     FingerPrint  ");
									System.out.println();
									System.out.println(" PowerFul Unisonic      50MP AI/        5000mAh Massive         8.3mm ultra slim       16.5 cm(6.5 inch)     2GB + 32GB/       Side Mounted    ");
									System.out.println(" T612 Processor         5MP Selfie          Battery             Glowing Starlight        Fullscreen            4GB + 64GB      FingerPrint Sensor");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Aqua Blue");
									System.out.println("Night Sea ");
									System.out.println("Sandy Gold");
									System.out.println();
									System.out.println("Press 1 for Aqua Blue");
									System.out.println("Press 2 for Night Sea");
									System.out.println("Press 3 for Sandy Gold");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Aqua Blue");
											break;
									case 2: System.out.println("Night Sea");
											break;
									case 3: System.out.println("Sandy Gold");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("3GB + 32GB    "+8999);
									System.out.println("4GB + 64GB    "+9999);
									System.out.println();
									System.out.println("Press 1 for 3GB + 32GB");
									System.out.println("Press 2 for 4GB + 64GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price); 
											System.out.println("3GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C33 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2:  System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme C33 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 3: price=6999;
									System.out.println();
									System.out.println("realme C30	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery            Display               Storage & RAM       ");
									System.out.println();
									System.out.println(" PowerFul Unisonic      8MP AI/         5000mAh Massive               16.5 cm(6.5 inch)     2GB + 32GB/            ");
									System.out.println(" T612 Processor         5MP Selfie          Battery                   Fullscreen            3GB + 32GB       ");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Lake Blue");
									System.out.println("Denim Black ");
									System.out.println("Bamboo Green");
									System.out.println();
									System.out.println("Press 1 for Lake Blue");
									System.out.println("Press 2 for Denim Black");
									System.out.println("Press 3 for Bamboo Green");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Lake Blue");
											break;
									case 2: System.out.println("Denim Black");
											break;
									case 3: System.out.println("Bamboo Green");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("2GB + 32GB    "+6999);
									System.out.println("3GB + 32GB    "+7999);
									System.out.println();
									System.out.println("Press 1 for 2GB + 32GB");
									System.out.println("Press 2 for 3GB + 32GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("2GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C30 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("3GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme C30 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 4: price=9299;
									System.out.println();
									System.out.println("realme C31	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery            Display               Storage & RAM   FingerPrint    ");
									System.out.println();
									System.out.println(" PowerFul Unisonic      13MP AI         5000mAh Massive               16.5 cm(6.5 inch)     3GB + 32GB/     Side Mounted      ");
									System.out.println(" T612 Processor         Triple              Battery                   Fullscreen            4GB + 64GB      FingerPrint Sensor ");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Light Silver");
									System.out.println("Dark Green ");
									System.out.println();
									System.out.println("Press 1 for Light Silver");
									System.out.println("Press 2 for Dark Green");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Light Silver");
											break;
									case 2: System.out.println("Dark Green");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("3GB + 32GB    "+9299);
									System.out.println("4GB + 64GB    "+9999);
									System.out.println();
									System.out.println("Press 1 for 3GB + 32GB");
									System.out.println("Press 2 for 4GB + 64GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("3GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C31 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+700));
											System.out.println("4GB +64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+700)*qty;
											System.out.println("realme C31 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 5: price=11999;
									System.out.println();
									System.out.println("realme C35	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery            Display               Storage & RAM               FingerPrint");
									System.out.println();
									System.out.println(" PowerFul Unisonic      50MP AI         18W Quick Charge              16.7 cm(6.6 inch)     4GB + 64GB/ 4GB + 128GB/    Side Mounted        ");
									System.out.println(" T616 Processor         Triple          5000mAh Massive Battery       Fullscreen            6GB + 128GB                 FingerPrint Sensor");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Glowing Black");
									System.out.println("Glowing Green ");
									System.out.println();
									System.out.println("Press 1 for Glowing Black");
									System.out.println("Press 2 for Glowing Green");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Glowing Black");
											break;
									case 2: System.out.println("Glowing Green");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB     "+11999);
									System.out.println("4GB + 128GB    "+12999);
									System.out.println("6GB + 128GB    "+13999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 4GB + 128GB");
									System.out.println("Press 3 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C35 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB +128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme C35 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+2000));
											System.out.println("6GB +128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme C35 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 6: price=7499;
									System.out.println();
									System.out.println("realme C11 2021	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery         Display               Storage & RAM       ");
									System.out.println();
									System.out.println(" PowerFul Unisonic      8MP AI          5000mAh Massive            16.5 cm(6.5 inch)     2GB + 32GB/          ");
									System.out.println(" T616 Processor         Triple           Battery                   Fullscreen            4GB + 64GB       ");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Cool Blue");
									System.out.println("Cool Grey ");
									System.out.println();
									System.out.println("Press 1 for Cool Blue");
									System.out.println("Press 2 for Cool Grey");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Cool Blue");
											break;
									case 2: System.out.println("Cool Grey");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("2GB + 32GB     "+7499);
									System.out.println("4GB + 64GB     "+8999);
									System.out.println();
									System.out.println("Press 1 for 2GB + 32GB");
									System.out.println("Press 2 for 4GB + 64GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("2GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C11 2021 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1500));
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1500)*qty;
											System.out.println("realme C11 2021 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 7: price=10999;
									System.out.println();
									System.out.println("realme C25_Y	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery           Display               Storage & RAM    FingerPrint   ");
									System.out.println();
									System.out.println(" PowerFul Unisonic      50MP AI          18W Quick Charge            16.5 cm(6.5 inch)     4GB + 64GB/      Instant   ");
									System.out.println(" T618 Processor         Triple           5000mAh Massive Battery     Large Display         4GB + 128GB      FingerPrint Sensor ");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Glacier Blue");
									System.out.println("Metal Grey ");
									System.out.println();
									System.out.println("Press 1 for Glacier Blue");
									System.out.println("Press 2 for Metal Grey ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Glacier Blue");
											break;
									case 2: System.out.println("Metal Grey ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB     "+10999);
									System.out.println("4GB + 128GB    "+11999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 4GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C25_Y "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme C25_Y "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 8: price=10999;
									System.out.println();
									System.out.println("realme C25Y	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery           Display               Storage & RAM    FingerPrint   ");
									System.out.println();
									System.out.println(" PowerFul Octa-core     50MP AI          18W Quick Charge            16.5 cm(6.5 inch)     4GB + 64GB/      Instant    ");
									System.out.println(" 64bits Processor       Triple           5000mAh Mega Battery        Large Display         4GB + 128GB      FingerPrint Sensor");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Glacier Blue");
									System.out.println("Metal Grey ");
									System.out.println();
									System.out.println("Press 1 for Glacier Blue");
									System.out.println("Press 2 for Metal Grey ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Glacier Blue");
											break;
									case 2: System.out.println("Metal Grey ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB     "+10999);
									System.out.println("4GB + 128GB    "+11999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 4GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C25Y "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme C25Y "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 9: price=7499;
									System.out.println();
									System.out.println("realme C20	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery       Display               Storage & RAM       ");
									System.out.println();
									System.out.println(" Helio G35              8MP AI          5000mAh                  16.5 cm(6.5 inch)     2GB + 32GB          ");
									System.out.println(" Powerful Processor                     Mega Battery             Large Display                ");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Cool Blue");
									System.out.println("Cool Grey ");
									System.out.println();
									System.out.println("Press 1 for Cool Blue");
									System.out.println("Press 2 for Cool Grey ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Cool Blue");
											break;
									case 2: System.out.println("Cool Grey ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("2GB + 32GB     "+7499);
									System.out.println();
									System.out.println("Press 1 for 2GB + 32GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("2GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C20 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 10:price=9999;
									System.out.println();
									System.out.println("Price:"+price);
									System.out.println("realme C25	  ");
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery      Display               Storage & RAM      FingerPrint ");
									System.out.println();
									System.out.println(" Helio G70-Gaming       13MP AI         6000mAh                 16.5 cm(6.5 inch)     4GB + 64GB/        Instant  ");
									System.out.println("     Processor          Triple          Mega Battery            Large Display         4GB + 128GB        FingerPrint Sensor");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Watery Blue");
									System.out.println("Watery Grey ");
									System.out.println();
									System.out.println("Press 1 for Watery Blue");
									System.out.println("Press 2 for Watery Grey ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Watery Blue");
											break;
									case 2: System.out.println("Watery Grey ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB     "+9999);
									System.out.println("4GB + 128GB    "+10999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 4GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C25 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme C25 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 11:price=10999;
									System.out.println();
									System.out.println("realme C25s	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery      Display               Storage & RAM     FingerPrint  ");
									System.out.println();
									System.out.println(" Helio G85-Gaming       13MP AI         6000mAh                 16.5 cm(6.5 inch)     4GB + 64GB/       Instant   ");
									System.out.println("     Processor          Triple          Mega Battery            Large Display         4GB + 128GB       FingerPrint Sensor");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Watery Blue");
									System.out.println("Watery Grey ");
									System.out.println();
									System.out.println("Press 1 for Watery Blue");
									System.out.println("Press 2 for Watery Grey ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Watery Blue");
											break;
									case 2: System.out.println("Watery Grey ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB     "+10999);
									System.out.println("4GB + 128GB    "+11999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 4GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C25s "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme C25s "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 12:price=9499;
									System.out.println();
									System.out.println("realme C25Y	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery      Display               Storage & RAM    FingerPrint   ");
									System.out.println();
									System.out.println(" Unisco T610            13MP AI         5000mAh                 16.5 cm(6.5 inch)     3GB + 32GB/      Instant    ");
									System.out.println("  Processor             Triple          Mega Battery            Large Display         4GB + 64GB       FingerPrint Sensor");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Cross Blue");
									System.out.println("Cross Grey ");
									System.out.println();
									System.out.println("Press 1 for Cross Blue");
									System.out.println("Press 2 for Cross Grey ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Cross Blue");
											break;
									case 2: System.out.println("Cross Grey ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("3GB + 32GB     "+9499);
									System.out.println("4GB + 64GB    "+10499);
									System.out.println();
									System.out.println("Press 1 for 3GB + 32GB");
									System.out.println("Press 2 for 4GB + 64GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("3GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme C25Y "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme C25Y "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
							default:System.out.println("Invalid Choice");
							}
							break;
					case 2: System.out.println("            Narzo Series");
							System.out.println();
							System.out.println("1.realme narzo 50i Prime	               ");
							System.out.println("  Processor         | Battery               | Display");
							System.out.println("  Unisoc T612       | 5000mAh               | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+7999);
							System.out.println();
							System.out.println("2.realme narzo 50 5G        ");
							System.out.println("  Processor         | Camera                | Display");
							System.out.println("  Dimensity 810     | 48MP                  | 90Hz");
							System.out.println("                                                                            Price:"+15999);
							System.out.println();
							System.out.println("3.realme narzo 50 Pro 5G  ");
							System.out.println("  Processor         | Display               | Camera");
							System.out.println("  Dimensity 920     | 90Hz                  | 48MP AI Triple");
							System.out.println("                                                                            Price:"+21999);
							System.out.println();
							System.out.println("4.realme narzo 50A Prime       ");
							System.out.println("  Processor         | Battery               | Camera");
							System.out.println("  Unisoc T612       | 5000mAh               | 50MP AI Triple");
							System.out.println("                                                                            Price:"+11499);
							System.out.println();
							System.out.println("5.realme narzo 50              ");
							System.out.println("  Processor         | RAM                   | Camera");
							System.out.println("  Helio G96         | 11GB                  | 50MP AI Triple");
							System.out.println("                                                                            Price:"+12999);
							System.out.println();
							System.out.println("6.realme narzo 50i             ");
							System.out.println("  Display           | Battery               | Processor");
							System.out.println("  16.5cm(6.5 inch)  | 5000mAh               | Octa-Core");
							System.out.println("                                                                            Price:"+7499);
							System.out.println();
							System.out.println("7.realme narzo 50A             ");
							System.out.println("  Processor         | Charging              | Camera");
							System.out.println("  Helio G85         | 18W                   | 50MP AI Triple");
							System.out.println("                                                                            Price:"+11499);
							System.out.println();
							System.out.println("8.realme narzo 30A             ");
							System.out.println("  Processor         | Battery               | Camera");
							System.out.println("  Helio G85         | 6000mAh               | 13MP AI Dual");
							System.out.println("                                                                            Price:"+8999);
							System.out.println();
							System.out.println("9.realme narzo 30         ");
							System.out.println("  Processor         | Display               | Battery");
							System.out.println("  Helio G95         | 90Hz                  | 5000mAh");
							System.out.println("                                                                            Price:"+13499);
							System.out.println();
							System.out.println("10.realme narzo 30 5G	       ");
							System.out.println("  Processor         | Battery               | Camera");
							System.out.println("  Dimensity 700     | 5000mAh               | 48MP");
							System.out.println("                                                                            Price:"+14999);
							System.out.println();
							System.out.println("Enter Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=7999;
									System.out.println();
									System.out.println("realme narzo 50i Prime	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery      Display               Storage & RAM       ");
									System.out.println();
									System.out.println(" Unisco T612            8MP AI/         5000mAh Massive         16.5 cm(6.5 inch)     3GB + 32GB/          ");
									System.out.println("  Processor             5MP Selfie         Battery              Fullscreen            4GB + 64GB       ");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Dark Blue");
									System.out.println("Mint Green ");
									System.out.println();
									System.out.println("Press 1 for Dark Blue");
									System.out.println("Press 2 for Mint Green ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Dark Blue");
											break;
									case 2: System.out.println("Mint Green ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("3GB + 32GB     "+7999);
									System.out.println("4GB + 64GB     "+8999);
									System.out.println();
									System.out.println("Press 1 for 3GB + 32GB");
									System.out.println("Press 2 for 4GB + 64GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("3GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 50i Prime "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB +64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme narzo 50i Prime "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 2: price=15999;
									System.out.println();
									System.out.println("realme narzo 50 5G 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery         Display               Storage & RAM               FingerPrint");
									System.out.println();
									System.out.println(" Dimensity 810          48MP	        33W Dart Charge /          90Hz Ultra            4GB + 64GB/ 4GB + 128GB     Super-fast Side Mounted     ");
									System.out.println(" 5G Processor           Nightscape      5000mAh Massive Battery    Smooth Display        6GB + 128GB                 FingerPrint");
									System.out.println("                                                                   6.6 inch");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Hyper Black");
									System.out.println("Hyper Blue ");
									System.out.println();
									System.out.println("Press 1 for Hyper Black");
									System.out.println("Press 2 for Hyper Blue ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Hyper Black");
											break;
									case 2: System.out.println("Hyper Blue ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB      "+15999);
									System.out.println("4GB + 128GB     "+16999);
									System.out.println("6GB + 128GB     "+17999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 4GB + 128GB");
									System.out.println("Press 3 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 50 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme narzo 50 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+2000));
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme narzo 50 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 3: price=21999;
									System.out.println();
									System.out.println("realme narzo 50 Pro 5G 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery         Display               Storage & RAM         FingerPrint ");
									System.out.println();
									System.out.println(" Dimensity 920          48MP AI	        33W Dart Charge /          90Hz Super            6GB + 128GB/          In-Display     ");
									System.out.println(" 5G Processor           Triple          5000mAh Massive Battery    AMOLED Display        8GB + 128GB           FingerPrint Sensor");
									System.out.println("                                                                   6.4 inch");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Hyper Black");
									System.out.println("Hyper Blue ");
									System.out.println();
									System.out.println("Press 1 for Hyper Black");
									System.out.println("Press 2 for Hyper Blue ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Hyper Black");
											break;
									case 2: System.out.println("Hyper Blue ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 128GB     "+21999);
									System.out.println("8GB + 128GB     "+23999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB");
									System.out.println("Press 2 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 50 Pro 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme narzo 50 Pro 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 4: price=11499;
									System.out.println();
									System.out.println("realme narzo 50A Prime 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor              Camera          Charging & Battery       Display               Storage & RAM       FingerPrint ");
									System.out.println();
									System.out.println(" Powerful Unisoc        50MP AI	         5000mAh                 16.7cm(6.6 inch)      4GB + 64GB/         Fast-Side Mounted    ");
									System.out.println(" T612 Processor         Triple           Massive Battery         FHD Display           4GB + 128GB         FingerPrint Sensor");
									System.out.println(); 
									System.out.println("Color");
									System.out.println();
									System.out.println("Flash Black");
									System.out.println("Flash Blue ");
									System.out.println();
									System.out.println("Press 1 for Flash Black");
									System.out.println("Press 2 for Flash Blue ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Flash Black");
											break;
									case 2: System.out.println("Flash Blue ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB      "+11499);
									System.out.println("4GB + 128GB     "+12499);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 4GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 50A Prime "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme narzo 50A Prime "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 5: price=12999;
									System.out.println();
									System.out.println("realme narzo 50 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor                Camera          Charging & Battery          Display                 Storage & RAM       FingerPrint ");
									System.out.println();
									System.out.println(" Mediatek Helio           50MP AI         33W Dart Charge/            120Hz Ultra Smooth      4GB + 64GB/         Fast-Side Mounted    ");
									System.out.println(" G96 Gaming Processor     Triple          5000mAh Massive Battery     16.7cm(6.6 inch)        6GB + 128GB         FingerPrint Sensor");
									System.out.println("                                                                      FHD+ Display"); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Speed Black");
									System.out.println("Speed Blue ");
									System.out.println();
									System.out.println("Press 1 for Speed Black");
									System.out.println("Press 2 for Speed Blue ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Speed Black");
											break;
									case 2: System.out.println("Speed Blue ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB      "+12999);
									System.out.println("6GB + 128GB     "+15499);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 50  "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2500));
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2500)*qty;
											System.out.println("realme narzo 50  "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 6: price=7499;
									System.out.println();
									System.out.println("realme narzo 50i 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor        Camera      Charging & Battery       Display              Storage & RAM        ");
									System.out.println();
									System.out.println(" Octa-core        8MP AI      5000mAh                  16.5cm(6.5 inch)     2GB + 32GB/             ");
									System.out.println(" Processor        HD          Massive Battery          Large Display        4GB + 64GB         ");
									System.out.println("                                                                      "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Carbon Black");
									System.out.println("Mint Green ");
									System.out.println();
									System.out.println("Press 1 for Carbon Black");
									System.out.println("Press 2 for Mint Green ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Carbon Black");
											break;
									case 2: System.out.println("Mint Green ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("2GB + 32GB      "+7499);
									System.out.println("4GB + 64GB      "+8999);
									System.out.println();
									System.out.println("Press 1 for 2GB + 32GB");
									System.out.println("Press 2 for 4GB + 64GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("2GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 50i  "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1500));
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1500)*qty;
											System.out.println("realme narzo 50i  "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 7: price=11499;
									System.out.println();
									System.out.println("realme narzo 50A 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera      Charging & Battery          Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Helio G85          50MP AI     18W Quick Charge/           16.5cm(6.5 inch)          4GB + 64GB/      Instant      ");
									System.out.println(" Gaming Processor   Triple      5000mAh Massive Battery     Mini-drop Fullscreen      4GB + 128GB      Fingerprint  ");
									System.out.println("                                                            Display         "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Oxygen Blue");
									System.out.println("Oxygen Green ");
									System.out.println();
									System.out.println("Press 1 for Oxygen Blue");
									System.out.println("Press 2 for Oxygen Green ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Oxygen Blue");
											break;
									case 2: System.out.println("Oxygen Green ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB       "+11499);
									System.out.println("4GB + 128GB      "+12499);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB");
									System.out.println("Press 2 for 4GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 50A  "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme narzo 50A  "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 8: price=8999;
									System.out.println();
									System.out.println("realme narzo 30A 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera      Charging & Battery       Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Helio G85          13MP AI     6000mAh                  16.5cm(6.5 inch)          3GB + 32GB/      Instant      ");
									System.out.println(" Gaming Processor   Dual        Mega Battery             Mini-drop Fullscreen      4GB + 64GB      Fingerprint  ");
									System.out.println("                                                         Display         "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Laser Blue");
									System.out.println("Laser Black ");
									System.out.println();
									System.out.println("Press 1 for Laser Blue");
									System.out.println("Press 2 for Laser Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Laser Blue");
											break;
									case 2: System.out.println("Laser Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("3GB + 32GB       "+8999);
									System.out.println("4GB + 64GB       "+9999);
									System.out.println();
									System.out.println("Press 1 for 3GB + 32GB");
									System.out.println("Press 2 for 4GB + 64GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println(price);
											System.out.println("3GB + 32GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 30A  "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println(price+1000);
											System.out.println("4GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme narzo 30A  "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 9: price=13499;
									System.out.println();
									System.out.println("realme narzo 30 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera      Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Helio G95          48MP AI     30W Dart Charge/             90 Hz Ultra Smooth       4GB + 64GB/      Side Mounted      ");
									System.out.println(" Gaming Processor   Triple      5000mAh Massive Battery      16.5cm(6.5 inch)         6GB + 64GB/      Fingerprint  ");
									System.out.println("                                                             Large Display            6GB + 128GB "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Racing Blue");
									System.out.println("Racing Silver ");
									System.out.println();
									System.out.println("Press 1 for Racing Blue");
									System.out.println("Press 2 for Racing Silver ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Racing Blue");
											break;
									case 2: System.out.println("Racing Silver ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB        "+13499);
									System.out.println("6GB + 64GB        "+14499);
									System.out.println("6GB + 128GB       "+15499);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB ");
									System.out.println("Press 2 for 6GB + 64GB");
									System.out.println("Press 3 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println(price);
											System.out.println("4GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 30  "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println(price+1000);
											System.out.println("6GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme narzo 30  "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println(price+2000);
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme narzo 30  "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 10:price=14999;
									System.out.println();
									System.out.println("realme narzo 30 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Dimensity 700      48MP         18W Quick Charge/            90 Hz Ultra Smooth       4GB + 64GB/       Side Mounted      ");
									System.out.println(" 5G Processor       Nightscape   5000mAh Massive Battery      16.5cm(6.5 inch)         6GB + 128GB       Fingerprint  ");
									System.out.println("                                                              Large Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Racing Blue");
									System.out.println("Racing Silver ");
									System.out.println();
									System.out.println("Press 1 for Racing Blue");
									System.out.println("Press 2 for Racing Silver ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Racing Blue");
											break;
									case 2: System.out.println("Racing Silver ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB        "+14999);
									System.out.println("6GB + 128GB       "+16999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB ");
									System.out.println("Press 2 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println(price);
											System.out.println("4GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme narzo 30 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println(price+2000);
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme narzo 30 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									 break;
							default:System.out.println("Invalid Selection");
							}
							break;
					case 3: System.out.println("            number Series");
							System.out.println();
							System.out.println("1.realme 9i 5G	               ");
							System.out.println("  Processor         | Battery              | Camera");
							System.out.println("  Dimensity 810     | 5000mAh              | 50MP AI Triple");
							System.out.println("                                                                            Price:"+14999);
							System.out.println();
							System.out.println("2.realme 9	               ");
							System.out.println("  Processor         | Camera               | Display");
							System.out.println("  SD 680            | 108MP                | 90Hz");
							System.out.println("                                                                            Price:"+16999);
							System.out.println();
							System.out.println("3.realme 9 5G	               ");
							System.out.println("  Processor         | Display              | Camera");
							System.out.println("  Dimensity 810     | 90Hz                 | 48MP AI Triple");
							System.out.println("                                                                            Price:"+15999);
							System.out.println();
							System.out.println("4.realme 9 5G Speed Edition	               ");
							System.out.println("  Processor         | Camera               | Display");
							System.out.println("  SD 778            | 48MP AI Triple       | 144Hz");
							System.out.println("                                                                            Price:"+19999);
							System.out.println();
							System.out.println("5.realme 9 Pro+ 5G	               ");
							System.out.println("  Processor         | Charging             | Battery");
							System.out.println("  Dimensity 920     | 60W                  | 4500mAh");
							System.out.println("                                                                            Price:"+24999);
							System.out.println();
							System.out.println("6.realme 9 Pro 5G	               ");
							System.out.println("  Processor         | Display              | Camera");
							System.out.println("  SD 695            | 120Hz                | 64MP");
							System.out.println("                                                                            Price:"+18999);
							System.out.println();
							System.out.println("7.realme 9i	               ");
							System.out.println("  Processor         | Battery              | Camera");
							System.out.println("  SD 680            | 5000mAh              | 50MP AI Triple");
							System.out.println("                                                                            Price:"+13499);
							System.out.println();
							System.out.println("8.realme 8i	               ");
							System.out.println("  Processor         | Battery              | Display");
							System.out.println("  Helio G96         | 5000mAh              | 120Hz");
							System.out.println("                                                                            Price:"+13999);
							System.out.println();
							System.out.println("9.realme 8s 5G	               ");
							System.out.println("  Processor         | Charging              | Display");
							System.out.println("  Dimensity 810     | 33W                   | 90Hz");
							System.out.println("                                                                            Price:"+17999);
							System.out.println();
							System.out.println("10.realme 8	               ");
							System.out.println("  Processor         | Battery              | Camera");
							System.out.println("  Helio G95         | 5000mAh              | 64MP AI Quad ");
							System.out.println("                                                                            Price:"+15999);
							System.out.println();
							System.out.println("11.realme 8 5G	               ");
							System.out.println("  Processor         | Battery              | Charging");
							System.out.println("  Dimensity 700     | 5000mAh              | 18W");
							System.out.println("                                                                            Price:"+15499);
							System.out.println();
							System.out.println("12.realme 5 Pro	               ");
							System.out.println("  Processor         | Battery              | Camera");
							System.out.println("  SD 712 AIE        | 4035mAh              | 48MP AI Quad");
							System.out.println("                                                                            Price:"+14999);
							System.out.println();
							System.out.println("Enter Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1:price=14999;
									System.out.println();
									System.out.println("realme 9i 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Dimensity 810      50MP AI      18W Quick Charge/            90 Hz Ultra Smooth       4GB + 64GB/      Side Mounted      ");
									System.out.println(" 5G Processor       Triple       5000mAh Massive Battery      16.5cm(6.5 inch)         6GB + 128GB      Fingerprint  ");
									System.out.println("                                                              Large Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Soulful Blue");
									System.out.println("Metallica Gold ");
									System.out.println("Rocking Black ");
									System.out.println();
									System.out.println("Press 1 for Soulful Blue");
									System.out.println("Press 2 for Metallica Gold ");
									System.out.println("Press 3 for Rocking Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Soulful Blue");
											break;
									case 2: System.out.println("Metallica Gold ");
											break;
									case 3: System.out.println("Rocking Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB        "+14999);
									System.out.println("6GB + 128GB       "+16999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB ");
									System.out.println("Press 2 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 9i 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme 9i 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 2:price=16999;
									System.out.println();
									System.out.println("realme 9	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 68      108MP        33W Dart Charge/            90 Hz                     6GB + 128GB/       In Display       ");
									System.out.println("  Processor         ProLight     5000mAh Massive Battery     16.5cm(6.5 inch)          8GB + 128GB        Fingerprint  ");
									System.out.println("                                                             Super AMOLED Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Meteor Black");
									System.out.println("Sunburst Gold ");
									System.out.println("Stargaze White");
									System.out.println();
									System.out.println("Press 1 for Meteor Black");
									System.out.println("Press 2 for Sunburst Gold ");
									System.out.println("Press 3 for Stargaze White ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Meteor Black");
											break;
									case 2: System.out.println("Sunburst Gold ");
											break;
									case 3: System.out.println("Stargaze White ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 128GB       "+16999);
									System.out.println("8GB + 128GB       "+17999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 9 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme 9 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 3:price=15999;
									System.out.println();
									System.out.println("realme 9 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Dimensity 810      48MP AI      18W Quick Charge/            90 Hz Ultra Smooth       4GB + 64GB/       Side Mounted      ");
									System.out.println(" 5G Processor       Triple       5000mAh Massive Battery      16.51cm(6.5 inch)        6GB + 128GB       Fingerprint  ");
									System.out.println("                                                              Large Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Stargaze White");
									System.out.println("Meteor Black");
									System.out.println("Supersonic Black");
									System.out.println("Supersonic Blue");
									System.out.println();
									System.out.println("Press 1 for Stargaze White");
									System.out.println("Press 2 for Meteor Black ");
									System.out.println("Press 3 for Supersonic Black");
									System.out.println("Press 4 for Supersonic Blue");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Stargaze White");
											break;
									case 2: System.out.println("Meteor Black ");
											break;
									case 3: System.out.println("Supersonic Black");
											break;
									case 4: System.out.println("Supersonic Blue ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB        "+15999);
									System.out.println("6GB + 128GB       "+17499);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB ");
									System.out.println("Press 2 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 9 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1500));
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1500)*qty;
											System.out.println("realme 9 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
								   break;
							case 4:price=19999;
									System.out.println();
									System.out.println("realme 9 5G	Speed Edition  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 778G    48MP AI      30W Dart Charge/             144Hz Gaming Screen      6GB + 128GB/      Side Mounted      ");
									System.out.println(" 5G Processor       Triple       5000mAh Massive Battery      16.7cm(6.6 inch)         8GB + 128GB      Fingerprint  ");
									System.out.println("                                                              Large Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Azure Glow ");
									System.out.println("Starry Glow ");
									System.out.println();
									System.out.println("Press 1 for Azure Glow");
									System.out.println("Press 2 for Starry Glow ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Azure Glow");
											break;
									case 2: System.out.println("Starry Glow ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 128GB       "+19999);
									System.out.println("8GB + 128GB       "+22999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 9 5G	Speed Edition "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+3000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+3000)*qty;
											System.out.println("realme 9 5G	Speed Edition"+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 5:price=24999;
									System.out.println();
									System.out.println("realme 9 Pro+ 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Dimensity 920      50MP         60W Super Dart/              90 Hz                    6GB + 128GB/       In Display      ");
									System.out.println(" 5G Processor       Nightscape   4500mAh Massive Battery      16.5cm(6.5 inch)         8GB + 128GB/      Fingerprint  ");
									System.out.println("                                                              Super AMOLED Display     8GB + 256GB       "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Sunrise Blue");
									System.out.println("Aurora Green ");
									System.out.println("Midnight Black ");
									System.out.println();
									System.out.println("Press 1 for Sunrise Blue");
									System.out.println("Press 2 for Aurora Green ");
									System.out.println("Press 3 for Midnight Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Sunrise Blue");
											break;
									case 2: System.out.println("Aurora Green ");
											break;
									case 3: System.out.println("Midnight Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 128GB       "+24999);
									System.out.println("8GB + 128GB       "+26999);
									System.out.println("8GB + 256GB       "+28999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									System.out.println("Press 3 for 8GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 9 Pro+ 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme 9 Pro+ 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+4000));
											System.out.println("8GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+4000)*qty;
											System.out.println("realme 9 Pro+ 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 6:price=18999;
									System.out.println();
									System.out.println("realme 9 Pro 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 695     64MP         33W Dart Charge              120Hz Ultra Smooth       6GB + 128GB/       Side Mounted      ");
									System.out.println(" 5G Processor       Nightscape   5000mAh Massive Battery      16.5cm(6.5 inch)         8GB + 128GB      Fingerprint  ");
									System.out.println("                                                              Large Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Sunrise Blue");
									System.out.println("Aurora Green ");
									System.out.println("Midnight Black ");
									System.out.println();
									System.out.println("Press 1 for Sunrise Blue");
									System.out.println("Press 2 for Aurora Green ");
									System.out.println("Press 3 for Midnight Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Sunrise Blue");
											break;
									case 2: System.out.println("Aurora Green ");
											break;
									case 3: System.out.println("Midnight Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 128GB       "+18999);
									System.out.println("8GB + 128GB       "+20999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 9 Pro 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme 9 Pro 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 7:price=13499;
									System.out.println();
									System.out.println("realme 9i	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera      Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 680     50MP AI     33W Dart Charge/             90 Hz Ultra Smooth       4GB + 64GB/       Side Mounted      ");
									System.out.println(" Processor          Triple      5000mAh Massive Battery      16.7cm(6.6 inch)         4GB + 128GB/      Fingerprint  ");
									System.out.println("                                                              Large Display           6GB + 128GB "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Prism Blue");
									System.out.println("Prism Black ");
									System.out.println();
									System.out.println("Press 1 for Prism Blue");
									System.out.println("Press 2 for Prism Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Prism Blue");
											break;
									case 2: System.out.println("Prism Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB        "+13499);
									System.out.println("4GB + 128GB       "+14999);
									System.out.println("6GB + 128GB       "+15999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB ");
									System.out.println("Press 2 for 4GB + 128GB");
									System.out.println("Press 3 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 9i "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1500));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1500)*qty;
											System.out.println("realme 9i "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+2500));
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2500)*qty;
											System.out.println("realme 9i "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 8:price=13999;
									System.out.println();
									System.out.println("realme 8i	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor      Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Helio G96      50MP AI      18W Fast Charge/             120Hz Ultra Smooth       4GB + 64GB/       Side Mounted      ");
									System.out.println(" Processor      Triple       5000mAh Massive Battery      16.8cm(6.6 inch)         6GB + 128GB       Fingerprint  ");
									System.out.println("                                                          Large Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Space Black");
									System.out.println("Space Purple ");
									System.out.println();
									System.out.println("Press 1 for Space Black");
									System.out.println("Press 2 for Space Purple ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Space Black");
											break;
									case 2: System.out.println("Space Purple ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB        "+13999);
									System.out.println("6GB + 128GB       "+15999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB ");
									System.out.println("Press 2 for 6GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 8i "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme 8i "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 9:price=17999;
									System.out.println();
									System.out.println("realme 8s 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Dimensity 810      64MP         33W Quick Charge/            90 Hz Ultra Smooth       6GB + 128GB/      Side Mounted      ");
									System.out.println(" 5G Processor       Nightscape   5000mAh Massive Battery      16.5cm(6.5 inch)         8GB + 128GB       Fingerprint  ");
									System.out.println("                                                              Large Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Universe Blue");
									System.out.println("Universe Purple ");
									System.out.println();
									System.out.println("Press 1 for Universe Blue");
									System.out.println("Press 2 for Universe Purple ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Universe Blue");
											break;
									case 2: System.out.println("Universe Purple ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 128GB       "+17999);
									System.out.println("8GB + 128GB       "+19999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 8s 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme 8s 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 10:price=15999;
									System.out.println();
									System.out.println("realme 8 	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor           Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Helio G96 Gaming    64MP AI      30W Dart Charge/             180Hz Ultra Smooth       4GB + 128GB/       Ultra -fatIn-Display      ");
									System.out.println(" Processor           Quad         5000mAh Massive Battery      16.3cm(6.4 inch)         6GB + 128GB/       Fingerprint  ");
									System.out.println("                                                               AMOLED Display           8GB + 128GB  "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Cyber Black");
									System.out.println("Cyber Silver ");
									System.out.println("Punk Black ");
									System.out.println();
									System.out.println("Press 1 for Cyber Black");
									System.out.println("Press 2 for Cyber Silver ");
									System.out.println("Press 3 for Punk Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Cyber Blacke");
											break;
									case 2: System.out.println("Cyber Silver ");
											break;
									case 3: System.out.println("Punk Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 128GB       "+15999);
									System.out.println("6GB + 128GB       "+16999);
									System.out.println("8GB + 128GB       "+17999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 128GB ");
									System.out.println("Press 2 for 6GB + 128GB");
									System.out.println("Press 3 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 8 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme 8  "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme 8  "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 11:price=15499;
									System.out.println();
									System.out.println("realme 8 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Dimensity 700      48M+2M+2M    18W Quick Charge/            90 Hz Ultra Smooth       4GB + 64GB/      Side Mounted      ");
									System.out.println(" 5G Processor                    5000mAh Massive Battery      16.5cm(6.5 inch)         4GB + 128GB/      Fingerprint  ");
									System.out.println("                                                              Large Display            8GB + 128GB "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Supersonic Blue");
									System.out.println("Supersonic Black ");
									System.out.println();
									System.out.println("Press 1 for Supersonic Blue");
									System.out.println("Press 2 for Supersonic Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Supersonic Blue");
											break;
									case 2: System.out.println("Supersonic Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB        "+15499);
									System.out.println("4GB + 128GB       "+16499);
									System.out.println("8GB + 128GB       "+18499);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB ");
									System.out.println("Press 2 for 4GB + 128GB");
									System.out.println("Press 3 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 8 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("4GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme 8 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+3000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+3000)*qty;
											System.out.println("realme 8 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 12:price=14999;
									System.out.println();
									System.out.println("realme 5 Pro	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor             Camera       Charging & Battery           Display              Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 712 AIE    48MP AI      VOOC Flash charge 3.0/       16.0cm(6.3 inch)     6GB + 64GB/       Instant       ");
									System.out.println(" Processor             Quad         4035mAh Massive Battery       FHD+ Display        8GB + 128GB/      Fingerprint  ");
									System.out.println("                                                                              "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Sparkling Blue");
									System.out.println("Chroma White  ");
									System.out.println("Crystal Green  ");
									System.out.println();
									System.out.println("Press 1 for Sparkling Blue");
									System.out.println("Press 2 for Chroma White ");
									System.out.println("Press 3 for Crystal Green ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Sparkling Blue");
											break;
									case 2: System.out.println("Chroma White ");
											break;
									case 3: System.out.println("Crystal Green ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 64GB        "+14999);
									System.out.println("8GB + 128GB       "+16999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 64GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme 5 Pro "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme 5 Pro "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					case 4: System.out.println("             GT Series");
							System.out.println();
							System.out.println("1.realme GT NEO 3T 80W	               ");
							System.out.println("  Processor         | Charging             | Battery");
							System.out.println("  SD 870            | 80W                  | 5000mAh");
							System.out.println("                                                                            Price:"+29999);
							System.out.println();
							System.out.println("2.realme GT NEO 3	               ");
							System.out.println("  Processor         | Charging             | Camera");
							System.out.println("  Dimensity 8100    | 80W                  | 50+8+2MP");
							System.out.println("                                                                            Price:"+36999);
							System.out.println();
							System.out.println("3.realme GT 2	               ");
							System.out.println("  Processor         | Charging             | Camera");
							System.out.println("  SD 888            | 65W                  | 50+8+2MP");
							System.out.println("                                                                            Price:"+34999);
							System.out.println();
							System.out.println("4.realme GT 2 Pro               ");
							System.out.println("  Processor         | Charging             | Battery");
							System.out.println("  SD 8 Gen 1 5G     | 65W                  | 5000mAh");
							System.out.println("                                                                            Price:"+49999);
							System.out.println();
							System.out.println("5.realme GT NEO 2	               ");
							System.out.println("  Processor         | Charging             | Battery");
							System.out.println("  SD 870            | 65W                  | 5000mAh");
							System.out.println("                                                                            Price:"+31999);
							System.out.println();
							System.out.println("6.realme GT 5G	               ");
							System.out.println("  Processor         | Charging             | Battery");
							System.out.println("  SD 888            | 65W                  | 4500mAh");
							System.out.println("                                                                            Price:"+37999);
							System.out.println();
							System.out.println("7.realme GT Master Edition	               ");
							System.out.println("  Processor         | Charging             | Battery");
							System.out.println("  SD 778            | 65W                  | 4300mAh");
							System.out.println("                                                                            Price:"+25999);
							System.out.println();
							System.out.println("Enter Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1:price=29999;
									System.out.println();
									System.out.println("realme GT NEO 3T 80W	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                   Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" SD 870 Antutu      64+8+2MP 	 80W Fast Charge/             120Hz HDR10+              6GB + 128GB/       Ultra In-Display       ");
									System.out.println(" 680k 5G Processor               5000mAh  Battery             16.7cm(6.62 inch)         8GB + 128GB/      Fingerprint  ");
									System.out.println("                                                              E4 AMOLED Display         8GB + 256GB    "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Dash Yellow");
									System.out.println("Drifting White ");
									System.out.println("Shade Black ");
									System.out.println();
									System.out.println("Press 1 for Dash Yellow");
									System.out.println("Press 2 for Drifting White ");
									System.out.println("Press 3 for Shade Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Dash Yellow");
											break;
									case 2: System.out.println("Drifting White  ");
											break;
									case 3: System.out.println("Shade Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("8GB + 128GB       "+29999);
									System.out.println("8GB + 128GB       "+31999);
									System.out.println("8GB + 256GB       "+33999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									System.out.println("Press 3 for 8GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme GT NEO 3T 80W "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme GT NEO 3T 80W "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+4000));
											System.out.println("8GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+4000)*qty;
											System.out.println("realme GT NEO 3T 80W "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 2:price=36999;
									System.out.println();
									System.out.println("realme GT NEO 3	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                    Storage & RAM     Fingerprint   ");
									System.out.println(); 
									System.out.println(" Dimensity 8100     50+8+2MP 	 80W Fast Charge/            120Hz Ultra Smooth    80W   8GB + 128GB/      In-Display       ");
									System.out.println(" Processor                       4880mAh  Battery            17.02cm(6.7 inch)     80W   8GB + 256GB/      Fingerprint  ");
									System.out.println("                                                             AMOLED Display        150W  12GB + 256GB "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Thor Limited Edition");
									System.out.println("Asphalt Black");
									System.out.println("Nitro Blue");
									System.out.println("Sprint White ");
									System.out.println();
									System.out.println("Press 1 for Thor Limited Edition");
									System.out.println("Press 2 for Asphalt Black");
									System.out.println("Press 3 for Nitro Blue");
									System.out.println("Press 4 for Racing Silver ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Thor Limited Edition");
											break;
									case 2: System.out.println("Asphalt Black");
											break;
									case 3: System.out.println("Nitro Blue");
											break;
									case 4: System.out.println("Sprint White ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("80W   8GB + 128GB       "+36999);
									System.out.println("80W   8GB + 256GB       "+38999);
									System.out.println("150W  12GB + 256GB      "+42999);
									System.out.println();
									System.out.println("Press 1 for 80W   8GB + 128GB ");
									System.out.println("Press 2 for 80W   8GB + 256GB");
									System.out.println("Press 3 for 150W  12GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("80W 8GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme GT NEO 3 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("80W 8GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme GT NEO 3 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+6000));
											System.out.println("150W  12GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+6000)*qty;
											System.out.println("realme GT NEO 3 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 3:price=34999;
									System.out.println();
									System.out.println("realme GT 2	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 888     50+8+2MP 	 65W Super Dart Charge/       120Hz Ultra Smooth        8GB + 128GB/       In-Display       ");
									System.out.println(" Processor                       5000mAh Massive Battery      16.8cm(6.62 inch)        12GB + 256GB        Fingerprint  ");
									System.out.println("                                                              AMOLED Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Paper Green");
									System.out.println("Paper White");
									System.out.println("Steel Black");
									System.out.println();
									System.out.println("Press 1 for Paper Green");
									System.out.println("Press 2 for Paper White");
									System.out.println("Press 3 for Steel Black");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Paper Green");
											break;
									case 2: System.out.println("Paper White");
											break;
									case 3: System.out.println("Steel Black");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println(" 8GB + 128GB      "+34999);
									System.out.println("12GB + 256GB      "+38999);
									System.out.println();
									System.out.println("Press 1 for  8GB + 128GB");
									System.out.println("Press 2 for 12GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("8GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme GT 2 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+4000));
											System.out.println("12GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+4000)*qty;
											System.out.println("realme GT 2 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 4:price=49999;
									System.out.println();
									System.out.println("realme GT 2 Pro	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor             Camera       Charging & Battery          Display                  Storage & RAM      Fingerprint   ");
									System.out.println();
									System.out.println(" SnapDragon 8 Gen 1    50MP+50MP   65W Super Dart Charge/       120Hz Ultra Smooth        8GB + 128GB/      In-Display      ");
									System.out.println(" 5G Processor          Dual        5000mAh Massive Battery      17.02cm(6.7 inch)        12GB + 256GB       Fingerprint  ");
									System.out.println("                                                                2K AMOLED Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Paper Green");
									System.out.println("Paper White");
									System.out.println("Steel Black");
									System.out.println();
									System.out.println("Press 1 for Paper Green");
									System.out.println("Press 2 for Paper White");
									System.out.println("Press 3 for Steel Black");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Paper Green");
											break;
									case 2: System.out.println("Paper White");
											break;
									case 3: System.out.println("Steel Black");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println(" 8GB + 128GB       "+49999);
									System.out.println("12GB + 256GB       "+57999);
									System.out.println();
									System.out.println("Press 1 for  8GB + 128GB ");
									System.out.println("Press 2 for 12GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("8GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme GT 2 Pro "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+8000));
											System.out.println("12GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+8000)*qty;
											System.out.println("realme GT 2 Pro "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 5:price=31999;
									System.out.println();
									System.out.println("realme GT NEO 2	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM      Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 870     64MP AI 	 65W Super Dart Charge/       120Hz  E4                 8GB + 128GB/      In-Display       ");
									System.out.println(" 5G Processor       Triple       5000mAh Massive Battery      16.5cm(6.5 inch)         12GB + 256GB       Fingerprint  ");
									System.out.println("                                                              AMOLED Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Neo Green");
									System.out.println("Neo Black ");
									System.out.println("Neo Blue ");
									System.out.println();
									System.out.println("Press 1 for Neo Green");
									System.out.println("Press 2 for Neo Black  ");
									System.out.println("Press 3 for Neo Blue ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Neo Green");
											break;
									case 2: System.out.println("Neo Black ");
											break;
									case 3: System.out.println("Neo Blue ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println(" 8GB + 128GB       "+31999);
									System.out.println("12GB + 256GB       "+35999);
									System.out.println();
									System.out.println("Press 1 for  8GB + 128GB ");
									System.out.println("Press 2 for 12GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("8GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme GT NEO 2 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+4000));
											System.out.println("12GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+4000)*qty;
											System.out.println("realme GT NEO 2 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 6:price=37999;
									System.out.println();
									System.out.println("realme GT 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM      Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 888     64MP         65W Super Dart Charge/       120Hz Ultra Smooth         8GB + 128GB/      In-Display      ");
									System.out.println(" 5G Processor       Triple       4500mAh Massive Battery      16.4cm(6.43 inch)         12GB + 256GB       Fingerprint  ");
									System.out.println("                                                              AMOLED Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Dashing Blue");
									System.out.println("Dashing Silver ");
									System.out.println("Racing Yellow ");
									System.out.println();
									System.out.println("Press 1 for Dashing Blue");
									System.out.println("Press 2 for Dashing Silver ");
									System.out.println("Press 3 for Racing Silver ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Dashing Blue");
											break;
									case 2: System.out.println("Dashing Silver");
											break;
									case 3: System.out.println("Racing Yellow");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println(" 8GB + 128GB       "+37999);
									System.out.println("12GB + 256GB       "+41999);
									System.out.println();
									System.out.println("Press 1 for  8GB + 128GB ");
									System.out.println("Press 2 for 12GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("8GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme GT 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+4000));
											System.out.println("12GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+4000)*qty;
											System.out.println("realme GT 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 7:price=25999;
									System.out.println();
									System.out.println("realme GT Master Edition	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 778G    64MP rear/   65W Super Dart Charge/       120Hz Ultra Smooth       6GB + 128GB/       In-Display      ");
									System.out.println(" 5G Processor       32MP front   4300mAh Massive Battery      16.5cm(6.5 inch)         8GB + 128GB/      Fingerprint  ");
									System.out.println("                                                              Super AMOLED Display     8GB + 256GB       "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Daybreak Blue");
									System.out.println("Cosmos Black ");
									System.out.println("Luna White");
									System.out.println("Voyager Grey ");
									System.out.println();
									System.out.println("Press 1 for Daybreak Blue");
									System.out.println("Press 2 for Cosmos Blackr ");
									System.out.println("Press 3 for Luna White");
									System.out.println("Press 4 for Voyager Grey ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Daybreak Blue");
											break;
									case 2: System.out.println("Cosmos Black ");
											break;
									case 3: System.out.println("Luna White");
											break;
									case 4: System.out.println("Voyager Grey ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 128GB       "+25999);
									System.out.println("8GB + 128GB       "+27999);
									System.out.println("8GB + 256GB       "+29999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									System.out.println("Press 3 for 8GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme GT Master Edition "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme GT Master Edition "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+4000));
											System.out.println("8GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+4000)*qty;
											System.out.println("realme GT Master Edition "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					case 5: System.out.println("                 X Series");
							System.out.println();
							System.out.println("1.realme  X7 Pro 5G              ");
							System.out.println("  Processor         | Display             | Battery");
							System.out.println("  Dimensity 1000+   | 120Hz Fullscreen    | 4500mAh");
							System.out.println("                                                                            Price:"+29999);
							System.out.println();
							System.out.println("2.realme X3 SuperZoom               ");
							System.out.println("  Camera            | Processor           | Charging");
							System.out.println("  60X Super zoom    | SD 855+             | 30 W");
							System.out.println("                                                                            Price:"+27999);
							System.out.println();
							System.out.println("3.realme  X3              ");
							System.out.println("  Camera            | Charging            | Display");
							System.out.println("  64MP Quad         | 80W                 | 6.5 inch Fullscreen");
							System.out.println("                                                                            Price:"+24999);
							System.out.println();
							System.out.println("4.realme  X2 Pro              ");
							System.out.println("  Display           | Charging            | Camera");
							System.out.println("  90Hz              | 50 W                | 64MP Quad");
							System.out.println("                                                                            Price:"+29999);
							System.out.println();
							System.out.println("5.realme  XT             ");
							System.out.println("  Camera            | Display             | Processor");
							System.out.println("  64MP Quad         | FHD+                | SD 712");
							System.out.println("                                                                            Price:"+16999);
							System.out.println();
							System.out.println("Enter Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1:price=29999;
									System.out.println();
									System.out.println("realme X7 Pro 5G	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Dimensity 1000+    Sony 64MP 	 65W Super Dart Charge/       120Hz Ultra Smooth       8GB + 128GB       In-Display      ");
									System.out.println(" 5G Processor       Quad         4500mAh Massive Battery      16.5cm(6.55 inch)                          Fingerprint  ");
									System.out.println("                                                              Super AMOLED Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Fantasy ");
									System.out.println("Mystic Black ");
									System.out.println();
									System.out.println("Press 1 for Fantasy");
									System.out.println("Press 2 for Mystic Black ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Fantasy");
											break;
									case 2: System.out.println("Mystic Black ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("8GB + 128GB       "+29999);
									System.out.println();
									System.out.println("Press 1 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price)*qty;
											System.out.println("realme X7 Pro 5G "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 2:price=27999;
									System.out.println();
									System.out.println("realme X3 SuperZoom	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera           Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 855+    64MP Quad        30W Dart Charge/             120Hz Ultra Smooth       8GB + 128GB/       Side Mounted      ");
									System.out.println(" Processor          60X Super Zoom   4200mAh Massive Battery      16.6cm(6.6 inch)         8GB + 256GB/      Fingerprint  ");
									System.out.println("                                                                  Fullscreen Display      12Gb + 256GB     "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Glacier Blue");
									System.out.println("Arctic White ");
									System.out.println();
									System.out.println("Press 1 for Glacier Blue");
									System.out.println("Press 2 for Arctic White ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Glacier Blue");
											break;
									case 2: System.out.println("Arctic White ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println(" 8GB + 128GB       "+27999);
									System.out.println(" 8GB + 256GB       "+29999);
									System.out.println("12GB + 256GB       "+32999);
									System.out.println();
									System.out.println("Press 1 for  8GB + 128GB ");
									System.out.println("Press 2 for  8GB + 256GB");
									System.out.println("Press 3 for 12GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("8GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme X3 SuperZoom "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme X3 SuperZoom "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+5000));
											System.out.println("12GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+5000)*qty;
											System.out.println("realme X3 SuperZoom "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 3:price=24999;
									System.out.println();
									System.out.println("realme X3	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera            Charging & Battery           Display                 Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 855+    64MP Quad/        30W Dart Charge/            120Hz Ultra Smooth       6GB + 128GB/      Side Mounted      ");
									System.out.println(" Processor          20X Hybrid Zoom   4200mAh  Battery            16.6cm(6.6 inch)         8GB + 128GB       Fingerprint  ");
									System.out.println("                                                                  Fullscreen Display             "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Glacier Blue");
									System.out.println("Arctic White ");
									System.out.println();
									System.out.println("Press 1 for Glacier Blue");
									System.out.println("Press 2 for Arctic White ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Glacier Blue");
											break;
									case 2: System.out.println("Arctic White ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB + 128GB       "+24999);
									System.out.println("8GB + 128GB       "+25999);
									System.out.println();
									System.out.println("Press 1 for 6GB + 128GB ");
									System.out.println("Press 2 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 128GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme X3 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme X3 "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 4:price=29999;
									System.out.println();
									System.out.println("realme X2 Pro	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 855+    64MP         50W Super VOOC Charge/       90 Hz Ultra Smooth       6GB  + 64GB/       In-Display       ");
									System.out.println(" Processor          Quad         5000mAh Massive Battery      16.5cm(6.5 inch)         8GB  + 128GB/      Fingerprint  ");
									System.out.println("                                                              FHD+ Super AMOLED        12GB + 256GB      "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Racing Blue");
									System.out.println("Racing Silver ");
									System.out.println();
									System.out.println("Press 1 for Racing Blue");
									System.out.println("Press 2 for Racing Silver ");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Racing Blue");
											break;
									case 2: System.out.println("Racing Silver ");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("6GB  + 64GB        "+29999);
									System.out.println("8GB  + 128GB       "+31999);
									System.out.println("12GB + 256GB       "+35999);
									System.out.println();
									System.out.println("Press 1 for 6GB  + 64GB ");
									System.out.println("Press 2 for 8GB  + 128GB");
									System.out.println("Press 2 for 12GB + 256GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("6GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme X2 Pro "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+2000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+2000)*qty;
											System.out.println("realme X2 Pro "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+6000));
											System.out.println("12GB + 256GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+6000)*qty;
											System.out.println("realme X2 Pro "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							case 5:price=16999;
									System.out.println();
									System.out.println("realme XT	  ");
									System.out.println("Price:"+price);
									System.out.println();
									System.out.println(" Processor          Camera       Charging & Battery           Display                  Storage & RAM     Fingerprint   ");
									System.out.println();
									System.out.println(" Snapdragon 712     64MP         20W VOOC Charge 3.O          90Hz Ultra Smooth        4GB + 64GB/       In-Display      ");
									System.out.println(" Processor          Quad         5000mAh Massive Battery      16.3cm(6.4 inch)         6GB + 64GB/      Fingerprint  ");
									System.out.println("                                                              FHD+ AMOLED Display      8GB + 128GB       "); 
									System.out.println();
									System.out.println("Color");
									System.out.println();
									System.out.println("Pearl Blue");
									System.out.println("Pearl White ");
									System.out.println();
									System.out.println("Press 1 for Pearl Blue");
									System.out.println("Press 2 for Pearl White");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Pearl Blue");
											break;
									case 2: System.out.println("Pearl White");
											break;
									default:System.out.println("Invalid Choice");
									}
									System.out.println();
									System.out.println("Storage");
									System.out.println();
									System.out.println("4GB + 64GB        "+16999);
									System.out.println("6GB + 64GB        "+17999);
									System.out.println("8GB + 128GB       "+19999);
									System.out.println();
									System.out.println("Press 1 for 4GB + 64GB ");
									System.out.println("Press 2 for 6GB + 64GB ");
									System.out.println("Press 3 for 8GB + 128GB");
									choice=scan.nextInt();
									switch (choice)
									{
									case 1: System.out.println("Price:"+price);
											System.out.println("4GB + 64GB ");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme XT "+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: System.out.println("Price:"+(price+1000));
											System.out.println("6GB + 64GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+1000)*qty;
											System.out.println("realme XT "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: System.out.println("Price:"+(price+3000));
											System.out.println("8GB + 128GB");
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=(price+3000)*qty;
											System.out.println("realme XT "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Choice");
									}
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					default:System.out.println("Invalid Selection");
					}
					break;
			case 2: System.out.println("                              Audio");
					System.out.println();
					System.out.println("1. Wired Earphones		2. Neck Band		3.Ear Buds		4. Bluetooth Speaker");
					System.out.println();
					System.out.println("Enter the Product Number");
					choice=scan.nextInt();
					switch (choice)
					{
						case 1: System.out.println("             Wired Earphones");
								System.out.println();
								System.out.println("1.realme Buds 2               "+"Price:"+599);
								System.out.println("2.realme Buds 2 Neo           "+"Price:"+499);
								System.out.println("3.realme Buds 2 Classic       "+"Price:"+399);
								System.out.println("Enter the Product Number");
								choice=scan.nextInt();
								switch (choice)
								{
									case 1: price=599;
											System.out.println("realme Buds 2               "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds 2"+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: price=499;
											System.out.println("realme Buds 2 Neo               "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds 2 Neo"+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: price=399;
											System.out.println("realme Buds 2 Classic              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds 2 Classic"+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Selection");
								}
								break;
						case 2: System.out.println("Neck Band");
								System.out.println();
								System.out.println("1.realme Buds Wireless Pro    "+"Price:"+2499);
								System.out.println("2.realme Buds Wireless 2      "+"Price:"+2099);
								System.out.println("3.realme Buds Wireless        "+"Price:"+1599);
								System.out.println("Enter the Product Number");
								choice=scan.nextInt();
								switch (choice)
								{
									case 1: price=2499;
											System.out.println("realme Buds Wireless Pro              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Wireless Pro"+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: price=2099;
											System.out.println("realme Buds Wireless 2              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Wireless 2 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: price=1599;
											System.out.println("realme Buds Wireless             "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Wireless"+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Selection");
								}
								break;
						case 3: System.out.println("Ear Buds");
								System.out.println();
								System.out.println("1.realme Buds Air 3s          "+"Price:"+1999);
								System.out.println("2.realme TechLife Buds T100   "+"Price:"+1499);
								System.out.println("3.realme Buds Air 3 Neo       "+"Price:"+1999);
								System.out.println("4.realme Buds Q2s             "+"Price:"+1599);
								System.out.println("5.realme Buds Air Pro         "+"Price:"+4999);
								System.out.println("6.realme Buds Air Neo         "+"Price:"+2999);
								System.out.println("Enter the Product Number");
								choice=scan.nextInt();
								switch (choice)
								{
									case 1: price=1999;
											System.out.println("realme Buds Air 3s              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Air 3s"+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: price=1499;
											System.out.println("realme TechLife Buds T100           "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme TechLife Buds T100"+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: price=1999;
											System.out.println("realme Buds Air 3 Neo              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Air 3 Neo"+" Quantity:"+qty+" Price:"+price);
											break;
									case 4: price=1599;
											System.out.println("realme Buds Q2s              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Q2s"+" Quantity:"+qty+" Price:"+price);
											break;
									case 5: price=4999;
											System.out.println("realme Buds Air Pro       "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Air Pro"+" Quantity:"+qty+" Price:"+price);
											break;
									case 6: price=2999;
											System.out.println("realme Buds Air Neo           "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Air Neo"+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Selection");
								}
								break;
						case 4: System.out.println("               Bluetooth Speaker");
								System.out.println();
								System.out.println("1.realme Brick  Bluetooth Speaker       "+"Price:"+2999);
								System.out.println("2.realme Cobble Bluetooth Speaker       "+"Price:"+1799);
								System.out.println("3.realme Pocket Bluetooth Speaker       "+"Price:"+1099);
								System.out.println("Enter the Product Number");
								choice=scan.nextInt();
								switch (choice)
								{
									case 1: price=2999;
											System.out.println("realme Brick Bluetooth Speaker              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Brick Bluetooth Speaker"+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: price=1799;
											System.out.println("realme Cobble Bluetooth Speaker           "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Cobble"+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: price=1099;
											System.out.println("realme Pocket Bluetooth Speaker             "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Pocket Bluetooth Speaker "+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Selection");
								}
					default:System.out.println("Invalid Selection");
					}
					break;
			case 3:	System.out.println("                      Smart Life");
					System.out.println();
					System.out.println("1.Smart Watches		2.Smart Band		3.Smart Home");
					System.out.println();
					System.out.println("Enter the Product Number");
					choice=scan.nextInt();
					switch (choice)
					{
					case 1: System.out.println("       Smart Watches");
							System.out.println();
							System.out.println("1.realme Watch 3 Pro          "+" Price:"+4999);
							System.out.println("2.realme Watch 3              "+" Price:"+2999);
							System.out.println("3.realme TechLife Watch S100  "+" Price:"+1899);
							System.out.println("4.realme Watch 2              "+" Price:"+2999);
							System.out.println("5.realme Watch 2 Pro          "+" Price:"+4499);
							System.out.println("6.realme Watch S              "+" Price:"+4499);
							System.out.println("7.realme Watch S Pro          "+" Price:"+9999);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
									case 1: price=4999;
											System.out.println("realme Watch 3 Pro              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Watch 3 Pro"+" Quantity:"+qty+" Price:"+price);
											break;
									case 2: price=2999;
											System.out.println("realme Watch 3            "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Watch 3 "+" Quantity:"+qty+" Price:"+price);
											break;
									case 3: price=1899;
											System.out.println("realme Buds Air 3 Neo              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Buds Air 3 Neo"+" Quantity:"+qty+" Price:"+price);
											break;
									case 4: price=2999;
											System.out.println("realme Watch 2              "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Watch 2"+" Quantity:"+qty+" Price:"+price);
											break;
									case 5: price=4499;
											System.out.println("realme Watch 2 Pro       "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Watch 2 Pro"+" Quantity:"+qty+" Price:"+price);
											break;
									case 6: price=4499;
											System.out.println("realme Watch S           "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Watch S"+" Quantity:"+qty+" Price:"+price);
											break;
									case 7: price=9999;
											System.out.println("realme Watch S Pro           "+"Price:"+price);
											System.out.println("Select the Quantity");
											qty=scan.nextInt();
											price=price*qty;
											System.out.println("realme Watch S Pro"+" Quantity:"+qty+" Price:"+price);
											break;
									default:System.out.println("Invalid Selection");
							}
							break;
					case 2: System.out.println("       Smart Band");
							System.out.println();
							System.out.println("1.realme Band            "+" Price:"+1499);
							System.out.println("2.realme Band 2          "+" Price:"+2999);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=1499;
									System.out.println("realme Band              "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Band"+" Quantity:"+qty+" Price:"+price);
									break;
							case 2: price=2999;
									System.out.println("realme Band 2              "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Band 2 "+" Quantity:"+qty+" Price:"+price);
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					case 3: System.out.println("      Smart Home ");
							System.out.println();
							System.out.println("1.realme TechLife Robot Vacuum Cleaner            "+" Price:"+24999);
							System.out.println("2.realme LED Smart Bulb                           "+" Price:"+749);
							System.out.println("3.realme Motion Activated Night Light             "+" Price:"+599);
							System.out.println("4.realme Smart Plug                               "+" Price:"+799);
							System.out.println("5.realme Smart Cam 360                            "+" Price:"+2999);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=24999;
									System.out.println("realme TechLife Robot Vacuum Cleaner              "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme TechLife Robot Vacuum Cleaner"+" Quantity:"+qty+" Price:"+price);
									break;
							case 2: price=749;
									System.out.println("realme LED Smart Bulb              "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme LED Smart Bulb"+" Quantity:"+qty+" Price:"+price);
									break;
							case 3: price=599;
									System.out.println("realme Motion Activated Night Light               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Motion Activated Night Light "+" Quantity:"+qty+" Price:"+price);
									break;
							case 4: price=799;
									System.out.println("realme Smart Plug              "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Smart Plug"+" Quantity:"+qty+" Price:"+price);
									break;
							case 5: price=2999;
									System.out.println("realme Smart Cam 360              "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Smart Cam 360"+" Quantity:"+qty+" Price:"+price);
									break;
							default:System.out.println("Invalid Selection");
							}
					default:System.out.println("Invalid Selection");
					}
					break;
			case 4: System.out.println("                     Accessories");
					System.out.println();
					System.out.println("1.PowerBanks		2.Cables		3.Gaming Accessories");
					System.out.println();
					System.out.println("Enter the Product Number");
					choice=scan.nextInt();
					switch (choice)
					{
					case 1: System.out.println("                     PowerBanks");
							System.out.println();
							System.out.println("1.realme 10000mAh Power Bank 2i                     "+" Price:"+1199);
							System.out.println("2.realme 30W Dart Charge 10000mAh Power Bank        "+" Price:"+2399);
							System.out.println("3.realme 10000mAh Power Bank 2                      "+" Price:"+1299);
							System.out.println("4.realme 20000mAh Power Bank 2                      "+" Price:"+2099);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=1199;
									System.out.println("realme  10000mAh Power Bank 2i             "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme 10000mAh Power Bank 2i "+" Quantity:"+qty+" Price:"+price);
									break;
							case 2: price=2399;
									System.out.println("realme 30W Dart Charge 10000mAh Power Bank              "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme 30W Dart Charge 10000mAh Power Bank "+" Quantity:"+qty+" Price:"+price);
									break;
							case 3: price=1299;
									System.out.println("realme  10000mAh Power Bank 2             "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme 10000mAh Power Bank 2 "+" Quantity:"+qty+" Price:"+price);
									break;
							case 4: price=2099;
									System.out.println("realme  20000mAh Power Bank 2             "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme 20000mAh Power Bank 2 "+" Quantity:"+qty+" Price:"+price);
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					case 2: System.out.println("                     Cables");
							System.out.println();
							System.out.println("1.realme Type-C Hub			 "+" Price:"+999);
							System.out.println("2.realme Micro-USB Cable		 "+" Price:"+199);
							System.out.println("3.realme Type-C Cable			 "+" Price:"+249);
							System.out.println("4.realme Type-C SuperDart Game Cable     "+" Price:"+599);
							System.out.println("5.realme Type-C VOOC Cable               "+" Price:"+399);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=999;
									System.out.println("realme Type-C Hub               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Type-C Hub "+" Quantity:"+qty+" Price:"+price);
									break;
							case 2: price=199;
									System.out.println("realme Micro-USB Cable               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Micro-USB Cable "+" Quantity:"+qty+" Price:"+price);
									break;
							case 3: price=249;
									System.out.println("realme Type-C Cable               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Type-C Cable  "+" Quantity:"+qty+" Price:"+price);
									break;
							case 4: price=599;
									System.out.println("realme Type-C SuperDart Game Cable               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Type-C SuperDart Game Cable "+" Quantity:"+qty+" Price:"+price);
									break;
							case 5: price=399;
									System.out.println("realme Type-C VOOC Cable               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Type-C VOOC Cable "+" Quantity:"+qty+" Price:"+price);
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					case 3: System.out.println("                     Gaming Accessories");
							System.out.println();
							System.out.println("1.realme Mobile Game Finger Sleeves		"+" Price:"+129);
							System.out.println("2.realme Mobile Game Trigger			"+" Price:"+699);
							System.out.println("3.realme Mobile Game Controller			"+" Price:"+999);
							System.out.println("4.realme Cooling Back Clip Neo			"+" Price:"+999);
							System.out.println("5.realme Cooling Back Clip			"+" Price:"+1799);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=129;
									System.out.println("realme Mobile Game Finger Sleeves               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Mobile Game Finger Sleeves  "+" Quantity:"+qty+" Price:"+price);
									break;
							case 2: price=699;
									System.out.println("realme Mobile Game Trigger               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Mobile Game Trigger  "+" Quantity:"+qty+" Price:"+price);
									break;
							case 3: price=999;
									System.out.println("realme Mobile Game Controller               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Mobile Game Controller  "+" Quantity:"+qty+" Price:"+price);
									break;
							case 4: price=999;
									System.out.println("realme Cooling Back Clip Neo               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Cooling Back Clip Neo  "+" Quantity:"+qty+" Price:"+price);
									break;
							case 5: price=1799;
									System.out.println("realme Cooling Back Clip                "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Cooling Back Clip   "+" Quantity:"+qty+" Price:"+price);
									break;
							default:System.out.println("Invalid Selection");
							}
					default:System.out.println("Invalid Selection");
					}
					break;
			case 5: System.out.println("                       Smart Tv");
					System.out.println();
					System.out.println("1.32 inch TV		2.43-50 inch TV		3.50+ inch TV");
					System.out.println();
					System.out.println("Enter the Product Number");
					choice=scan.nextInt();
					switch (choice)
					{
					case 1: System.out.println("                 Smart TV- 32 inch TV ");
							System.out.println();
							System.out.println("1.realme Smart TV Neo			"+" Price:"+13499);
							System.out.println("2.realme Smart TV Full HD		"+" Price:"+16499);
							System.out.println("3.realme Smart TV		        "+" Price:"+15499);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=13499;
									System.out.println("realme Smart TV Neo               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Smart TV Neo  "+" Quantity:"+qty+" Price:"+price);
									break;
							case 2: price=16499;
									System.out.println("realme Smart TV Full HD              "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Smart TV Full HD  "+" Quantity:"+qty+" Price:"+price);
									break;
							case 3: price=15499;
									System.out.println("realme Smart TV               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Smart TV  "+" Quantity:"+qty+" Price:"+price);
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					case 2: System.out.println("                 Smart TV- 43-50 inch TV ");
							System.out.println();
							System.out.println("1.realme Smart TV X Full HD		"+" Price:"+21999);
							System.out.println("2.realme Smart TV 4K		        "+" Price:"+29999);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=21999;
									System.out.println("realme Smart TV X Full HD               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Smart TV X Full HD  "+" Quantity:"+qty+" Price:"+price);
									break;
							case 2: price=29999;
									System.out.println("realme Smart TV 4K               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Smart TV 4K  "+" Quantity:"+qty+" Price:"+price);
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					case 3: System.out.println("                 Smart TV- 50 inch+ TV ");
							System.out.println();
							System.out.println("1.realme Smart TV SLED 4K		    "+" Price:"+48999);
							System.out.println();
							System.out.println("Enter the Product Number");
							choice=scan.nextInt();
							switch (choice)
							{
							case 1: price=48999;
									System.out.println("realme Smart TV SLED 4K               "+"Price:"+price);
									System.out.println("Select the Quantity");
									qty=scan.nextInt();
									price=price*qty;
									System.out.println("realme Smart TV SLED 4K  "+" Quantity:"+qty+" Price:"+price);
									break;
							default:System.out.println("Invalid Selection");
							}
							break;
					default:System.out.println("Invalid Selection");
					}
					break;
		}
		System.out.println();
		System.out.println("Add to Cart                               Buy Now");
		System.out.println();
		System.out.println("Press 1 for Add To Cart" );
		System.out.println("Press 2 for Buy Now");
		System.out.println("Press 3 for Exit ");
		choice=scan.nextInt();
		switch (choice)
		{
		case 1: System.out.println("Added to Cart Successfully");
				break;
		case 2: System.out.println("         Check Out");
				System.out.println("Add your Delivery Address");
				String address=scan.next();
				System.out.println("Add your Phone Number");
				int num=scan.nextInt();
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("Quantity                    "+qty);
				System.out.println("Item Subtotal               "+price);
				System.out.println();
				System.out.println();
				System.out.println();
				amount=amount+price;
				System.out.println("Total:"+amount+"                               Place Order");
				System.out.println();
				System.out.println("Press 1 for place the order");
				choice=scan.nextInt();
				switch (choice)
				{
				case 1:System.out.println("Payment Method");
						System.out.println();
						System.out.println("Choose your Payment Method");
						System.out.println();
						System.out.println("1.PhonePay/GooglePay/Paytm");
						System.out.println("2.Debit/Credit card");
						System.out.println("3.EMI");
						System.out.println("4.Cash on delivery");
						choice=scan.nextInt();
						switch (choice)
						{
							case 1: System.out.println("Enter UPI Pin");
									System.out.println("Payment "+amount+" done Successfully");
									break;
							case 2: System.out.println("Enter Card Details");
									System.out.println("Payment "+amount+" done Successfully");
									break;
							case 3: System.out.println("3 months/ 6 months / 9 months / 1 Year");
									break;
							case 4: System.out.println("After getting delivery u should pay the amount");
									break;
							default:System.out.println("Invalid Payment Choice");
						}
						System.out.println("Your Order was Placed");
						System.out.println("Order will be reached 3-5 Days");
						System.out.println("Thank You");
						break;
				default:System.out.println("Invalid Choice");
				}
				break;
		}
		System.out.println("Do you wish to continue Press 0");
		System.out.println("Do you wish to stop Press 1");
		status=scan.nextInt();
		amount=0;
		}
		while (status==0);	
	}
}
		