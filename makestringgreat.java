class Solution {
    public String makeGood(String s) {
        Stack<Character>sg=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!sg.isEmpty() && Character.toLowerCase(sg.peek())==Character.toLowerCase(ch)&&sg.peek()!=ch){
                sg.pop();
            }
            else{
                sg.push(ch);
            }
        }
        String result="";
        while(!sg.isEmpty()){
            result=sg.pop()+result;
        }
        return result;
    }
}
