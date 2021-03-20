package com.tcs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Solution {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Project[] project = new Project[4];

        for (int i = 0; i < project.length; i++) {
            int projId = sc.nextInt();
            sc.nextLine();
            String projName = sc.nextLine();
            double projCost = sc.nextDouble();
            sc.nextLine();
            String tech1 = sc.nextLine();
            String tech2 = sc.nextLine();
            String tech3 = sc.nextLine();
            project[i] = new Project(projId, projName, projCost, tech1, tech2, tech3);

        }


        int countOfProjects = findProjsCountForGivenTech(project, sc.nextLine());
        if (countOfProjects > 0)
            System.out.println(countOfProjects);
        else
            System.out.println("No Projects with the given technology");


        Project projectCost = getProjectWithMaxCost(project);
        if (projectCost != null)
            System.out.println(projectCost.getProjectID() + "@" + projectCost.getProjName());
        else
            System.out.println("No Project");

    }


    public static int findProjsCountForGivenTech(Project[] project, String technology) {
        int count = 0;
        for (int i = 0; i < project.length; i++) {
            if (    project[i].getTechnology1().equalsIgnoreCase((technology)) ||
                    project[i].getTechnology2().equalsIgnoreCase((technology)) ||
                    project[i].getTechnology3().equalsIgnoreCase((technology))
             )
                count++;
        }

        return count;
    }

    public static Project getProjectWithMaxCost(Project[] projects) {

        Arrays.sort(projects, Comparator.comparing(Project::getProjCost));
        return projects[projects.length-1];
    }
}
