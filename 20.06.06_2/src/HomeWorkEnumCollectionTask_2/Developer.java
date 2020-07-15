package HomeWorkEnumCollectionTask_2;

import java.util.Arrays;

public enum Developer {

    DEVELOPER_1(new Skill[]{Skill.FIFE, Skill.SECOND}),
    DEVELOPER_2 (new Skill[]{Skill.THIRD, Skill.FOUR}),
    DEVELOPER_3 (new Skill[]{Skill.FIRST, Skill.FIFE}),
    DEVELOPER_4 (new Skill[]{Skill.THIRD, Skill.FOUR, Skill.SECOND}),
    DEVELOPER_5 (new Skill[]{Skill.THIRD, Skill.FIFE}),
    DEVELOPER_6 (new Skill[]{Skill.SECOND, Skill.THIRD});

    Skill[] skill;

    Developer(Skill[] skill) {
        this.skill = skill;
    }

    public Skill[] getSkill() {
        return skill;
    }
}
