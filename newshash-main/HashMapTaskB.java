import java.util.HashMap;
import java.util.Scanner;

public class HashMapTaskB{
	    static Scanner input=new Scanner(System.in);
//Question1		
	public HashMap<Integer,String> map(){
   	  HashMap<Integer,String> mapList=new HashMap<Integer, String>(); 
	  return mapList;	  
    }
//Question2 
	public HashMap<String,String> addMap(String[] key,String[] values){
	 HashMap<String,String> map=new HashMap<String, String>();
	 	for(int run=0;run<key.length;run++){
	   		map.put(key[run],values[run]);
	    }
	 return map;
	}
//Question3	
	public HashMap<Integer,Integer> addInt(int[]number,int[]phoneNumber){
	 HashMap<Integer,Integer> mapThree=new HashMap<Integer,Integer>();
     	for(int run=0;run<number.length;run++){
     		mapThree.put(number[run],phoneNumber[run]);
     	}
    return mapThree;
   }
//Question4
	public HashMap<String,Integer> addStringInt(String[] name,int[] num){
	 HashMap<String,Integer> mapFour=new HashMap<String,Integer>();
	 	for(int run=0;run<name.length;run++){
	 		mapFour.put(name[run],num[run]);
	 	}
	 return mapFour;
	}
//Question5
//Question6	 	
	public HashMap<String,String> addNullValues(String[]animalKey,String[] animalValues){
	 HashMap<String,String> mapSix=new HashMap<String,String>(); 
	 	for(int run=0;run<animalKey.length;run++){
	 		mapSix.put(animalKey[run],animalValues[run]);
	 	}
    return mapSix;
   }
//Question7
	public HashMap<String,String> addNullKey(String[]animalKey,String[] animalValues){
	 HashMap<String,String> mapSaven=new HashMap<String,String>(); 
		 
		 for(int run=0;run<animalKey.length;run++){
		 	mapSaven.put(animalKey[run],animalValues[run]);
		 }
	 return mapSaven;
	}	 
//Question8
    public  HashMap<String,String>keyCheck(String[]animalKey,String[] animalValues){
		HashMap<String,String>mapEigth=new HashMap<String,String>();
			
			for(int run=0; run<animalKey.length;run++){
			   mapEigth.put(animalKey[run],animalValues[run]);
			}
		 mapEigth.containsKey(animalKey);
		return  mapEigth;	
	 }

//Question9
    public  HashMap<String,String>valueCheck(String[]animalKey,String[] animalValues){
	   	HashMap<String,String>mapNine=new HashMap<String,String>();
			
			for(int run=0; run<animalKey.length;run++){
			   mapNine.put(animalKey[run],animalValues[run]);
			}
		 mapNine.containsValue(animalKey);
		return  mapNine;	
	}		
   /* maim method will be start at below */

	public static void main(String[] args){
	     HashMapTaskB obj=new HashMapTaskB();
	     System.out.println("enter your choice");
	     int choice=input.nextInt();
	     
	switch(choice){
		case 1:
		       HashMap<Integer,String> mapList=obj.map();
		       System.out.println("map" +mapList);
		       System.out.println("map size" + mapList.size());
		       System.out.println("Run successfully");
		break;
		
		
		case 2:
		       System.out.println("enter the number of key and values you need to put the map");
		       int count=input.nextInt();
		       String[] key=new String[count];
		       String[] values = new String[count];
		       System.out.println("enter the"+ count+ "Key and value");
		       
		       	for(int run=0;run<count;run++){
		       		key[run]=input.next();
		       		values[run] = input.next();
		       }
		       
		       HashMap<String,String> map= obj.addMap(key,values);
		        System.out.println("HashMap" +map);
		        System.out.println("HashMap size" +map.size());
		        System.out.println("Run successfully");
		break;
		
		
		case 3:
		       System.out.println("enter the number of key and values you need to put the map");
		       count=input.nextInt();
		       int[]number=new int[count];
		       int[]phoneNumber=new int[count];
		       System.out.println("enter the" +count+ "key and values");
		       
		       	for(int run=0; run<count; run++){
		       		number[run]=input.nextInt();
		       		phoneNumber[run]=input.nextInt();
		       }
		       
		       HashMap<Integer,Integer> mapThree=obj.addInt(number,phoneNumber);
		       System.out.println("HashMap="+mapThree);
		       System.out.println("HashMap size="+mapThree.size());
		       System.out.println(" Run successfully");
		break;
		
		case 4:
			   System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   String[] name=new String[count];
			   int num[]=new int [count];
			   System.out.println("enter the" +count+ "key and values");
			   
			   	for(int run=0;run<count; run++){	
			    	name[run]=input.next();
			    	num[run]=input.nextInt();
			   }
		      HashMap<String,Integer> mapFour=obj.addStringInt(name,num);
		      System.out.println("HashMap="+mapFour);
		      System.out.println("HashMap size="+mapFour.size());
		      System.out.println(" Run successfully");
		break;
		
	/*   case 5:
	          System.out.println("enter the number of key and values you need to put the map");
		      count=input.nextInt();
			  String[]=new String[count];
			  System.out.println("enter the" +count+ "key and values");
			   
			   	for(int run=0;run<count; run++){	
			    	name[run]=input.next();
			    	num[run]=input.nextInt();
			   }
		       obj.
		       System.out.println(" Run successfully");
		break;*/
		
		case 6:
		       System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   String[] animalKey=new String[count];
			   String[] animalValues=new String [count];
			   System.out.println("enter the" +count+ "key and values");
			   
			   	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
			   }
		      HashMap<String,String> mapSix=obj.addNullValues(animalKey,animalValues);
		      System.out.println("HashMap="+mapSix);
		      System.out.println("HashMap size="+mapSix.size());
		      System.out.println("Run successfully");
		break;
		
		
		case 7:
			   System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   animalKey=new String[count];
			   animalValues=new String[count];
		       System.out.println("enter the null key and then add" +count+ "with values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		      HashMap<String,String> mapSaven=obj.addNullValues(animalKey,animalValues);
		      System.out.println("HashMap="+mapSaven);
		      System.out.println("HashMap size="+mapSaven.size());
		      System.out.println("Run successfully");
		break;
		
		case 8:
		      
			   System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   animalKey=new String[count];
			   animalValues=new String[count];
		       System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		      HashMap<String,String> mapEigth=obj.keyCheck(animalKey,animalValues);
		      System.out.println("HashMap="+mapEigth);
		      System.out.println("HashMap size="+mapEigth.size());
		      System.out.println("Run successfully");
			  System.out.println(mapEigth.containsKey(animalKey));  
			  
		break;
		 case 9:
			   System.out.println("enter the number of key and values you need to put the map");
			   count=input.nextInt();
			   animalKey=new String[count];
			   animalValues=new String[count];
		       System.out.println("enter the key and then add" +count+ " values");
		       	
		       	for(int run=0;run<count; run++){	
			    	animalKey[run]=input.next();
			    	animalValues[run]=input.next();
		        }
		      HashMap<String,String> mapNine=obj.valueCheck(animalKey,animalValues);
		      System.out.println("HashMap="+mapNine);
		      System.out.println("HashMap size="+mapNine.size());
		      System.out.println("Run successfully");
			  System.out.println(mapNine.containsKey(animalKey));  
		
		       System.out.println(" Run successfully");
		break;
		
/*case 9:
		System.out.println(" Run successfully");
		break;
		
		case 10:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 11:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 12:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 13:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		
		case 13:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		
		case 14:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 15:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 15:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 16:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 17:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 18:
		       obj.
		       System.out.println(" Run successfully");
		break;
		
		case 19:
		       obj.
		       System.out.println(" Run successfully");
		break;
	         
	    case 20:
		       obj.
		       System.out.println(" Run successfully");
		break;*/
	}
  }	
}
