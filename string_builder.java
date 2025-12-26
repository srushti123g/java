public class string_builder {
    public static void main(String args[]){
    //strings in java are 
    String str="h";
    str=str +"e";
    str=str +"l";
    str=str  +"l";
    str=str  +"o";
    StringBuilder sb=new StringBuilder("S");
    System.out.println(sb);
    //character AT INDEX 0
    System.out.println(sb.charAt(0));
    //set char at index 0
  sb.setCharAt(0,'D');
  System.out.println(sb);
  //to insert the character
  sb.insert(1,'S');
  System.out.println(sb);
  //delete the extra 
  sb.delete(0,1);
  System.out.println(sb);
  
  sb.append('r');
  
  sb.append('u');
  
  sb.append('s');
  
  sb.append('h');
  System.out.println(sb);
  
  



    }

}
