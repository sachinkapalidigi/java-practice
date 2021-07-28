public class infixtopostfix {
    public String solve(String A) {
        
        int n = A.length();
        HashMap<Character, Integer> pres = new HashMap<Character, Integer>();
        pres.put('+', 1); pres.put('-', 1); pres.put('/', 2); pres.put('*', 2); pres.put('^', 3);
        
        StringBuilder postfix = new StringBuilder();
        Stack<Character> ops = new Stack<Character>();
        
        for(int i=0; i<n; i++){
            char incoming = A.charAt(i);
            
            if( incoming == '(' ){
                ops.push(incoming);
            }else if(incoming == ')'){
                
                while(!ops.isEmpty() && ops.peek() != '(' ){
                    postfix.append( ops.pop() );
                }
                if(!ops.isEmpty()){
                    ops.pop();
                }
                
            }else if( pres.containsKey(incoming) ){
                if(ops.isEmpty() || ( !ops.isEmpty() && ops.peek() == '(' ) ){
                     ops.push(incoming);
                }else if((pres.get( incoming ) > pres.get( ops.peek() ) ) ){
                    ops.push(incoming);
                }else {
                    while( !ops.isEmpty() && ops.peek() != '(' && pres.get(ops.peek()) >= pres.get( incoming ) ){
                        postfix.append( ops.pop() );
                    }   
                    ops.push(incoming);
                }
            }else {
                postfix.append(incoming);
            }
        }
        
        while(!ops.isEmpty() ){
            postfix.append( ops.pop() );
        }
        
        return postfix.toString();
    }
}
