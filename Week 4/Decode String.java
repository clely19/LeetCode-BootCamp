class Solution {
    public String decodeString(String s) {
        ArrayList<Character> stack = new ArrayList<>();

        for(char ch: s.toCharArray()){
            if(ch != ']'){
                stack.add(ch);
            }
            else{
                StringBuilder subString = new StringBuilder();
                while(stack.get(stack.size()-1)!= '['){
                    subString.insert(0, stack.remove(stack.size() - 1));                
                    }
                stack.remove(stack.size()-1);

                StringBuilder _k = new StringBuilder();
                while(!stack.isEmpty() && Character.isDigit(stack.get(stack.size()-1))){
                    _k.insert(0, stack.remove(stack.size() - 1));
                }

                int k = Integer.parseInt(_k.toString());
                String st = subString.toString().repeat(k);
                for (char c : st.toCharArray()) {
                    stack.add(c);
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for(char ch: stack){
            result.append(ch);
        }
        return result.toString();
    }
}
