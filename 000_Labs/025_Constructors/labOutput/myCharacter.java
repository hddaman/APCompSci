public class myCharacter{
    String role;
    public myCharacter(){
        role = "No Role";
    }
    public myCharacter(String a){
        role = a;
    }
    public String giveRole(){
        return role;
    }
    public void showRole(){
        if(role.equals("Wizard") || role.equals("wizard")){
            System.out.print("You chose the " + role + "!");
        }else if(role.equals("Rogue") || role.equals("rogue")){
            System.out.print("You chose the " + role + "!");
        }else if(role.equals("Warrior") || role.equals("warrior")){
            System.out.print("You chose the " + role + "!");
        }else{
            System.out.print("Rerun program.");
        }
    }
}