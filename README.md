﻿# SchoolFoxAPI

## Description
Basic wrapper for the SchoolFox API. Currently only supports login and getting the user data.
Because of my School I only have access to the messenger part of the API. So this is the only part that will be implemented.
If you want to implement the other parts of the API feel free to do so.

if you have any questions or suggestions feel free to contact me :)

## Installation
download the repository and build the project and use the Jar file for your project.

## Usage
```java
        SchoolFox schoolFox = new SchoolFox("test@schoolfox.app", "test1234");
        System.out.println(schoolFox.user.getToken());

        SchoolFox.getInstance().getSchoolManager().getSchoolInformation().getSchools().forEach(school -> {
            System.out.println("School ID: " + school.getId());
            System.out.println("School name: " + school.getName());
            System.out.println("Active Classes:");
            schoolFox.getInventoryManager().getInventory().getInventory().forEach(inventoryItem -> {
                System.out.println(inventoryItem.getSchoolClassName());
            });
        System.out.println("Archived Classes:");
            schoolFox.getInventoryManager().getArchivedInventory().getInventory().forEach(inventoryItem -> {
                System.out.println(inventoryItem.getSchoolClassName());
            });

        System.out.println("All Conversations:");
        schoolFox.getConversationManager().getConversations(SchoolFox.getInstance().getUser().getSchools().getSchools().getFirst().getId()).forEach(conversation -> {
                System.out.println(conversation.getTopic());
            });  
```

