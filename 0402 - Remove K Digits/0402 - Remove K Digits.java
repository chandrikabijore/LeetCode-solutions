class Solution {
        public String removeKdigits(String num, int k) {
       Stack<Character> stk=new Stack<>();
       int n=num.length();
       if(k>=n)
       {
           return "0";
       }
       for(int i=0;i<n;i++)
       {
               while(!stk.isEmpty()&&stk.peek()>num.charAt(i) && k!=0)
               {
                   stk.pop();
                   k--;
               }
               if(!stk.isEmpty() || num.charAt(i)!='0')
               {
                   stk.push(num.charAt(i));
               }
       }
        StringBuffer str=new StringBuffer("");
       while(!stk.isEmpty() && k>0)
       {
           stk.pop();
           k--;
       }
        if(stk.isEmpty())
       {
           return "0";
       }
        while(!stk.isEmpty())
        {
            str.append(stk.pop());
        }
        return str.reverse().toString();
    }
}


