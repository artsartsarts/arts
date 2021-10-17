class AddStrings {
    public String addStrings(String num1, String num2) {
        String large = num1.length() >= num2.length() ? num1 : num2;
        String small = num1.length() < num2.length() ? num1 : num2;
        char[] result = new char[large.length()];
        
        int l = large.length() - 1;
        int s = small.length() - 1;
        int r = result.length - 1;
        int carry = 0;
        while (s >= 0) {
            int d1 = small.charAt(s--) - '0';
            int d2 = large.charAt(l--) - '0';
            int sum = d1 + d2 + carry;
            result[r--] = (char) (sum % 10 + '0');
            carry = sum / 10;
        }
        
        while (l >= 0) {
            int d2 = large.charAt(l--) - '0';
            int sum = d2 + carry;
            result[r--] = (char) (sum % 10 + '0');
            carry = sum / 10;
        }
        
        return (carry > 0) ? carry + new String(result) : new String(result);
    }
}
