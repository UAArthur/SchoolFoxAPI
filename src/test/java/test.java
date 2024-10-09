import net.hauntedstudio.SchoolFox;


import java.text.ParseException;

public class test {
    public static void main(String[] args) {
        SchoolFox schoolFox = new SchoolFox("test@schoolfox.app", "test1234");
        System.out.println(schoolFox.user.getToken());

        SchoolFox.getInstance().getSchoolManager().getSchoolInformation().getSchools().forEach(school -> {
            System.out.println("School ID: " + school.getId());
            System.out.println("School name: " + school.getName());
        });

        try {
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
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
