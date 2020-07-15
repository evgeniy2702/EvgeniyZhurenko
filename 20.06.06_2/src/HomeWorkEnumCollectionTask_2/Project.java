package HomeWorkEnumCollectionTask_2;

import java.util.Arrays;

public class Project {

    Team[] team;
    String nameProject;

    public Project(Team[] team, String nameProject) {
        this.team = team;
        this.nameProject = nameProject;
    }

    public Project(String nameProject) {
        this.nameProject = nameProject;
    }

    public Team[] getTeam() {
        return team;
    }

    public void setTeam(Team[] team) {
        this.team = team;
    }

    public String getNameProject() {
        return nameProject;
    }

    public void setNameProject(String nameProject) {
        this.nameProject = nameProject;
    }

    public void Print() {
        System.out.println("Над проектом " + nameProject +
                " трудится команда разрабтчиков ");
        teamComand();
        System.out.println("Которые совместно имеют след навыки :");
        teamComandSkill();
    }

    public void teamComand() {
            for (Team team1 : team) {
                System.out.println("Команда " + team1.nameTeam);
                team1.showDeveloper();
            }
    }

    public void teamComandSkill() {
        for (Team team1 : team) {
            System.out.println(team1.nameTeam + ": " + team1.showeSkillDeveloper());
            }
        }
    }

