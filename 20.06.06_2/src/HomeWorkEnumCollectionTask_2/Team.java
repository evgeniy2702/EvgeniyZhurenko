package HomeWorkEnumCollectionTask_2;

import com.sun.source.tree.LiteralTree;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Team {

    Developer[] developer;
    String typeOfWork;
    String nameTeam;

    public Team(Developer[] developer) {
        this.developer = developer;
    }

    public Team() {
    }

    public Team(String name, Developer[] developer, String typeOfWork) {
        nameTeam = name;
        this.developer = developer;
        this.typeOfWork = typeOfWork;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public Developer[] getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer[] developer) {
        this.developer = developer;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public void setTypeOfWork(String typeOfWork) {
        this.typeOfWork = typeOfWork;
    }

    @Override
    public String toString() {
        return "Команда: " + nameTeam + " имеет направление работы - " + typeOfWork +
                "\nв состав разработчиков входят: " + Arrays.toString(developer) +
                "\nнавыки разработчиков :" + showeSkillDeveloper();
    }

    public ArrayList showeSkillDeveloper() {
        ArrayList<String> allSkillTeam = new ArrayList<>();
        for (Developer devel: developer) {
            allSkillTeam.add(Arrays.toString(devel.getSkill()));
        }
        return allSkillTeam;
        }

        public void showDeveloper() {
            System.out.println("Состав :");
            for (Developer devel : developer) {
                System.out.print( devel+ "; ");
            }
            System.out.println();
        }
}
