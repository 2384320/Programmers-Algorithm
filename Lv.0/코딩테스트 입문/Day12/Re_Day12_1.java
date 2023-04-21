class Solution {
    public String solution(String my_string) {
        String[] vowel = {"a", "e", "i", "o", "u"};
		for (String str : vowel) {
			my_string = my_string.replaceAll(str, "");
		}
        return my_string;
    }
}