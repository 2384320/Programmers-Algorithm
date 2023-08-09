class Solution {
    public String solution(String p) {        
        if (checkString(p))return p;
        return splitString(p);
    }
    
    private boolean checkString(String str) {
        int open = 0;
                
        if (str.charAt(0) != '(')
            return false;
        
        for (char ch : str.toCharArray()) {
            if (ch == '(') open++;
            else {
                open--;
                if (open < 0)
                    return false;
            }
        }
        return true;
    }
    
    private String splitString(String str) {
        StringBuilder u = new StringBuilder();
        StringBuilder v = new StringBuilder();
        
        int open = 0;
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == '(') open++;
            else open--;
            
            if (open == 0) {
                u.append(str.substring(0, i + 1));
                v.append(str.substring(i + 1, length));
                
                if (checkString(u.toString()))
                    u.append(splitString(v.toString()));
                else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("(")
                        .append(splitString(v.toString()))
                        .append(")")
                        .append(reverseString(u.toString()));
                    return sb.toString();
                }
                break;
            }
        }
        return u.toString();
    }
    
    private String reverseString(String str) {
        StringBuilder s = new StringBuilder();
        int length = str.length();
        
        for (int i = 1; i < length - 1; i++) {
            if (str.charAt(i) == '(') s.append(")");
            else s.append("(");
        }
        return s.toString();
    }
}