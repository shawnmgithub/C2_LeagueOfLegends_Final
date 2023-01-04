import java.io.Serializable;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;
// make the class Serializable to write it later.
public class User implements Serializable {
// variable creation
	String name ="default";
	String mythicItem;
	String currentChamp;
	String masteryChoice; 
	String summonerSpellOne; 
	String summonerSpellTwo; 
	String role;
	String itemOne;
	String itemTwo;
	String itemThree;
	String itemFour;
	String itemFive;
	String secondMastery;
	LinkedList<String> ownedChamps; 
	//creating arrays with data from League of legends to be randomized
  String[] itemsLegendary = {"Abyssal Mask","Ardent Censer","Banshee's Veil","Black Cleaver","Black Mist Scythe","Blade of the Ruined King","BloodThirster","Bulwark of the Moutain","Chempunk Chainsword","Chemtech Putrifier","Cosmic Drive","Dead Man's Plate","Death's Dance","Demonic Embrance","Edge of Night","Essence Reaver","Force of Nature","Frozen Heart","Gargoyle Stoneplate","Guardian Angel","Guinsoo's RageBlade","Horizon Focus","Infinity Edge","Knight's Vow","Lich Bane","Lord Dominik's Regards","Maw of Malmortius","Mejai's SoulStealer","Mecurial Schimitar","Mikael's Blessing","Morellonomicon","Mortal Rminder","Muramana","Nashor's Tooth","Navori Quickblades","Pauldrons of Whiterock","Phantom Dancer","Rabadon's DeathCap","Randuin's Omen","Rapid Firecannon","Ravenous Hydra","Redemption","Runnan's Hurricane","Rylai's Crystal Scepter","Sanguine Blade","Seraph's Embrance","Serpent's Fang","Serylda's Grudge","Shard of True Ice","Silvermere Dawn","Spirit Visage","Staff of Flowing Water","Sterak's Gage","Stormrazor","The Collector","Thornmail","Titanic Hydra","Umbral Glaive","Vigilant Wardstone","VoidStaff","Warmog's Armor","Wit's End","Youmuu's GhostBlade","Zeke's Convergence","Zhonya's Hourglass"};

  String[] itemsMythic = {"Divine Sunderer","Duskblade of Draktharr","Eclipse","Everfrost","Frostfire Gauntlet","GaleForce","Goredrinker","Hextech Rocketbelt","Imortal Shieldbow","Imperial Mandate","Kraken Slayer","Liandry's Anguish","Locket of the Iron Solari","Luden's Tempest","Moonstone Renewer","Night Harvester","Prowler's Claw","RiftMaker","Shurelya's Battlesong","Stridebreaker","Sunfire Aegis","Trinity Force","Turbo Chemtank"
  };
    
  String[] summonerSpells = {"Heal","Ghost","Barrier","Exhaust","Clarity","Flash","Teleport","Smite","Cleanse","Ignite"
  };

  String[] masteriesMain = {"Press The Attack","Lethal Tempo","Fleet Footwork","Conqueror","Electrocute","Predator","Dark Harvest","Hail of Blades","Summon Aery","Arcane Comet","Phase Rush","Grasp of the Undying","Aftershock","Guardian","Glacial Augment","UnsealedSpellbook","Omnistone"
	};
  String[] masteriesSecondary = {"Precision","Domination","Sorcery","Resolve","Inspiration"
  };
  String[] masteriesChoice;


	public User(){
		mythicItem = "Mythic Default";
		currentChamp = "Default Current Champ";
		masteryChoice = "Default mastery Choice";
		summonerSpellOne = "Default Summoner Spell One";
		summonerSpellTwo = "Default Summoner Spell Two";
		role = "default role";
		itemOne = "item1";
		itemTwo="item2";
		itemThree="item3";
		itemFour="item4";
		itemFive="item5";
		secondMastery="mastery";
		ownedChamps = new LinkedList<String>();
	}


 //getters/setters
  public String getName(){
  	return this.name;
 	}
	 // removes the possiblity as getting the same mastery tree as your first mastery
 	public String getMasterySecond(){
	if(masteryChoice.equals("Press The Attack")||masteryChoice.equals("Lethal Tempo")||masteryChoice.equals("Fleet Footwork")||masteryChoice.equals("Conqueror")){
    List<String> tempList = new ArrayList<String>(Arrays.asList(masteriesSecondary));
    tempList.remove("Precision");
    masteriesChoice = tempList.toArray(new String[0]);
	}
	if(masteryChoice.equals("Electrocute")||masteryChoice.equals("Predator")||masteryChoice.equals("Dark Harvest")||masteryChoice.equals("Hail of Blades")){
    List<String> tempList = new ArrayList<String>(Arrays.asList(masteriesSecondary));
    tempList.remove("Domination");
    masteriesChoice = tempList.toArray(new String[0]);
	}
	if(masteryChoice.equals("Summon Aery")||masteryChoice.equals("Arcane Comet")||masteryChoice.equals("Phase Rush")){
    List<String> tempList = new ArrayList<String>(Arrays.asList(masteriesSecondary));
    tempList.remove("Sorcery");
    masteriesChoice = tempList.toArray(new String[0]);
	}
	if(masteryChoice.equals("Grasp of the Undying")||masteryChoice.equals("Aftershock")||masteryChoice.equals("Guardian")){
    List<String> tempList = new ArrayList<String>(Arrays.asList(masteriesSecondary));
    tempList.remove("Resolve");
    masteriesChoice = tempList.toArray(new String[0]);
	}
	if(masteryChoice.equals("Glacial Augment")||masteryChoice.equals("UnsealedSpellbook")||masteryChoice.equals("Omnistone")){
    List<String> tempList = new ArrayList<String>(Arrays.asList(masteriesSecondary));
    tempList.remove("Inspiration");
    masteriesChoice = tempList.toArray(new String[0]);
	}
    int rand = new Random().nextInt(masteriesChoice.length);
    this.secondMastery=masteriesChoice[rand];
    return this.secondMastery;
 	}
	 // gets an item from the mythic item array
 	public String getMythicalItem(){
    int rand = new Random().nextInt(itemsMythic.length);
    this.mythicItem=itemsMythic[rand];
    return this.mythicItem;
 	}
	 // rolls a random champ from the ownedchamps linked list
 	public String getCurrentChamp(){
  	int random = new Random().nextInt(this.ownedChamps.size());
    this.currentChamp = this.ownedChamps.get(random);
    return this.currentChamp;
 	}
	// rolls a random mastery
	public String getMasteryChoice(){
    int rand = new Random().nextInt(masteriesMain.length);
    this.masteryChoice=masteriesMain[rand];
    return this.masteryChoice;
 	}
	 //rolls a random summoner spell
 	public String getSummonerSpellOne(){
    int rand = new Random().nextInt(summonerSpells.length);
    this.summonerSpellOne=summonerSpells[rand];
    return this.summonerSpellOne;
 	}
	// removes the possiblity of getting summonerSpellOne then rolls a random summoner spell
	public String getSummonerSpellTwo(){
    String[] tempArray;
    List<String> temp = new ArrayList<String>(Arrays.asList(summonerSpells));
    temp.remove(summonerSpellOne);
    tempArray = temp.toArray(new String[0]);
    int rand = new Random().nextInt(tempArray.length);
    this.summonerSpellTwo=tempArray[rand];  
		return this.summonerSpellTwo;
 	}
// sets the spell
  public String setSummonerSpellOne(String spell){
    summonerSpellOne = spell;
    return summonerSpellOne;
  }
// getItemOne-five ensures that no duplicate items are gotten by removing the previously chose items from the possiblity of being chosen
 	public String getItemOne(){
 		int rand = new Random().nextInt(itemsLegendary.length);
    this.itemOne=itemsLegendary[rand];
    return this.itemOne;
 	}

 	public String getItemTwo(){
 		String[] tempArray;
    List<String> tempList = new ArrayList<String>(Arrays.asList(itemsLegendary));
    tempList.remove(itemOne);
    tempArray = tempList.toArray(new String[0]);
    int rand = new Random().nextInt(tempArray.length);
    this.itemTwo=tempArray[rand];  
 		return this.itemTwo;
 	}

 	public String getItemThree(){
 		String[] tempArray;
    List<String> tempList = new ArrayList<String>(Arrays.asList(itemsLegendary));
    tempList.remove(itemOne);
    tempList.remove(itemTwo);
    tempArray = tempList.toArray(new String[0]);
    int rand = new Random().nextInt(tempArray.length);
    this.itemThree=tempArray[rand];  
 		return this.itemThree;
 	}

 	public String getItemFour(){
 		String[] tempArray;
    List<String> tempList = new ArrayList<String>(Arrays.asList(itemsLegendary));
    tempList.remove(itemOne);
    tempList.remove(itemTwo);
    tempList.remove(itemThree);
    tempArray = tempList.toArray(new String[0]);
    int rand = new Random().nextInt(tempArray.length);
    this.itemFour=tempArray[rand];  
 		return this.itemFour;
 	}

 	public String getItemFive(){
 		String[] tempArray;
    List<String> tempList = new ArrayList<String>(Arrays.asList(itemsLegendary));
    tempList.remove(itemOne);
    tempList.remove(itemTwo);
    tempList.remove(itemThree);
    tempList.remove(itemFour);
    tempArray = tempList.toArray(new String[0]);
    int rand = new Random().nextInt(tempArray.length);
    this.itemFive=tempArray[rand];  
 		return this.itemFive;
 	}
// sets name
 	public void setName(String nameIn){
 		this.name = nameIn;
 	}
// sets role
 	public void setRole(String roleIn){
 		this.role = roleIn;
 	}
// adds champ to the ownedchamps LinkedList
	public void addChamp(String champIn){
		this.ownedChamps.add(champIn);
 	}
 }//end
