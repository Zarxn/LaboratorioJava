import java.util.Scanner;
public class Laboratorio{

  private static final int STRING_INPUT = 1;
  private static final int STRING_LENGTH = 5;
  private static final int STRING_CONCATENATION = 4;
  private static final int CHARACTER_POSITION = 6;
  private static final int ARRAY_INPUT = 3;
  private static final int NUMBER_INPUT  = 2;
  private static final int EXIT_TO_MAIN_MENU = 7;
  private static final int SHOW_NUMBER_DIVISION = 8;
  private static final int SHOW_INT_NUMBERS_DIVISION_AND_INT_RESIDUE = 9;
  private static final int SHOW_ARRAY = 10;
  private static final int ARRAY_AVERAGE = 11;
  private static final int MAX_ARRAY_VALUE = 12;
  private static final int ARRAY_MERGE = 14;
  private static final int ARRAY_MERGE_WITHOUT_DUPLICATES = 15;
  private static final int ARRAY_ARITHMETIC_OPERATIONS = 13;
  private static final int ARRAY_ADDITION = 23;
  private static final int ARRAY_SUBSTRACTION = 25;
  private static final int ARRAY_MULTIPLICATION = 24;
  private static final int ROTATE_ARRAY = 16;
  private static final int SORT_ARRAY = 17;
  
  
  
  
  private static int exit;
  private static int option;
  private static String firststring;
  private static String secondstring;
  private static String thirdstring;
  private static int position;
  private static double number1;
  private static double number2;
  private static double divisionresult;
  private static int intnumber1;
  private static int intnumber2;
  private static double intdivisionresult;
  private static int intresidueresult;
  private static int[] firstarray;
  private static int[] secondarray;
  private static int[] thirdarray;
  private static int[] arrayresult;
  private static int firstarraysize;
  private static int secondarraysize;
  private static int thirdarraysize;
  private static double arrayaverage;
  private static double array_average_result;
  private static double array_addition;
  private static int max_array_value;
  private static Scanner sc  = new Scanner(System.in);
  private static int max_array_value_result;
  private static int[] show_array_result;
  private static int arraysizeaddition;
  private static int indexarrayone;
  private static int indexarraytwo;
  private static int indexarraythree;
  private static int rotations_value;
  private static int get_rotations_value;
  private static int first_element_of_array;
  private static int last_element_of_array;
 
 
  
  /** This method intializes the variables that will be neccesary to solve the problems established
  */
  
   
  
    public static void initialize(){
  
    exit = 4;
	firststring = "";
	secondstring = "";
	thirdstring = "";
	option = 0;
	position = 0;
	number1 = 0.0;
	number2 = 0.0;
	divisionresult = 0.0;
	intnumber1 = 0;
	intnumber2 = 0;
	intdivisionresult = 0.0;
	intresidueresult = 0;
	firstarraysize = 0;
	secondarraysize = 0;
	thirdarraysize = 0;
	array_average_result = 0.0;
	array_addition = 0.0;
	max_array_value_result = 0;
	arraysizeaddition = 0;
	indexarrayone = 0;
	indexarraytwo = 0;
	indexarraythree = 0;
	rotations_value = 0;
	get_rotations_value = 0;
	first_element_of_array = 0;
	last_element_of_array = 0;
	
	
	
	
  
  
  
  
   }
  
  /** This method shows a menu to the user, which he can choose between string input, array input or two numbers input, depending on what he chooses, another menu will appear
    */
  
    public static void firstMenu(){
		
	System.out.println("");
	System.out.println("");
	System.out.println("Menu de opciones #1");
	System.out.println("Por favor seleccione alguna de las siguientes opciones: ");
	System.out.println("");
	System.out.println("(1).Ingresar tres cadenas de caracteres");
	System.out.println("(2).Ingresar dos numeros reales");
	System.out.println("(3).Ingresar tres arreglos");
	System.out.println("(4).Salir");
	System.out.println("");
	option = sc.nextInt();sc.nextLine();
	System.out.println("");
	
	     switch(option){
	
	      case STRING_INPUT:
		  
		  stringInput();
		  stringMenu();
		  
		  break;
		  
	      case NUMBER_INPUT:
		  
		  numbersInput();
	      numbersMenu();
		  
		  break;
	      
		  case ARRAY_INPUT:
		  
		  arraySize();
		  arrayInput();
		  arrayMenu();
		  
		  break;
	
	    }
	
	}
    
	/** This method ask the user to input  three string values, which will be stored on three differentes variables
	
	pre: user can't input a value different to a String value.
	post: three string values stored on three different variables.
	
	@throws Exception :
	
	1. If the user enter a value that is not a String value.
	
	*/
    
	public static void stringInput(){
	
	 
	System.out.println("Por favor ingrese la primera cadena");
	System.out.println("");
    firststring = sc.nextLine();
	System.out.println("");
	System.out.println("Por favor ingrese la segunda cadena");
	System.out.println("");
	secondstring = sc.nextLine();
	System.out.println("");
	System.out.println("Por favor ingrese la tercera cadena");
	System.out.println("");
	thirdstring = sc.nextLine();
	System.out.println("");
		  
		
	
	}
 
    /** This method concatenates three string values previously asked to the user
	
	*/
    public static void stringConcatenation(){
	
	System.out.println("El resultado de concatenar las cadenas es: " +" "+ firststring +" "+ secondstring +" "+ thirdstring);
	System.out.println("");
	stringMenu();
	
	/** This method shows to the user the length of each string value previously stored
	*/
	}
	public static void stringLength(){
	
	System.out.println("La longitud de la cadena " + firststring + " es: " + firststring.length());
	System.out.println("");
	System.out.println("La longitud de la cadena " + secondstring + " es: " + secondstring.length());
	System.out.println("");
	System.out.println("La longitud de la cadena " + thirdstring + " es: " + thirdstring.length());
	System.out.println("");
	stringMenu();


	
	
	}
	
	
	/** This method shows to the user the position of a character on each string  previously stored
	
	pre: user can't enter a position that doesn't exist in one string.
	post: the position of the character on each string.
	@throws Exception:
	
	1.If the user enter a position that doesn't exist in at least one string.
	*/
	public static void characterPosition(){
	
	System.out.print("Ingrese la posicion del caracter en la cadena que desea saber");
	System.out.println("");
	 position = sc.nextInt();
	 sc.nextLine();
	 System.out.println("");
	System.out.print("la posicion suministrada, en relacion a la cadena " + firststring + " corresponde al caracter: " + firststring.charAt(position));
	System.out.println("");
	System.out.print("la posicion suministrada, en relacion a la cadena " + secondstring + " corresponde al caracter: " + secondstring.charAt(position));
	System.out.println("");
	System.out.print("la posicion suministrada, en relacion a la cadena " + thirdstring + " corresponde al caracter: " + thirdstring.charAt(position));
	System.out.println("");
	stringMenu();
	
	
	}
	
	/** This method shows to the user a Menu, where he can find different options with different operations by only using string values
	  
     pre: user must choose a valid option.
     post: A different operation depending on what the user chooses.

    */	 
	
	public static void stringMenu(){
	
	
	System.out.println("¿Que Operacion desea realizar con las tres cadenas ingresadas?");
	System.out.println("");
	System.out.println("(4). Concatenar las tres cadenas y mostrar en pantalla");
	System.out.println("(5). Mostrar longitud de cada una de las tres cadenas");
	System.out.println("(6). Digitar numero y mostrar su correspondiente posicion en un caracter de la cadena");
	System.out.println("(7). Salir Al menu inicial");
	System.out.println("");
	option = sc.nextInt();
	sc.nextLine();
	System.out.println("");
	switch(option){
	
	
	case STRING_CONCATENATION:
	
	 stringConcatenation();
	
	 break;
	 
	 case STRING_LENGTH:
	 
	  stringLength();
	  
	 break;
	 
	 case CHARACTER_POSITION:
	 
	 characterPosition();
	 
	 break;
	 
	 case EXIT_TO_MAIN_MENU:
	 
	 firstMenu();
	
	
	 default:
	 
	 System.out.println("Por favor ingrese una opcion valida");
	
	}
	
	
	/** This method asks to the user two int values to be stored.
	
	pre: user must enter a number > 0;
	post: two int values stored.
	
	@throws Exception:
	1.If the user enter a String value.
	
	*/
   }
    
	public static void numbersInput(){
	
	System.out.println("Ingrese el primer numero real, por favor que sea mayor a 0");
	System.out.println("");
	number1 = sc.nextDouble();
	sc.nextLine();
	System.out.println("");
	while(number1 <= 0){
	
	System.out.println("Por favor ingrese un numero que se encuentre en el rango");
	System.out.println("");
	System.out.println("Ingrese el primer numero real, por favor que sea mayor a 0");
	System.out.println("");
	number1 = sc.nextDouble();
	sc.nextLine();
	System.out.println("");
	
	}
	System.out.println("Ingrese el segundo numero real, por favor que sea mayor a 0");
	System.out.println("");
	number2	= sc.nextDouble();
	sc.nextLine();
	while(number2 <= 0){
	
	System.out.println("Por favor ingrese un numero que se encuentre en el rango");
	System.out.println("");
	System.out.println("Ingrese el segundo numero real, por favor que sea mayor a 0");
	System.out.println("");
	number2 = sc.nextDouble();
	sc.nextLine();
	System.out.println("");
	
	}
	
	}
	
	
	/** This method  divid two numbers previously asked to the user and stored.
     */

   public static void numberDivision(){
	   
	   
	divisionresult = number1 / number2;
	System.out.println(""); 
	System.out.println("El resultado de la division entre " + number1 + " y " + number2 + " es: " + divisionresult);
	System.out.println("");
	numbersMenu();  
	  
   }
   
   /** This method divide the int part of the two numbers previosly calculated and stored
   */
   
   public static void intnumberDivision(){
	   
	 intnumber1 = (int)number1;
	 intnumber2 = (int)number2;
	 intdivisionresult = intnumber1 / intnumber2;
	 intresidueresult = intnumber1 % intnumber2;
	 System.out.println("");
	 System.out.println("El resultado de la division de la parte entera de " + number1 + " y " + number2 + " es " + intdivisionresult + " . El residuo de la parte entera por otro lado es igual a " + intresidueresult);
	 System.out.println("");
	 numbersMenu();
	  
   }
   /** This method shows a Menu to the user; where he can find different operations, by only using the two numbers he previously has chosen;
   
   */
   public static void numbersMenu(){
	   
	 System.out.println("¿Que operacion desea realizar con los dos numeros reales ingresados?");
	 System.out.println("(7) . Salir al menu principal");
	 System.out.println("(8) . Mostrar la division de los dos numeros ingresados");
	 System.out.println("(9) . Mostrar la division y el residuo de la parte entera de los dos numeros ingresados");
	 System.out.println("");
	 option = sc.nextInt();
	 sc.nextLine();
	 
	 switch(option){
		 
		 
		 case EXIT_TO_MAIN_MENU:
		 
		 firstMenu();
		 break;
		 
		 case SHOW_NUMBER_DIVISION:
		 
		 numberDivision();
		 break;
		 
		 case SHOW_INT_NUMBERS_DIVISION_AND_INT_RESIDUE:
		 
		 intnumberDivision();
		 break;
		 
		 default:
		 
		 System.out.println("Por favor seleccione una opcion valida");
			 
	 }
	     
   }
   
   /** This method ask to the user the size of each array the user will create
   
   *@throws Exception:
   
    1. if the user enter a String value.
   */
   
   public static void arraySize(){
	   
	 System.out.println("");
	 System.out.println("Por favor indique el tamaño que desea que sea el primer arreglo a ingresar");
	 System.out.println("");
	 firstarraysize = sc.nextInt();
	 sc.nextLine();
	 System.out.println("");
	 System.out.println("Por favor indique el tamaño que desea que sea el segundo arreglo a ingresar");
	 System.out.println("");
	 secondarraysize = sc.nextInt();
	 sc.nextLine();
	 System.out.println("");
	 System.out.println("Por favor indique el tamaño que desea que sea el tercer arreglo a ingresar");
	 System.out.println("");
	 thirdarraysize = sc.nextInt();
	 sc.nextLine();
	 System.out.println("");
	    
   }
   
   /**
    This method ask to the user each element of each of the three arrays and then store them.
	
	@throws Exception: if the user enter a String value;
   
   */
   public static void arrayInput(){
	   
	firstarray = new int[firstarraysize];
	secondarray = new int[secondarraysize];
	thirdarray = new int[thirdarraysize];
	
	for(int i = 0; i<firstarraysize ; i++){
		
		System.out.println("Por favor ingrese el elemento # " + (i+1) + " del primer arreglo");
		System.out.println("");
		firstarray[i] = sc.nextInt();
		sc.nextLine();
		System.out.println("");
	} 
	System.out.println("");
	System.out.println("");
	System.out.println("");
	for(int i = 0; i<secondarraysize ; i++){
		
		System.out.println("Por favor ingrese el elemento # " + (i+1) + " del segundo arreglo");
		System.out.println("");
		secondarray[i] = sc.nextInt();
		sc.nextLine();
        System.out.println("");	    
   }
   System.out.println("");
   System.out.println("");
   System.out.println("");
    for(int i = 0; i<thirdarraysize ; i++){
		
		System.out.println("Por favor ingrese el elemento # " + (i+1) + " del tercer arreglo");
		System.out.println("");
		thirdarray[i] = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		
    }
	System.out.println("");
	System.out.println("");
	
   }
   
   /**
   This method shows to the user all the elements of each array previosly created
   */
   
   public static void showArray(){
	   
	   
	 System.out.println("A continuacion se mostraran los tres arreglos que usted ha ingresado"); 
	 System.out.println("");
	 System.out.println("");
	 System.out.println("");
	 System.out.println("ARREGLO #1"); 
	 System.out.println("");
	 System.out.println("");
	 for(int i = 0; i<firstarraysize ; i++){
		 
		 System.out.println("El elemento # " + (i+1) + " del primer arreglo corresponde a: " + firstarray[i]);
		 
	 }
	 System.out.println("");
	 System.out.println("ARREGLO #2");
	 System.out.println("");
	 System.out.println("");
	 for(int i = 0; i<secondarraysize ; i++){
		 
		 System.out.println("El elemento # " + (i+1) + " del segundo arreglo corresponde a: " + secondarray[i]);
		 
		 
	 }
	   System.out.println("");
	   System.out.println("ARREGLO #3");
	   System.out.println("");
	   System.out.println("");
	   for(int i = 0; i<thirdarraysize ; i++){
		 
		 System.out.println("El elemento # " + (i+1) + " del tercer arreglo corresponde a: " + thirdarray[i]);
		 
		 
	 }
	   System.out.println("");
	   System.out.println("");
	   System.out.println("");
	   arrayMenu();
	     
	   
   }
    
	/** This method allow user to make a decision based on what array he want to do an especific operation;
	throws Execption:
	1.If the user enter a string value.
	*/
    public static void arrayChoice(){
		
		
	  System.out.println("Por favor indique a cual de los siguientes arreglos desea realizar el calculo seleccionado: ");
	  System.out.println("");
	  System.out.println("(20). Primer Arreglo");
	  System.out.println("(21). Segundo Arreglo");
	  System.out.println("(22). Tercer Arreglo");
	  System.out.println("");
	  option = sc.nextInt();
	  sc.nextLine();
	  System.out.println("");	
		
	}
	
	/** This method calculates the average among the elements of the three arrays previously stored
	post : a double value.
	*/
	
	public static double arrayAverage(){
		
		arrayaverage = 0.0;
		
		if(option == 20){
			
		for(int i = 0; i < firstarray.length; i++){
				
				arrayaverage += firstarray[i];
			
			
		}
        		
		arrayaverage = arrayaverage / firstarray.length;	
			
			
			
		} else if(option == 21){
			
		for(int i = 0; i < secondarray.length; i++){
				
				arrayaverage += secondarray[i];
			
			
		}
        		
		arrayaverage = arrayaverage / secondarray.length;	
			
			
			
		} else if(option == 22){
			
		for(int i = 0; i < thirdarray.length; i++){
				
				arrayaverage += thirdarray[i];
			
			
		}
        		
		arrayaverage = arrayaverage / thirdarray.length;	
			
			
			
		}
		
		return arrayaverage;
		
	}
   
   /** This method shows to the user the average of the elements of the three arrays previosly stored.
   */
   public static void showarrayAverage(){
	   
	   array_average_result = arrayAverage();
	   System.out.println("");
	   System.out.println("");
	   System.out.println("El promedio de los elementos del arreglo seleccionado es: " + array_average_result);
	   System.out.println("");
	   System.out.println("");
	   arrayMenu();   
	   
   }
      
	  /** This method find the max value of an especific array, based on a previous user selection;
	  */
   public static int maxarrayValue(){
   
     max_array_value = 0;
		
		if(option == 20){
			
		for(int i = 0; i < firstarray.length; i++){
				
				if(firstarray[i] > max_array_value){
					
					
					max_array_value = firstarray[i];
					
					
					
					
				}
			
			
		}
		
		} else if(option == 21){
			
		for(int i = 0; i < secondarray.length; i++){
				
				if(secondarray[i] > max_array_value){
					
					
					max_array_value = secondarray[i];
					
					
					
					
				}
			
			
		}
		
		} else if(option == 22){
			
		for(int i = 0; i < thirdarray.length; i++){
				
				if(thirdarray[i] > max_array_value){
					
					
					max_array_value = thirdarray[i];
					
					
					
					
				}
			
			
		}
		
		}
        
		
		return max_array_value;
		
	}
	
	/** This method allow user to make a multiple decision, in relation to what arrays he want to be operated;
	
	@throws Exception: if the user enter a String value
	
	*/
	public static void arraymultipleChoice(){
		
		
		System.out.println("Seleccione los arreglos a operar: ");
		System.out.println(""); 
		System.out.println(""); 
		System.out.println("(30). Arreglo 1 y Arreglo 2");
		System.out.println("(31). Arreglo 1 y Arreglo 3");
		System.out.println("(32). Arreglo 2 y Arreglo 3");
		System.out.println("(33). Arreglo 3 y Arreglo 2");
		System.out.println("(34). Arreglo 2 y Arreglo 1");
		System.out.println("(35). Arreglo 3 y Arreglo 1");
		System.out.println("(36). Ir al menu de arreglos");
		System.out.println("");
		array_size_Verification();
		System.out.println("");
		option = sc.nextInt();	
		
	}
	
	/** This method compare the size of each array, due to the fact that two arrays can't be operated if they have different sizes.
	
	*/
	
	public static void array_size_Verification(){
		
	if(firstarray.length != secondarray.length){
 
	System.out.println("El arreglo no.1 y no.2 no tienen el mismo tamaño, por lo tanto tenga en cuenta que no se pueden operar");
	System.out.println(""); 
		
		
		
		
	} 
	if(firstarray.length != thirdarray.length){
		
	System.out.println("El arreglo no.1 y no.3 no tienen el mismo tamaño, por lo tanto tenga en cuenta que no se pueden operar");
	System.out.println(""); 
		
		
		
		
	} 
	if(thirdarray.length != secondarray.length){
		
    
	System.out.println("El arreglo no.2 y no.3 no tienen el mismo tamaño, por lo tanto tenga en cuenta que no se pueden operar");
	System.out.println(""); 
		
		
	} 
			
	}
	
	/** This method calculates the sum between the elements of the two arrays previosly chosen by the user.
	*/
	public static int[] arrayAddition(){
		
	
			
		
		if(option == 30){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = firstarray[i] + secondarray[i];
				
				
			}
			
			
			
		} else if(option == 31){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = firstarray[i] + thirdarray[i];
				
				
			}
			

			
		} else if(option == 32){
			
			
			arrayresult = new int[secondarray.length];
			
			for(int i = 0; i < secondarray.length; i++){
				
				
				arrayresult[i] = secondarray[i] + thirdarray[i];
				
		
			}
			
			
		} else if(option == 33){
			
			
			arrayresult = new int[secondarray.length];
			
			for(int i = 0; i < secondarray.length; i++){
				
				
				arrayresult[i] = thirdarray[i] + secondarray[i];
				
	
				
			}
			
			
			
		} else if(option == 34){
		
			
			arrayresult = new int[firstarray.length];
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = secondarray[i] + firstarray[i];
				
					
			}
				
			
		} else if(option == 35){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = thirdarray[i] + firstarray[i];
				
			}
			
			
		} else if(option == 36){
			
			
			arrayMenu();
			
		}
		
		return arrayresult;
			
	}
	
	//* This method shows to the user a new array, which contains the sum of each element of the two arrays previosly chosen to be operated.
	public static void show_array_additionResult(){
		
		show_array_result = arrayAddition();
	 	for(int i = 0; i< show_array_result.length; i++){
			
			
	    System.out.println("El elemento # " +(i+1)+ " del nuevo arreglo es igual a: " + show_array_result[i]);
			
		}
		
		System.out.println("");
		System.out.println("");
		arrayMenu();
		
		
		
		
	}
	
	
	
	public static int[] arraySubstraction(){
		
	if(option == 30){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = firstarray[i] - secondarray[i];
				
				
			}
			
			
			
		} else if(option == 31){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = firstarray[i] - thirdarray[i];
				
				
			}
			

			
		} else if(option == 32){
			
			
			arrayresult = new int[secondarray.length];
			
			for(int i = 0; i < secondarray.length; i++){
				
				
				arrayresult[i] = secondarray[i] - thirdarray[i];
				
		
			}
			
			
		} else if(option == 33){
			
			
			arrayresult = new int[secondarray.length];
			
			for(int i = 0; i < secondarray.length; i++){
				
				
				arrayresult[i] = thirdarray[i] - secondarray[i];
				
	
				
			}
			
			
			
		} else if(option == 34){
		
			
			arrayresult = new int[firstarray.length];
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = secondarray[i] - firstarray[i];
				
					
			}
				
			
		} else if(option == 35){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = thirdarray[i] - firstarray[i];
				
			}
			
			
		} else if(option == 36){
			
			
		 arrayMenu();
			
		}
		
		return arrayresult;		
	}
	
	public static void show_array_substractionResult(){
		
	show_array_result = arraySubstraction();
	 	for(int i = 0; i< show_array_result.length; i++){
			
			
	    System.out.println("El elemento # " +(i+1)+ " del nuevo arreglo es igual a: " + show_array_result[i]);
			
		}
		
		System.out.println("");
		System.out.println("");
		arrayMenu();	
		
	}
	
	public static int[] arrayMultiplication(){
		
	    if(option == 30){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = firstarray[i] * secondarray[i];
				
				
			}
			
			
			
		} else if(option == 31){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = firstarray[i] * thirdarray[i];
				
				
			}
			

			
		} else if(option == 32){
			
			
			arrayresult = new int[secondarray.length];
			
			for(int i = 0; i < secondarray.length; i++){
				
				
				arrayresult[i] = secondarray[i] * thirdarray[i];
				
		
			}
			
			
		} else if(option == 33){
			
			
			arrayresult = new int[secondarray.length];
			
			for(int i = 0; i < secondarray.length; i++){
				
				
				arrayresult[i] = thirdarray[i] * secondarray[i];
				
	
				
			}
			
			
			
		} else if(option == 34){
		
			
			arrayresult = new int[firstarray.length];
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = secondarray[i] * firstarray[i];
				
					
			}
				
			
		} else if(option == 35){
			
			
			arrayresult = new int[firstarray.length];
			
			for(int i = 0; i < firstarray.length; i++){
				
				
				arrayresult[i] = thirdarray[i] * firstarray[i];
				
			}
			
			
		} else if(option == 36){
			
			
		 arrayMenu();
			
		}
		
		return arrayresult;		
	}		
	
	
	public static void show_array_multiplicationResult(){
		
		show_array_result = arrayMultiplication();
	 	for(int i = 0; i< show_array_result.length; i++){
			
			
	    System.out.println("El elemento # " +(i+1)+ " del nuevo arreglo es igual a: " + show_array_result[i]);
			
		}
		
		System.out.println("");
		System.out.println("");
		arrayMenu();		
		
	}
	
	public static int[] arrayMerge(){
		
		
	 arraysizeaddition = firstarray.length + secondarray.length + thirdarray.length;	
	 arrayresult = new int[arraysizeaddition];
	 for(int i = 0; i< arraysizeaddition; i++){
		 
		if( indexarrayone < firstarray.length){
			
		arrayresult[i] = firstarray[indexarrayone];	
		indexarrayone++;
		
		} else if( indexarraytwo < secondarray.length){
			
			
		arrayresult[i] = secondarray[indexarraytwo];
		indexarraytwo++;
			
			
		} else if( indexarraythree < thirdarray.length){
		 
			
		arrayresult[i] = thirdarray[indexarraythree];	
		indexarraythree++;
			
			
		}  
		 
	 }	
		
		
	return arrayresult;
		
	}
	
	
	public static void showarrayMerge(){
		
	System.out.println("");	
	show_array_result = arrayMerge();
    System.out.println("Union de los tres arreglos: ");
    System.out.println("");	
	System.out.println("");
	for(int i = 0; i<show_array_result.length; i++){
		
	System.out.println("El elemento " + (i+1) + " del nuevo arreglo es: " + show_array_result[i]);
	System.out.println("");	
	System.out.println("");
	
		
	}
	
	arrayMenu();
	System.out.println("");	
	System.out.println("");
		
	}
	
	public static void get_arithmetic_operationMenu(){
		
		System.out.println("");
		System.out.println("(23). Suma");
		System.out.println("(24). Multiplicacion");
		System.out.println("(25). Resta");
		System.out.println("");
		option = sc.nextInt();
		System.out.println("");
		System.out.println("");
		switch(option){
			
			
			case ARRAY_ADDITION:
			     
				 arraymultipleChoice();
				 arrayAddition();
				 show_array_additionResult();
			
			     break;
				 
			case ARRAY_MULTIPLICATION:
                 
				 arraymultipleChoice();
				 arrayMultiplication();
				 show_array_multiplicationResult();
                 
				 break;
			
			
			case ARRAY_SUBSTRACTION:
			
			    arraymultipleChoice();
				arraySubstraction();
				show_array_substractionResult();
			    
				break;
			
			
			
			default:
			
			System.out.println("");
			System.out.println("Opcion no valida");
			System.out.println("");
			
	
		}	
		
	}
	

	
	public static void get_value_of_n_Rotations(){
	
	System.out.println("");	
	System.out.println("");	
	System.out.println("Escriba el numero de veces que quiere rotar el arreglo");
	System.out.println("");	
	System.out.println("");	
	get_rotations_value = sc.nextInt();
	System.out.println("");	
	System.out.println("");	
		
		
	
		
		
	}
	
	public static int[] toinvertArray(){
		
		
		if(option == 20){
			
			
			arrayresult = new int[firstarray.length];	
			for(int i = 0; i < get_rotations_value; i++){
		
		
			
			 last_element_of_array = firstarray[firstarray.length-1]; 
			 
			 for(int j = firstarray.length-1; j > 0; j--){    
                 
                 firstarray[j] = firstarray[j-1];  
				 
                 }  
				 
			firstarray[0] = last_element_of_array;    
		 
		        }
				
			
		
		     
		arrayresult = firstarray;	
				
				
			
			
			
		}  else if(option == 21){
			
			arrayresult = new int[secondarray.length];
		  
			
				
				 
				for( int i = 0; i < get_rotations_value; i++){
		
		
			
			 last_element_of_array = secondarray[secondarray.length-1]; 
			 
			 for(int j = secondarray.length-1; j > 0; j--){    
                 
                 secondarray[j] = secondarray[j-1];  
				 
                 }  
				 
			   secondarray[0] = last_element_of_array;    
		 
		        }
				
						
			
		arrayresult = secondarray;	
			
		}	else if(option == 22){
			
			arrayresult = new int[thirdarray.length];
			
				
				 
				for( int i = 0; i < get_rotations_value; i++){
		
		
			
			 last_element_of_array = thirdarray[thirdarray.length-1]; 
			 
			 for(int j = thirdarray.length-1; j > 0; j--){    
                 
                 thirdarray[j] = thirdarray[j-1];  
				 
                 }  
				 
			thirdarray[0] = last_element_of_array;    
		 
		        }
		
				
				
			
			arrayresult = thirdarray;
			
		} else{
			
			
			System.out.println("");
			System.out.println("");
			System.out.println("Seleccione una opcion valida");
			System.out.println("");
			System.out.println("");
		}
			
		return arrayresult;
			
	}
	
	public static void show_rotated_Array(){
		
		
		show_array_result = toinvertArray();
	 	for(int i = 0; i<arrayresult.length; i++){
			
			
	    System.out.println("El elemento # " +(i+1)+ " del nuevo arreglo es igual a: " + show_array_result[i]);
			
		}
		
		System.out.println("");
		System.out.println("");
		arrayMenu();		
	}
	
	
   public static void show_max_array_Value(){
	   
	   
	   
	   max_array_value_result = maxarrayValue();
	   System.out.println("");
	   System.out.println("");
	   System.out.println("El mayor elemento del arreglo seleccionado es igual a: "  + max_array_value_result);
	   arrayMenu();
	     
   }
   
   public static int[] toSortArray(){
	   
	 if(option == 20){
		 
		 arrayresult = new int[firstarray.length];
		 for(int i = 0; i < firstarray.length - 1; i++)
        {
            for(int j = 0; j < firstarray.length - 1; j++)
            {
                if (firstarray[j] < firstarray[j + 1])
                {
                    int tmp = firstarray[j+1];
                    firstarray[j+1] = firstarray[j];
                    firstarray[j] = tmp;
                }
            }
        } 
		
		arrayresult = firstarray;
	 }
	 
	 if(option == 21){
		 arrayresult = new int[secondarray.length];
		 for(int i = 0; i < secondarray.length - 1; i++)
        {
            for(int j = 0; j < secondarray.length - 1; j++)
            {
                if (secondarray[j] < secondarray[j + 1])
                {
                    int tmp = secondarray[j+1];
                    secondarray[j+1] = secondarray[j];
                    secondarray[j] = tmp;
                }
            }
        } 
		 arrayresult = secondarray;
	 }
	 
	 if(option == 22){
		 arrayresult = new int[thirdarray.length];
		 for(int i = 0; i < thirdarray.length - 1; i++)
        {
            for(int j = 0; j < thirdarray.length - 1; j++)
            {
                if (thirdarray[j] < thirdarray[j + 1])
                {
                    int tmp = thirdarray[j+1];
                    thirdarray[j+1] = thirdarray[j];
                    thirdarray[j] = tmp;
                }
            }
        } 
		 arrayresult = thirdarray;

	 }
	      
	   return arrayresult;
	     
	   
   }
   
   
   public static void to_show_SortedArray(){
	   
	arrayresult = toSortArray();
	 	for(int i = 0; i<arrayresult.length; i++){
			
			
	    System.out.println("El elemento # " +(i+1)+ " del nuevo arreglo es igual a: " + arrayresult[i]);
			
		}
		
		System.out.println("");
		System.out.println("");
		arrayMenu();	     
	   
   }
   
   
   public static void arrayMenu(){
	   
	   
	   System.out.println("");
	   System.out.println("¿Que operacion desea realizar con los arreglos ingresados?");
	   System.out.println("");
	   System.out.println("(10) .Mostrar en pantalla");
	   System.out.println("(11) .Hallar promedio de los elementos");
	   System.out.println("(12) .Mostrar mayor valor de los elementos");
	   System.out.println("(13) .Realizar Operaciones aritmeticas y generar nuevo arreglo");
	   System.out.println("(14) .Mostrar union de los tres arreglos(con elementos repetidos) y generar nuevo arreglo");
	   System.out.println("(15) .Mostrar union de los tres arreglos(sin elementos repetidos) y generar nuevo arreglo");
	   System.out.println("(16) .Rotar arreglo");
	   System.out.println("(17) .Ordenar arreglo");
	   System.out.println("(7) . Salir al menu principal");
	   option = sc.nextInt();
	   sc.nextLine();
	   System.out.println("");
	   switch(option){
		   
		   
		 case SHOW_ARRAY:
		 
		 showArray();
		 
		 break;
		 
		 case ARRAY_AVERAGE:
		   
		   arrayChoice();
		   arrayAverage();
		   showarrayAverage();
		   
		   break;
		   
		 case MAX_ARRAY_VALUE:
		 
		   arrayChoice();
		   maxarrayValue();
		   show_max_array_Value();
		   
		   break;
		   
		 case ARRAY_ARITHMETIC_OPERATIONS:
		  
		   get_arithmetic_operationMenu();
		   
		   break;
		   
		  case ARRAY_MERGE:
		  
		  arrayMerge();
		  showarrayMerge();
		  
		  break;
		  
	      case ROTATE_ARRAY:
		  
		  
		  arrayChoice();
		  get_value_of_n_Rotations();
		  toinvertArray();
		  show_rotated_Array();
		  
		  case SORT_ARRAY:
		  
		  arrayChoice();
		  toSortArray();
		  to_show_SortedArray();
		  
		  
		  
		  
		  case EXIT_TO_MAIN_MENU:
		  
		  firstMenu();
		  
		  default: 
		  
		  System.out.println("");
		  System.out.println("Opcion invalida");
		  System.out.println("");
		  arrayMenu();
		  System.out.println("");
		  System.out.println("");
		   
		   
		   
	   }
	   
	   
	   
   }
   
   public static void main(String args[]){
   
   
   initialize();
   firstMenu();
   
   
   
   }



}