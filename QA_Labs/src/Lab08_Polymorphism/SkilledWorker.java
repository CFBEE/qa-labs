package Lab08_Polymorphism;

import java.util.ArrayList;

public class SkilledWorker extends Employee {
    // Field - skills as an ArrayList
    private ArrayList<String> skills = new ArrayList<>();

    // Constructor for 'SkilledWorker'
    public SkilledWorker(String name, String jobTitle) {
        super(name, jobTitle);
    }

    // addSkill method with error handling
    public void addSkill(String skill) {
        if (skill == null || skill.isBlank()) {
            throw new IllegalArgumentException("Skill cannot be null or blank");
        }
        skills.add(skill);
    }

    // Getter for skills list
    public ArrayList<String> getSkills() {
        return skills;
    }

    // Return SkillWorker ifno
    @Override
    public String getInfo() {
        // Include base info, then list skills
        StringBuilder sb = new StringBuilder(super.getInfo());
        sb.append("Skills: ");
        if (skills.isEmpty()) {
            sb.append("None\n");
        } else {
            for (int i = 0; i < skills.size(); i++) {
                sb.append(skills.get(i));
                if (i < skills.size() - 1) sb.append(", ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
