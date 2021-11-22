import java.util.*;
import java.lang.*;
import java.io.*;
interface Sortvotes
{
    void ascendDisplay(ArrayList<String> votesEntered);
    void descendDisplay(ArrayList<String> votesEntered);
}


class ElectionPost implements Sortvotes
{
    public void printlist(ArrayList<String> listOfCandidates,String post)
    {
        System.out.println(post);
        for(String cand : listOfCandidates)
        {
            System.out.println(cand);
        }
    }
    
    public void ascendDisplay(ArrayList<String> votesEntered)
    {
       HashMap<String,Integer>hash=new HashMap<String,Integer>();
       for(String name:votesEntered)
       {
           if(hash.containsKey(name))
           hash.put(name,hash.get(name)+1);
           else
           hash.put(name,1);
       }
       Map<String,Integer> hash1=sortByValue(hash);
       for (Map.Entry<String, Integer> f : hash1.entrySet()) {
            System.out.println(f.getKey() +" - "+ f.getValue());
    }
	}
	public void descendDisplay(ArrayList<String> votesEntered)
    {
       HashMap<String,Integer>hash2=new HashMap<String,Integer>();
       for(String name:votesEntered)
       {
           if(hash2.containsKey(name))
           hash2.put(name,hash2.get(name)+1);
           else
           hash2.put(name,1);
       }
       Map<String,Integer> hash3=desortByValue(hash2);
       for (Map.Entry<String, Integer> f : hash3.entrySet()) {
            System.out.println(f.getKey() +" - "+ f.getValue());
    }
	}
	
    
    public HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm)
    {
        
        List<Map.Entry<String, Integer> > list =new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() 
        {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o1.getValue()).compareTo(o2.getValue());
            }
            
        });
       
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
    public HashMap<String, Integer> desortByValue(HashMap<String, Integer> hm)
    {
        
        List<Map.Entry<String, Integer> > list =new LinkedList<Map.Entry<String, Integer> >(hm.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer> >() 
        {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2)
            {
                return (o2.getValue()).compareTo(o1.getValue());
            }
            
        });
       
        HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> aa : list) {
            temp.put(aa.getKey(), aa.getValue());
        }
        return temp;
    }
  
            
        

}
public class Q4
{
	public static void main(String[] args)throws Exception {
	 Scanner sc=new Scanner(System.in);
	 String post=sc.nextLine();
	 int n=sc.nextInt();
	 String esc=sc.nextLine();
	 ArrayList<String> listOfCandidates=new ArrayList<String>();
     ArrayList<String> votesEntered=new ArrayList<String>();
	 while(n-->0)
	 {
	     String candidates=sc.nextLine();
	     listOfCandidates.add(candidates);
	 }
	 int m=sc.nextInt();
	 String buffer=sc.nextLine();
	 while(m-->0)
	 {
	     String name=sc.nextLine();
	     votesEntered.add(name);
	    
	     
	 }
	 ElectionPost obj=new ElectionPost();
	 System.out.println("Output:");
	 obj.printlist(listOfCandidates,post);
	 obj.ascendDisplay(votesEntered);
	 obj.descendDisplay(votesEntered);
	 
	}
}
