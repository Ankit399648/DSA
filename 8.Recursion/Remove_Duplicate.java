public class Remove_Duplicate {

    public static void removeDuplicate(String str, int index, StringBuilder newStr, Boolean map[])
    {
        if(index==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(index);
        if(map[currChar-'a']==true){
            removeDuplicate(str, index+1, newStr, map);
        }
        else{
            map[currChar-'a']=true;
            removeDuplicate(str, index+1, newStr.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str="zaabbccdde";
        Boolean map[]=new Boolean[26];
        for(int i=0; i<map.length; i++){
            map[i]=false;
        }
        removeDuplicate(str, 0, new StringBuilder(""), map);
    }
}
