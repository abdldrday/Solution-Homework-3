public class MUDBuliderDemo {
    public static void main(String[] args){
        Room room1 = new Room("Room1" , "Description");
        Room room2 = new Room("Room2", "description");
        NPC npc1 = new NPC("NPC1", "description");
        NPC npc2 = new NPC("NPC2" , "description");


        Dungeon dungeon = new SimpleDungeonBuilder()
                .setDungeonName("Builder Demo")
                .addRoom(room1)
                .addRoom(room2)
                .addNPC(npc1)
                .addNPC(npc2)
                .build();

        dungeon.describe();
    }
}
