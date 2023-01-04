import java.util.Scanner;
import java.io.*;
import java.io.Serializable;
import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.List;
import java.util.ArrayList;
// start of multipanel
public class MultiPanel extends JFrame implements ActionListener{
	TeamMaker pnlA = new TeamMaker();
	UserMaker pnlB = new UserMaker();
	CardLayout cards = new CardLayout();
	//making buttons and panels for the main layout
	JButton btnA = new JButton("Make A Team");
	JButton btnB = new JButton("New User");
	JPanel pnlCenter = new JPanel();
	JPanel pnlSouth = new JPanel();
	// start of main
 	public static void main(String[] args){
  	new MultiPanel();
  } // end main of multipanel

	//constructor for multipanel
 	public MultiPanel(){
     //used professor's 
  	Container p = this.getContentPane();
  	p.setLayout(new BorderLayout());
  
		// initate cardlayout
		pnlCenter.setLayout(cards);
		pnlCenter.add(pnlA, "Team Maker");
		pnlCenter.add(pnlB, "User Creator");
 
  	//indicate which element should be shown on what container
	// the main page will be the user creator page, this will be the first page when the program is loaded
  	cards.show(pnlCenter, "User Creator");
// adds the center panel to the main container
  	p.add(pnlCenter, BorderLayout.CENTER);
  
  // adding the buttons to the south panel that is always visible
		pnlSouth.add(btnA);
		pnlSouth.add(btnB);
		btnA.addActionListener(this);
		btnB.addActionListener(this);
// adding panel south
  	p.add(pnlSouth, BorderLayout.SOUTH);
  
		this.pack();
		this.setVisible(true);
  }  // end constructor

	public void actionPerformed(ActionEvent e){
  	if (e.getSource() == btnA){
   		cards.show(pnlCenter, "Team Maker");
  	}else if (e.getSource() == btnB){
   		cards.show(pnlCenter, "User Creator");
  	} else {
   		System.out.println("Something went wrong");
  	} // end if
 	} // end actionPerformed
} // end MultiPanel 

class UserMaker extends JPanel implements ActionListener{
  // generally each 'page' is based on a JPanel
 	// and can be a complete app with its own
 	// event handlers and complex layout if you wish.
	JButton btnSave = new JButton("Save");
 	JTextField userNameIn = new JTextField("Username");
 	/*coding all of the buttons for each champion is alot of lines of code, I attempted to make an array of strings of names of all of the characters, but that did not allow me to use the buttons in the ActionListener, I manually created and added them so I could use the buttons in the ActionListener*/
	JCheckBox chkAatrox = new JCheckBox("Aatrox");
	JCheckBox chkAhri = new JCheckBox("Ahri");
	JCheckBox chkAkali = new JCheckBox("Akali");
	JCheckBox chkAlistar = new JCheckBox("Alistar");
	JCheckBox chkAmumu = new JCheckBox("Amumu");
	JCheckBox chkAnivia = new JCheckBox("Anivia");
	JCheckBox chkAnnie = new JCheckBox("Annie");
	JCheckBox chkAphelios = new JCheckBox("Aphelios");
	JCheckBox chkAshe = new JCheckBox("Ashe");
	JCheckBox chkAurelionSol = new JCheckBox("Aurelion Sol");
	JCheckBox chkAzir = new JCheckBox("Azir");
	JCheckBox chkBard = new JCheckBox("Bard");
	JCheckBox chkBlitzCrank = new JCheckBox("Blitzcrank");
	JCheckBox chkBrand = new JCheckBox("Brand");
	JCheckBox chkBraum = new JCheckBox("Braum");
	JCheckBox chkCaitlyn = new JCheckBox("Caitlyn");
	JCheckBox chkCamille = new JCheckBox("Camille");
	JCheckBox chkCassiopeia = new JCheckBox("Cassiopeia");
	JCheckBox chkCho = new JCheckBox("Cho'Gath");
	JCheckBox chkCorki = new JCheckBox("Corki");
	JCheckBox chkDarius = new JCheckBox("Darius");
	JCheckBox chkDiana = new JCheckBox("Diana");
	JCheckBox chkDrMundo= new JCheckBox("Dr.Mundo");
	JCheckBox chkDraven = new JCheckBox("Draven");
	JCheckBox chkEkko = new JCheckBox("Ekko");
	JCheckBox chkElise = new JCheckBox("Elise");
	JCheckBox chkEvelyn = new JCheckBox("Evelyn");
	JCheckBox chkEzreal = new JCheckBox("Ezreal");
	JCheckBox chkFiddlesticks = new JCheckBox("Fiddlesticks");
	JCheckBox chkFiora = new JCheckBox("Fiora");
	JCheckBox chkFizz = new JCheckBox("Fizz");
	JCheckBox chkGalio = new JCheckBox("Galio");
	JCheckBox chkGangPlank = new JCheckBox("Gangplank");
	JCheckBox chkGaren = new JCheckBox("Garen");
	JCheckBox chkGnar= new JCheckBox("Gnar");
	JCheckBox chkGragas = new JCheckBox("Gragas");
	JCheckBox chkGraves = new JCheckBox("Graves");
	JCheckBox chkGwen = new JCheckBox("Gwen");
	JCheckBox chkHecarim = new JCheckBox("Hecarim");
	JCheckBox chkHeimerdinger = new JCheckBox("Heimerdinger");
	JCheckBox chkIllaoi = new JCheckBox("Illaoi");
	JCheckBox chkIrelia = new JCheckBox("Irelia");
	JCheckBox chkIvern = new JCheckBox("Ivern");
	JCheckBox chkJanna = new JCheckBox("Janna");
	JCheckBox chkJarvanIV = new JCheckBox("Jarvan IV");
	JCheckBox chkJax = new JCheckBox("Jax");
	JCheckBox chkJayce = new JCheckBox("Jayce");
	JCheckBox chkJhin = new JCheckBox("Jhin");
	JCheckBox chkJinx = new JCheckBox("Jinx");
	JCheckBox chkKaiSa = new JCheckBox("Kai'Sa");
	JCheckBox chkKalista = new JCheckBox("Kalista");
	JCheckBox chkKarma = new JCheckBox("Karma");
	JCheckBox chkKarthus = new JCheckBox("Karthus");
	JCheckBox chkKassadin = new JCheckBox("Kassadin");
	JCheckBox chkKatarina = new JCheckBox("Katarina");
	JCheckBox chkKayle = new JCheckBox("Kayle");
	JCheckBox chkKayn = new JCheckBox("Kayn");
	JCheckBox chkKennen = new JCheckBox("Kennen");
	JCheckBox chkKhaZix = new JCheckBox("Kha'Zix");
	JCheckBox chkKindred = new JCheckBox("Kindred");
	JCheckBox chkKled = new JCheckBox("Kled");
	JCheckBox chkKogMaw = new JCheckBox("Kog'Maw");
	JCheckBox chkLeblanc = new JCheckBox("Leblanc");
	JCheckBox chkLeeSin = new JCheckBox("Lee Sin");
	JCheckBox chkLeona = new JCheckBox("Leona");
	JCheckBox chkLillia = new JCheckBox("Lillia");
	JCheckBox chkLissandra = new JCheckBox("Lissandra");
	JCheckBox chkLucian = new JCheckBox("Lucian");
	JCheckBox chkLulu = new JCheckBox("Lulu");
	JCheckBox chkLux = new JCheckBox("Lux");
	JCheckBox chkMalphite = new JCheckBox("Malphite");
	JCheckBox chkMalzahar = new JCheckBox("Malzahar");
	JCheckBox chkMaoKai = new JCheckBox("Maokai");
	JCheckBox chkMasterYi = new JCheckBox("Master Yi");
	JCheckBox chkMissFortune = new JCheckBox("Miss Fortune");
	JCheckBox chkMordekaiser = new JCheckBox("Mordekaiser");
	JCheckBox chkMorgana = new JCheckBox("Morgana");
	JCheckBox chkNami = new JCheckBox("Nami");
	JCheckBox chkNasus = new JCheckBox("Nasus");
	JCheckBox chkNautilus = new JCheckBox("Nautilus");
	JCheckBox chkNeeko = new JCheckBox("Neeko");
	JCheckBox chkNidalee = new JCheckBox("Nidalee");
	JCheckBox chkNocturne = new JCheckBox("Nocturne");
	JCheckBox chkNunu = new JCheckBox("Nunu & Willump");
	JCheckBox chkOlaf = new JCheckBox("Olaf");
	JCheckBox chkOrianna = new JCheckBox("Orianna");
	JCheckBox chkOrnn = new JCheckBox("Ornn");
	JCheckBox chkPantheon = new JCheckBox("Pantheon");
	JCheckBox chkPoppy = new JCheckBox("Poppy");
	JCheckBox chkPyke = new JCheckBox("Pyke");
	JCheckBox chkQiyana = new JCheckBox("Qiyana");
	JCheckBox chkQuinn = new JCheckBox("Quinn");
	JCheckBox chkRakan = new JCheckBox("Rakan");
	JCheckBox chkRammus = new JCheckBox("Rammus");
	JCheckBox chkRekSai = new JCheckBox("Rek'Sai");
	JCheckBox chkRell = new JCheckBox("Rell");
	JCheckBox chkRenekton = new JCheckBox("Renekton");
	JCheckBox chkRengar = new JCheckBox("Rengar");
	JCheckBox chkRiven = new JCheckBox("Riven");
	JCheckBox chkRumble = new JCheckBox("Rumble");
	JCheckBox chkRyze = new JCheckBox("Ryze");
	JCheckBox chkSamira = new JCheckBox("Samira");
	JCheckBox chkSejuani = new JCheckBox("Sejuani");
	JCheckBox chkSenna = new JCheckBox("Senna");
	JCheckBox chkSeraphine = new JCheckBox("Seraphine");
	JCheckBox chkSett = new JCheckBox("Sett");
	JCheckBox chkShaco = new JCheckBox("Shaco");
	JCheckBox chkShen = new JCheckBox("Shen");
	JCheckBox chkShyvana = new JCheckBox("Shyvana");
	JCheckBox chkSinged = new JCheckBox("Singed");
	JCheckBox chkSion = new JCheckBox("Sion");
	JCheckBox chkSivir = new JCheckBox("Sivir");
	JCheckBox chkSkarner = new JCheckBox("Skarner");
	JCheckBox chkSona = new JCheckBox("Sona");
	JCheckBox chkSoraka = new JCheckBox("Soraka");
	JCheckBox chkSwain = new JCheckBox("Swain");
	JCheckBox chkSylas = new JCheckBox("Sylas");
	JCheckBox chkSyndra = new JCheckBox("Syndra");
	JCheckBox chkTahmKench = new JCheckBox("Tahm Kench");
	JCheckBox chkTaliyah = new JCheckBox("Taliyah");
	JCheckBox chkTalon = new JCheckBox("Talon");
	JCheckBox chkTaric = new JCheckBox("Taric");
	JCheckBox chkTeemo = new JCheckBox("Teemo");
	JCheckBox chkThresh = new JCheckBox("Thresh");
	JCheckBox chkTristana = new JCheckBox("Tristana");
	JCheckBox chkTrundle = new JCheckBox("Trundle");
	JCheckBox chkTryndamere = new JCheckBox("Tryndamere");
	JCheckBox chkTwistedFate = new JCheckBox("Twisted Fate");
	JCheckBox chkTwitch = new JCheckBox("Twitch");
	JCheckBox chkUdyr = new JCheckBox("Udyr");
	JCheckBox chkUrgot = new JCheckBox("Urgot");
	JCheckBox chkVarus = new JCheckBox("Varus");
	JCheckBox chkVayne = new JCheckBox("Vayne");
	JCheckBox chkVeigar = new JCheckBox("Veigar");
	JCheckBox chkVelKoz = new JCheckBox("Vel'Koz");
	JCheckBox chkVi = new JCheckBox("VI");
	JCheckBox chkViego = new JCheckBox("Viego");
	JCheckBox chkViktor = new JCheckBox("Viktor");
	JCheckBox chkVladimir = new JCheckBox("Vladimir");
	JCheckBox chkVolibear = new JCheckBox("Volibear");
	JCheckBox chkWarwick = new JCheckBox("Warwick");
	JCheckBox chkWukong = new JCheckBox("Wukong");
	JCheckBox chkXayah = new JCheckBox("Xayah");
	JCheckBox chkXerath = new JCheckBox("Xerath");
	JCheckBox chkXinZhao = new JCheckBox("Xin Zhao");
	JCheckBox chkYasuo = new JCheckBox("Yasuo");
	JCheckBox chkYone = new JCheckBox("Yone");
	JCheckBox chkYorick = new JCheckBox("Yorick");
	JCheckBox chkYuumi = new JCheckBox("Yuumi");
	JCheckBox chkZac = new JCheckBox("Zac");
	JCheckBox chkZed = new JCheckBox("Zed");
	JCheckBox chkZiggs = new JCheckBox("Ziggs");
	JCheckBox chkZilean = new JCheckBox("Zilean");
	JCheckBox chkZoe = new JCheckBox("Zoe");
	JCheckBox chkZyra = new JCheckBox("Zyra");
	// start of the user creator class
 	public UserMaker(){
  	this.setLayout(new GridLayout(0,10));

	  //adding all of the Jobjects I made
    this.add(userNameIn);
		this.add(chkAatrox);
		this.add(chkAhri);
		this.add(chkAkali);
		this.add(chkAlistar);
		this.add(chkAmumu);
		this.add(chkAnivia);
		this.add(chkAnnie);
		this.add(chkAphelios);
		this.add(chkAshe);
		this.add(chkAurelionSol);
		this.add(chkAzir);
		this.add(chkBard);
		this.add(chkBlitzCrank);
		this.add(chkBrand);
		this.add(chkBraum);
		this.add(chkCaitlyn);
		this.add(chkCamille);
		this.add(chkCassiopeia);
		this.add(chkCho);
		this.add(chkCorki);
		this.add(chkDarius);
		this.add(chkDiana);
		this.add(chkDrMundo);
		this.add(chkDraven);
		this.add(chkEkko);
		this.add(chkElise);
		this.add(chkEvelyn);
		this.add(chkEzreal);
		this.add(chkFiddlesticks);
		this.add(chkFiora);
		this.add(chkFizz);
		this.add(chkGalio);
		this.add(chkGangPlank);
		this.add(chkGaren);
		this.add(chkGnar);
		this.add(chkGragas);
		this.add(chkGraves);
		this.add(chkGwen);
		this.add(chkHecarim);
		this.add(chkHeimerdinger);
		this.add(chkIllaoi);
		this.add(chkIrelia);
		this.add(chkIvern);
		this.add(chkJanna);
		this.add(chkJarvanIV);
		this.add(chkJax);
		this.add(chkJayce);
		this.add(chkJhin);
		this.add(chkJinx);
		this.add(chkKaiSa);
		this.add(chkKalista);
		this.add(chkKarma);
		this.add(chkKarthus);
		this.add(chkKassadin);
		this.add(chkKatarina);
		this.add(chkKayle);
		this.add(chkKayn);
		this.add(chkKennen);
		this.add(chkKhaZix);
		this.add(chkKindred);
		this.add(chkKled);
		this.add(chkKogMaw);
		this.add(chkLeblanc);
		this.add(chkLeeSin);
		this.add(chkLeona);
		this.add(chkLillia);
		this.add(chkLissandra);
		this.add(chkLucian);
		this.add(chkLulu);
		this.add(chkLux);
		this.add(chkMalphite);
		this.add(chkMalzahar);
		this.add(chkMaoKai);
		this.add(chkMasterYi);
		this.add(chkMissFortune);
		this.add(chkMordekaiser);
		this.add(chkMorgana);
		this.add(chkNami);
		this.add(chkNasus);
		this.add(chkNautilus);
		this.add(chkNeeko);
		this.add(chkNidalee);
		this.add(chkNocturne);
		this.add(chkNunu);
		this.add(chkOlaf);
		this.add(chkOrianna);
		this.add(chkOrnn);
		this.add(chkPantheon);
		this.add(chkPoppy);
		this.add(chkPyke);
		this.add(chkQiyana);
		this.add(chkQuinn);
		this.add(chkRakan);
		this.add(chkRammus);
		this.add(chkRekSai);
		this.add(chkRell);
		this.add(chkRenekton);
		this.add(chkRengar);
		this.add(chkRiven);
		this.add(chkRumble);
		this.add(chkRyze);
		this.add(chkSamira);
		this.add(chkSejuani);
		this.add(chkSenna);
		this.add(chkSeraphine);
		this.add(chkSett);
		this.add(chkShaco);
		this.add(chkShen);
		this.add(chkShyvana);
		this.add(chkSinged);
		this.add(chkSion);
		this.add(chkSivir);
		this.add(chkSkarner);
		this.add(chkSona);
		this.add(chkSoraka);
		this.add(chkSwain);
		this.add(chkSylas);
		this.add(chkSyndra);
		this.add(chkTahmKench);
		this.add(chkTaliyah);
		this.add(chkTalon);
		this.add(chkTaric);
		this.add(chkTeemo);
		this.add(chkThresh);
		this.add(chkTristana);
		this.add(chkTrundle);
		this.add(chkTryndamere);
		this.add(chkTwistedFate);
		this.add(chkTwitch);
		this.add(chkUdyr);
		this.add(chkUrgot);
		this.add(chkVarus);
		this.add(chkVayne);
		this.add(chkVeigar);
		this.add(chkVelKoz);
		this.add(chkVi);
		this.add(chkViego);
		this.add(chkViktor);
		this.add(chkVladimir);
		this.add(chkVolibear);
		this.add(chkWarwick);
		this.add(chkWukong);
		this.add(chkXayah);
		this.add(chkXerath);
		this.add(chkXinZhao);
		this.add(chkYasuo);
		this.add(chkYone);
		this.add(chkYorick);
		this.add(chkYuumi);
		this.add(chkZac);
		this.add(chkZed);
		this.add(chkZiggs);
		this.add(chkZilean);
		this.add(chkZoe);
		this.add(chkZyra);
		this.add(btnSave);
    btnSave.addActionListener(this);
	}//end constructor 
		 
	/*when the submit button is clicked, it will make a new user object. then it will set the name of the user object to whatever the user selects. it will then add all of the champs the user owns to an arraylist stored in the User object. after all of this it will write the user as the username+".dat"
	*/

// start of the  ActionListener
public void actionPerformed(ActionEvent e){
	if (e.getSource() == btnSave){
			User g = new User();
			String nameIn = userNameIn.getText();
			g.setName(nameIn);
			
	if (chkAatrox.isSelected()){
			g.addChamp("Aatrox");
		}
	if (chkAhri.isSelected()){
			g.addChamp("Ahri");
		}
	if (chkAkali.isSelected()){
			g.addChamp("Akali");
		}
	if (chkAlistar.isSelected()){
			g.addChamp("Alistar");
		}
	if (chkAmumu.isSelected()){
			g.addChamp("Amumu");
		}
	if (chkAnivia.isSelected()){
			g.addChamp("Anivia");
		}
	if (chkAnnie.isSelected()){
			g.addChamp("Annie");
		}
	if (chkAphelios.isSelected()){
			g.addChamp("Aphelios");
		}
	if (chkAshe.isSelected()){
			g.addChamp("Ashe");
		}
	if (chkAurelionSol.isSelected()){
			g.addChamp("Aurelion Sol");
		}
	if (chkAzir.isSelected()){
			g.addChamp("Azir");
		}
	if (chkBard.isSelected()){
			g.addChamp("Bard");
		}
	if (chkBlitzCrank.isSelected()){
			g.addChamp("Blitzcrank");
		}
	if (chkBrand.isSelected()){
			g.addChamp("Brand");
		}
	if (chkBraum.isSelected()){
			g.addChamp("Braum");
		}
	if (chkCaitlyn.isSelected()){
			g.addChamp("Caitlyn");
		}
	if (chkCamille.isSelected()){
			g.addChamp("Camille");
		}
	if (chkCassiopeia.isSelected()){
			g.addChamp("Cassiopeia");
		}
	if (chkCho.isSelected()){
			g.addChamp("Cho'Gath");
		}
	if (chkCorki.isSelected()){
			g.addChamp("Corki");
		}
	if (chkDarius.isSelected()){
			g.addChamp("Darius");
		}
	if (chkDiana.isSelected()){
			g.addChamp("Diana");
		}
	if (chkDraven.isSelected()){
			g.addChamp("Draven");
		}
	if (chkDrMundo.isSelected()){
			g.addChamp("Dr.Mundo");
		}
	if (chkEkko.isSelected()){
			g.addChamp("Ekko");
		}
	if (chkElise.isSelected()){
			g.addChamp("Elise");
		}
	if (chkEvelyn.isSelected()){
			g.addChamp("Evelyn");
		}
	if (chkEzreal.isSelected()){
			g.addChamp("Ezreal");
		}
	if (chkFiddlesticks.isSelected()){
			g.addChamp("Fiddlesticks");
		}
	if (chkFiora.isSelected()){
			g.addChamp("Fiora");
		}
	if (chkFizz.isSelected()){
			g.addChamp("Fizz");
		}
	if (chkGalio.isSelected()){
			g.addChamp("Galio");
		}
	if (chkGangPlank.isSelected()){
			g.addChamp("Gangplank");
		}
	if (chkGaren.isSelected()){
			g.addChamp("Garen");
		}
	if (chkGnar.isSelected()){
			g.addChamp("Gnar");
		}
	if (chkGragas.isSelected()){
			g.addChamp("Gragas");
		}
	if (chkGraves.isSelected()){
			g.addChamp("Graves");
		}
	if (chkGwen.isSelected()){
			g.addChamp("Gwen");
		}
	if (chkHecarim.isSelected()){
			g.addChamp("Hecarim");
		}
	if (chkHeimerdinger.isSelected()){
			g.addChamp("Heimerdinger");
		}
	if (chkIllaoi.isSelected()){
			g.addChamp("Illaoi");
		}
	if (chkIrelia.isSelected()){
			g.addChamp("Irelia");
		}
	if (chkIvern.isSelected()){
			g.addChamp("Ivern");
		}
	if (chkJanna.isSelected()){
			g.addChamp("Janna");
		}
	if (chkJarvanIV.isSelected()){
			g.addChamp("Jarvan IV");
		}
	if (chkJax.isSelected()){
			g.addChamp("Jax");
		}
	if (chkJayce.isSelected()){
			g.addChamp("Jayce");
		}
	if (chkJhin.isSelected()){
			g.addChamp("Jhin");
		}
	if (chkJinx.isSelected()){
			g.addChamp("Jinx");
		}
	if (chkKaiSa.isSelected()){
			g.addChamp("Kai'Sa");
		}
	if (chkKalista.isSelected()){
			g.addChamp("Kalista");
		}
	if (chkKarma.isSelected()){
			g.addChamp("Karma");
		}
	if (chkKarthus.isSelected()){
			g.addChamp("Karthus");
		}
	if (chkKassadin.isSelected()){
			g.addChamp("Kassadin");
		}
	if (chkKatarina.isSelected()){
			g.addChamp("Katarina");
		}
	if (chkKayle.isSelected()){
			g.addChamp("Kayle");
		}
	if (chkKayn.isSelected()){
			g.addChamp("Kayn");
		}
	if (chkKennen.isSelected()){
			g.addChamp("Kennen");
		}
	if (chkKhaZix.isSelected()){
			g.addChamp("Kha'Zix");
		}
	if (chkKindred.isSelected()){
			g.addChamp("Kindred");
		}
	if (chkKled.isSelected()){
			g.addChamp("Kled");
		}
	if (chkKogMaw.isSelected()){
			g.addChamp("Kog'Maw");
		}
	if (chkLeblanc.isSelected()){
			g.addChamp("Leblanc");
		}
	if (chkLeeSin.isSelected()){
			g.addChamp("Lee Sin");
		}
	if (chkLeona.isSelected()){
			g.addChamp("Leona");
		}
	if (chkLillia.isSelected()){
			g.addChamp("Lillia");
		}
	if (chkLissandra.isSelected()){
			g.addChamp("Lissandra");
		}
	if (chkLucian.isSelected()){
			g.addChamp("Lucian");
		}
	if (chkLulu.isSelected()){
			g.addChamp("Lulu");
		}
	if (chkLux.isSelected()){
			g.addChamp("Lux");
		}
	if (chkMalphite.isSelected()){
			g.addChamp("Malphite");
		}
	if (chkMalzahar.isSelected()){
			g.addChamp("Malzahar");
		}
	if (chkMaoKai.isSelected()){
			g.addChamp("Maokai");
		}
	if (chkMasterYi.isSelected()){
			g.addChamp("Master Yi");
		}
	if (chkMissFortune.isSelected()){
			g.addChamp("Miss Fortune");
		}
	if (chkMordekaiser.isSelected()){
			g.addChamp("Mordekaiser");
		}
	if (chkMorgana.isSelected()){
			g.addChamp("Morgana");
		}
	if (chkNami.isSelected()){
			g.addChamp("Nami");
		}
	if (chkNasus.isSelected()){
			g.addChamp("Nasus");
		}
	if (chkNautilus.isSelected()){
			g.addChamp("Nautilus");
		}
	if (chkNeeko.isSelected()){
			g.addChamp("Neeko");
		}
	if (chkNidalee.isSelected()){
			g.addChamp("Nidalee");
		}
	if (chkNocturne.isSelected()){
			g.addChamp("Nocturne");
		}
	if (chkNunu.isSelected()){
			g.addChamp("Nunu & Willump");
		}
	if (chkOlaf.isSelected()){
			g.addChamp("Olaf");
		}
	if (chkOrianna.isSelected()){
			g.addChamp("Orianna");
		}
	if (chkOrnn.isSelected()){
			g.addChamp("Ornn");
		}
	if (chkPantheon.isSelected()){
			g.addChamp("Pantheon");
		}
	if (chkPoppy.isSelected()){
			g.addChamp("Poppy");
		}
	if (chkPyke.isSelected()){
			g.addChamp("Pyke");
		}
	if (chkQiyana.isSelected()){
			g.addChamp("Qiyana");
		}
	if (chkQuinn.isSelected()){
			g.addChamp("Quinn");
		}
	if (chkRakan.isSelected()){
			g.addChamp("Rakan");
		}
	if (chkRammus.isSelected()){
			g.addChamp("Rammus");
		}
	if (chkRekSai.isSelected()){
			g.addChamp("Rek'Sai");
		}
	if (chkRell.isSelected()){
			g.addChamp("Rell");
		}
	if (chkRenekton.isSelected()){
			g.addChamp("Renekton");
		}
	if (chkRengar.isSelected()){
			g.addChamp("Rengar");
		}
	if (chkRiven.isSelected()){
			g.addChamp("Riven");
		}
	if (chkRumble.isSelected()){
			g.addChamp("Rumble");
		}
	if (chkRyze.isSelected()){
			g.addChamp("Ryze");
		}
	if (chkSamira.isSelected()){
			g.addChamp("Samira");
		}
	if (chkSejuani.isSelected()){
			g.addChamp("Sejuani");
		}
	if (chkSenna.isSelected()){
			g.addChamp("Senna");
		}
	if (chkSeraphine.isSelected()){
			g.addChamp("Seraphine");
		}
	if (chkSett.isSelected()){
			g.addChamp("Sett");
		}
	if (chkShaco.isSelected()){
			g.addChamp("Shaco");
		}
	if (chkShen.isSelected()){
			g.addChamp("Shen");
		}
	if (chkShyvana.isSelected()){
			g.addChamp("Shyvana");
		}
	if (chkSinged.isSelected()){
			g.addChamp("Singed");
		}
	if (chkSion.isSelected()){
			g.addChamp("Sion");
		}
	if (chkSivir.isSelected()){
			g.addChamp("Sivir");
		}
	if (chkSkarner.isSelected()){
			g.addChamp("Skarner");
		}
	if (chkSona.isSelected()){
			g.addChamp("Sona");
		}
	if (chkSoraka.isSelected()){
			g.addChamp("Soraka");
		}
	if (chkSwain.isSelected()){
			g.addChamp("Swain");
		}
	if (chkSylas.isSelected()){
			g.addChamp("Sylas");
		}
	if (chkSyndra.isSelected()){
			g.addChamp("Syndra");
		}
	if (chkTahmKench.isSelected()){
			g.addChamp("Tahm Kench");
		}
	if (chkTaliyah.isSelected()){
			g.addChamp("Taliyah");
		}
	if (chkTalon.isSelected()){
			g.addChamp("Talon");
		}
	if (chkTaric.isSelected()){
			g.addChamp("Taric");
		}
	if (chkTeemo.isSelected()){
			g.addChamp("Teemo");
		}
	if (chkThresh.isSelected()){
			g.addChamp("Thresh");
		}
	if (chkTristana.isSelected()){
			g.addChamp("Tristana");
		}
	if (chkTrundle.isSelected()){
			g.addChamp("Trundle");
		}
	if (chkTryndamere.isSelected()){
			g.addChamp("Tryndamere");
		}
	if (chkTwistedFate.isSelected()){
			g.addChamp("Twisted Fate");
		}
	if (chkTwitch.isSelected()){
			g.addChamp("Twitch");
		}
	if (chkUdyr.isSelected()){
			g.addChamp("Udyr");
		}
	if (chkUrgot.isSelected()){
			g.addChamp("Urgot");
		}
	if (chkVarus.isSelected()){
			g.addChamp("Varus");
		}
	if (chkVayne.isSelected()){
			g.addChamp("Vayne");
		}
	if (chkVeigar.isSelected()){
			g.addChamp("Veigar");
		}
	if (chkVelKoz.isSelected()){
			g.addChamp("Vel'Koz");
		}
	if (chkVi.isSelected()){
			g.addChamp("Vi");
		}
	if (chkViego.isSelected()){
			g.addChamp("Viego");
		}
	if (chkViktor.isSelected()){
			g.addChamp("Viktor");
		}
	if (chkVladimir.isSelected()){
			g.addChamp("Vladimir");
		}
	if (chkVolibear.isSelected()){
			g.addChamp("Volibear");
		}
	if (chkWarwick.isSelected()){
			g.addChamp("Warwick");
		}
	if (chkWukong.isSelected()){
			g.addChamp("Wukong");
		}
	if (chkXayah.isSelected()){
			g.addChamp("Xayah");
		}
	if (chkXerath.isSelected()){
			g.addChamp("Xearth");
		}
	if (chkXinZhao.isSelected()){
			g.addChamp("Xin Zhao");
		}
	if (chkYasuo.isSelected()){
			g.addChamp("Yasuo");
		}
	if (chkYone.isSelected()){
			g.addChamp("Yone");
		}
	if (chkYorick.isSelected()){
			g.addChamp("Yorick");
		}
	if (chkYuumi.isSelected()){
			g.addChamp("Yummi");
		}
	if (chkZac.isSelected()){
			g.addChamp("Zac");
		}
	if (chkZed.isSelected()){
			g.addChamp("Zed");
		}
	if (chkZiggs.isSelected()){
			g.addChamp("Ziggs");
		}
	if (chkZilean.isSelected()){
			g.addChamp("Zilean");
		}
	if (chkZoe.isSelected()){
			g.addChamp("Zoe");
		}
	if (chkZyra.isSelected()){
			g.addChamp("Zyra");
	}
  try{
		FileOutputStream fo = new FileOutputStream(nameIn + ".dat");
		ObjectOutputStream oOut = new ObjectOutputStream(fo);
		oOut.writeObject(g);
  }catch (Exception w){
		System.out.println(w.getMessage());
  }    
	JOptionPane.showMessageDialog(this,
    "Your user has been saved",
    "Saved notification",
    JOptionPane.PLAIN_MESSAGE);
  }//endif
  else {
  	System.out.println("Error");
  } // endElse
 	}
} // end UserMaker

class TeamMaker extends JPanel implements ActionListener{
	/*this makes an array of all of the users
	this is done by using a FilenameFilter from java io, and only accepting files that end with .dat in the directory*/ 
  File dir = new File(".");
	List<String> list = Arrays.asList(dir.list(
  new FilenameFilter() {
      @Override public boolean accept(File dir, String name) {
         return name.endsWith(".dat");
		}
  }));

//variable creation
	String[] arrayB;
	String[] array = list.toArray(new String[0]);
	ObjectInputStream userTopobIn;
	ObjectInputStream userJgobIn;
	ObjectInputStream userMidobIn;
	ObjectInputStream userBotobIn;
	ObjectInputStream userSupobIn;
	String userOneChamp;
	JComboBox<String> lstTop = new JComboBox<>(array);
	JComboBox<String> lstJungle = new JComboBox<>(array);
	JComboBox<String> lstMid = new JComboBox<>(array);
	JComboBox<String> lstBot = new JComboBox<>(array);
	JComboBox<String> lstSupport = new JComboBox<>(array);
	JLabel lblTop = new JLabel("Top:");
	JLabel lblJungle = new JLabel("Jungle:");
	JLabel lblMid = new JLabel("Mid:");
	JLabel lblBot = new JLabel("Adc:");
	JLabel lblSupport = new JLabel("Support:");
	JLabel lblWelcome = new JLabel("Team Builder");
	JButton btnRefresh = new JButton("refresh");
	JButton btnFinish = new JButton("Finish");
	JLabel lblblank = new JLabel("");
// teamMaker constructor 
	public TeamMaker(){
		this.add(lblWelcome,0,0);
		this.add(btnRefresh);
		this.setLayout(new GridLayout(0,2));
		this.add(lblTop);
		this.add(lstTop);
		this.add(lblJungle);
		this.add(lstJungle);
		this.add(lblMid);
		this.add(lstMid);
		this.add(lblBot);
		this.add(lstBot);
		this.add(lblSupport);
		this.add(lstSupport);
		this.add(btnFinish);
		btnFinish.addActionListener(this);
		btnRefresh.addActionListener(this);
 	}
// Teammaker ActionListener

 	public void actionPerformed(ActionEvent e){
		 /* The refresh button will add any new usernames added during the same instance of the program as the team being created */
		if (e.getSource() == btnRefresh){
			try{
				File dirA = new File(".");
				List<String> listA = Arrays.asList(dirA.list(
				new FilenameFilter() {
						@Override public boolean accept(File dirA, String nameA) {
						return nameA.endsWith(".dat");
				}
				}));
				String[] arrayA = listA.toArray(new String[0]);
				ArrayList<String> arraylist= new ArrayList<String>(Arrays.asList(arrayA));
				ArrayList<String> ogList = new ArrayList<String>(Arrays.asList(array));
				ArrayList<String> anothaOne=new ArrayList<String>();
				// this gets the difference between the original loaded list and the list after the refresh button was pressed
				ArrayList<String> check = new ArrayList<String>(arraylist);
				check.removeAll(ogList);
				// adds all of the items that were not in the original list to the JComboBox
				int size = check.size();
				for(int i=0; i<size; i++){
					lstTop.addItem(check.get(i));
					lstJungle.addItem(check.get(i));
					lstMid.addItem(check.get(i));
					lstBot.addItem(check.get(i));
					lstSupport.addItem(check.get(i));
				}
				array = arrayA;
			} 
			 catch(Exception a){
		System.out.println(a.getMessage());  } 	
	} 

			 
  if (e.getSource() == btnFinish){
	  // creates new user objects so that I can read in existenting user objects to put inside them
		User userTopObj = new User();
		User userJgObj = new User();
		User userMidObj = new User();
		User userBotObj = new User();
		User userSupObj = new User();
    
	String userTop = lstTop.getSelectedItem().toString();
	String userJg = lstJungle.getSelectedItem().toString();
	String userMid = lstMid.getSelectedItem().toString();
	String userBot = lstBot.getSelectedItem().toString();
	String userSup = lstSupport.getSelectedItem().toString();

	//reading in all the selected users, while reading in, this will ensure no user has the same character. 
	String temp = "";
	ArrayList<String> selected = new ArrayList<String>(); //new list, for organizing which champs were selected
	// the champions are rolled during this part because it was easier to ensure that no 2 users got the same champion
	try{
		FileInputStream userTopfIn = new FileInputStream(userTop);
		userTopobIn = new ObjectInputStream(userTopfIn);
		userTopObj = (User)userTopobIn.readObject();
		

	temp = userTopObj.getCurrentChamp();
	selected.add(temp);
	

	} catch(Exception a){
		System.out.println(a.getMessage());
	}

	try{
		FileInputStream userJgfIn = new FileInputStream(userJg);
		userJgobIn = new ObjectInputStream(userJgfIn);
		userJgObj = (User)userJgobIn.readObject();
		

		do{
			temp = userJgObj.getCurrentChamp();
		}while((selected.contains(temp)));
		selected.add(temp);
		
  }catch(Exception b){
			System.out.println(b.getMessage());
  }

	try{
		FileInputStream userMidfIn = new FileInputStream(userMid);
		userMidobIn = new ObjectInputStream(userMidfIn);
		userMidObj = (User)userMidobIn.readObject();
		

		do{
			temp = userMidObj.getCurrentChamp();
		}while((selected.contains(temp)));
		selected.add(temp);
		
		
	}catch(Exception c){
		System.out.println(c.getMessage());
	}

	try{
		FileInputStream userBotfIn = new FileInputStream(userBot);
		userBotobIn = new ObjectInputStream(userBotfIn);
		userBotObj = (User)userBotobIn.readObject();
		

		do{
			temp = userBotObj.getCurrentChamp();
		}while((selected.contains(temp)));
		selected.add(temp);
		
		
	}catch(Exception f){
		System.out.println(f.getMessage());
	}

	try{
		FileInputStream userSupfIn = new FileInputStream(userSup);
		userSupobIn = new ObjectInputStream(userSupfIn);
		userSupObj = (User)userSupobIn.readObject();
		

		do{
			temp = userSupObj.getCurrentChamp();
		}while((selected.contains(temp)));
		selected.add(temp);
		

	}catch(Exception g){
		System.out.println(g.getMessage());
  }

	// the final output screen. it got gross, but it outputs all of the different users different atributes. 
	JOptionPane.showMessageDialog(this,
	"top: "+ userTopObj.getName()+"| "+ userTopObj.currentChamp+ "|("+userTopObj.getSummonerSpellOne()+","+userTopObj.getSummonerSpellTwo()+")|("+ userTopObj.getMasteryChoice()+","+userTopObj.getMasterySecond()+")| 1)"+userTopObj.getMythicalItem() +" 2)"+userTopObj.getItemOne()+" 3)"+userTopObj.getItemTwo()+" 4)"+userTopObj.getItemThree()+" 5)"+userTopObj.getItemFour()+" 6)"+userTopObj.getItemFive()+ "\n"

	+"jungle: "+userJgObj.getName()+"| "+userJgObj.currentChamp+" |("+userJgObj.setSummonerSpellOne("Smite")+","+userJgObj.getSummonerSpellTwo()+ ")|( "+ userJgObj.getMasteryChoice()+","+userJgObj.getMasterySecond()+")|1)" +userJgObj.getMythicalItem()+ " 2)"+userJgObj.getItemOne()+" 3)"+userJgObj.getItemTwo()+" 4)" +userJgObj.getItemThree() +" 5)"+userJgObj.getItemFour()+" 6)"+userJgObj.getItemFive()+"\n"

	+"Mid: " + userMidObj.getName()+"| "+userMidObj.currentChamp+"|("+userMidObj.getSummonerSpellOne()+"," +userMidObj.getSummonerSpellTwo() + ")|("+ userMidObj.getMasteryChoice()+","+userMidObj.getMasterySecond()+ ")| 1)"+ userMidObj.getMythicalItem()+ " 2)"+userMidObj.getItemOne()+" 3)"+userMidObj.getItemTwo()+" 4)"+userMidObj.getItemThree()+" 5)"+userMidObj.getItemFour()+" 6)"+userMidObj.getItemFive()+ "\n"

	+"Adc: "+userBotObj.getName()+"| "+userBotObj.currentChamp+"|("+ userBotObj.getSummonerSpellOne()+ ","+userBotObj.getSummonerSpellTwo()+")|("+userBotObj.getMasteryChoice()+","+userBotObj.getMasterySecond()+")| 1)"+userBotObj.getMythicalItem()+" 2)"+ userBotObj.getItemOne()+" 3)"+userBotObj.getItemTwo()+" 4)"+userBotObj.getItemThree()+" 5)" + userBotObj.getItemFour()+" 6)"+userBotObj.getItemFive()+"\n"+

	"support: "+userSupObj.getName() +"| "+ userSupObj.currentChamp+"|("+userSupObj.getSummonerSpellOne()+","+userSupObj.getSummonerSpellTwo()+")|("+userSupObj.getMasteryChoice()+","+userSupObj.getMasterySecond()+")| 1)"+ userSupObj.getMythicalItem()+" 2)"+ userSupObj.getItemOne()+" 3)"+userSupObj.getItemTwo()+" 4)"+userSupObj.getItemThree()+" 5)"+userSupObj.getItemFour()+" 6)"+userSupObj.getItemFive()
	,
  "Finished Team Screen",
  JOptionPane.PLAIN_MESSAGE);
  try {
  userTopobIn.close();
	}catch(IOException j) {
  	System.out.println(j.getMessage());
	}
  } // end of the finish button interactions 
  } // end actionPerformed
 } //end of  the class
