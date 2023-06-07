class Solution {
    public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        
        for (String skill_tree : skill_trees) {
            int idx = 0;
            boolean rightSkillTree = true;
            for (char ch : skill_tree.toCharArray()) {
                if (!skill.contains(String.valueOf(ch))) continue;
                if (skill.charAt(idx) == ch) idx++;
                else {
                    rightSkillTree = false;
                    break;
                }
            }
            if (rightSkillTree) answer++;
        }
        
        return answer;
    }
}