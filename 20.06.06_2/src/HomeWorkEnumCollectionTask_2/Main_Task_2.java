package HomeWorkEnumCollectionTask_2;

public class Main_Task_2 {

    public static void main(String[] args) {

        // Создать класс Team, который содержит коллекции экземпляров класс Developer.
        //* Класс Developer содержит коллекцию классов Skill
        //* Создать класс Project, который содержит экземпляр класса Team.
        //* Необходимо реализовать методы для вывода на экран всех разработчиков в команде и вывести их навыки.

    Project project_1 = new Project("Project_1");
    Project project_2 = new Project("Project_2");
    Project project_3 = new Project("Project_3");


//            Project_1

        Team team_1 = new Team();
        team_1.nameTeam = "Team_1";
        team_1.typeOfWork = "Type of work 1";
        team_1.developer = new Developer[]{Developer.DEVELOPER_1, Developer.DEVELOPER_2, Developer.DEVELOPER_3};

        project_1.team = new Team[]{team_1};
        System.out.println(team_1.nameTeam);
        team_1.showDeveloper();
        System.out.println("Навыки команды разработчиков " + team_1.nameTeam + ": " + team_1.showeSkillDeveloper());


        System.out.println();

//            Project_2

        Team team_2 = new Team();
        team_2.nameTeam = "Team_2";
        team_2.typeOfWork = "Type of work 2";
        team_2.developer = new Developer[]{Developer.DEVELOPER_3, Developer.DEVELOPER_4, Developer.DEVELOPER_5};

        project_2.team = new Team[]{team_2};
        System.out.println(team_2.toString());

        System.out.println();

//            Project_3


        Team team_3 = new Team();
        team_3.nameTeam = "Team_3";
        team_3.typeOfWork = "Type of work 3";

        project_3.team = new Team[]{team_1,team_2};
        project_3.Print();
    }
}
