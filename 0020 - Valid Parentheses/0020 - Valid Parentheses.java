class Solution {
    public boolean isValid(String s) {
        ArrayList<Character> list = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' ){
                list.add(s.charAt(i));
            }else{
                if(list.size() == 0){
                    return false;
                }else if(check(list.get(list.size()-1),s.charAt(i)) == false){
                    return false;
                }else{
                    list.remove(list.size()-1);
                    }
            }
        }
        return list.size() == 0;
        
    }
    public boolean check(char a, char b){
            return (a == '(' && b ==')') || (a == '{' && b =='}') || (a == '[' && b ==']'); 
        }
}
