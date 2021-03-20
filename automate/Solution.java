package com.automate;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Project[] p = getProjectDetails();

        System.out.println("Enter technology to search");
        int countOfProjects = findProjsCountForGivenTech(p, sc.nextLine());
        if (countOfProjects > 0)
            System.out.println(countOfProjects);
        else
            System.out.println("No Projects with the given technology");


        Project projectCost = getProjectWithMaxCost(p);
        if (projectCost != null)
            System.out.println(projectCost.getProjectID() + "@" + projectCost.getProjName());
        else
            System.out.println("No Project");

    }

    public static Project[] getProjectDetails() {
        Scanner sc = new Scanner(System.in);
        Project[] project = new Project[5];
        System.out.println("print project data");
        for (int i = 0; i <6; i++) {

            int projId = sc.nextInt();
            sc.nextLine();
            String projName = sc.nextLine();
            double projCost = sc.nextDouble();
            String tech1 = sc.nextLine();
            String tech2 = sc.nextLine();
            String tech3 = sc.nextLine();
            project[i] = new Project(projId, projName, projCost, tech1
                    , tech2, tech3);
            return project;
        }
        return null;
    }


    public static int findProjsCountForGivenTech(Project[] project, String technology) {
        int count = 0;
        for (int i = 0; i < project.length; i++) {
            if (    project[i].getTechnology1().equalsIgnoreCase((technology)) ||
                    project[i].getTechnology2().equalsIgnoreCase((technology)) ||
                    project[i].getTechnology3().equalsIgnoreCase((technology)))
                return count++ ;
        }

        return 0;
    }

    public static Project getProjectWithMaxCost(Project[] projects) {

        for (int i = 0; i < projects.length; i++) {
            for (int j = 0; j < projects.length; j++) {
                if (projects[i].getProjCost() > projects[j].getProjCost())
                    return projects[i];
                else return projects[j];
            }
        }
        return null;
    }
}
