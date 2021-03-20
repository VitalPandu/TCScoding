package com.automate;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Project[] p = getProjectDetails();

        System.out.println("Enter technology to search");
        String tech = sc.nextLine();
        int countOfProjects = findProjsCountForGivenTech(p, tech);
        if (countOfProjects > 0)
            System.out.println(countOfProjects);
        else
            System.out.println("No Projects with the given technology");


        Project p1 = getProjectWithMaxCost(p);
        if (p != null)
            System.out.println(p1.getProjectID() + "@" + p1.getProjName());
        else
            System.out.println("No Project");

    }

    public static Project[] getProjectDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("print project data");
        for (int i = 0; i <= 4; i++) {
            Project[] project = new Project[];
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
                return count += 1;
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
