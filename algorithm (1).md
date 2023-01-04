# overall goal:
The overall goal of this project is to make a league of legends team generator to increase the amount of fun my friends and I have with League of Legends.
# input
the only input the user will have is their username and what champions they own
# file 1: User.java
# goal for User.java
User.java is where each user's owned champions and username will be stored. It is also where the randomization happens for the team generation aspect.
# steps for User.java implements seralizable
User will have alot of variables the Strings are name, mythicItem,itemOne,itemTwo,itemThree,itemFour,itemFive,masteryChoice,secondaryMastery,currentChamp,summonerSpellOne, and summonerSpell two
there is a linked list for the user's owned champions
arrays that contain information for the randomization:
itemsLegendary
itemsMythic
summonerSpells
masteriesMain
masteriesSecondary
# functions for User
User(): User() acts as a constructor for the user object.
getName: returns name

getCurrentChamp: generates a random number the length of the owned champions linked list and picks a random one at that index

getMythicalItem: randomly generates and returns 1 item from the mythicItems array

getMasteryChoice: will choose and return a random mastery from the mastery array
getSecondMaster: will return the secondary mastery tree you use. removing the possiblity of it being the same tree that your main keystone mastery was in. 

getSummonerSpellOne: picks a random summoner spell from the summonerspell array

getSummonerSpellTwo: picks a random summoner spell other than the one from the summoner spell array. this is done by removing the summonerSpellone string from the summoner spell array and then choosing a random one

setSummonerSpellOne:setSummonerSpell one just manually sets one summoner spell that is needed to manually set one of the jungler's spells to smite because it is required for League of legends for the jungler to have smite.

setName: sets the name
setRole: sets the Role
addChamp: addChamp will take in a champion to add to the ownedChamps linked list

getItemOne-Five the getItemOne,getItemTwo,getItemThree,getItemFour, and getItemFive all work similarly except it removes the previosly selected items from being possibly picked again before picking another random one

# file 2: MultiPanel.Java
Multipanel.Java is where the gui is,where the user inputs their data, and where the final results of the randomization are shown.
# file 2 class 1: MultiPanel extends JFrame implements actionlistener 
# variables:
Teammaker pnlA = new Teammaker
userMaker pnl b = new UserMaker
JButton btnA = new JButton("Make A Team")
JButton btnB = new JButton("New User")
JPanel pnlCenter = new JPanel()
JPanel pnlSouth = new JPanel()
# methods
main: main will make a new Multipanel because all of multipanel is done in the constructor.
MultiPanel(): the Multipanel constuctor will creator a container to act as the overall "program" it will hold all of the other panels.
set a card layout
add two seperate panels to the card layout, one for the team maker and one for the character creator
make the default panel to be shown the character creator.
add btnA/btnB and their actionListoners to the south panel that is ALWAYS visible 
that ends the Multipanel constructor
Actionperfomer(): the action performed for Multipanel is pretty simple
if btn a is pressed then make the TeamMaker panel visible if btn b is pressed then make the user creator be visible

# file 2 class 2 UserMaker extends Jpanel implements action listener 
userMaker is a panel that is made visible and unvisible by the Multipanel Jframe class. 
userMaker is all of the buttons and action events needed to build a user
# variables:
JButton btnSave = new JButton("Save")
JTextField userNameIn = new JTextField("Username")
all of the individual checkboxes for all 155 characters need to be declared here as well. I attempted to make these buttons by looping an array and adding the buttons to the screen, but then I could not use the buttons in the action listener
# methods:
UserMaker(): Usermaker will have a grid layout
add userName in and then all of the checkboxes for each champion, and then add the save button
actionPerformed(): once the save button is pressed make a user/add the username to the user with user.setname().155 if statements for each character to add them to the user's owned champ linked list using the User.addChamp() method. I tried to simplify this and make this less lines of code with no luck Write the user to the computer using a fileoutput and an object output stream. make the name the username + ".dat" then pop up a dialouge box that tells the user their champ has been saved

# file 2 class 3 TeamMaker extends Jpanel implements Actionlistener
first thing in team maker is to make a list of strings and add all of the files in the directory that end with .dat to the list of strings. use the  filenameFilter interface to do so
# variables 
ObjectInputStream userTopobIn;
	ObjectInputStream userJgobIn;
	ObjectInputStream userMidobIn;
	ObjectInputStream userBotobIn;
	ObjectInputStream userSupobIn;
	String userOneChamp;
	JComboBox<String> lstTop = new JComboBox<>(array)
	JComboBox<String> lstJungle = new JComboBox<>(array)
	JComboBox<String> lstMid = new JComboBox<>(array)
	JComboBox<String> lstBot = new JComboBox<>(array)
	JComboBox<String> lstSupport = new JComboBox<>(array)
	JLabel lblTop = new JLabel("Top:")
	JLabel lblJungle = new JLabel("Jungle:")
	JLabel lblMid = new JLabel("Mid:")
	JLabel lblBot = new JLabel("Adc:")
	JLabel lblSupport = new JLabel("Support:")
	JLabel lblWelcome = new JLabel("Team Builder")
	JButton btnRefresh = new JButton("refresh")
	JButton btnFinish = new JButton("Finish")
	JLabel lblblank = new JLabel("")
# methods
TeamMaker(): teammaker will be a grid layout. it will then add the lbl's welcome,refresh,top,LstTop,jungle,LstJungle,mid,Lstmid,bot,lstbot,support,Lstsupport,and then the finish button. in that order.

actionPerformed:

if they press the refresh button:
    reload the array of users and update the jcomboBox 
    use the same FileName filter idea as before to make another arraylist of all the new objects created since the program was started. find the "difference" between the new array and the old array. add all of the new elements to the combobox
    

if they press the finish button
create 5 new users called userTopOBJ,userJgoBJ,userMidoBJ,userBotobj,and userSupobj
make 5 string variables and set them equal to the getselected item from each combobox which were lsttop,lstjg,lstmid,etc
example: top = lstTop
for each of the 5 user objects load in the object with the same name as the strings that assocate with each role
example:
ArrayList<String> selected = new ArrayList<String>();
   try{
	FileInputStream userTopfIn = new FileInputStream(userTop);
	userTopobIn = new ObjectInputStream(userTopfIn);
	userTopObj = (User)userTopobIn.readObject();
	System.out.println("your top was loaded");
	temp = userTopObj.getCurrentChamp();
	selected.add(temp);
	System.out.println("selected: " + selected + "\tTEMP: " + temp);
	} catch(Exception a){
		System.out.println(a.getMessage());
	}
do this 4 more times for each role. The chosen champion is done here because it was the easiest place to ensure no 2 users have the same champion. that is done with the selected list. The selected list keeps track of all of the champs that were selected and rerolls it if any user gets the same champion as a previous user.

the next step is to create a dialouge box to display all of the random choices. This will be done by calling all of the user methods that were already setup:
"top: "+ userTopObj.getName()+"| "+ userTopObj.currentChamp+ "|("+userTopObj.getSummonerSpellOne()+","+userTopObj.getSummonerSpellTwo()+")|("+ userTopObj.getMasteryChoice()+","+userTopObj.getMasterySecond()+")| 1)"+userTopObj.getMythicalItem() +" 2)"+userTopObj.getItemOne()+" 3)"+userTopObj.getItemTwo()+" 4)"+userTopObj.getItemThree()+" 5)"+userTopObj.getItemFour()+" 6)"+userTopObj.getItemFive()+ "\n"

do this 4 more times for each role using the different objects such as userJungleobj and userMidobj

The Main file will just make a new Multipanel to start the program. 






        